package ig;

/* loaded from: classes16.dex */
public final class e0 extends com.google.protobuf.q5 implements ig.g0 {
    private int bitField0_;
    private com.google.protobuf.g7 keys_;
    private com.google.protobuf.g7 values_;

    private e0() {
        super(null);
        com.google.protobuf.g7 g7Var = com.google.protobuf.f7.f45086f;
        this.keys_ = g7Var;
        this.values_ = g7Var;
        maybeForceBuilderInitialization();
    }

    private void ensureKeysIsMutable() {
        if ((this.bitField0_ & 1) == 0) {
            this.keys_ = new com.google.protobuf.f7(this.keys_);
            this.bitField0_ |= 1;
        }
    }

    private void ensureValuesIsMutable() {
        if ((this.bitField0_ & 2) == 0) {
            this.values_ = new com.google.protobuf.f7(this.values_);
            this.bitField0_ |= 2;
        }
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291298m;
    }

    private void maybeForceBuilderInitialization() {
        ig.f0.access$11100();
    }

    public ig.e0 addAllKeys(java.lang.Iterable<java.lang.String> iterable) {
        ensureKeysIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.keys_);
        onChanged();
        return this;
    }

    public ig.e0 addAllValues(java.lang.Iterable<java.lang.String> iterable) {
        ensureValuesIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.values_);
        onChanged();
        return this;
    }

    public ig.e0 addKeys(java.lang.String str) {
        str.getClass();
        ensureKeysIsMutable();
        this.keys_.add(str);
        onChanged();
        return this;
    }

    public ig.e0 addKeysBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        ensureKeysIsMutable();
        this.keys_.q(yVar);
        onChanged();
        return this;
    }

    public ig.e0 addValues(java.lang.String str) {
        str.getClass();
        ensureValuesIsMutable();
        this.values_.add(str);
        onChanged();
        return this;
    }

    public ig.e0 addValuesBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        ensureValuesIsMutable();
        this.values_.q(yVar);
        onChanged();
        return this;
    }

    public ig.e0 clearKeys() {
        this.keys_ = com.google.protobuf.f7.f45086f;
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public ig.e0 clearValues() {
        this.values_ = com.google.protobuf.f7.f45086f;
        this.bitField0_ &= -3;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291298m;
    }

    @Override // ig.g0
    public java.lang.String getKeys(int i17) {
        return (java.lang.String) this.keys_.get(i17);
    }

    @Override // ig.g0
    public com.google.protobuf.y getKeysBytes(int i17) {
        return this.keys_.f(i17);
    }

    @Override // ig.g0
    public int getKeysCount() {
        return this.keys_.size();
    }

    @Override // ig.g0
    public java.lang.String getValues(int i17) {
        return (java.lang.String) this.values_.get(i17);
    }

    @Override // ig.g0
    public com.google.protobuf.y getValuesBytes(int i17) {
        return this.values_.f(i17);
    }

    @Override // ig.g0
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291299n;
        j6Var.c(ig.f0.class, ig.e0.class);
        return j6Var;
    }

    public ig.e0 setKeys(int i17, java.lang.String str) {
        str.getClass();
        ensureKeysIsMutable();
        this.keys_.set(i17, str);
        onChanged();
        return this;
    }

    public ig.e0 setValues(int i17, java.lang.String str) {
        str.getClass();
        ensureValuesIsMutable();
        this.values_.set(i17, str);
        onChanged();
        return this;
    }

    @Override // ig.g0
    public com.google.protobuf.j9 getKeysList() {
        return this.keys_.b();
    }

    @Override // ig.g0
    public com.google.protobuf.j9 getValuesList() {
        return this.values_.b();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.e0 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.f0 build() {
        ig.f0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.f0 buildPartial() {
        ig.f0 f0Var = new ig.f0(this);
        if ((this.bitField0_ & 1) != 0) {
            this.keys_ = this.keys_.b();
            this.bitField0_ &= -2;
        }
        ig.f0.access$11302(f0Var, this.keys_);
        if ((this.bitField0_ & 2) != 0) {
            this.values_ = this.values_.b();
            this.bitField0_ &= -3;
        }
        ig.f0.access$11402(f0Var, this.values_);
        onBuilt();
        return f0Var;
    }

    @Override // com.google.protobuf.q5
    public ig.e0 clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.f0 getDefaultInstanceForType() {
        return ig.f0.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.e0 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.e0 setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.e0 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.e0 m447clearOneof(com.google.protobuf.g4 g4Var) {
        super.m447clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.e0 m452mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.e0) super.m452mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.e0 m446clear() {
        super.m446clear();
        com.google.protobuf.g7 g7Var = com.google.protobuf.f7.f45086f;
        this.keys_ = g7Var;
        int i17 = this.bitField0_ & (-2);
        this.values_ = g7Var;
        this.bitField0_ = i17 & (-3);
        return this;
    }

    private e0(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        com.google.protobuf.g7 g7Var = com.google.protobuf.f7.f45086f;
        this.keys_ = g7Var;
        this.values_ = g7Var;
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.e0 m443clone() {
        return (ig.e0) super.m451clone();
    }
}
