package e83;

/* loaded from: classes16.dex */
public final class x extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f250246d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250247e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f250248f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p9 f250249g;

    public x(e83.a aVar) {
        super(null);
        boolean z17;
        this.f250247e = "";
        this.f250248f = java.util.Collections.emptyList();
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
        e83.y buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e83.y buildPartial() {
        e83.y yVar = new e83.y(this, null);
        int i17 = (this.f250246d & 1) == 0 ? 0 : 1;
        yVar.f250253e = this.f250247e;
        com.google.protobuf.p9 p9Var = this.f250249g;
        if (p9Var == null) {
            if ((this.f250246d & 2) != 0) {
                this.f250248f = java.util.Collections.unmodifiableList(this.f250248f);
                this.f250246d &= -3;
            }
            yVar.f250254f = this.f250248f;
        } else {
            yVar.f250254f = p9Var.g();
        }
        yVar.f250252d = i17;
        onBuilt();
        return yVar;
    }

    public java.lang.Object clone() {
        return (e83.x) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f250249g == null) {
            this.f250249g = new com.google.protobuf.p9(this.f250248f, (this.f250246d & 2) != 0, getParentForChildren(), isClean());
            this.f250248f = null;
        }
        return this.f250249g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.x e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.y.f250251i     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.w r0 = (e83.w) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.y r2 = (e83.y) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            e83.y r3 = (e83.y) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.f(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.x.e(com.google.protobuf.d0, com.google.protobuf.t4):e83.x");
    }

    public e83.x f(e83.y yVar) {
        boolean z17;
        com.google.protobuf.wa waVar;
        if (yVar == e83.y.f250250h) {
            return this;
        }
        if ((yVar.f250252d & 1) != 0) {
            this.f250246d |= 1;
            this.f250247e = yVar.f250253e;
            onChanged();
        }
        if (this.f250249g == null) {
            if (!yVar.f250254f.isEmpty()) {
                if (this.f250248f.isEmpty()) {
                    this.f250248f = yVar.f250254f;
                    this.f250246d &= -3;
                } else {
                    if ((this.f250246d & 2) == 0) {
                        this.f250248f = new java.util.ArrayList(this.f250248f);
                        this.f250246d |= 2;
                    }
                    this.f250248f.addAll(yVar.f250254f);
                }
                onChanged();
            }
        } else if (!yVar.f250254f.isEmpty()) {
            if (this.f250249g.p()) {
                this.f250249g.f45409a = null;
                this.f250249g = null;
                this.f250248f = yVar.f250254f;
                this.f250246d &= -3;
                z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f250249g = z17 ? d() : null;
            } else {
                this.f250249g.b(yVar.f250254f);
            }
        }
        waVar = ((com.google.protobuf.l6) yVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return e83.y.f250250h;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return e83.o0.f250219y;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250220z;
        j6Var.c(e83.y.class, e83.x.class);
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
        return (e83.x) m84mergeUnknownFields(waVar);
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
        return e83.y.f250250h;
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
        e83.y buildPartial = buildPartial();
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

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.y) {
            f((e83.y) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public x(com.google.protobuf.r5 r5Var, e83.a aVar) {
        super(r5Var);
        boolean z17;
        this.f250247e = "";
        this.f250248f = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.y) {
            f((e83.y) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
