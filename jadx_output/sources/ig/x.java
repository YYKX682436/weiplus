package ig;

/* loaded from: classes16.dex */
public interface x extends com.google.protobuf.r8 {
    /* synthetic */ java.util.List findInitializationErrors();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.util.Map getAllFields();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.k8 getDefaultInstanceForType();

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.r3 getDescriptorForType();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.lang.Object getField(com.google.protobuf.b4 b4Var);

    /* synthetic */ java.lang.String getInitializationErrorString();

    ig.s getMusicActions(int i17);

    int getMusicActionsCount();

    java.util.List<ig.s> getMusicActionsList();

    ig.t getMusicActionsOrBuilder(int i17);

    java.util.List<? extends ig.t> getMusicActionsOrBuilderList();

    /* synthetic */ com.google.protobuf.b4 getOneofFieldDescriptor(com.google.protobuf.g4 g4Var);

    long getPreviewDurationMs();

    java.lang.String getPreviewTemplateId();

    com.google.protobuf.y getPreviewTemplateIdBytes();

    ig.c0 getPreviewTemplateSourceType();

    /* synthetic */ java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17);

    /* synthetic */ int getRepeatedFieldCount(com.google.protobuf.b4 b4Var);

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.wa getUnknownFields();

    @Override // com.google.protobuf.r8
    /* synthetic */ boolean hasField(com.google.protobuf.b4 b4Var);

    /* synthetic */ boolean hasOneof(com.google.protobuf.g4 g4Var);

    boolean hasPreviewDurationMs();

    boolean hasPreviewTemplateId();

    boolean hasPreviewTemplateSourceType();

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
