package ig;

/* loaded from: classes16.dex */
public interface o extends com.google.protobuf.r8 {
    /* synthetic */ java.util.List findInitializationErrors();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.util.Map getAllFields();

    ig.e getAssets(int i17);

    int getAssetsCount();

    java.util.List<ig.e> getAssetsList();

    ig.f getAssetsOrBuilder(int i17);

    java.util.List<? extends ig.f> getAssetsOrBuilderList();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.k8 getDefaultInstanceForType();

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.r3 getDescriptorForType();

    long getExportDurationMs();

    java.lang.String getExportMusicId();

    com.google.protobuf.y getExportMusicIdBytes();

    java.lang.String getExportMusicSongName();

    com.google.protobuf.y getExportMusicSongNameBytes();

    ig.p getExportMusicSourceType();

    java.lang.String getExportTemplateId();

    com.google.protobuf.y getExportTemplateIdBytes();

    ig.c0 getExportTemplateSourceType();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.lang.Object getField(com.google.protobuf.b4 b4Var);

    java.lang.String getFixedTemplateIds(int i17);

    com.google.protobuf.y getFixedTemplateIdsBytes(int i17);

    int getFixedTemplateIdsCount();

    java.util.List<java.lang.String> getFixedTemplateIdsList();

    /* synthetic */ java.lang.String getInitializationErrorString();

    /* synthetic */ com.google.protobuf.b4 getOneofFieldDescriptor(com.google.protobuf.g4 g4Var);

    /* synthetic */ java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17);

    /* synthetic */ int getRepeatedFieldCount(com.google.protobuf.b4 b4Var);

    ig.w getTemplateActions(int i17);

    int getTemplateActionsCount();

    java.util.List<ig.w> getTemplateActionsList();

    ig.x getTemplateActionsOrBuilder(int i17);

    java.util.List<? extends ig.x> getTemplateActionsOrBuilderList();

    ig.a0 getTemplateRecommendation();

    ig.b0 getTemplateRecommendationOrBuilder();

    long getTotalPreviewDurationMs();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.wa getUnknownFields();

    boolean hasExportDurationMs();

    boolean hasExportMusicId();

    boolean hasExportMusicSongName();

    boolean hasExportMusicSourceType();

    boolean hasExportTemplateId();

    boolean hasExportTemplateSourceType();

    @Override // com.google.protobuf.r8
    /* synthetic */ boolean hasField(com.google.protobuf.b4 b4Var);

    /* synthetic */ boolean hasOneof(com.google.protobuf.g4 g4Var);

    boolean hasTemplateRecommendation();

    boolean hasTotalPreviewDurationMs();

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
