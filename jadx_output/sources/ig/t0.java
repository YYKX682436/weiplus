package ig;

/* loaded from: classes16.dex */
public interface t0 extends com.google.protobuf.r8 {
    /* synthetic */ java.util.List findInitializationErrors();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.util.Map getAllFields();

    long getBeginTimeStamp();

    java.lang.String getCamSource();

    com.google.protobuf.y getCamSourceBytes();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.k8 getDefaultInstanceForType();

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.r3 getDescriptorForType();

    ig.f0 getDetails();

    ig.g0 getDetailsOrBuilder();

    java.lang.String getEndReason();

    com.google.protobuf.y getEndReasonBytes();

    int getEnterScene();

    java.lang.String getEntryType();

    com.google.protobuf.y getEntryTypeBytes();

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

    java.lang.String getTaskId();

    com.google.protobuf.y getTaskIdBytes();

    java.lang.String getTaskName();

    com.google.protobuf.y getTaskNameBytes();

    java.lang.String getTemplateId();

    com.google.protobuf.y getTemplateIdBytes();

    long getTemplateIndex();

    java.lang.String getTemplateSelectReason();

    com.google.protobuf.y getTemplateSelectReasonBytes();

    long getTotalDurationMs();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.wa getUnknownFields();

    boolean hasBeginTimeStamp();

    boolean hasCamSource();

    boolean hasDetails();

    boolean hasEndReason();

    boolean hasEnterScene();

    boolean hasEntryType();

    @Override // com.google.protobuf.r8
    /* synthetic */ boolean hasField(com.google.protobuf.b4 b4Var);

    boolean hasMaasVersion();

    boolean hasMetricsType();

    /* synthetic */ boolean hasOneof(com.google.protobuf.g4 g4Var);

    boolean hasPostId();

    boolean hasSessionId();

    boolean hasTaskId();

    boolean hasTaskName();

    boolean hasTemplateId();

    boolean hasTemplateIndex();

    boolean hasTemplateSelectReason();

    boolean hasTotalDurationMs();

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
