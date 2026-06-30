package org.chromium.net.httpflags;

/* loaded from: classes16.dex */
public final class BaseFeatureOverrides extends com.google.protobuf.n5 implements org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder {
    private static final org.chromium.net.httpflags.BaseFeatureOverrides DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.e9 PARSER;
    private com.google.protobuf.e8 featureStates_ = com.google.protobuf.e8.f45062e;

    /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$1, reason: invalid class name */
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
    public static final class Builder extends com.google.protobuf.h5 implements org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder {
        public org.chromium.net.httpflags.BaseFeatureOverrides.Builder clearFeatureStates() {
            copyOnWrite();
            ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().clear();
            return this;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public boolean containsFeatureStates(java.lang.String str) {
            str.getClass();
            return ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap().containsKey(str);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStates() {
            return getFeatureStatesMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public int getFeatureStatesCount() {
            return ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStatesMap() {
            return java.util.Collections.unmodifiableMap(((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(java.lang.String str, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
            str.getClass();
            java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> featureStatesMap = ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            return featureStatesMap.containsKey(str) ? featureStatesMap.get(str) : featureState;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(java.lang.String str) {
            str.getClass();
            java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> featureStatesMap = ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            if (featureStatesMap.containsKey(str)) {
                return featureStatesMap.get(str);
            }
            throw new java.lang.IllegalArgumentException();
        }

        public org.chromium.net.httpflags.BaseFeatureOverrides.Builder putAllFeatureStates(java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> map) {
            copyOnWrite();
            ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().putAll(map);
            return this;
        }

        public org.chromium.net.httpflags.BaseFeatureOverrides.Builder putFeatureStates(java.lang.String str, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
            str.getClass();
            featureState.getClass();
            copyOnWrite();
            ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().put(str, featureState);
            return this;
        }

        public org.chromium.net.httpflags.BaseFeatureOverrides.Builder removeFeatureStates(java.lang.String str) {
            str.getClass();
            copyOnWrite();
            ((org.chromium.net.httpflags.BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().remove(str);
            return this;
        }

        private Builder() {
            super(org.chromium.net.httpflags.BaseFeatureOverrides.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes16.dex */
    public static final class FeatureState extends com.google.protobuf.n5 implements org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder {
        private static final org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.e9 PARSER;
        private int bitField0_;
        private boolean enabled_;
        private com.google.protobuf.e8 params_ = com.google.protobuf.e8.f45062e;

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder {
            public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder clearEnabled() {
                copyOnWrite();
                ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).clearEnabled();
                return this;
            }

            public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder clearParams() {
                copyOnWrite();
                ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getMutableParamsMap().clear();
                return this;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean containsParams(java.lang.String str) {
                str.getClass();
                return ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap().containsKey(str);
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean getEnabled() {
                return ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getEnabled();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, com.google.protobuf.y> getParams() {
                return getParamsMap();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public int getParamsCount() {
                return ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap().size();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public java.util.Map<java.lang.String, com.google.protobuf.y> getParamsMap() {
                return java.util.Collections.unmodifiableMap(((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap());
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public com.google.protobuf.y getParamsOrDefault(java.lang.String str, com.google.protobuf.y yVar) {
                str.getClass();
                java.util.Map<java.lang.String, com.google.protobuf.y> paramsMap = ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap();
                return paramsMap.containsKey(str) ? paramsMap.get(str) : yVar;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public com.google.protobuf.y getParamsOrThrow(java.lang.String str) {
                str.getClass();
                java.util.Map<java.lang.String, com.google.protobuf.y> paramsMap = ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getParamsMap();
                if (paramsMap.containsKey(str)) {
                    return paramsMap.get(str);
                }
                throw new java.lang.IllegalArgumentException();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean hasEnabled() {
                return ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).hasEnabled();
            }

            public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder putAllParams(java.util.Map<java.lang.String, com.google.protobuf.y> map) {
                copyOnWrite();
                ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getMutableParamsMap().putAll(map);
                return this;
            }

            public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder putParams(java.lang.String str, com.google.protobuf.y yVar) {
                str.getClass();
                yVar.getClass();
                copyOnWrite();
                ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getMutableParamsMap().put(str, yVar);
                return this;
            }

            public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder removeParams(java.lang.String str) {
                str.getClass();
                copyOnWrite();
                ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).getMutableParamsMap().remove(str);
                return this;
            }

            public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder setEnabled(boolean z17) {
                copyOnWrite();
                ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) this.instance).setEnabled(z17);
                return this;
            }

            private Builder() {
                super(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes16.dex */
        public static final class ParamsDefaultEntryHolder {
            static final com.google.protobuf.v7 defaultEntry = new com.google.protobuf.v7(com.google.protobuf.ub.f45591f, "", com.google.protobuf.ub.f45594i, com.google.protobuf.y.f45712e);

            private ParamsDefaultEntryHolder() {
            }
        }

        static {
            org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState = new org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState();
            DEFAULT_INSTANCE = featureState;
            com.google.protobuf.n5.registerDefaultInstance(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.class, featureState);
        }

        private FeatureState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.bitField0_ &= -2;
            this.enabled_ = false;
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.Map<java.lang.String, com.google.protobuf.y> getMutableParamsMap() {
            return internalGetMutableParams();
        }

        private com.google.protobuf.e8 internalGetMutableParams() {
            com.google.protobuf.e8 e8Var = this.params_;
            if (!e8Var.f45063d) {
                this.params_ = e8Var.f();
            }
            return this.params_;
        }

        private com.google.protobuf.e8 internalGetParams() {
            return this.params_;
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder newBuilder() {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseDelimitedFrom(java.io.InputStream inputStream) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z17) {
            this.bitField0_ |= 1;
            this.enabled_ = z17;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean containsParams(java.lang.String str) {
            str.getClass();
            return internalGetParams().containsKey(str);
        }

        @Override // com.google.protobuf.n5
        public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (l5Var) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new java.lang.Object[]{"bitField0_", "enabled_", "params_", org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.ParamsDefaultEntryHolder.defaultEntry});
                case NEW_MUTABLE_INSTANCE:
                    return new org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState();
                case NEW_BUILDER:
                    return new org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.class) {
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

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, com.google.protobuf.y> getParams() {
            return getParamsMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public int getParamsCount() {
            return internalGetParams().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public java.util.Map<java.lang.String, com.google.protobuf.y> getParamsMap() {
            return java.util.Collections.unmodifiableMap(internalGetParams());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public com.google.protobuf.y getParamsOrDefault(java.lang.String str, com.google.protobuf.y yVar) {
            str.getClass();
            com.google.protobuf.e8 internalGetParams = internalGetParams();
            return internalGetParams.containsKey(str) ? (com.google.protobuf.y) internalGetParams.get(str) : yVar;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public com.google.protobuf.y getParamsOrThrow(java.lang.String str) {
            str.getClass();
            com.google.protobuf.e8 internalGetParams = internalGetParams();
            if (internalGetParams.containsKey(str)) {
                return (com.google.protobuf.y) internalGetParams.get(str);
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder newBuilder(org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder) DEFAULT_INSTANCE.createBuilder(featureState);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(com.google.protobuf.y yVar) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(byte[] bArr) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(java.io.InputStream inputStream) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(com.google.protobuf.d0 d0Var) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes16.dex */
    public interface FeatureStateOrBuilder extends com.google.protobuf.p8 {
        boolean containsParams(java.lang.String str);

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        boolean getEnabled();

        @java.lang.Deprecated
        java.util.Map<java.lang.String, com.google.protobuf.y> getParams();

        int getParamsCount();

        java.util.Map<java.lang.String, com.google.protobuf.y> getParamsMap();

        com.google.protobuf.y getParamsOrDefault(java.lang.String str, com.google.protobuf.y yVar);

        com.google.protobuf.y getParamsOrThrow(java.lang.String str);

        boolean hasEnabled();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes16.dex */
    public static final class FeatureStatesDefaultEntryHolder {
        static final com.google.protobuf.v7 defaultEntry = new com.google.protobuf.v7(com.google.protobuf.ub.f45591f, "", com.google.protobuf.ub.f45593h, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.getDefaultInstance());

        private FeatureStatesDefaultEntryHolder() {
        }
    }

    static {
        org.chromium.net.httpflags.BaseFeatureOverrides baseFeatureOverrides = new org.chromium.net.httpflags.BaseFeatureOverrides();
        DEFAULT_INSTANCE = baseFeatureOverrides;
        com.google.protobuf.n5.registerDefaultInstance(org.chromium.net.httpflags.BaseFeatureOverrides.class, baseFeatureOverrides);
    }

    private BaseFeatureOverrides() {
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getMutableFeatureStatesMap() {
        return internalGetMutableFeatureStates();
    }

    private com.google.protobuf.e8 internalGetFeatureStates() {
        return this.featureStates_;
    }

    private com.google.protobuf.e8 internalGetMutableFeatureStates() {
        com.google.protobuf.e8 e8Var = this.featureStates_;
        if (!e8Var.f45063d) {
            this.featureStates_ = e8Var.f();
        }
        return this.featureStates_;
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides.Builder newBuilder() {
        return (org.chromium.net.httpflags.BaseFeatureOverrides.Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseDelimitedFrom(java.io.InputStream inputStream) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public boolean containsFeatureStates(java.lang.String str) {
        str.getClass();
        return internalGetFeatureStates().containsKey(str);
    }

    @Override // com.google.protobuf.n5
    public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (l5Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"featureStates_", org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStatesDefaultEntryHolder.defaultEntry});
            case NEW_MUTABLE_INSTANCE:
                return new org.chromium.net.httpflags.BaseFeatureOverrides();
            case NEW_BUILDER:
                return new org.chromium.net.httpflags.BaseFeatureOverrides.Builder();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                com.google.protobuf.e9 e9Var = PARSER;
                if (e9Var == null) {
                    synchronized (org.chromium.net.httpflags.BaseFeatureOverrides.class) {
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

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStates() {
        return getFeatureStatesMap();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public int getFeatureStatesCount() {
        return internalGetFeatureStates().size();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStatesMap() {
        return java.util.Collections.unmodifiableMap(internalGetFeatureStates());
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(java.lang.String str, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState) {
        str.getClass();
        com.google.protobuf.e8 internalGetFeatureStates = internalGetFeatureStates();
        return internalGetFeatureStates.containsKey(str) ? (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) internalGetFeatureStates.get(str) : featureState;
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(java.lang.String str) {
        str.getClass();
        com.google.protobuf.e8 internalGetFeatureStates = internalGetFeatureStates();
        if (internalGetFeatureStates.containsKey(str)) {
            return (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) internalGetFeatureStates.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides.Builder newBuilder(org.chromium.net.httpflags.BaseFeatureOverrides baseFeatureOverrides) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides.Builder) DEFAULT_INSTANCE.createBuilder(baseFeatureOverrides);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(com.google.protobuf.y yVar) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(byte[] bArr) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(java.io.InputStream inputStream) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(com.google.protobuf.d0 d0Var) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.BaseFeatureOverrides) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
    }
}
