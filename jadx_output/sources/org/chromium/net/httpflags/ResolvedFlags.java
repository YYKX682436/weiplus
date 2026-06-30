package org.chromium.net.httpflags;

/* loaded from: classes13.dex */
public final class ResolvedFlags {
    private final java.util.Map<java.lang.String, org.chromium.net.httpflags.ResolvedFlags.Value> mFlags;

    /* renamed from: org.chromium.net.httpflags.ResolvedFlags$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase;

        static {
            int[] iArr = new int[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.values().length];
            $SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase = iArr;
            try {
                iArr[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.BOOL_VALUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.INT_VALUE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.FLOAT_VALUE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.STRING_VALUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.BYTES_VALUE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase[org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase.VALUE_NOT_SET.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public ResolvedFlags(java.util.Map<java.lang.String, org.chromium.net.httpflags.ResolvedFlags.Value> map) {
        this.mFlags = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] parseVersionString(java.lang.String str) {
        try {
            if (str.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Version string is empty");
            }
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
            int countTokens = stringTokenizer.countTokens();
            int[] iArr = new int[countTokens];
            for (int i17 = 0; i17 < countTokens; i17++) {
                iArr[i17] = java.lang.Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (java.lang.RuntimeException e17) {
            throw new java.lang.IllegalArgumentException("Unable to parse HTTP flags version string: `" + str + "`", e17);
        }
    }

    public static org.chromium.net.httpflags.ResolvedFlags resolve(org.chromium.net.httpflags.Flags flags, java.lang.String str, java.lang.String str2) {
        int[] parseVersionString = parseVersionString(str2);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, org.chromium.net.httpflags.FlagValue> entry : flags.getFlagsMap().entrySet()) {
            try {
                org.chromium.net.httpflags.ResolvedFlags.Value resolve = org.chromium.net.httpflags.ResolvedFlags.Value.resolve(entry.getValue(), str, parseVersionString);
                if (resolve != null) {
                    hashMap.put(entry.getKey(), resolve);
                }
            } catch (java.lang.RuntimeException e17) {
                throw new java.lang.IllegalArgumentException("Unable to resolve HTTP flag `" + entry.getKey() + "`", e17);
            }
        }
        return new org.chromium.net.httpflags.ResolvedFlags(hashMap);
    }

    public java.util.Map<java.lang.String, org.chromium.net.httpflags.ResolvedFlags.Value> flags() {
        return java.util.Collections.unmodifiableMap(this.mFlags);
    }

    /* loaded from: classes16.dex */
    public static final class Value {
        private final java.lang.Object mValue;

        /* loaded from: classes16.dex */
        public enum Type {
            BOOL,
            INT,
            FLOAT,
            STRING,
            BYTES
        }

        public Value(boolean z17) {
            this.mValue = java.lang.Boolean.valueOf(z17);
        }

        private void checkType(org.chromium.net.httpflags.ResolvedFlags.Value.Type type) {
            org.chromium.net.httpflags.ResolvedFlags.Value.Type type2 = getType();
            if (type == type2) {
                return;
            }
            throw new java.lang.IllegalStateException("Attempted to access flag value as " + type + ", but actual type is " + type2);
        }

        private static org.chromium.net.httpflags.ResolvedFlags.Value fromConstrainedValue(org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue) {
            org.chromium.net.httpflags.FlagValue.ConstrainedValue.ValueCase valueCase = constrainedValue.getValueCase();
            switch (org.chromium.net.httpflags.ResolvedFlags.AnonymousClass1.$SwitchMap$org$chromium$net$httpflags$FlagValue$ConstrainedValue$ValueCase[valueCase.ordinal()]) {
                case 1:
                    return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getBoolValue());
                case 2:
                    return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getIntValue());
                case 3:
                    return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getFloatValue());
                case 4:
                    return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getStringValue());
                case 5:
                    return new org.chromium.net.httpflags.ResolvedFlags.Value(constrainedValue.getBytesValue());
                case 6:
                    return null;
                default:
                    throw new java.lang.IllegalArgumentException("Flag value uses unknown value type " + valueCase);
            }
        }

        private static boolean matchesVersion(int[] iArr, int[] iArr2) {
            int i17 = 0;
            while (i17 < java.lang.Math.max(iArr.length, iArr2.length)) {
                int i18 = i17 < iArr.length ? iArr[i17] : 0;
                int i19 = i17 < iArr2.length ? iArr2[i17] : 0;
                if (i18 > i19) {
                    return true;
                }
                if (i18 < i19) {
                    return false;
                }
                i17++;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static org.chromium.net.httpflags.ResolvedFlags.Value resolve(org.chromium.net.httpflags.FlagValue flagValue, java.lang.String str, int[] iArr) {
            for (org.chromium.net.httpflags.FlagValue.ConstrainedValue constrainedValue : flagValue.getConstrainedValuesList()) {
                if (!constrainedValue.hasAppId() || constrainedValue.getAppId().equals(str)) {
                    if (!constrainedValue.hasMinVersion() || matchesVersion(iArr, org.chromium.net.httpflags.ResolvedFlags.parseVersionString(constrainedValue.getMinVersion()))) {
                        return fromConstrainedValue(constrainedValue);
                    }
                }
            }
            return null;
        }

        public boolean getBoolValue() {
            checkType(org.chromium.net.httpflags.ResolvedFlags.Value.Type.BOOL);
            return ((java.lang.Boolean) this.mValue).booleanValue();
        }

        public com.google.protobuf.y getBytesValue() {
            checkType(org.chromium.net.httpflags.ResolvedFlags.Value.Type.BYTES);
            return (com.google.protobuf.y) this.mValue;
        }

        public float getFloatValue() {
            checkType(org.chromium.net.httpflags.ResolvedFlags.Value.Type.FLOAT);
            return ((java.lang.Float) this.mValue).floatValue();
        }

        public long getIntValue() {
            checkType(org.chromium.net.httpflags.ResolvedFlags.Value.Type.INT);
            return ((java.lang.Long) this.mValue).longValue();
        }

        public java.lang.String getStringValue() {
            checkType(org.chromium.net.httpflags.ResolvedFlags.Value.Type.STRING);
            return (java.lang.String) this.mValue;
        }

        public org.chromium.net.httpflags.ResolvedFlags.Value.Type getType() {
            java.lang.Object obj = this.mValue;
            if (obj instanceof java.lang.Boolean) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.BOOL;
            }
            if (obj instanceof java.lang.Long) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.INT;
            }
            if (obj instanceof java.lang.Float) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.FLOAT;
            }
            if (obj instanceof java.lang.String) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.STRING;
            }
            if (obj instanceof com.google.protobuf.y) {
                return org.chromium.net.httpflags.ResolvedFlags.Value.Type.BYTES;
            }
            throw new java.lang.IllegalStateException("Unexpected flag value type: ".concat(this.mValue.getClass().getName()));
        }

        public Value(long j17) {
            this.mValue = java.lang.Long.valueOf(j17);
        }

        public Value(float f17) {
            this.mValue = java.lang.Float.valueOf(f17);
        }

        public Value(java.lang.String str) {
            this.mValue = str;
        }

        public Value(com.google.protobuf.y yVar) {
            this.mValue = yVar;
        }
    }
}
