package org.chromium.net.httpflags;

/* loaded from: classes16.dex */
public final class Flags extends com.google.protobuf.n5 implements org.chromium.net.httpflags.FlagsOrBuilder {
    private static final org.chromium.net.httpflags.Flags DEFAULT_INSTANCE;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile com.google.protobuf.e9 PARSER;
    private com.google.protobuf.e8 flags_ = com.google.protobuf.e8.f45062e;

    /* renamed from: org.chromium.net.httpflags.Flags$1, reason: invalid class name */
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
    public static final class Builder extends com.google.protobuf.h5 implements org.chromium.net.httpflags.FlagsOrBuilder {
        public org.chromium.net.httpflags.Flags.Builder clearFlags() {
            copyOnWrite();
            ((org.chromium.net.httpflags.Flags) this.instance).getMutableFlagsMap().clear();
            return this;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public boolean containsFlags(java.lang.String str) {
            str.getClass();
            return ((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap().containsKey(str);
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlags() {
            return getFlagsMap();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public int getFlagsCount() {
            return ((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap().size();
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlagsMap() {
            return java.util.Collections.unmodifiableMap(((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap());
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public org.chromium.net.httpflags.FlagValue getFlagsOrDefault(java.lang.String str, org.chromium.net.httpflags.FlagValue flagValue) {
            str.getClass();
            java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> flagsMap = ((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap();
            return flagsMap.containsKey(str) ? flagsMap.get(str) : flagValue;
        }

        @Override // org.chromium.net.httpflags.FlagsOrBuilder
        public org.chromium.net.httpflags.FlagValue getFlagsOrThrow(java.lang.String str) {
            str.getClass();
            java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> flagsMap = ((org.chromium.net.httpflags.Flags) this.instance).getFlagsMap();
            if (flagsMap.containsKey(str)) {
                return flagsMap.get(str);
            }
            throw new java.lang.IllegalArgumentException();
        }

        public org.chromium.net.httpflags.Flags.Builder putAllFlags(java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> map) {
            copyOnWrite();
            ((org.chromium.net.httpflags.Flags) this.instance).getMutableFlagsMap().putAll(map);
            return this;
        }

        public org.chromium.net.httpflags.Flags.Builder putFlags(java.lang.String str, org.chromium.net.httpflags.FlagValue flagValue) {
            str.getClass();
            flagValue.getClass();
            copyOnWrite();
            ((org.chromium.net.httpflags.Flags) this.instance).getMutableFlagsMap().put(str, flagValue);
            return this;
        }

        public org.chromium.net.httpflags.Flags.Builder removeFlags(java.lang.String str) {
            str.getClass();
            copyOnWrite();
            ((org.chromium.net.httpflags.Flags) this.instance).getMutableFlagsMap().remove(str);
            return this;
        }

        private Builder() {
            super(org.chromium.net.httpflags.Flags.DEFAULT_INSTANCE);
        }
    }

    /* loaded from: classes16.dex */
    public static final class FlagsDefaultEntryHolder {
        static final com.google.protobuf.v7 defaultEntry = new com.google.protobuf.v7(com.google.protobuf.ub.f45591f, "", com.google.protobuf.ub.f45593h, org.chromium.net.httpflags.FlagValue.getDefaultInstance());

        private FlagsDefaultEntryHolder() {
        }
    }

    static {
        org.chromium.net.httpflags.Flags flags = new org.chromium.net.httpflags.Flags();
        DEFAULT_INSTANCE = flags;
        com.google.protobuf.n5.registerDefaultInstance(org.chromium.net.httpflags.Flags.class, flags);
    }

    private Flags() {
    }

    public static org.chromium.net.httpflags.Flags getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getMutableFlagsMap() {
        return internalGetMutableFlags();
    }

    private com.google.protobuf.e8 internalGetFlags() {
        return this.flags_;
    }

    private com.google.protobuf.e8 internalGetMutableFlags() {
        com.google.protobuf.e8 e8Var = this.flags_;
        if (!e8Var.f45063d) {
            this.flags_ = e8Var.f();
        }
        return this.flags_;
    }

    public static org.chromium.net.httpflags.Flags.Builder newBuilder() {
        return (org.chromium.net.httpflags.Flags.Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static org.chromium.net.httpflags.Flags parseDelimitedFrom(java.io.InputStream inputStream) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(java.nio.ByteBuffer byteBuffer) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static com.google.protobuf.e9 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public boolean containsFlags(java.lang.String str) {
        str.getClass();
        return internalGetFlags().containsKey(str);
    }

    @Override // com.google.protobuf.n5
    public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
        switch (l5Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"flags_", org.chromium.net.httpflags.Flags.FlagsDefaultEntryHolder.defaultEntry});
            case NEW_MUTABLE_INSTANCE:
                return new org.chromium.net.httpflags.Flags();
            case NEW_BUILDER:
                return new org.chromium.net.httpflags.Flags.Builder();
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                com.google.protobuf.e9 e9Var = PARSER;
                if (e9Var == null) {
                    synchronized (org.chromium.net.httpflags.Flags.class) {
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

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlags() {
        return getFlagsMap();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public int getFlagsCount() {
        return internalGetFlags().size();
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlagsMap() {
        return java.util.Collections.unmodifiableMap(internalGetFlags());
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public org.chromium.net.httpflags.FlagValue getFlagsOrDefault(java.lang.String str, org.chromium.net.httpflags.FlagValue flagValue) {
        str.getClass();
        com.google.protobuf.e8 internalGetFlags = internalGetFlags();
        return internalGetFlags.containsKey(str) ? (org.chromium.net.httpflags.FlagValue) internalGetFlags.get(str) : flagValue;
    }

    @Override // org.chromium.net.httpflags.FlagsOrBuilder
    public org.chromium.net.httpflags.FlagValue getFlagsOrThrow(java.lang.String str) {
        str.getClass();
        com.google.protobuf.e8 internalGetFlags = internalGetFlags();
        if (internalGetFlags.containsKey(str)) {
            return (org.chromium.net.httpflags.FlagValue) internalGetFlags.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static org.chromium.net.httpflags.Flags.Builder newBuilder(org.chromium.net.httpflags.Flags flags) {
        return (org.chromium.net.httpflags.Flags.Builder) DEFAULT_INSTANCE.createBuilder(flags);
    }

    public static org.chromium.net.httpflags.Flags parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(com.google.protobuf.y yVar) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(byte[] bArr) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(java.io.InputStream inputStream) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(com.google.protobuf.d0 d0Var) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
    }

    public static org.chromium.net.httpflags.Flags parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        return (org.chromium.net.httpflags.Flags) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
    }
}
