package ig;

/* loaded from: classes16.dex */
public final class h extends com.google.protobuf.q5 implements ig.j {
    private int bitField0_;
    private java.lang.Object errorCode_;
    private java.lang.Object errorMessage_;
    private com.google.protobuf.g7 expands_;
    private com.google.protobuf.g7 keys_;
    private java.lang.Object name_;
    private long timeStamp_;
    private com.google.protobuf.g7 values_;

    private h() {
        super(null);
        this.name_ = "";
        this.errorCode_ = "";
        this.errorMessage_ = "";
        com.google.protobuf.g7 g7Var = com.google.protobuf.f7.f45086f;
        this.keys_ = g7Var;
        this.values_ = g7Var;
        this.expands_ = g7Var;
        maybeForceBuilderInitialization();
    }

    private void ensureExpandsIsMutable() {
        if ((this.bitField0_ & 32) == 0) {
            this.expands_ = new com.google.protobuf.f7(this.expands_);
            this.bitField0_ |= 32;
        }
    }

    private void ensureKeysIsMutable() {
        if ((this.bitField0_ & 8) == 0) {
            this.keys_ = new com.google.protobuf.f7(this.keys_);
            this.bitField0_ |= 8;
        }
    }

    private void ensureValuesIsMutable() {
        if ((this.bitField0_ & 16) == 0) {
            this.values_ = new com.google.protobuf.f7(this.values_);
            this.bitField0_ |= 16;
        }
    }

    public static final com.google.protobuf.r3 getDescriptor() {
        return ig.y0.f291286a;
    }

    private void maybeForceBuilderInitialization() {
        ig.i.access$400();
    }

