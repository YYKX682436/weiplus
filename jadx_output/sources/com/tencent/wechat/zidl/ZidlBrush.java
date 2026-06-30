package com.tencent.wechat.zidl;

/* loaded from: classes16.dex */
public final class ZidlBrush {

    /* renamed from: com.tencent.wechat.zidl.ZidlBrush$1, reason: invalid class name */
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
    public static final class MagicSclBizApiResponse extends com.google.protobuf.n5 implements com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder {
        public static final int DATA_FIELD_NUMBER = 3;
        private static final com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse DEFAULT_INSTANCE;
        public static final int ERRCODE_FIELD_NUMBER = 1;
        public static final int ERRMSG_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.e9 PARSER;
        private int bitField0_;
        private int errCode_;
        private byte memoizedIsInitialized = 2;
        private java.lang.String errMsg_ = "";
        private com.google.protobuf.y data_ = com.google.protobuf.y.f45712e;

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder {
            public /* synthetic */ Builder(com.tencent.wechat.zidl.ZidlBrush.AnonymousClass1 anonymousClass1) {
                this();
            }

            public com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder clearData() {
                copyOnWrite();
                ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).clearData();
                return this;
            }

            public com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder clearErrCode() {
                copyOnWrite();
                ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).clearErrCode();
                return this;
            }

            public com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder clearErrMsg() {
                copyOnWrite();
                ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).clearErrMsg();
                return this;
            }

            @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
            public com.google.protobuf.y getData() {
                return ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).getData();
            }

            @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
            public int getErrCode() {
                return ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).getErrCode();
            }

            @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
            public java.lang.String getErrMsg() {
                return ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).getErrMsg();
            }

            @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
            public com.google.protobuf.y getErrMsgBytes() {
                return ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).getErrMsgBytes();
            }

            @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
            public boolean hasData() {
                return ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).hasData();
            }

            @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
            public boolean hasErrCode() {
                return ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).hasErrCode();
            }

            @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
            public boolean hasErrMsg() {
                return ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).hasErrMsg();
            }

            public com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder setData(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).setData(yVar);
                return this;
            }

            public com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder setErrCode(int i17) {
                copyOnWrite();
                ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).setErrCode(i17);
                return this;
            }

            public com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder setErrMsg(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).setErrMsg(str);
                return this;
            }

            public com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder setErrMsgBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) this.instance).setErrMsgBytes(yVar);
                return this;
            }

            private Builder() {
                super(com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse magicSclBizApiResponse = new com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse();
            DEFAULT_INSTANCE = magicSclBizApiResponse;
            com.google.protobuf.n5.registerDefaultInstance(com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.class, magicSclBizApiResponse);
        }

        private MagicSclBizApiResponse() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -5;
            this.data_ = getDefaultInstance().getData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrCode() {
            this.bitField0_ &= -2;
            this.errCode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearErrMsg() {
            this.bitField0_ &= -3;
            this.errMsg_ = getDefaultInstance().getErrMsg();
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder newBuilder() {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(com.google.protobuf.y yVar) {
            yVar.getClass();
            this.bitField0_ |= 4;
            this.data_ = yVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrCode(int i17) {
            this.bitField0_ |= 1;
            this.errCode_ = i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrMsg(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.errMsg_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setErrMsgBytes(com.google.protobuf.y yVar) {
            this.errMsg_ = yVar.r();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.n5
        public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
            com.tencent.wechat.zidl.ZidlBrush.AnonymousClass1 anonymousClass1 = null;
            switch (l5Var) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return java.lang.Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔈ\u0001\u0003ည\u0002", new java.lang.Object[]{"bitField0_", "errCode_", "errMsg_", "data_"});
                case NEW_MUTABLE_INSTANCE:
                    return new com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse();
                case NEW_BUILDER:
                    return new com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.class) {
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

        @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
        public com.google.protobuf.y getData() {
            return this.data_;
        }

        @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
        public int getErrCode() {
            return this.errCode_;
        }

        @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
        public java.lang.String getErrMsg() {
            return this.errMsg_;
        }

        @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
        public com.google.protobuf.y getErrMsgBytes() {
            return com.google.protobuf.y.h(this.errMsg_);
        }

        @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
        public boolean hasErrCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponseOrBuilder
        public boolean hasErrMsg() {
            return (this.bitField0_ & 2) != 0;
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder newBuilder(com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse magicSclBizApiResponse) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse.Builder) DEFAULT_INSTANCE.createBuilder(magicSclBizApiResponse);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(com.google.protobuf.y yVar) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(byte[] bArr) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(com.google.protobuf.d0 d0Var) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.zidl.ZidlBrush.MagicSclBizApiResponse) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes16.dex */
    public interface MagicSclBizApiResponseOrBuilder extends com.google.protobuf.p8 {
        com.google.protobuf.y getData();

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        int getErrCode();

        java.lang.String getErrMsg();

        com.google.protobuf.y getErrMsgBytes();

        boolean hasData();

        boolean hasErrCode();

        boolean hasErrMsg();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    private ZidlBrush() {
    }

    public static void registerAllExtensions(com.google.protobuf.t4 t4Var) {
    }
}
