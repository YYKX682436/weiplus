package org.chromium.net.httpflags;

/* loaded from: classes16.dex */
public interface FlagsOrBuilder extends com.google.protobuf.p8 {
    boolean containsFlags(java.lang.String str);

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @java.lang.Deprecated
    java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlags();

    int getFlagsCount();

    java.util.Map<java.lang.String, org.chromium.net.httpflags.FlagValue> getFlagsMap();

    org.chromium.net.httpflags.FlagValue getFlagsOrDefault(java.lang.String str, org.chromium.net.httpflags.FlagValue flagValue);

    org.chromium.net.httpflags.FlagValue getFlagsOrThrow(java.lang.String str);

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
