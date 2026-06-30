package kg;

/* loaded from: classes16.dex */
public final class j1 extends com.google.protobuf.q5 implements kg.l1 {

    /* renamed from: d, reason: collision with root package name */
    public int f307558d;

    /* renamed from: e, reason: collision with root package name */
    public int f307559e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f307560f;

    /* renamed from: g, reason: collision with root package name */
    public kg.p0 f307561g;

    /* renamed from: h, reason: collision with root package name */
    public int f307562h;

    public j1(kg.b bVar) {
        super(null);
        boolean unused;
        this.f307558d = 0;
        this.f307559e = 0;
        this.f307560f = "";
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        kg.k1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.k1 buildPartial() {
        kg.k1 k1Var = new kg.k1(this);
        k1Var.decoderType_ = this.f307558d;
        k1Var.timingFillMode_ = this.f307559e;
        k1Var.filePath_ = this.f307560f;
        k1Var.layerSpatialDesc_ = this.f307561g;
        k1Var.layerIndex_ = this.f307562h;
        onBuilt();
        return k1Var;
    }

    public java.lang.Object clone() {
        return (kg.j1) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.j1 d(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.k1.access$18000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.k1 r3 = (kg.k1) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            if (r3 == 0) goto L10
            r2.e(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f45739d     // Catch: java.lang.Throwable -> L11
            kg.k1 r4 = (kg.k1) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.e(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.j1.d(com.google.protobuf.d0, com.google.protobuf.t4):kg.j1");
    }

    public kg.j1 e(kg.k1 k1Var) {
        int i17;
        int i18;
        com.google.protobuf.wa waVar;
        java.lang.Object obj;
        if (k1Var == kg.k1.getDefaultInstance()) {
            return this;
        }
        i17 = k1Var.decoderType_;
        if (i17 != 0) {
            this.f307558d = k1Var.getDecoderTypeValue();
            onChanged();
        }
        i18 = k1Var.timingFillMode_;
        if (i18 != 0) {
            this.f307559e = k1Var.getTimingFillModeValue();
            onChanged();
        }
        if (!k1Var.getFilePath().isEmpty()) {
            obj = k1Var.filePath_;
            this.f307560f = obj;
            onChanged();
        }
        if (k1Var.hasLayerSpatialDesc()) {
            kg.p0 layerSpatialDesc = k1Var.getLayerSpatialDesc();
            kg.p0 p0Var = this.f307561g;
            if (p0Var != null) {
                kg.o0 newBuilder = kg.p0.newBuilder(p0Var);
                newBuilder.e(layerSpatialDesc);
                this.f307561g = newBuilder.buildPartial();
            } else {
                this.f307561g = layerSpatialDesc;
            }
            onChanged();
        }
        if (k1Var.getLayerIndex() != 0) {
            this.f307562h = k1Var.getLayerIndex();
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) k1Var).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.k1.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.C;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.D;
        j6Var.c(kg.k1.class, kg.j1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (kg.j1) m84mergeUnknownFields(waVar);
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        setField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.j8
    public com.google.protobuf.q5 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return kg.k1.getDefaultInstance();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        kg.k1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.k1) {
            e((kg.k1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public j1(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        boolean unused;
        this.f307558d = 0;
        this.f307559e = 0;
        this.f307560f = "";
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.k1) {
            e((kg.k1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