    public ig.h addAllExpands(java.lang.Iterable<java.lang.String> iterable) {
        ensureExpandsIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.expands_);
        onChanged();
        return this;
    }

    public ig.h addAllKeys(java.lang.Iterable<java.lang.String> iterable) {
        ensureKeysIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.keys_);
        onChanged();
        return this;
    }

    public ig.h addAllValues(java.lang.Iterable<java.lang.String> iterable) {
        ensureValuesIsMutable();
        com.google.protobuf.e.addAll((java.lang.Iterable) iterable, (java.util.List) this.values_);
        onChanged();
        return this;
    }

    public ig.h addExpands(java.lang.String str) {
        str.getClass();
        ensureExpandsIsMutable();
        this.expands_.add(str);
        onChanged();
        return this;
    }

    public ig.h addExpandsBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        ensureExpandsIsMutable();
        this.expands_.q(yVar);
        onChanged();
        return this;
    }

    public ig.h addKeys(java.lang.String str) {
        str.getClass();
        ensureKeysIsMutable();
        this.keys_.add(str);
        onChanged();
        return this;
    }

    public ig.h addKeysBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        ensureKeysIsMutable();
        this.keys_.q(yVar);
        onChanged();
        return this;
    }

    public ig.h addValues(java.lang.String str) {
        str.getClass();
        ensureValuesIsMutable();
        this.values_.add(str);
        onChanged();
        return this;
    }

    public ig.h addValuesBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        ensureValuesIsMutable();
        this.values_.q(yVar);
        onChanged();
        return this;
    }

    public ig.h clearErrorCode() {
        this.bitField0_ &= -3;
        this.errorCode_ = ig.i.getDefaultInstance().getErrorCode();
        onChanged();
        return this;
    }

    public ig.h clearErrorMessage() {
        this.bitField0_ &= -5;
        this.errorMessage_ = ig.i.getDefaultInstance().getErrorMessage();
        onChanged();
        return this;
    }

    public ig.h clearExpands() {
        this.expands_ = com.google.protobuf.f7.f45086f;
        this.bitField0_ &= -33;
        onChanged();
        return this;
    }

    public ig.h clearKeys() {
        this.keys_ = com.google.protobuf.f7.f45086f;
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public ig.h clearName() {
        this.bitField0_ &= -2;
        this.name_ = ig.i.getDefaultInstance().getName();
        onChanged();
        return this;
    }

    public ig.h clearTimeStamp() {
        this.bitField0_ &= -65;
        this.timeStamp_ = 0L;
        onChanged();
        return this;
    }

    public ig.h clearValues() {
        this.values_ = com.google.protobuf.f7.f45086f;
        this.bitField0_ &= -17;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return ig.y0.f291286a;
    }

    @Override // ig.j
    public java.lang.String getErrorCode() {
        java.lang.Object obj = this.errorCode_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.errorCode_ = r17;
        }
        return r17;
    }

    @Override // ig.j
    public com.google.protobuf.y getErrorCodeBytes() {
        java.lang.Object obj = this.errorCode_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.errorCode_ = h17;
        return h17;
    }

    @Override // ig.j
    public java.lang.String getErrorMessage() {
        java.lang.Object obj = this.errorMessage_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.errorMessage_ = r17;
        }
        return r17;
    }

    @Override // ig.j
    public com.google.protobuf.y getErrorMessageBytes() {
        java.lang.Object obj = this.errorMessage_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.errorMessage_ = h17;
        return h17;
    }

    @Override // ig.j
    public java.lang.String getExpands(int i17) {
        return (java.lang.String) this.expands_.get(i17);
    }

    @Override // ig.j
    public com.google.protobuf.y getExpandsBytes(int i17) {
        return this.expands_.f(i17);
    }

    @Override // ig.j
    public int getExpandsCount() {
        return this.expands_.size();
    }

    @Override // ig.j
    public java.lang.String getKeys(int i17) {
        return (java.lang.String) this.keys_.get(i17);
    }

    @Override // ig.j
    public com.google.protobuf.y getKeysBytes(int i17) {
        return this.keys_.f(i17);
    }

    @Override // ig.j
    public int getKeysCount() {
        return this.keys_.size();
    }

    @Override // ig.j
    public java.lang.String getName() {
        java.lang.Object obj = this.name_;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.name_ = r17;
        }
        return r17;
    }

    @Override // ig.j
    public com.google.protobuf.y getNameBytes() {
        java.lang.Object obj = this.name_;
        if (!(obj instanceof java.lang.String)) {
            return (com.google.protobuf.y) obj;
        }
        com.google.protobuf.y h17 = com.google.protobuf.y.h((java.lang.String) obj);
        this.name_ = h17;
        return h17;
    }

    @Override // ig.j
    public long getTimeStamp() {
        return this.timeStamp_;
    }

    @Override // ig.j
    public java.lang.String getValues(int i17) {
        return (java.lang.String) this.values_.get(i17);
    }

    @Override // ig.j
    public com.google.protobuf.y getValuesBytes(int i17) {
        return this.values_.f(i17);
    }

    @Override // ig.j
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // ig.j
    public boolean hasErrorCode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ig.j
    public boolean hasErrorMessage() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // ig.j
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // ig.j
    public boolean hasTimeStamp() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = ig.y0.f291287b;
        j6Var.c(ig.i.class, ig.h.class);
        return j6Var;
    }

    public ig.h setErrorCode(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.errorCode_ = str;
        onChanged();
        return this;
    }

    public ig.h setErrorCodeBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 2;
        this.errorCode_ = yVar;
        onChanged();
        return this;
    }

    public ig.h setErrorMessage(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.errorMessage_ = str;
        onChanged();
        return this;
    }

    public ig.h setErrorMessageBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 4;
        this.errorMessage_ = yVar;
        onChanged();
        return this;
    }

    public ig.h setExpands(int i17, java.lang.String str) {
        str.getClass();
        ensureExpandsIsMutable();
        this.expands_.set(i17, str);
        onChanged();
        return this;
    }

    public ig.h setKeys(int i17, java.lang.String str) {
        str.getClass();
        ensureKeysIsMutable();
        this.keys_.set(i17, str);
        onChanged();
        return this;
    }

    public ig.h setName(java.lang.String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
        onChanged();
        return this;
    }

    public ig.h setNameBytes(com.google.protobuf.y yVar) {
        yVar.getClass();
        this.bitField0_ |= 1;
        this.name_ = yVar;
        onChanged();
        return this;
    }

    public ig.h setTimeStamp(long j17) {
        this.bitField0_ |= 64;
        this.timeStamp_ = j17;
        onChanged();
        return this;
    }

    public ig.h setValues(int i17, java.lang.String str) {
        str.getClass();
        ensureValuesIsMutable();
        this.values_.set(i17, str);
        onChanged();
        return this;
    }

    @Override // ig.j
    public com.google.protobuf.j9 getExpandsList() {
        return this.expands_.b();
    }

    @Override // ig.j
    public com.google.protobuf.j9 getKeysList() {
        return this.keys_.b();
    }

    @Override // ig.j
    public com.google.protobuf.j9 getValuesList() {
        return this.values_.b();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.h addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.i build() {
        ig.i buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public ig.i buildPartial() {
        ig.i iVar = new ig.i(this);
        int i17 = this.bitField0_;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        ig.i.access$602(iVar, this.name_);
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        ig.i.access$702(iVar, this.errorCode_);
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        ig.i.access$802(iVar, this.errorMessage_);
        if ((this.bitField0_ & 8) != 0) {
            this.keys_ = this.keys_.b();
            this.bitField0_ &= -9;
        }
        ig.i.access$902(iVar, this.keys_);
        if ((this.bitField0_ & 16) != 0) {
            this.values_ = this.values_.b();
            this.bitField0_ &= -17;
        }
        ig.i.access$1002(iVar, this.values_);
        if ((this.bitField0_ & 32) != 0) {
            this.expands_ = this.expands_.b();
            this.bitField0_ &= -33;
        }
        ig.i.access$1102(iVar, this.expands_);
        if ((i17 & 64) != 0) {
            ig.i.access$1202(iVar, this.timeStamp_);
            i18 |= 8;
        }
        ig.i.access$1302(iVar, i18);
        onBuilt();
        return iVar;
    }

    @Override // com.google.protobuf.q5
    public ig.h clearField(com.google.protobuf.b4 b4Var) {
        super.clearField(b4Var);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public ig.i getDefaultInstanceForType() {
        return ig.i.getDefaultInstance();
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public ig.h setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        super.setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5
    public ig.h setRepeatedField(com.google.protobuf.b4 b4Var, int i17, java.lang.Object obj) {
        super.setRepeatedField(b4Var, i17, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public final ig.h setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.h m439clearOneof(com.google.protobuf.g4 g4Var) {
        super.m439clearOneof(g4Var);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.h m444mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (ig.h) super.m444mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.h m438clear() {
        super.m438clear();
        this.name_ = "";
        int i17 = this.bitField0_ & (-2);
        this.errorCode_ = "";
        this.errorMessage_ = "";
        int i18 = i17 & (-3) & (-5);
        this.bitField0_ = i18;
        com.google.protobuf.g7 g7Var = com.google.protobuf.f7.f45086f;
        this.keys_ = g7Var;
        this.values_ = g7Var;
        this.expands_ = g7Var;
        this.timeStamp_ = 0L;
        this.bitField0_ = i18 & (-9) & (-17) & (-33) & (-65);
        return this;
    }

    @Override // com.google.protobuf.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.h m451clone() {
        return (ig.h) super.m443clone();
    }

    private h(com.google.protobuf.r5 r5Var) {
        super(r5Var);
        this.name_ = "";
        this.errorCode_ = "";
        this.errorMessage_ = "";
        com.google.protobuf.g7 g7Var = com.google.protobuf.f7.f45086f;
        this.keys_ = g7Var;
        this.values_ = g7Var;
        this.expands_ = g7Var;
        maybeForceBuilderInitialization();
    }
}
