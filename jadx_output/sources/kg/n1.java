package kg;

/* loaded from: classes16.dex */
public final class n1 extends com.google.protobuf.q5 implements kg.p1 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307578d;

    /* renamed from: e, reason: collision with root package name */
    public kg.s1 f307579e;

    /* renamed from: f, reason: collision with root package name */
    public kg.t0 f307580f;

    /* renamed from: g, reason: collision with root package name */
    public kg.p0 f307581g;

    /* renamed from: h, reason: collision with root package name */
    public float f307582h;

    /* renamed from: i, reason: collision with root package name */
    public int f307583i;

    public n1(kg.b bVar) {
        super(null);
        boolean unused;
        this.f307578d = "";
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        kg.o1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.o1 buildPartial() {
        kg.o1 o1Var = new kg.o1(this);
        o1Var.text_ = this.f307578d;
        o1Var.textStyle_ = this.f307579e;
        o1Var.layerStyle_ = this.f307580f;
        o1Var.layerSpatialDesc_ = this.f307581g;
        o1Var.maximumWidth_ = this.f307582h;
        o1Var.layerIndex_ = this.f307583i;
        onBuilt();
        return o1Var;
    }

    public java.lang.Object clone() {
        return (kg.n1) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.n1 d(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.o1.access$23000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.o1 r3 = (kg.o1) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
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
            kg.o1 r4 = (kg.o1) r4     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: kg.n1.d(com.google.protobuf.d0, com.google.protobuf.t4):kg.n1");
    }

    public kg.n1 e(kg.o1 o1Var) {
        com.google.protobuf.wa waVar;
        java.lang.Object obj;
        if (o1Var == kg.o1.getDefaultInstance()) {
            return this;
        }
        if (!o1Var.getText().isEmpty()) {
            obj = o1Var.text_;
            this.f307578d = obj;
            onChanged();
        }
        if (o1Var.hasTextStyle()) {
            kg.s1 textStyle = o1Var.getTextStyle();
            kg.s1 s1Var = this.f307579e;
            if (s1Var != null) {
                kg.r1 newBuilder = kg.s1.newBuilder(s1Var);
                newBuilder.e(textStyle);
                this.f307579e = newBuilder.buildPartial();
            } else {
                this.f307579e = textStyle;
            }
            onChanged();
        }
        if (o1Var.hasLayerStyle()) {
            kg.t0 layerStyle = o1Var.getLayerStyle();
            kg.t0 t0Var = this.f307580f;
            if (t0Var != null) {
                kg.s0 newBuilder2 = kg.t0.newBuilder(t0Var);
                newBuilder2.e(layerStyle);
                this.f307580f = newBuilder2.buildPartial();
            } else {
                this.f307580f = layerStyle;
            }
            onChanged();
        }
        if (o1Var.hasLayerSpatialDesc()) {
            kg.p0 layerSpatialDesc = o1Var.getLayerSpatialDesc();
            kg.p0 p0Var = this.f307581g;
            if (p0Var != null) {
                kg.o0 newBuilder3 = kg.p0.newBuilder(p0Var);
                newBuilder3.e(layerSpatialDesc);
                this.f307581g = newBuilder3.buildPartial();
            } else {
                this.f307581g = layerSpatialDesc;
            }
            onChanged();
        }
        if (o1Var.getMaximumWidth() != 0.0f) {
            this.f307582h = o1Var.getMaximumWidth();
            onChanged();
        }
        if (o1Var.getLayerIndex() != 0) {
            this.f307583i = o1Var.getLayerIndex();
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) o1Var).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.o1.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.I;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307598J;
        j6Var.c(kg.o1.class, kg.n1.class);
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
        return (kg.n1) m84mergeUnknownFields(waVar);
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
        return kg.o1.getDefaultInstance();
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

    public n1(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        boolean unused;
        this.f307578d = "";
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        kg.o1 buildPartial = buildPartial();
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
        if (k8Var instanceof kg.o1) {
            e((kg.o1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.o1) {
            e((kg.o1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
