package ig;

/* loaded from: classes16.dex */
public interface f extends com.google.protobuf.r8 {
    /* synthetic */ java.util.List findInitializationErrors();

    java.lang.String getAiTags();

    com.google.protobuf.y getAiTagsBytes();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.util.Map getAllFields();

    java.lang.String getAspectRatio();

    com.google.protobuf.y getAspectRatioBytes();

    java.lang.String getAssetFilePath();

    com.google.protobuf.y getAssetFilePathBytes();

    java.lang.String getAssetIdentifier();

    com.google.protobuf.y getAssetIdentifierBytes();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.k8 getDefaultInstanceForType();

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.r3 getDescriptorForType();

    long getDurationMs();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.lang.Object getField(com.google.protobuf.b4 b4Var);

    int getImageClassExceeds(int i17);

    int getImageClassExceedsCount();

    java.util.List<java.lang.Integer> getImageClassExceedsList();

    int getImageClassLabels(int i17);

    int getImageClassLabelsCount();

    java.util.List<java.lang.Integer> getImageClassLabelsList();

    /* synthetic */ java.lang.String getInitializationErrorString();

    boolean getIsOverThreshold();

    ig.k getMediaType();

    /* synthetic */ com.google.protobuf.b4 getOneofFieldDescriptor(com.google.protobuf.g4 g4Var);

    java.lang.String getOriginId();

    com.google.protobuf.y getOriginIdBytes();

    /* synthetic */ java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17);

    /* synthetic */ int getRepeatedFieldCount(com.google.protobuf.b4 b4Var);

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.wa getUnknownFields();

    int getVideoClassAudioLabels(int i17);

    int getVideoClassAudioLabelsCount();

    java.util.List<java.lang.Integer> getVideoClassAudioLabelsList();

    int getVideoClassVisualExceeds(int i17);

    int getVideoClassVisualExceedsCount();

    java.util.List<java.lang.Integer> getVideoClassVisualExceedsList();

    int getVideoClassVisualLabels(int i17);

    int getVideoClassVisualLabelsCount();

    java.util.List<java.lang.Integer> getVideoClassVisualLabelsList();

    boolean hasAiTags();

    boolean hasAspectRatio();

    boolean hasAssetFilePath();

    boolean hasAssetIdentifier();

    boolean hasDurationMs();

    @Override // com.google.protobuf.r8
    /* synthetic */ boolean hasField(com.google.protobuf.b4 b4Var);

    boolean hasIsOverThreshold();

    boolean hasMediaType();

    /* synthetic */ boolean hasOneof(com.google.protobuf.g4 g4Var);

    boolean hasOriginId();

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
