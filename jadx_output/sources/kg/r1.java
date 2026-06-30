package kg;

/* loaded from: classes16.dex */
public final class r1 extends com.google.protobuf.q5 implements kg.t1 {

    /* renamed from: d, reason: collision with root package name */
    public kg.t f307625d;

    /* renamed from: e, reason: collision with root package name */
    public kg.t f307626e;

    /* renamed from: f, reason: collision with root package name */
    public float f307627f;

    /* renamed from: g, reason: collision with root package name */
    public float f307628g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f307629h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f307630i;

    /* renamed from: m, reason: collision with root package name */
    public kg.g2 f307631m;

    /* renamed from: n, reason: collision with root package name */
    public kg.t f307632n;

    /* renamed from: o, reason: collision with root package name */
    public float f307633o;

    public r1(kg.b bVar) {
        super(null);
        boolean unused;
        this.f307629h = "";
        this.f307630i = "";
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        kg.s1 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.s1 buildPartial() {
        kg.s1 s1Var = new kg.s1(this);
        s1Var.fillColor_ = this.f307625d;
        s1Var.strokeColor_ = this.f307626e;
        s1Var.strokeWidth_ = this.f307627f;
        s1Var.fontSize_ = this.f307628g;
        s1Var.fontName_ = this.f307629h;
        s1Var.fontFilePath_ = this.f307630i;
        s1Var.shadowOffset_ = this.f307631m;
        s1Var.shadowColor_ = this.f307632n;
        s1Var.shadowRadius_ = this.f307633o;
        onBuilt();
        return s1Var;
    }

    public java.lang.Object clone() {
        return (kg.r1) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.r1 d(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.s1.access$19900()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.s1 r3 = (kg.s1) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
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
            kg.s1 r4 = (kg.s1) r4     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: kg.r1.d(com.google.protobuf.d0, com.google.protobuf.t4):kg.r1");
    }

    public kg.r1 e(kg.s1 s1Var) {
        com.google.protobuf.wa waVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (s1Var == kg.s1.getDefaultInstance()) {
            return this;
        }
        if (s1Var.hasFillColor()) {
            kg.t fillColor = s1Var.getFillColor();
            kg.t tVar = this.f307625d;
            if (tVar != null) {
                kg.s newBuilder = kg.t.newBuilder(tVar);
                newBuilder.e(fillColor);
                this.f307625d = newBuilder.buildPartial();
            } else {
                this.f307625d = fillColor;
            }
            onChanged();
        }
        if (s1Var.hasStrokeColor()) {
            kg.t strokeColor = s1Var.getStrokeColor();
            kg.t tVar2 = this.f307626e;
            if (tVar2 != null) {
                kg.s newBuilder2 = kg.t.newBuilder(tVar2);
                newBuilder2.e(strokeColor);
                this.f307626e = newBuilder2.buildPartial();
            } else {
                this.f307626e = strokeColor;
            }
            onChanged();
        }
        if (s1Var.getStrokeWidth() != 0.0f) {
            this.f307627f = s1Var.getStrokeWidth();
            onChanged();
        }
        if (s1Var.getFontSize() != 0.0f) {
            this.f307628g = s1Var.getFontSize();
            onChanged();
        }
        if (!s1Var.getFontName().isEmpty()) {
            obj2 = s1Var.fontName_;
            this.f307629h = obj2;
            onChanged();
        }
        if (!s1Var.getFontFilePath().isEmpty()) {
            obj = s1Var.fontFilePath_;
            this.f307630i = obj;
            onChanged();
        }
        if (s1Var.hasShadowOffset()) {
            kg.g2 shadowOffset = s1Var.getShadowOffset();
            kg.g2 g2Var = this.f307631m;
            if (g2Var != null) {
                kg.f2 newBuilder3 = kg.g2.newBuilder(g2Var);
                newBuilder3.e(shadowOffset);
                this.f307631m = newBuilder3.buildPartial();
            } else {
                this.f307631m = shadowOffset;
            }
            onChanged();
        }
        if (s1Var.hasShadowColor()) {
            kg.t shadowColor = s1Var.getShadowColor();
            kg.t tVar3 = this.f307632n;
            if (tVar3 != null) {
                kg.s newBuilder4 = kg.t.newBuilder(tVar3);
                newBuilder4.e(shadowColor);
                this.f307632n = newBuilder4.buildPartial();
            } else {
                this.f307632n = shadowColor;
            }
            onChanged();
        }
        if (s1Var.getShadowRadius() != 0.0f) {
            this.f307633o = s1Var.getShadowRadius();
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) s1Var).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.s1.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.E;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.F;
        j6Var.c(kg.s1.class, kg.r1.class);
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
        return (kg.r1) m84mergeUnknownFields(waVar);
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
        return kg.s1.getDefaultInstance();
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
        kg.s1 buildPartial = buildPartial();
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

    public r1(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        boolean unused;
        this.f307629h = "";
        this.f307630i = "";
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.s1) {
            e((kg.s1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.s1) {
            e((kg.s1) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
