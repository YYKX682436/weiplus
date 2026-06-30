package kg;

/* loaded from: classes16.dex */
public final class a1 extends com.google.protobuf.q5 implements kg.c1 {

    /* renamed from: d, reason: collision with root package name */
    public int f307512d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f307513e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.p9 f307514f;

    /* renamed from: g, reason: collision with root package name */
    public kg.p0 f307515g;

    /* renamed from: h, reason: collision with root package name */
    public kg.s1 f307516h;

    /* renamed from: i, reason: collision with root package name */
    public kg.t0 f307517i;

    /* renamed from: m, reason: collision with root package name */
    public float f307518m;

    /* renamed from: n, reason: collision with root package name */
    public int f307519n;

    public a1(kg.b bVar) {
        super(null);
        boolean z17;
        this.f307513e = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            d();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        kg.b1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.b1 buildPartial() {
        kg.b1 b1Var = new kg.b1(this);
        int i17 = this.f307512d;
        com.google.protobuf.p9 p9Var = this.f307514f;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f307513e = java.util.Collections.unmodifiableList(this.f307513e);
                this.f307512d &= -2;
            }
            b1Var.lyricInfos_ = this.f307513e;
        } else {
            b1Var.lyricInfos_ = p9Var.g();
        }
        b1Var.layerSpatialDesc_ = this.f307515g;
        b1Var.textStyle_ = this.f307516h;
        b1Var.layerStyle_ = this.f307517i;
        b1Var.maximumWidth_ = this.f307518m;
        b1Var.layerIndex_ = this.f307519n;
        onBuilt();
        return b1Var;
    }

    public java.lang.Object clone() {
        return (kg.a1) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f307514f == null) {
            this.f307514f = new com.google.protobuf.p9(this.f307513e, (this.f307512d & 1) != 0, getParentForChildren(), isClean());
            this.f307513e = null;
        }
        return this.f307514f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.a1 e(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.b1.access$24700()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.b1 r3 = (kg.b1) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            if (r3 == 0) goto L10
            r2.f(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f45739d     // Catch: java.lang.Throwable -> L11
            kg.b1 r4 = (kg.b1) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.f(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.a1.e(com.google.protobuf.d0, com.google.protobuf.t4):kg.a1");
    }

    public kg.a1 f(kg.b1 b1Var) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        boolean z17;
        com.google.protobuf.wa waVar;
        java.util.List list4;
        java.util.List list5;
        java.util.List list6;
        if (b1Var == kg.b1.getDefaultInstance()) {
            return this;
        }
        if (this.f307514f == null) {
            list4 = b1Var.lyricInfos_;
            if (!list4.isEmpty()) {
                if (this.f307513e.isEmpty()) {
                    list6 = b1Var.lyricInfos_;
                    this.f307513e = list6;
                    this.f307512d &= -2;
                } else {
                    if ((this.f307512d & 1) == 0) {
                        this.f307513e = new java.util.ArrayList(this.f307513e);
                        this.f307512d |= 1;
                    }
                    java.util.List list7 = this.f307513e;
                    list5 = b1Var.lyricInfos_;
                    list7.addAll(list5);
                }
                onChanged();
            }
        } else {
            list = b1Var.lyricInfos_;
            if (!list.isEmpty()) {
                if (this.f307514f.p()) {
                    this.f307514f.f45409a = null;
                    this.f307514f = null;
                    list3 = b1Var.lyricInfos_;
                    this.f307513e = list3;
                    this.f307512d &= -2;
                    z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                    this.f307514f = z17 ? d() : null;
                } else {
                    com.google.protobuf.p9 p9Var = this.f307514f;
                    list2 = b1Var.lyricInfos_;
                    p9Var.b(list2);
                }
            }
        }
        if (b1Var.hasLayerSpatialDesc()) {
            kg.p0 layerSpatialDesc = b1Var.getLayerSpatialDesc();
            kg.p0 p0Var = this.f307515g;
            if (p0Var != null) {
                kg.o0 newBuilder = kg.p0.newBuilder(p0Var);
                newBuilder.e(layerSpatialDesc);
                this.f307515g = newBuilder.buildPartial();
            } else {
                this.f307515g = layerSpatialDesc;
            }
            onChanged();
        }
        if (b1Var.hasTextStyle()) {
            kg.s1 textStyle = b1Var.getTextStyle();
            kg.s1 s1Var = this.f307516h;
            if (s1Var != null) {
                kg.r1 newBuilder2 = kg.s1.newBuilder(s1Var);
                newBuilder2.e(textStyle);
                this.f307516h = newBuilder2.buildPartial();
            } else {
                this.f307516h = textStyle;
            }
            onChanged();
        }
        if (b1Var.hasLayerStyle()) {
            kg.t0 layerStyle = b1Var.getLayerStyle();
            kg.t0 t0Var = this.f307517i;
            if (t0Var != null) {
                kg.s0 newBuilder3 = kg.t0.newBuilder(t0Var);
                newBuilder3.e(layerStyle);
                this.f307517i = newBuilder3.buildPartial();
            } else {
                this.f307517i = layerStyle;
            }
            onChanged();
        }
        if (b1Var.getMaximumWidth() != 0.0f) {
            this.f307518m = b1Var.getMaximumWidth();
            onChanged();
        }
        if (b1Var.getLayerIndex() != 0) {
            this.f307519n = b1Var.getLayerIndex();
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) b1Var).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.b1.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.K;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.L;
        j6Var.c(kg.b1.class, kg.a1.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (kg.a1) m84mergeUnknownFields(waVar);
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
        return kg.b1.getDefaultInstance();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        kg.b1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        e(d0Var, t4Var);
        return this;
    }

    public a1(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        boolean z17;
        this.f307513e = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.b1) {
            f((kg.b1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.b1) {
            f((kg.b1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
