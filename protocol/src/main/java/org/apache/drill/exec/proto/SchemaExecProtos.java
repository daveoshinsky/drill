/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from protobuf

package org.apache.drill.exec.proto;


public final class SchemaExecProtos
{

    public static final class FragmentHandle
    {
        public static final org.apache.drill.exec.proto.SchemaExecProtos.FragmentHandle.MessageSchema WRITE =
            new org.apache.drill.exec.proto.SchemaExecProtos.FragmentHandle.MessageSchema();
        public static final org.apache.drill.exec.proto.SchemaExecProtos.FragmentHandle.BuilderSchema MERGE =
            new org.apache.drill.exec.proto.SchemaExecProtos.FragmentHandle.BuilderSchema();
        
        public static class MessageSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.ExecProtos.FragmentHandle>
        {
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.ExecProtos.FragmentHandle message) throws java.io.IOException
            {
                if(message.hasQueryId())
                    output.writeObject(1, message.getQueryId(), org.apache.drill.exec.proto.SchemaUserBitShared.QueryId.WRITE, false);

                if(message.hasMajorFragmentId())
                    output.writeInt32(2, message.getMajorFragmentId(), false);
                if(message.hasMinorFragmentId())
                    output.writeInt32(3, message.getMinorFragmentId(), false);
                if(message.hasParentQueryId())
                    output.writeObject(4, message.getParentQueryId(), org.apache.drill.exec.proto.SchemaUserBitShared.QueryId.WRITE, false);

            }
            public boolean isInitialized(org.apache.drill.exec.proto.ExecProtos.FragmentHandle message)
            {
                return message.isInitialized();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaExecProtos.FragmentHandle.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaExecProtos.FragmentHandle.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.ExecProtos.FragmentHandle> typeClass()
            {
                return org.apache.drill.exec.proto.ExecProtos.FragmentHandle.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.ExecProtos.FragmentHandle.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.ExecProtos.FragmentHandle.class.getName();
            }
            //unused
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.ExecProtos.FragmentHandle message) throws java.io.IOException {}
            public org.apache.drill.exec.proto.ExecProtos.FragmentHandle newMessage() { return null; }
        }
        public static class BuilderSchema implements com.dyuproject.protostuff.Schema<org.apache.drill.exec.proto.ExecProtos.FragmentHandle.Builder>
        {
            public void mergeFrom(com.dyuproject.protostuff.Input input, org.apache.drill.exec.proto.ExecProtos.FragmentHandle.Builder builder) throws java.io.IOException
            {
                for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
                {
                    switch(number)
                    {
                        case 0:
                            return;
                        case 1:
                            builder.setQueryId(input.mergeObject(org.apache.drill.exec.proto.UserBitShared.QueryId.newBuilder(), org.apache.drill.exec.proto.SchemaUserBitShared.QueryId.MERGE));

                            break;
                        case 2:
                            builder.setMajorFragmentId(input.readInt32());
                            break;
                        case 3:
                            builder.setMinorFragmentId(input.readInt32());
                            break;
                        case 4:
                            builder.setParentQueryId(input.mergeObject(org.apache.drill.exec.proto.UserBitShared.QueryId.newBuilder(), org.apache.drill.exec.proto.SchemaUserBitShared.QueryId.MERGE));

                            break;
                        default:
                            input.handleUnknownField(number, this);
                    }
                }
            }
            public boolean isInitialized(org.apache.drill.exec.proto.ExecProtos.FragmentHandle.Builder builder)
            {
                return builder.isInitialized();
            }
            public org.apache.drill.exec.proto.ExecProtos.FragmentHandle.Builder newMessage()
            {
                return org.apache.drill.exec.proto.ExecProtos.FragmentHandle.newBuilder();
            }
            public java.lang.String getFieldName(int number)
            {
                return org.apache.drill.exec.proto.SchemaExecProtos.FragmentHandle.getFieldName(number);
            }
            public int getFieldNumber(java.lang.String name)
            {
                return org.apache.drill.exec.proto.SchemaExecProtos.FragmentHandle.getFieldNumber(name);
            }
            public java.lang.Class<org.apache.drill.exec.proto.ExecProtos.FragmentHandle.Builder> typeClass()
            {
                return org.apache.drill.exec.proto.ExecProtos.FragmentHandle.Builder.class;
            }
            public java.lang.String messageName()
            {
                return org.apache.drill.exec.proto.ExecProtos.FragmentHandle.class.getSimpleName();
            }
            public java.lang.String messageFullName()
            {
                return org.apache.drill.exec.proto.ExecProtos.FragmentHandle.class.getName();
            }
            //unused
            public void writeTo(com.dyuproject.protostuff.Output output, org.apache.drill.exec.proto.ExecProtos.FragmentHandle.Builder builder) throws java.io.IOException {}
        }
        public static java.lang.String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "queryId";
                case 2: return "majorFragmentId";
                case 3: return "minorFragmentId";
                case 4: return "parentQueryId";
                default: return null;
            }
        }
        public static int getFieldNumber(java.lang.String name)
        {
            java.lang.Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }
        private static final java.util.HashMap<java.lang.String,java.lang.Integer> fieldMap = new java.util.HashMap<java.lang.String,java.lang.Integer>();
        static
        {
            fieldMap.put("queryId", 1);
            fieldMap.put("majorFragmentId", 2);
            fieldMap.put("minorFragmentId", 3);
            fieldMap.put("parentQueryId", 4);
        }
    }

}
