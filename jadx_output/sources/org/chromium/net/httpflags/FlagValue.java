package org.chromium.net.httpflags;

/* loaded from: classes16.dex */
public final class FlagValue extends com.google.protobuf.n5 implements org.chromium.net.httpflags.FlagValueOrBuilder {
    public static final int CONSTRAINED_VALUES_FIELD_NUMBER = 8;
    private static final org.chromium.net.httpflags.FlagValue DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.e9 PARSER;
    private com.google.protobuf.v6 constrainedValues_ = com.google.protobuf.n5.emptyProtobufList();

    /* renamed from: org.chromium.net.httpflags.FlagValue$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.l5.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends com.google.protobuf.h5 implements org.chromium.net.httpflags.FlagValueOrBuilder {
        public org.chromium.net.httpflags.FlagValue.Builder addAllConstrainedValues(java.lang.Iterable<? extends org.chromium.net.httpflags.FlagValue.ConstrainedValue> iterable) {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).addAllConstrainedValues(iterable);
            return this;
        }

        public org.chromium.net.httpflags.FlagValue.Builder addConstrainedValues(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).addConstrainedValues(constrainedValue);
            return this;
        }

        public org.chromium.net.httpflags.FlagValue.Builder clearConstrainedValues() {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).clearConstrainedValues();
            return this;
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public org.chromium.net.httpflags.FlagValue.ConstrainedValue getConstrainedValues(int i17) {
            return ((org.chromium.net.httpflags.FlagValue) this.instance).getConstrainedValues(i17);
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public int getConstrainedValuesCount() {
            return ((org.chromium.net.httpflags.FlagValue) this.instance).getConstrainedValuesCount();
        }

        @Override // org.chromium.net.httpflags.FlagValueOrBuilder
        public java.util.List<org.chromium.net.httpflags.FlagValue.ConstrainedValue> getConstrainedValuesList() {
            return java.util.Collections.unmodifiableList(((org.chromium.net.httpflags.FlagValue) this.instance).getConstrainedValuesList());
        }

        public org.chromium.net.httpflags.FlagValue.Builder removeConstrainedValues(int i17) {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).removeConstrainedValues(i17);
            return this;
        }

        public org.chromium.net.httpflags.FlagValue.Builder setConstrainedValues(int i17, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).setConstrainedValues(i17, constrainedValue);
            return this;
        }

        private Builder() {
            super(org.chromium.net.httpflags.FlagValue.DEFAULT_INSTANCE);
        }

        public org.chromium.net.httpflags.FlagValue.Builder addConstrainedValues(int i17, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).addConstrainedValues(i17, constrainedValue);
            return this;
        }

        public org.chromium.net.httpflags.FlagValue.Builder setConstrainedValues(int i17, org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).setConstrainedValues(i17, (org.chromium.net.httpflags.FlagValue.ConstrainedValue) builder.build());
            return this;
        }

        public org.chromium.net.httpflags.FlagValue.Builder addConstrainedValues(org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).addConstrainedValues((org.chromium.net.httpflags.FlagValue.ConstrainedValue) builder.build());
            return this;
        }

        public org.chromium.net.httpflags.FlagValue.Builder addConstrainedValues(int i17, org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder builder) {
            copyOnWrite();
            ((org.chromium.net.httpflags.FlagValue) this.instance).addConstrainedValues(i17, (org.chromium.net.httpflags.FlagValue.ConstrainedValue) builder.build());
            return this;
        }
    }

    /* loaded from: classes16.dex */
    public static final class ConstrainedValue extends com.google.protobuf.n5 implements org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder {
        public static final int APP_ID_FIELD_NUMBER = 1;
        public static final int BOOL_VALUE_FIELD_NUMBER = 3;
        public static final int BYTES_VALUE_FIELD_NUMBER = 7;
        private static final org.chromium.net.httpflags.FlagValue.ConstrainedValue DEFAULT_INSTANCE;
        public static final int FLOAT_VALUE_FIELD_NUMBER = 5;
        public static final int INT_VALUE_FIELD_NUMBER = 4;
        public static final int MIN_VERSION_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.e9 PARSER = null;
        public static final int STRING_VALUE_FIELD_NUMBER = 6;
        private int bitField0_;
        private java.lang.Object value_;
        private int valueCase_ = 0;
        private java.lang.String appId_ = "";
        private java.lang.String minVersion_ = "";

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder {
            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearAppId() {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).clearAppId();
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearBoolValue() {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).clearBoolValue();
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearBytesValue() {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).clearBytesValue();
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearFloatValue() {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).clearFloatValue();
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearIntValue() {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).clearIntValue();
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearMinVersion() {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).clearMinVersion();
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearStringValue() {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).clearStringValue();
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder clearValue() {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).clearValue();
                return this;
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public java.lang.String getAppId() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public com.google.protobuf.y getAppIdBytes() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getAppIdBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean getBoolValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getBoolValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public com.google.protobuf.y getBytesValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getBytesValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public float getFloatValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getFloatValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public long getIntValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getIntValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public java.lang.String getMinVersion() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public com.google.protobuf.y getMinVersionBytes() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getMinVersionBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public java.lang.String getStringValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getStringValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public com.google.protobuf.y getStringValueBytes() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getStringValueBytes();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase getValueCase() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).getValueCase();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasAppId() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasAppId();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasBoolValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasBoolValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasBytesValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasBytesValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasFloatValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasFloatValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasIntValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasIntValue();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasMinVersion() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasMinVersion();
            }

