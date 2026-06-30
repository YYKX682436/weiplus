package ig;

/* loaded from: classes16.dex */
public interface j extends com.google.protobuf.r8 {
    /* synthetic */ java.util.List findInitializationErrors();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.util.Map getAllFields();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.k8 getDefaultInstanceForType();

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.r3 getDescriptorForType();

    java.lang.String getErrorCode();

    com.google.protobuf.y getErrorCodeBytes();

    java.lang.String getErrorMessage();

    com.google.protobuf.y getErrorMessageBytes();

    java.lang.String getExpands(int i17);

    com.google.protobuf.y getExpandsBytes(int i17);

    int getExpandsCount();

    java.util.List<java.lang.String> getExpandsList();

    @Override // com.google.protobuf.r8
    /* synthetic */ java.lang.Object getField(com.google.protobuf.b4 b4Var);

    /* synthetic */ java.lang.String getInitializationErrorString();

    java.lang.String getKeys(int i17);

    com.google.protobuf.y getKeysBytes(int i17);

    int getKeysCount();

    java.util.List<java.lang.String> getKeysList();

    java.lang.String getName();

    com.google.protobuf.y getNameBytes();

    /* synthetic */ com.google.protobuf.b4 getOneofFieldDescriptor(com.google.protobuf.g4 g4Var);

    /* synthetic */ java.lang.Object getRepeatedField(com.google.protobuf.b4 b4Var, int i17);

    /* synthetic */ int getRepeatedFieldCount(com.google.protobuf.b4 b4Var);

    long getTimeStamp();

    @Override // com.google.protobuf.r8
    /* synthetic */ com.google.protobuf.wa getUnknownFields();

    java.lang.String getValues(int i17);

    com.google.protobuf.y getValuesBytes(int i17);

    int getValuesCount();

    java.util.List<java.lang.String> getValuesList();

    boolean hasErrorCode();

    boolean hasErrorMessage();

    @Override // com.google.protobuf.r8
    /* synthetic */ boolean hasField(com.google.protobuf.b4 b4Var);

    boolean hasName();

    /* synthetic */ boolean hasOneof(com.google.protobuf.g4 g4Var);

    boolean hasTimeStamp();

    @Override // com.google.protobuf.p8
    /* synthetic */ boolean isInitialized();
}
