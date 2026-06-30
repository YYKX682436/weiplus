package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public final class CaraFoundationProto {

    /* renamed from: com.tencent.wechat.aff.cara.CaraFoundationProto$1, reason: invalid class name */
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

    /* loaded from: classes15.dex */
    public enum CaraDeviceBrand implements com.google.protobuf.p6 {
        CARA_DEVICE_BRAND_UNKNOWN(0),
        CARA_DEVICE_BRAND_OTHER(1),
        CARA_DEVICE_BRAND_APPLE(2),
        CARA_DEVICE_BRAND_VIVO(3),
        CARA_DEVICE_BRAND_OPPO(4),
        CARA_DEVICE_BRAND_HUAWEI(5),
        CARA_DEVICE_BRAND_HONOR(6),
        CARA_DEVICE_BRAND_REDMI(7),
        CARA_DEVICE_BRAND_XIAOMI(8),
        CARA_DEVICE_BRAND_REALME(9),
        CARA_DEVICE_BRAND_SAMSUNG(10),
        CARA_DEVICE_BRAND_ONEPLUS(11);

        public static final int CARA_DEVICE_BRAND_APPLE_VALUE = 2;
        public static final int CARA_DEVICE_BRAND_HONOR_VALUE = 6;
        public static final int CARA_DEVICE_BRAND_HUAWEI_VALUE = 5;
        public static final int CARA_DEVICE_BRAND_ONEPLUS_VALUE = 11;
        public static final int CARA_DEVICE_BRAND_OPPO_VALUE = 4;
        public static final int CARA_DEVICE_BRAND_OTHER_VALUE = 1;
        public static final int CARA_DEVICE_BRAND_REALME_VALUE = 9;
        public static final int CARA_DEVICE_BRAND_REDMI_VALUE = 7;
        public static final int CARA_DEVICE_BRAND_SAMSUNG_VALUE = 10;
        public static final int CARA_DEVICE_BRAND_UNKNOWN_VALUE = 0;
        public static final int CARA_DEVICE_BRAND_VIVO_VALUE = 3;
        public static final int CARA_DEVICE_BRAND_XIAOMI_VALUE = 8;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes15.dex */
        public static final class CaraDeviceBrandVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CaraDeviceBrandVerifier();

            private CaraDeviceBrandVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.forNumber(i17) != null;
            }
        }

        CaraDeviceBrand(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand forNumber(int i17) {
            switch (i17) {
                case 0:
                    return CARA_DEVICE_BRAND_UNKNOWN;
                case 1:
                    return CARA_DEVICE_BRAND_OTHER;
                case 2:
                    return CARA_DEVICE_BRAND_APPLE;
                case 3:
                    return CARA_DEVICE_BRAND_VIVO;
                case 4:
                    return CARA_DEVICE_BRAND_OPPO;
                case 5:
                    return CARA_DEVICE_BRAND_HUAWEI;
                case 6:
                    return CARA_DEVICE_BRAND_HONOR;
                case 7:
                    return CARA_DEVICE_BRAND_REDMI;
                case 8:
                    return CARA_DEVICE_BRAND_XIAOMI;
                case 9:
                    return CARA_DEVICE_BRAND_REALME;
                case 10:
                    return CARA_DEVICE_BRAND_SAMSUNG;
                case 11:
                    return CARA_DEVICE_BRAND_ONEPLUS;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand.CaraDeviceBrandVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes15.dex */
    public enum CaraNetworkType implements com.google.protobuf.p6 {
        CARA_NETWORK_TYPE_UNKNOWN(0),
        CARA_NETWORK_TYPE_WIFI(1),
        CARA_NETWORK_TYPE_MOBILE_LOW(2),
        CARA_NETWORK_TYPE_MOBILE_4G(3),
        CARA_NETWORK_TYPE_MOBILE_5G(4);

        public static final int CARA_NETWORK_TYPE_MOBILE_4G_VALUE = 3;
        public static final int CARA_NETWORK_TYPE_MOBILE_5G_VALUE = 4;
        public static final int CARA_NETWORK_TYPE_MOBILE_LOW_VALUE = 2;
        public static final int CARA_NETWORK_TYPE_UNKNOWN_VALUE = 0;
        public static final int CARA_NETWORK_TYPE_WIFI_VALUE = 1;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes15.dex */
        public static final class CaraNetworkTypeVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.CaraNetworkTypeVerifier();

            private CaraNetworkTypeVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.forNumber(i17) != null;
            }
        }

        CaraNetworkType(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType forNumber(int i17) {
            if (i17 == 0) {
                return CARA_NETWORK_TYPE_UNKNOWN;
            }
            if (i17 == 1) {
                return CARA_NETWORK_TYPE_WIFI;
            }
            if (i17 == 2) {
                return CARA_NETWORK_TYPE_MOBILE_LOW;
            }
            if (i17 == 3) {
                return CARA_NETWORK_TYPE_MOBILE_4G;
            }
            if (i17 != 4) {
                return null;
            }
            return CARA_NETWORK_TYPE_MOBILE_5G;
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType.CaraNetworkTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes16.dex */
    public static final class CaraSize extends com.google.protobuf.n5 implements com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder {
        private static final com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize DEFAULT_INSTANCE;
        public static final int HEIGHT_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.e9 PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int bitField0_;
        private float height_;
        private byte memoizedIsInitialized = 2;
        private float width_;

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder {
            public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder clearHeight() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) this.instance).clearHeight();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder clearWidth() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) this.instance).clearWidth();
                return this;
            }

            @Override // com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder
            public float getHeight() {
                return ((com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) this.instance).getHeight();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder
            public float getWidth() {
                return ((com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) this.instance).getWidth();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder
            public boolean hasHeight() {
                return ((com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) this.instance).hasHeight();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder
            public boolean hasWidth() {
                return ((com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) this.instance).hasWidth();
            }

            public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder setHeight(float f17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) this.instance).setHeight(f17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder setWidth(float f17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) this.instance).setWidth(f17);
                return this;
            }

            private Builder() {
                super(com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.DEFAULT_INSTANCE);
            }
        }

        static {
            com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize caraSize = new com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize();
            DEFAULT_INSTANCE = caraSize;
            com.google.protobuf.n5.registerDefaultInstance(com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.class, caraSize);
        }

        private CaraSize() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -3;
            this.height_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.bitField0_ &= -2;
            this.width_ = 0.0f;
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder newBuilder() {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(float f17) {
            this.bitField0_ |= 2;
            this.height_ = f17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(float f17) {
            this.bitField0_ |= 1;
            this.width_ = f17;
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
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔁ\u0000\u0002ᔁ\u0001", new java.lang.Object[]{"bitField0_", "width_", "height_"});
                case NEW_MUTABLE_INSTANCE:
                    return new com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize();
                case NEW_BUILDER:
                    return new com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.class) {
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

        @Override // com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder
        public float getHeight() {
            return this.height_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder
        public float getWidth() {
            return this.width_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder
        public boolean hasHeight() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSizeOrBuilder
        public boolean hasWidth() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder newBuilder(com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize caraSize) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize.Builder) DEFAULT_INSTANCE.createBuilder(caraSize);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(com.google.protobuf.y yVar) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(com.google.protobuf.d0 d0Var) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes15.dex */
    public interface CaraSizeOrBuilder extends com.google.protobuf.p8 {
        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        float getHeight();

        float getWidth();

        boolean hasHeight();

        boolean hasWidth();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    private CaraFoundationProto() {
    }

    public static void registerAllExtensions(com.google.protobuf.t4 t4Var) {
    }
}
