package s95;

/* loaded from: classes16.dex */
public final class h extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f405064d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f405065e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.p9 f405066f;

    /* renamed from: g, reason: collision with root package name */
    public long f405067g;

    /* renamed from: h, reason: collision with root package name */
    public long f405068h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f405069i;

    /* renamed from: m, reason: collision with root package name */
    public s95.f f405070m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f405071n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.protobuf.p9 f405072o;

    /* renamed from: p, reason: collision with root package name */
    public s95.u0 f405073p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f405074q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f405075r;

    /* renamed from: s, reason: collision with root package name */
    public com.google.protobuf.p9 f405076s;

    /* renamed from: t, reason: collision with root package name */
    public s95.y f405077t;

    /* renamed from: u, reason: collision with root package name */
    public s95.y f405078u;

    public h(s95.g gVar) {
        super(null);
        boolean z17;
        this.f405065e = java.util.Collections.emptyList();
        this.f405071n = java.util.Collections.emptyList();
        this.f405075r = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            f();
            d();
            e();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        s95.i buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s95.i buildPartial() {
        s95.i iVar = new s95.i(this, null);
        int i17 = this.f405064d;
        com.google.protobuf.p9 p9Var = this.f405066f;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f405065e = java.util.Collections.unmodifiableList(this.f405065e);
                this.f405064d &= -2;
            }
            iVar.f405086d = this.f405065e;
        } else {
            iVar.f405086d = p9Var.g();
        }
        iVar.f405087e = this.f405067g;
        iVar.f405088f = this.f405068h;
        iVar.f405089g = this.f405069i;
        iVar.f405090h = this.f405070m;
        com.google.protobuf.p9 p9Var2 = this.f405072o;
        if (p9Var2 == null) {
            if ((this.f405064d & 2) != 0) {
                this.f405071n = java.util.Collections.unmodifiableList(this.f405071n);
                this.f405064d &= -3;
            }
            iVar.f405091i = this.f405071n;
        } else {
            iVar.f405091i = p9Var2.g();
        }
        iVar.f405092m = this.f405073p;
        iVar.f405093n = this.f405074q;
        com.google.protobuf.p9 p9Var3 = this.f405076s;
        if (p9Var3 == null) {
            if ((this.f405064d & 4) != 0) {
                this.f405075r = java.util.Collections.unmodifiableList(this.f405075r);
                this.f405064d &= -5;
            }
            iVar.f405094o = this.f405075r;
        } else {
            iVar.f405094o = p9Var3.g();
        }
        iVar.f405095p = this.f405077t;
        iVar.f405096q = this.f405078u;
        onBuilt();
        return iVar;
    }

    public java.lang.Object clone() {
        return (s95.h) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f405072o == null) {
            this.f405072o = new com.google.protobuf.p9(this.f405071n, (this.f405064d & 2) != 0, getParentForChildren(), isClean());
            this.f405071n = null;
        }
        return this.f405072o;
    }

    public final com.google.protobuf.p9 e() {
        if (this.f405076s == null) {
            this.f405076s = new com.google.protobuf.p9(this.f405075r, (this.f405064d & 4) != 0, getParentForChildren(), isClean());
            this.f405075r = null;
        }
        return this.f405076s;
    }

    public final com.google.protobuf.p9 f() {
        if (this.f405066f == null) {
            this.f405066f = new com.google.protobuf.p9(this.f405065e, (this.f405064d & 1) != 0, getParentForChildren(), isClean());
            this.f405065e = null;
        }
        return this.f405066f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s95.h g(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = s95.i.f405085t     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.g r0 = (s95.g) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.i r2 = (s95.i) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.h(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            s95.i r3 = (s95.i) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.h(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s95.h.g(com.google.protobuf.d0, com.google.protobuf.t4):s95.h");
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return s95.i.f405084s;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return s95.r0.f405198w;
    }

    public s95.h h(s95.i iVar) {
        boolean z17;
        boolean z18;
        boolean z19;
        com.google.protobuf.wa waVar;
        if (iVar == s95.i.f405084s) {
            return this;
        }
        if (this.f405066f == null) {
            if (!iVar.f405086d.isEmpty()) {
                if (this.f405065e.isEmpty()) {
                    this.f405065e = iVar.f405086d;
                    this.f405064d &= -2;
                } else {
                    if ((this.f405064d & 1) == 0) {
                        this.f405065e = new java.util.ArrayList(this.f405065e);
                        this.f405064d |= 1;
                    }
                    this.f405065e.addAll(iVar.f405086d);
                }
                onChanged();
            }
        } else if (!iVar.f405086d.isEmpty()) {
            if (this.f405066f.p()) {
                this.f405066f.f45409a = null;
                this.f405066f = null;
                this.f405065e = iVar.f405086d;
                this.f405064d &= -2;
                z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f405066f = z17 ? f() : null;
            } else {
                this.f405066f.b(iVar.f405086d);
            }
        }
        long j17 = iVar.f405087e;
        if (j17 != 0) {
            this.f405067g = j17;
            onChanged();
        }
        long j18 = iVar.f405088f;
        if (j18 != 0) {
            this.f405068h = j18;
            onChanged();
        }
        boolean z27 = iVar.f405089g;
        if (z27) {
            this.f405069i = z27;
            onChanged();
        }
        if (iVar.f405090h != null) {
            s95.f k17 = iVar.k();
            s95.f fVar = this.f405070m;
            if (fVar != null) {
                s95.e builder = s95.f.f405055i.toBuilder();
                builder.f(fVar);
                builder.f(k17);
                this.f405070m = builder.buildPartial();
            } else {
                this.f405070m = k17;
            }
            onChanged();
        }
        if (this.f405072o == null) {
            if (!iVar.f405091i.isEmpty()) {
                if (this.f405071n.isEmpty()) {
                    this.f405071n = iVar.f405091i;
                    this.f405064d &= -3;
                } else {
                    if ((this.f405064d & 2) == 0) {
                        this.f405071n = new java.util.ArrayList(this.f405071n);
                        this.f405064d |= 2;
                    }
                    this.f405071n.addAll(iVar.f405091i);
                }
                onChanged();
            }
        } else if (!iVar.f405091i.isEmpty()) {
            if (this.f405072o.p()) {
                this.f405072o.f45409a = null;
                this.f405072o = null;
                this.f405071n = iVar.f405091i;
                this.f405064d &= -3;
                z18 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f405072o = z18 ? d() : null;
            } else {
                this.f405072o.b(iVar.f405091i);
            }
        }
        if (iVar.f405092m != null) {
            s95.u0 m17 = iVar.m();
            s95.u0 u0Var = this.f405073p;
            if (u0Var != null) {
                s95.t0 builder2 = s95.u0.f405223i.toBuilder();
                builder2.e(u0Var);
                builder2.e(m17);
                this.f405073p = builder2.buildPartial();
            } else {
                this.f405073p = m17;
            }
            onChanged();
        }
        boolean z28 = iVar.f405093n;
        if (z28) {
            this.f405074q = z28;
            onChanged();
        }
        if (this.f405076s == null) {
            if (!iVar.f405094o.isEmpty()) {
                if (this.f405075r.isEmpty()) {
                    this.f405075r = iVar.f405094o;
                    this.f405064d &= -5;
                } else {
                    if ((this.f405064d & 4) == 0) {
                        this.f405075r = new java.util.ArrayList(this.f405075r);
                        this.f405064d |= 4;
                    }
                    this.f405075r.addAll(iVar.f405094o);
                }
                onChanged();
            }
        } else if (!iVar.f405094o.isEmpty()) {
            if (this.f405076s.p()) {
                this.f405076s.f45409a = null;
                this.f405076s = null;
                this.f405075r = iVar.f405094o;
                this.f405064d &= -5;
                z19 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f405076s = z19 ? e() : null;
            } else {
                this.f405076s.b(iVar.f405094o);
            }
        }
        if (iVar.f405095p != null) {
            s95.y j19 = iVar.j();
            s95.y yVar = this.f405077t;
            if (yVar != null) {
                s95.x g17 = s95.y.g(yVar);
                g17.e(j19);
                this.f405077t = g17.buildPartial();
            } else {
                this.f405077t = j19;
            }
            onChanged();
        }
        if (iVar.f405096q != null) {
            s95.y l17 = iVar.l();
            s95.y yVar2 = this.f405078u;
            if (yVar2 != null) {
                s95.x g18 = s95.y.g(yVar2);
                g18.e(l17);
                this.f405078u = g18.buildPartial();
            } else {
                this.f405078u = l17;
            }
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) iVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405199x;
        j6Var.c(s95.i.class, s95.h.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (s95.h) m84mergeUnknownFields(waVar);
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
        return s95.i.f405084s;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        s95.i buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        g(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.i) {
            h((s95.i) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.i) {
            h((s95.i) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public h(com.google.protobuf.r5 r5Var, s95.g gVar) {
        super(r5Var);
        boolean z17;
        this.f405065e = java.util.Collections.emptyList();
        this.f405071n = java.util.Collections.emptyList();
        this.f405075r = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            f();
            d();
            e();
        }
    }
}
