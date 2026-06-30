package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public final class CaraProphetProto {

    /* renamed from: com.tencent.wechat.aff.cara.CaraProphetProto$1, reason: invalid class name */
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
    public static final class CaraPredictionPositive extends com.google.protobuf.n5 implements com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder {
        private static final com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.e9 PARSER = null;
        public static final int POSITIVE_FIELD_NUMBER = 2;
        public static final int PROB_FIELD_NUMBER = 3;
        public static final int UUID_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean positive_;
        private float prob_;
        private byte memoizedIsInitialized = 2;
        private java.lang.String uuid_ = "";

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder {
            public com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder clearPositive() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).clearPositive();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder clearProb() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).clearProb();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder clearUuid() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).clearUuid();
                return this;
            }

            @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
            public boolean getPositive() {
                return ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).getPositive();
            }

            @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
            public float getProb() {
                return ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).getProb();
            }

            @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
            public java.lang.String getUuid() {
                return ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).getUuid();
            }

            @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
            public com.google.protobuf.y getUuidBytes() {
                return ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).getUuidBytes();
            }

            @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
            public boolean hasPositive() {
                return ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).hasPositive();
            }

            @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
            public boolean hasProb() {
                return ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).hasProb();
            }

            @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
            public boolean hasUuid() {
                return ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).hasUuid();
            }

            public com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder setPositive(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).setPositive(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder setProb(float f17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).setProb(f17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder setUuid(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).setUuid(str);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder setUuidBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) this.instance).setUuidBytes(yVar);
                return this;
            }

            private Builder() {
                super(com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.DEFAULT_INSTANCE);
            }
        }

        static {
            com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive caraPredictionPositive = new com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive();
            DEFAULT_INSTANCE = caraPredictionPositive;
            com.google.protobuf.n5.registerDefaultInstance(com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.class, caraPredictionPositive);
        }

        private CaraPredictionPositive() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPositive() {
            this.bitField0_ &= -3;
            this.positive_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProb() {
            this.bitField0_ &= -5;
            this.prob_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUuid() {
            this.bitField0_ &= -2;
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder newBuilder() {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPositive(boolean z17) {
            this.bitField0_ |= 2;
            this.positive_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProb(float f17) {
            this.bitField0_ |= 4;
            this.prob_ = f17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.uuid_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuidBytes(com.google.protobuf.y yVar) {
            this.uuid_ = yVar.r();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.n5
        public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (l5Var) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return java.lang.Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဇ\u0001\u0003ခ\u0002", new java.lang.Object[]{"bitField0_", "uuid_", "positive_", "prob_"});
                case NEW_MUTABLE_INSTANCE:
                    return new com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive();
                case NEW_BUILDER:
                    return new com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.class) {
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

        @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
        public boolean getPositive() {
            return this.positive_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
        public float getProb() {
            return this.prob_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
        public java.lang.String getUuid() {
            return this.uuid_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
        public com.google.protobuf.y getUuidBytes() {
            return com.google.protobuf.y.h(this.uuid_);
        }

        @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
        public boolean hasPositive() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
        public boolean hasProb() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositiveOrBuilder
        public boolean hasUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder newBuilder(com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive caraPredictionPositive) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive.Builder) DEFAULT_INSTANCE.createBuilder(caraPredictionPositive);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(com.google.protobuf.y yVar) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(com.google.protobuf.d0 d0Var) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraProphetProto.CaraPredictionPositive) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes15.dex */
    public interface CaraPredictionPositiveOrBuilder extends com.google.protobuf.p8 {
        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        boolean getPositive();

        float getProb();

        java.lang.String getUuid();

        com.google.protobuf.y getUuidBytes();

        boolean hasPositive();

        boolean hasProb();

        boolean hasUuid();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    private CaraProphetProto() {
    }

    public static void registerAllExtensions(com.google.protobuf.t4 t4Var) {
    }
}
