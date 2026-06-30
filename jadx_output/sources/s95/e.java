package s95;

/* loaded from: classes16.dex */
public final class e extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f405035d;

    /* renamed from: e, reason: collision with root package name */
    public s95.y f405036e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f405037f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p9 f405038g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f405039h;

    /* renamed from: i, reason: collision with root package name */
    public s95.y f405040i;

    public e(com.google.protobuf.r5 r5Var, s95.d dVar) {
        super(r5Var);
        boolean z17;
        this.f405037f = java.util.Collections.emptyList();
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
        s95.f buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s95.f buildPartial() {
        s95.f fVar = new s95.f(this, null);
        int i17 = this.f405035d;
        fVar.f405057d = this.f405036e;
        com.google.protobuf.p9 p9Var = this.f405038g;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f405037f = java.util.Collections.unmodifiableList(this.f405037f);
                this.f405035d &= -2;
            }
            fVar.f405058e = this.f405037f;
        } else {
            fVar.f405058e = p9Var.g();
        }
        fVar.f405059f = this.f405039h;
        fVar.f405060g = this.f405040i;
        onBuilt();
        return fVar;
    }

    public java.lang.Object clone() {
        return (s95.e) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f405038g == null) {
            this.f405038g = new com.google.protobuf.p9(this.f405037f, (this.f405035d & 1) != 0, getParentForChildren(), isClean());
            this.f405037f = null;
        }
        return this.f405038g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s95.e e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = s95.f.f405056m     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.d r0 = (s95.d) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.f r2 = (s95.f) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            s95.f r3 = (s95.f) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: s95.e.e(com.google.protobuf.d0, com.google.protobuf.t4):s95.e");
    }

    public s95.e f(s95.f fVar) {
        boolean z17;
        com.google.protobuf.wa waVar;
        if (fVar == s95.f.f405055i) {
            return this;
        }
        if (fVar.f405057d != null) {
            s95.y i17 = fVar.i();
            s95.y yVar = this.f405036e;
            if (yVar != null) {
                s95.x g17 = s95.y.g(yVar);
                g17.e(i17);
                this.f405036e = g17.buildPartial();
            } else {
                this.f405036e = i17;
            }
            onChanged();
        }
        if (this.f405038g == null) {
            if (!fVar.f405058e.isEmpty()) {
                if (this.f405037f.isEmpty()) {
                    this.f405037f = fVar.f405058e;
                    this.f405035d &= -2;
                } else {
                    if ((this.f405035d & 1) == 0) {
                        this.f405037f = new java.util.ArrayList(this.f405037f);
                        this.f405035d |= 1;
                    }
                    this.f405037f.addAll(fVar.f405058e);
                }
                onChanged();
            }
        } else if (!fVar.f405058e.isEmpty()) {
            if (this.f405038g.p()) {
                this.f405038g.f45409a = null;
                this.f405038g = null;
                this.f405037f = fVar.f405058e;
                this.f405035d &= -2;
                z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f405038g = z17 ? d() : null;
            } else {
                this.f405038g.b(fVar.f405058e);
            }
        }
        boolean z18 = fVar.f405059f;
        if (z18) {
            this.f405039h = z18;
            onChanged();
        }
        if (fVar.f405060g != null) {
            s95.y j17 = fVar.j();
            s95.y yVar2 = this.f405040i;
            if (yVar2 != null) {
                s95.x g18 = s95.y.g(yVar2);
                g18.e(j17);
                this.f405040i = g18.buildPartial();
            } else {
                this.f405040i = j17;
            }
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) fVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return s95.f.f405055i;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return s95.r0.f405190o;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405191p;
        j6Var.c(s95.f.class, s95.e.class);
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
        return (s95.e) m84mergeUnknownFields(waVar);
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
        return s95.f.f405055i;
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
        s95.f buildPartial = buildPartial();
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

    public e(s95.d dVar) {
        super(null);
        boolean z17;
        this.f405037f = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.f) {
            f((s95.f) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.f) {
            f((s95.f) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