            @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
            public boolean hasStringValue() {
                return ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).hasStringValue();
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setAppId(java.lang.String str) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setAppId(str);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setAppIdBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setAppIdBytes(yVar);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setBoolValue(boolean z17) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setBoolValue(z17);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setBytesValue(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setBytesValue(yVar);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setFloatValue(float f17) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setFloatValue(f17);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setIntValue(long j17) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setIntValue(j17);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setMinVersion(java.lang.String str) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setMinVersion(str);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setMinVersionBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setMinVersionBytes(yVar);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setStringValue(java.lang.String str) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setStringValue(str);
                return this;
            }

            public org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder setStringValueBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.instance).setStringValueBytes(yVar);
                return this;
            }

            private Builder() {
                super(org.chromium.net.httpflags.FlagValue.ConstrainedValue.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes16.dex */
        public enum ValueCase {
            BOOL_VALUE(3),
            INT_VALUE(4),
            FLOAT_VALUE(5),
            STRING_VALUE(6),
            BYTES_VALUE(7),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i17) {
                this.value = i17;
            }

            public static org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase forNumber(int i17) {
                if (i17 == 0) {
                    return VALUE_NOT_SET;
                }
                if (i17 == 3) {
                    return BOOL_VALUE;
                }
                if (i17 == 4) {
                    return INT_VALUE;
                }
                if (i17 == 5) {
                    return FLOAT_VALUE;
                }
                if (i17 == 6) {
                    return STRING_VALUE;
                }
                if (i17 != 7) {
                    return null;
                }
                return BYTES_VALUE;
            }

            public int getNumber() {
                return this.value;
            }

            @java.lang.Deprecated
            public static org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase valueOf(int i17) {
                return forNumber(i17);
            }
        }

        static {
            org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue = new org.chromium.net.httpflags.FlagValue.ConstrainedValue();
            DEFAULT_INSTANCE = constrainedValue;
            com.google.protobuf.n5.registerDefaultInstance(org.chromium.net.httpflags.FlagValue.ConstrainedValue.class, constrainedValue);
        }

        private ConstrainedValue() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppId() {
            this.bitField0_ &= -2;
            this.appId_ = getDefaultInstance().getAppId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoolValue() {
            if (this.valueCase_ == 3) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBytesValue() {
            if (this.valueCase_ == 7) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFloatValue() {
            if (this.valueCase_ == 5) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIntValue() {
            if (this.valueCase_ == 4) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMinVersion() {
            this.bitField0_ &= -3;
            this.minVersion_ = getDefaultInstance().getMinVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStringValue() {
            if (this.valueCase_ == 6) {
                this.valueCase_ = 0;
                this.value_ = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.valueCase_ = 0;
            this.value_ = null;
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder newBuilder() {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseDelimitedFrom(java.io.InputStream inputStream) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.appId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppIdBytes(com.google.protobuf.y yVar) {
            this.appId_ = yVar.r();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoolValue(boolean z17) {
            this.valueCase_ = 3;
            this.value_ = java.lang.Boolean.valueOf(z17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBytesValue(com.google.protobuf.y yVar) {
            yVar.getClass();
            this.valueCase_ = 7;
            this.value_ = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(float f17) {
            this.valueCase_ = 5;
            this.value_ = java.lang.Float.valueOf(f17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(long j17) {
            this.valueCase_ = 4;
            this.value_ = java.lang.Long.valueOf(j17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinVersion(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.minVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMinVersionBytes(com.google.protobuf.y yVar) {
            this.minVersion_ = yVar.r();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(java.lang.String str) {
            str.getClass();
            this.valueCase_ = 6;
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValueBytes(com.google.protobuf.y yVar) {
            this.value_ = yVar.r();
            this.valueCase_ = 6;
        }

        @Override // com.google.protobuf.n5
        public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (l5Var) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003်\u0000\u0004ဵ\u0000\u0005ဴ\u0000\u0006ျ\u0000\u0007ွ\u0000", new java.lang.Object[]{"value_", "valueCase_", "bitField0_", "appId_", "minVersion_"});
                case NEW_MUTABLE_INSTANCE:
                    return new org.chromium.net.httpflags.FlagValue.ConstrainedValue();
                case NEW_BUILDER:
                    return new org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (org.chromium.net.httpflags.FlagValue.ConstrainedValue.class) {
                            e9Var = PARSER;
                            if (e9Var == null) {
                                e9Var = new com.google.protobuf.i5(DEFAULT_INSTANCE);
                                PARSER = e9Var;
                            }
                        }
                    }
                    return e9Var;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public java.lang.String getAppId() {
            return this.appId_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public com.google.protobuf.y getAppIdBytes() {
            return com.google.protobuf.y.h(this.appId_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean getBoolValue() {
            if (this.valueCase_ == 3) {
                return ((java.lang.Boolean) this.value_).booleanValue();
            }
            return false;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public com.google.protobuf.y getBytesValue() {
            return this.valueCase_ == 7 ? (com.google.protobuf.y) this.value_ : com.google.protobuf.y.f45712e;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public float getFloatValue() {
            if (this.valueCase_ == 5) {
                return ((java.lang.Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public long getIntValue() {
            if (this.valueCase_ == 4) {
                return ((java.lang.Long) this.value_).longValue();
            }
            return 0L;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public java.lang.String getMinVersion() {
            return this.minVersion_;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public com.google.protobuf.y getMinVersionBytes() {
            return com.google.protobuf.y.h(this.minVersion_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public java.lang.String getStringValue() {
            return this.valueCase_ == 6 ? (java.lang.String) this.value_ : "";
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public com.google.protobuf.y getStringValueBytes() {
            return com.google.protobuf.y.h(this.valueCase_ == 6 ? (java.lang.String) this.value_ : "");
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase getValueCase() {
            return org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.forNumber(this.valueCase_);
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasBoolValue() {
            return this.valueCase_ == 3;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasBytesValue() {
            return this.valueCase_ == 7;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasFloatValue() {
            return this.valueCase_ == 5;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 4;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasMinVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder
        public boolean hasStringValue() {
            return this.valueCase_ == 6;
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder newBuilder(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue.Builder) DEFAULT_INSTANCE.createBuilder(constrainedValue);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(com.google.protobuf.y yVar) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(byte[] bArr) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(java.io.InputStream inputStream) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(com.google.protobuf.d0 d0Var) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static org.chromium.net.httpflags.FlagValue.ConstrainedValue parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes16.dex */
    public interface ConstrainedValueOrBuilder extends com.google.protobuf.p8 {
        java.lang.String getAppId();

        com.google.protobuf.y getAppIdBytes();

        boolean getBoolValue();

        com.google.protobuf.y getBytesValue();

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        float getFloatValue();

        long getIntValue();

        java.lang.String getMinVersion();

        com.google.protobuf.y getMinVersionBytes();

        java.lang.String getStringValue();

        com.google.protobuf.y getStringValueBytes();

        org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase getValueCase();

        boolean hasAppId();

        boolean hasBoolValue();

        boolean hasBytesValue();

        boolean hasFloatValue();

        boolean hasIntValue();

        boolean hasMinVersion();

        boolean hasStringValue();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    static {
        org.chromium.net.httpflags.FlagValue flagValue = new org.chromium.net.httpflags.FlagValue();
        DEFAULT_INSTANCE = flagValue;
        com.google.protobuf.n5.registerDefaultInstance(org.chromium.net.httpflags.FlagValue.class, flagValue);
    }

    private FlagValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConstrainedValues(java.lang.Iterable<? extends org.chromium.net.httpflags.FlagValue.ConstrainedValue> iterable) {
        ensureConstrainedValuesIsMutable();
        com.google.protobuf.f.addAll((java.lang.Iterable) iterable, (java.util.List) this.constrainedValues_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConstrainedValues(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.add(constrainedValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConstrainedValues() {
        this.constrainedValues_ = com.google.protobuf.n5.emptyProtobufList();
    }

    private void ensureConstrainedValuesIsMutable() {
        com.google.protobuf.v6 v6Var = this.constrainedValues_;
        if (((com.google.protobuf.h) v6Var).f45145d) {
            return;
        }
        this.constrainedValues_ = com.google.protobuf.n5.mutableCopy(v6Var);
    }

    public static org.chromium.net.httpflags.FlagValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static org.chromium.net.httpflags.FlagValue.Builder newBuilder() {
        return (org.chromium.net.httpflags.FlagValue.Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static org.chromium.net.httpflags.FlagValue parseDelimitedFrom(java.io.InputStream inputStream) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConstrainedValues(int i17) {
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.remove(i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConstrainedValues(int i17, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.set(i17, constrainedValue);
    }

    @Override // com.google.protobuf.n5
    public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (l5Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new java.lang.Object[]{"constrainedValues_", org.chromium.net.httpflags.FlagValue.ConstrainedValue.class});
            case NEW_MUTABLE_INSTANCE:
                return new org.chromium.net.httpflags.FlagValue();
            case NEW_BUILDER:
                return new org.chromium.net.httpflags.FlagValue.Builder();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                com.google.protobuf.e9 e9Var = PARSER;
                if (e9Var == null) {
                    synchronized (org.chromium.net.httpflags.FlagValue.class) {
                        e9Var = PARSER;
                        if (e9Var == null) {
                            e9Var = new com.google.protobuf.i5(DEFAULT_INSTANCE);
                            PARSER = e9Var;
                        }
                    }
                }
                return e9Var;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public org.chromium.net.httpflags.FlagValue.ConstrainedValue getConstrainedValues(int i17) {
        return (org.chromium.net.httpflags.FlagValue.ConstrainedValue) this.constrainedValues_.get(i17);
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public int getConstrainedValuesCount() {
        return this.constrainedValues_.size();
    }

    @Override // org.chromium.net.httpflags.FlagValueOrBuilder
    public java.util.List<org.chromium.net.httpflags.FlagValue.ConstrainedValue> getConstrainedValuesList() {
        return this.constrainedValues_;
    }

    public org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder getConstrainedValuesOrBuilder(int i17) {
        return (org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder) this.constrainedValues_.get(i17);
    }

    public java.util.List<? extends org.chromium.net.httpflags.FlagValue.ConstrainedValueOrBuilder> getConstrainedValuesOrBuilderList() {
        return this.constrainedValues_;
    }

    public static org.chromium.net.httpflags.FlagValue.Builder newBuilder(org.chromium.net.httpflags.FlagValue flagValue) {
        return (org.chromium.net.httpflags.FlagValue.Builder) DEFAULT_INSTANCE.createBuilder(flagValue);
    }

    public static org.chromium.net.httpflags.FlagValue parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(com.google.protobuf.y yVar) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConstrainedValues(int i17, org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
        constrainedValue.getClass();
        ensureConstrainedValuesIsMutable();
        this.constrainedValues_.add(i17, constrainedValue);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(byte[] bArr) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(java.io.InputStream inputStream) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(com.google.protobuf.d0 d0Var) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
    }

    public static org.chromium.net.httpflags.FlagValue parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.FlagValue) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
    }
}
