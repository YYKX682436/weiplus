package ig;

/* loaded from: classes16.dex */
public interface k0 extends com.google.protobuf.r8 {
    /* synthetic */ java.util.List findInitializationErrors();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.util.Map getAllFields();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.k8 getDefaultInstanceForType();

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.r3 getDescriptorForType();

    ig.f0 getDetails();

    ig.g0 getDetailsOrBuilder();

    int getEnterScene();

    java.lang.String getEntryType();

    com.google.protobuf.y getEntryTypeBytes();

    java.lang.String getEventName();

    com.google.protobuf.y getEventNameBytes();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.lang.Object getField(com.google.protobuf.b4 b4Var);

    /* synthetic */ java.lang.String getInitializationErrorString();

    java.lang.String getMaasVersion();

    com.google.protobuf.y getMaasVersionBytes();

    com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType getMetricsType();

    /* synthetic */ com.google.protobuf.b4 getOneofFieldDescriptor(com.google.protobuf.g4 g4Var);

    java.lang.String getPostId();

    com.google.protobuf.y getPostIdBytes();

    /* synthetic */ java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17);

    /* synthetic */ int getRepeatedFieldCount(com.google.protobuf.b4 b4Var);

    java.lang.String getSessionId();

    com.google.protobuf.y getSessionIdBytes();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.wa getUnknownFields();

    boolean hasDetails();

    boolean hasEnterScene();

    boolean hasEntryType();

    boolean hasEventName();

    @Override // com.google.protobuf.r8
    /* synthetic */ boolean hasField(com.google.protobuf.b4 b4Var);

    boolean hasMaasVersion();

    boolean hasMetricsType();

    /* synthetic */ boolean hasOneof(com.google.protobuf.g4 g4Var);

    boolean hasPostId();

    boolean hasSessionId();

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
