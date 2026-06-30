package kg;

/* loaded from: classes16.dex */
public final class s0 extends com.google.protobuf.q5 implements kg.u0 {

    /* renamed from: d, reason: collision with root package name */
    public float f307635d;

    /* renamed from: e, reason: collision with root package name */
    public kg.t f307636e;

    /* renamed from: f, reason: collision with root package name */
    public float f307637f;

    /* renamed from: g, reason: collision with root package name */
    public kg.t f307638g;

    /* renamed from: h, reason: collision with root package name */
    public kg.k2 f307639h;

    public s0(kg.b bVar) {
        super(null);
        boolean unused;
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        kg.t0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.t0 buildPartial() {
        kg.t0 t0Var = new kg.t0(this);
        t0Var.cornerRadius_ = this.f307635d;
        t0Var.borderColor_ = this.f307636e;
        t0Var.borderWidth_ = this.f307637f;
        t0Var.backgroundColor_ = this.f307638g;
        t0Var.edgeInsets_ = this.f307639h;
        onBuilt();
        return t0Var;
    }

    public java.lang.Object clone() {
        return (kg.s0) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.s0 d(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.t0.access$21500()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.t0 r3 = (kg.t0) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
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
            kg.t0 r4 = (kg.t0) r4     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: kg.s0.d(com.google.protobuf.d0, com.google.protobuf.t4):kg.s0");
    }

    public kg.s0 e(kg.t0 t0Var) {
        com.google.protobuf.wa waVar;
        if (t0Var == kg.t0.getDefaultInstance()) {
            return this;
        }
        if (t0Var.getCornerRadius() != 0.0f) {
            this.f307635d = t0Var.getCornerRadius();
            onChanged();
        }
        if (t0Var.hasBorderColor()) {
            kg.t borderColor = t0Var.getBorderColor();
            kg.t tVar = this.f307636e;
            if (tVar != null) {
                kg.s newBuilder = kg.t.newBuilder(tVar);
                newBuilder.e(borderColor);
                this.f307636e = newBuilder.buildPartial();
            } else {
                this.f307636e = borderColor;
            }
            onChanged();
        }
        if (t0Var.getBorderWidth() != 0.0f) {
            this.f307637f = t0Var.getBorderWidth();
            onChanged();
        }
        if (t0Var.hasBackgroundColor()) {
            kg.t backgroundColor = t0Var.getBackgroundColor();
            kg.t tVar2 = this.f307638g;
            if (tVar2 != null) {
                kg.s newBuilder2 = kg.t.newBuilder(tVar2);
                newBuilder2.e(backgroundColor);
                this.f307638g = newBuilder2.buildPartial();
            } else {
                this.f307638g = backgroundColor;
            }
            onChanged();
        }
        if (t0Var.hasEdgeInsets()) {
            kg.k2 edgeInsets = t0Var.getEdgeInsets();
            kg.k2 k2Var = this.f307639h;
            if (k2Var != null) {
                kg.j2 newBuilder3 = kg.k2.newBuilder(k2Var);
                newBuilder3.f(edgeInsets);
                this.f307639h = newBuilder3.buildPartial();
            } else {
                this.f307639h = edgeInsets;
            }
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) t0Var).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.t0.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.G;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.H;
        j6Var.c(kg.t0.class, kg.s0.class);
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
        return (kg.s0) m84mergeUnknownFields(waVar);
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
        return kg.t0.getDefaultInstance();
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

    public s0(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        boolean unused;
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        kg.t0 buildPartial = buildPartial();
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
        if (k8Var instanceof kg.t0) {
            e((kg.t0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.t0) {
            e((kg.t0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
