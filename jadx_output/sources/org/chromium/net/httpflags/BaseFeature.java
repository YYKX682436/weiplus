package org.chromium.net.httpflags;

/* loaded from: classes16.dex */
public final class BaseFeature {
    public static final java.lang.String FLAG_PREFIX = "ChromiumBaseFeature_";
    public static final java.lang.String PARAM_DELIMITER = "_PARAM_";

    /* renamed from: org.chromium.net.httpflags.BaseFeature$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type;

        static {
            int[] iArr = new int[org.chromium.net.httpflags.ResolvedFlags.Value.Type.values().length];
            $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type = iArr;
            try {
                iArr[org.chromium.net.httpflags.ResolvedFlags.Value.Type.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[org.chromium.net.httpflags.ResolvedFlags.Value.Type.INT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[org.chromium.net.httpflags.ResolvedFlags.Value.Type.FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[org.chromium.net.httpflags.ResolvedFlags.Value.Type.STRING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[org.chromium.net.httpflags.ResolvedFlags.Value.Type.BYTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static final class ParsedFlagName {
        public java.lang.String featureName;
        public java.lang.String paramName;

        private ParsedFlagName() {
        }
    }

    private BaseFeature() {
    }

    private static void applyOverride(java.lang.String str, org.chromium.net.httpflags.ResolvedFlags.Value value, java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder> map) {
        org.chromium.net.httpflags.BaseFeature.ParsedFlagName parseFlagName = parseFlagName(str);
        if (parseFlagName == null) {
            return;
        }
        org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder builder = map.get(parseFlagName.featureName);
        if (builder == null) {
            builder = org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.newBuilder();
            map.put(parseFlagName.featureName, builder);
        }
        java.lang.String str2 = parseFlagName.paramName;
        if (str2 == null) {
            applyStateOverride(value, builder);
        } else {
            applyParamOverride(str2, value, builder);
        }
    }

    private static void applyParamOverride(java.lang.String str, org.chromium.net.httpflags.ResolvedFlags.Value value, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder builder) {
        com.google.protobuf.w wVar;
        com.google.protobuf.y yVar;
        org.chromium.net.httpflags.ResolvedFlags.Value.Type type = value.getType();
        int i17 = org.chromium.net.httpflags.BaseFeature.AnonymousClass1.$SwitchMap$org$chromium$net$httpflags$ResolvedFlags$Value$Type[type.ordinal()];
        if (i17 == 1) {
            java.lang.String str2 = value.getBoolValue() ? "true" : "false";
            java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
            com.google.protobuf.y yVar2 = com.google.protobuf.y.f45712e;
            wVar = new com.google.protobuf.w(str2.getBytes(charset));
        } else if (i17 == 2) {
            java.lang.String l17 = java.lang.Long.toString(value.getIntValue(), 10);
            java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.UTF_8;
            com.google.protobuf.y yVar3 = com.google.protobuf.y.f45712e;
            wVar = new com.google.protobuf.w(l17.getBytes(charset2));
        } else if (i17 == 3) {
            java.lang.String f17 = java.lang.Float.toString(value.getFloatValue());
            java.nio.charset.Charset charset3 = java.nio.charset.StandardCharsets.UTF_8;
            com.google.protobuf.y yVar4 = com.google.protobuf.y.f45712e;
            wVar = new com.google.protobuf.w(f17.getBytes(charset3));
        } else {
            if (i17 != 4) {
                if (i17 == 5) {
                    yVar = value.getBytesValue();
                    builder.putParams(str, yVar);
                } else {
                    throw new java.lang.UnsupportedOperationException("Unsupported HTTP flag value type for base::Feature param `" + str + "`: " + type);
                }
            }
            java.lang.String stringValue = value.getStringValue();
            java.nio.charset.Charset charset4 = java.nio.charset.StandardCharsets.UTF_8;
            com.google.protobuf.y yVar5 = com.google.protobuf.y.f45712e;
            wVar = new com.google.protobuf.w(stringValue.getBytes(charset4));
        }
        yVar = wVar;
        builder.putParams(str, yVar);
    }

    private static void applyStateOverride(org.chromium.net.httpflags.ResolvedFlags.Value value, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder builder) {
        org.chromium.net.httpflags.ResolvedFlags.Value.Type type = value.getType();
        if (type == org.chromium.net.httpflags.ResolvedFlags.Value.Type.BOOL) {
            builder.setEnabled(value.getBoolValue());
            return;
        }
        throw new java.lang.IllegalArgumentException("HTTP flag has type " + type + ", but only boolean flags are supported as base::Feature overrides");
    }

    public static org.chromium.net.httpflags.BaseFeatureOverrides getOverrides(org.chromium.net.httpflags.ResolvedFlags resolvedFlags) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, org.chromium.net.httpflags.ResolvedFlags.Value> entry : resolvedFlags.flags().entrySet()) {
            try {
                applyOverride(entry.getKey(), entry.getValue(), hashMap);
            } catch (java.lang.RuntimeException e17) {
                throw new java.lang.IllegalArgumentException("Could not parse HTTP flag `" + entry.getKey() + "` as a base::Feature override", e17);
            }
        }
        org.chromium.net.httpflags.BaseFeatureOverrides.Builder newBuilder = org.chromium.net.httpflags.BaseFeatureOverrides.newBuilder();
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            newBuilder.putFeatureStates((java.lang.String) entry2.getKey(), (org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState) ((org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState.Builder) entry2.getValue()).build());
        }
        return (org.chromium.net.httpflags.BaseFeatureOverrides) newBuilder.build();
    }

    private static org.chromium.net.httpflags.BaseFeature.ParsedFlagName parseFlagName(java.lang.String str) {
        if (!str.startsWith(FLAG_PREFIX)) {
            return null;
        }
        java.lang.String substring = str.substring(20);
        org.chromium.net.httpflags.BaseFeature.ParsedFlagName parsedFlagName = new org.chromium.net.httpflags.BaseFeature.ParsedFlagName();
        int indexOf = substring.indexOf(PARAM_DELIMITER);
        if (indexOf < 0) {
            parsedFlagName.featureName = substring;
        } else {
            parsedFlagName.featureName = substring.substring(0, indexOf);
            parsedFlagName.paramName = substring.substring(indexOf + 7);
        }
        return parsedFlagName;
    }
}
