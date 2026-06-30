package org.chromium.net.httpflags;

/* loaded from: classes16.dex */
public interface BaseFeatureOverridesOrBuilder extends com.google.protobuf.p8 {
    boolean containsFeatureStates(java.lang.String str);

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @java.lang.Deprecated
    java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStates();

    int getFeatureStatesCount();

    java.util.Map<java.lang.String, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState> getFeatureStatesMap();

    org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrDefault(java.lang.String str, org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState featureState);

    org.chromium.net.httpflags.BaseFeatureOverrides.FeatureState getFeatureStatesOrThrow(java.lang.String str);

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
