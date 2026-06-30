package ig;

/* loaded from: classes16.dex */
public final class z extends com.google.protobuf.q5 implements ig.b0 {
    private java.lang.Object attachmentsJson_;
    private int bitField0_;
    private java.lang.Object creationId_;
    private java.lang.Object projectClassification_;
    private long requestId_;
    private java.lang.Object sceneTag_;

    private z() {
        super(null);
        this.creationId_ = "";
        this.sceneTag_ = "";
        this.projectClassification_ = "";
        this.attachmentsJson_ = "";
        maybeForceBuilderInitialization();
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291294i;
    }

    private void maybeForceBuilderInitialization() {
        ig.a0.access$8100();
    }

    public ig.z clearAttachmentsJson() {
        this.bitField0_ &= -17;
        this.attachmentsJson_ = ig.a0.getDefaultInstance().getAttachmentsJson();
        onChanged();
        return this;
    }

    public ig.z clearCreationId() {
        this.bitField0_ &= -3;
        this.creationId_ = ig.a0.getDefaultInstance().getCreationId();
        onChanged();
        return this;
    }

    public ig.z clearProjectClassification() {
        this.bitField0_ &= -9;
        this.projectClassification_ = ig.a0.getDefaultInstance().getProjectClassification();
        onChanged();
        return this;
    }

    public ig.z clearRequestId() {
        this.bitField0_ &= -2;
        this.requestId_ = 0L;
        onChanged();
        return this;
    }

    public ig.z clearSceneTag() {
        this.bitField0_ &= -5;
        this.sceneTag_ = ig.a0.getDefaultInstance().getSceneTag();
        onChanged();
        return this;
    }

    @Override // ig.b0
    public java.lang.String getAttachmentsJson() {
        java.lang.Object obj = this.attachmentsJson_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.attachmentsJson_ = r17;
        }
        return r17;
    }

    @Override // ig.b0
    public com.google.protobuf.y getAttachmentsJsonBytes() {
        java.lang.Object obj = this.attachmentsJson_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.attachmentsJson_ = h17;
        return h17;
    }

    @Override // ig.b0
    public java.lang.String getCreationId() {
        java.lang.Object obj = this.creationId_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.creationId_ = r17;
        }
        return r17;
    }

    @Override // ig.b0
    public com.google.protobuf.y getCreationIdBytes() {
        java.lang.Object obj = this.creationId_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.creationId_ = h17;
        return h17;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291294i;
    }

    @Override // ig.b0
    public java.lang.String getProjectClassification() {
        java.lang.Object obj = this.projectClassification_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.projectClassification_ = r17;
        }
        return r17;
    }

    @Override // ig.b0
    public com.google.protobuf.y getProjectClassificationBytes() {
        java.lang.Object obj = this.projectClassification_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.projectClassification_ = h17;
        return h17;
    }

    @Override // ig.b0
    public long getRequestId() {
        return this.requestId_;
    }

    @Override // ig.b0
    public java.lang.String getSceneTag() {
        java.lang.Object obj = this.sceneTag_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.sceneTag_ = r17;
        }
        return r17;
    }

    @Override // ig.b0
    public com.google.protobuf.y getSceneTagBytes() {
        java.lang.Object obj = this.sceneTag_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.sceneTag_ = h17;
        return h17;
    }

    @Override // ig.b0
    public boolean hasAttachmentsJson() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // ig.b0
    public boolean hasCreationId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.b0
    public boolean hasProjectClassification() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // ig.b0
    public boolean hasRequestId() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.b0
    public boolean hasSceneTag() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291295j;
        j6Var.c(ig.a0.class, ig.z.class);
        return j6Var;
    }

    public ig.z setAttachmentsJson(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.attachmentsJson_ = str;
        onChanged();
        return this;
    }

    public ig.z setAttachmentsJsonBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 16;
        this.attachmentsJson_ = yVar;
        onChanged();
        return this;
    }

    public ig.z setCreationId(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.creationId_ = str;
        onChanged();
        return this;
    }

    public ig.z setCreationIdBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 2;
        this.creationId_ = yVar;
        onChanged();
        return this;
    }

    public ig.z setProjectClassification(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.projectClassification_ = str;
        onChanged();
        return this;
    }

    public ig.z setProjectClassificationBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 8;
        this.projectClassification_ = yVar;
        onChanged();
        return this;
    }

    public ig.z setRequestId(long j17) {
        this.bitField0_ |= 1;
        this.requestId_ = j17;
        onChanged();
        return this;
    }

    public ig.z setSceneTag(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.sceneTag_ = str;
        onChanged();
        return this;
    }

    public ig.z setSceneTagBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 4;
        this.sceneTag_ = yVar;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.z addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.a0 build() {
        ig.a0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.a0 buildPartial() {
        int i17;
        ig.a0 a0Var = new ig.a0(this);
        int i18 = this.bitField0_;
        if ((i18 & 1) != 0) {
            ig.a0.access$8302(a0Var, this.requestId_);
            i17 = 1;
        } else {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            i17 |= 2;
        }
        ig.a0.access$8402(a0Var, this.creationId_);
        if ((i18 & 4) != 0) {
            i17 |= 4;
        }
        ig.a0.access$8502(a0Var, this.sceneTag_);
        if ((i18 & 8) != 0) {
            i17 |= 8;
        }
        ig.a0.access$8602(a0Var, this.projectClassification_);
        if ((i18 & 16) != 0) {
            i17 |= 16;
        }
        ig.a0.access$8702(a0Var, this.attachmentsJson_);
        ig.a0.access$8802(a0Var, i17);
        onBuilt();
        return a0Var;
    }

    @Override // com.google.protobuf.q5
    public ig.z clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.a0 getDefaultInstanceForType() {
        return ig.a0.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.z setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.z setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.z setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.z m511clearOneof(com.google.protobuf.g4 g4Var) {
        super.m511clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.z m516mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.z) super.m516mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.z m510clear() {
        super.m510clear();
        this.requestId_ = 0L;
        int i17 = this.bitField0_ & (-2);
        this.creationId_ = "";
        this.sceneTag_ = "";
        this.projectClassification_ = "";
        this.attachmentsJson_ = "";
        this.bitField0_ = i17 & (-3) & (-5) & (-9) & (-17);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.z m515clone() {
        return (ig.z) super.m515clone();
    }

    private z(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.creationId_ = "";
        this.sceneTag_ = "";
        this.projectClassification_ = "";
        this.attachmentsJson_ = "";
        maybeForceBuilderInitialization();
    }
}
