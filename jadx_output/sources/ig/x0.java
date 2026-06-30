package ig;

/* loaded from: classes16.dex */
public interface x0 extends com.google.protobuf.r8 {
    /* synthetic */ java.util.List findInitializationErrors();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.util.Map getAllFields();

    long getBeginTimeStamp();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.k8 getDefaultInstanceForType();

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.r3 getDescriptorForType();

    java.lang.String getEndReason();

    com.google.protobuf.y getEndReasonBytes();

    int getEnterScene();

    java.lang.String getEntryType();

    com.google.protobuf.y getEntryTypeBytes();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.lang.Object getField(com.google.protobuf.b4 b4Var);

    long getFirstImpressionTimeCostMs();

    /* synthetic */ java.lang.String getInitializationErrorString();

    java.lang.String getLastStateId();

    com.google.protobuf.y getLastStateIdBytes();

    java.lang.String getLastViewId();

    com.google.protobuf.y getLastViewIdBytes();

    java.lang.String getMaasVersion();

    com.google.protobuf.y getMaasVersionBytes();

    ig.f0 getMcMetrics();

    ig.g0 getMcMetricsOrBuilder();

    com.tencent.maas.analytics.MJAnalyticsS12$MJPublisherMetricsType getMetricsType();

    long getMetricsVersion();

    /* synthetic */ com.google.protobuf.b4 getOneofFieldDescriptor(com.google.protobuf.g4 g4Var);

    int getParentEnterScene();

    java.lang.String getPostId();

    com.google.protobuf.y getPostIdBytes();

    /* synthetic */ java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17);

    /* synthetic */ int getRepeatedFieldCount(com.google.protobuf.b4 b4Var);

    ig.f0 getResultInfoMc();

    ig.f0 getResultInfoMcMaterial();

    ig.g0 getResultInfoMcMaterialOrBuilder();

    ig.g0 getResultInfoMcOrBuilder();

    ig.f0 getResultInfoMedia();

    ig.g0 getResultInfoMediaOrBuilder();

    ig.f0 getResultInfoSc();

    ig.g0 getResultInfoScOrBuilder();

    java.lang.String getResultOriginType();

    com.google.protobuf.y getResultOriginTypeBytes();

    ig.f0 getScMetrics();

    ig.g0 getScMetricsOrBuilder();

    ig.f0 getScPreload();

    ig.g0 getScPreloadOrBuilder();

    ig.f0 getScPreviewPref();

    ig.g0 getScPreviewPrefOrBuilder();

    ig.f0 getScRecordPref();

    ig.g0 getScRecordPrefOrBuilder();

    java.lang.String getSessionId();

    com.google.protobuf.y getSessionIdBytes();

    ig.f0 getStartupOptions();

    ig.g0 getStartupOptionsOrBuilder();

    long getTotalDownloadBytes();

    long getTotalDurationMs();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.wa getUnknownFields();

    long getValidationCode();

    long getVisitedStates();

    long getVisitedViews();

    boolean hasBeginTimeStamp();

    boolean hasEndReason();

    boolean hasEnterScene();

    boolean hasEntryType();

    @Override // com.google.protobuf.r8
    /* synthetic */ boolean hasField(com.google.protobuf.b4 b4Var);

    boolean hasFirstImpressionTimeCostMs();

    boolean hasLastStateId();

    boolean hasLastViewId();

    boolean hasMaasVersion();

    boolean hasMcMetrics();

    boolean hasMetricsType();

    boolean hasMetricsVersion();

    /* synthetic */ boolean hasOneof(com.google.protobuf.g4 g4Var);

    boolean hasParentEnterScene();

    boolean hasPostId();

    boolean hasResultInfoMc();

    boolean hasResultInfoMcMaterial();

    boolean hasResultInfoMedia();

    boolean hasResultInfoSc();

    boolean hasResultOriginType();

    boolean hasScMetrics();

    boolean hasScPreload();

    boolean hasScPreviewPref();

    boolean hasScRecordPref();

    boolean hasSessionId();

    boolean hasStartupOptions();

    boolean hasTotalDownloadBytes();

    boolean hasTotalDurationMs();

    boolean hasValidationCode();

    boolean hasVisitedStates();

    boolean hasVisitedViews();

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
