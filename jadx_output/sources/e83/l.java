package e83;

/* loaded from: classes16.dex */
public final class l extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f250164d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250165e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f250166f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f250167g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.p9 f250168h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f250169i;

    /* renamed from: m, reason: collision with root package name */
    public com.google.protobuf.p9 f250170m;

    public l(e83.a aVar) {
        super(null);
        boolean z17;
        this.f250165e = "";
        this.f250166f = "";
        this.f250167g = java.util.Collections.emptyList();
        this.f250169i = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            e();
            f();
        }
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        e83.m buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    public e83.u c() {
        return (e83.u) f().d(e83.v.f250240h);
    }

    public java.lang.Object clone() {
        return (e83.l) m83clone();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e83.m buildPartial() {
        e83.m mVar = new e83.m(this, null);
        int i17 = this.f250164d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        mVar.f250174e = this.f250165e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        mVar.f250175f = this.f250166f;
        com.google.protobuf.p9 p9Var = this.f250168h;
        if (p9Var == null) {
            if ((this.f250164d & 4) != 0) {
                this.f250167g = java.util.Collections.unmodifiableList(this.f250167g);
                this.f250164d &= -5;
            }
            mVar.f250176g = this.f250167g;
        } else {
            mVar.f250176g = p9Var.g();
        }
        com.google.protobuf.p9 p9Var2 = this.f250170m;
        if (p9Var2 == null) {
            if ((this.f250164d & 8) != 0) {
                this.f250169i = java.util.Collections.unmodifiableList(this.f250169i);
                this.f250164d &= -9;
            }
            mVar.f250177h = this.f250169i;
        } else {
            mVar.f250177h = p9Var2.g();
        }
        mVar.f250173d = i18;
        onBuilt();
        return mVar;
    }

    public final com.google.protobuf.p9 e() {
        if (this.f250168h == null) {
            this.f250168h = new com.google.protobuf.p9(this.f250167g, (this.f250164d & 4) != 0, getParentForChildren(), isClean());
            this.f250167g = null;
        }
        return this.f250168h;
    }

    public final com.google.protobuf.p9 f() {
        if (this.f250170m == null) {
            this.f250170m = new com.google.protobuf.p9(this.f250169i, (this.f250164d & 8) != 0, getParentForChildren(), isClean());
            this.f250169i = null;
        }
        return this.f250170m;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.l g(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.m.f250172n     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.k r0 = (e83.k) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.m r2 = (e83.m) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.h(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            e83.m r3 = (e83.m) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: e83.l.g(com.google.protobuf.d0, com.google.protobuf.t4):e83.l");
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return e83.m.f250171m;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return e83.o0.f250203i;
    }

    public e83.l h(e83.m mVar) {
        boolean z17;
        boolean z18;
        com.google.protobuf.wa waVar;
        if (mVar == e83.m.f250171m) {
            return this;
        }
        if ((mVar.f250173d & 1) != 0) {
            this.f250164d |= 1;
            this.f250165e = mVar.f250174e;
            onChanged();
        }
        if ((mVar.f250173d & 2) != 0) {
            this.f250164d |= 2;
            this.f250166f = mVar.f250175f;
            onChanged();
        }
        if (this.f250168h == null) {
            if (!mVar.f250176g.isEmpty()) {
                if (this.f250167g.isEmpty()) {
                    this.f250167g = mVar.f250176g;
                    this.f250164d &= -5;
                } else {
                    if ((this.f250164d & 4) == 0) {
                        this.f250167g = new java.util.ArrayList(this.f250167g);
                        this.f250164d |= 4;
                    }
                    this.f250167g.addAll(mVar.f250176g);
                }
                onChanged();
            }
        } else if (!mVar.f250176g.isEmpty()) {
            if (this.f250168h.p()) {
                this.f250168h.f45409a = null;
                this.f250168h = null;
                this.f250167g = mVar.f250176g;
                this.f250164d &= -5;
                z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f250168h = z17 ? e() : null;
            } else {
                this.f250168h.b(mVar.f250176g);
            }
        }
        if (this.f250170m == null) {
            if (!mVar.f250177h.isEmpty()) {
                if (this.f250169i.isEmpty()) {
                    this.f250169i = mVar.f250177h;
                    this.f250164d &= -9;
                } else {
                    if ((this.f250164d & 8) == 0) {
                        this.f250169i = new java.util.ArrayList(this.f250169i);
                        this.f250164d |= 8;
                    }
                    this.f250169i.addAll(mVar.f250177h);
                }
                onChanged();
            }
        } else if (!mVar.f250177h.isEmpty()) {
            if (this.f250170m.p()) {
                this.f250170m.f45409a = null;
                this.f250170m = null;
                this.f250169i = mVar.f250177h;
                this.f250164d &= -9;
                z18 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f250170m = z18 ? f() : null;
            } else {
                this.f250170m.b(mVar.f250177h);
            }
        }
        waVar = ((com.google.protobuf.l6) mVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250204j;
        j6Var.c(e83.m.class, e83.l.class);
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
        return (e83.l) m84mergeUnknownFields(waVar);
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
        return e83.m.f250171m;
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
        e83.m buildPartial = buildPartial();
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
        if (k8Var instanceof e83.m) {
            h((e83.m) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.m) {
            h((e83.m) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public l(com.google.protobuf.r5 r5Var, e83.a aVar) {
        super(r5Var);
        boolean z17;
        this.f250165e = "";
        this.f250166f = "";
        this.f250167g = java.util.Collections.emptyList();
        this.f250169i = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            e();
            f();
        }
    }
}
