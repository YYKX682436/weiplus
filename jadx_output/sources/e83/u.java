package e83;

/* loaded from: classes16.dex */
public final class u extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f250236d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250237e;

    /* renamed from: f, reason: collision with root package name */
    public e83.n0 f250238f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.t9 f250239g;

    public u(e83.a aVar) {
        super(null);
        boolean z17;
        this.f250237e = "";
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
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
        e83.v buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e83.v buildPartial() {
        e83.v vVar = new e83.v(this, null);
        int i17 = this.f250236d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        vVar.f250243e = this.f250237e;
        if ((i17 & 2) != 0) {
            com.google.protobuf.t9 t9Var = this.f250239g;
            if (t9Var == null) {
                vVar.f250244f = this.f250238f;
            } else {
                vVar.f250244f = (e83.n0) t9Var.b();
            }
            i18 |= 2;
        }
        vVar.f250242d = i18;
        onBuilt();
        return vVar;
    }

    public java.lang.Object clone() {
        return (e83.u) m83clone();
    }

    public e83.m0 d() {
        this.f250236d |= 2;
        onChanged();
        return (e83.m0) e().d();
    }

    public final com.google.protobuf.t9 e() {
        e83.n0 n0Var;
        com.google.protobuf.t9 t9Var = this.f250239g;
        if (t9Var == null) {
            if (t9Var == null) {
                n0Var = this.f250238f;
                if (n0Var == null) {
                    n0Var = e83.n0.f250184m;
                }
            } else {
                n0Var = (e83.n0) t9Var.e();
            }
            this.f250239g = new com.google.protobuf.t9(n0Var, getParentForChildren(), isClean());
            this.f250238f = null;
        }
        return this.f250239g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.u f(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.v.f250241i     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.t r0 = (e83.t) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.v r2 = (e83.v) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.g(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            e83.v r3 = (e83.v) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.g(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.u.f(com.google.protobuf.d0, com.google.protobuf.t4):e83.u");
    }

    public e83.u g(e83.v vVar) {
        com.google.protobuf.wa waVar;
        e83.n0 n0Var;
        e83.n0 n0Var2;
        if (vVar == e83.v.f250240h) {
            return this;
        }
        if ((vVar.f250242d & 1) != 0) {
            this.f250236d |= 1;
            this.f250237e = vVar.f250243e;
            onChanged();
        }
        if ((vVar.f250242d & 2) != 0) {
            e83.n0 h17 = vVar.h();
            com.google.protobuf.t9 t9Var = this.f250239g;
            if (t9Var == null) {
                if ((this.f250236d & 2) == 0 || (n0Var = this.f250238f) == null || n0Var == (n0Var2 = e83.n0.f250184m)) {
                    this.f250238f = h17;
                } else {
                    e83.m0 builder = n0Var2.toBuilder();
                    builder.f(n0Var);
                    builder.f(h17);
                    this.f250238f = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(h17);
            }
            this.f250236d |= 2;
        }
        waVar = ((com.google.protobuf.l6) vVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return e83.v.f250240h;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return e83.o0.f250201g;
    }

    public e83.u h(java.lang.String str) {
        str.getClass();
        this.f250236d |= 1;
        this.f250237e = str;
        onChanged();
        return this;
    }

    public e83.u i(e83.m0 m0Var) {
        com.google.protobuf.t9 t9Var = this.f250239g;
        if (t9Var == null) {
            this.f250238f = m0Var.build();
            onChanged();
        } else {
            t9Var.i(m0Var.build());
        }
        this.f250236d |= 2;
        return this;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250202h;
        j6Var.c(e83.v.class, e83.u.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (e83.u) m84mergeUnknownFields(waVar);
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
        return e83.v.f250240h;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.e mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 setUnknownFields(com.google.protobuf.wa waVar) {
        super.setUnknownFields(waVar);
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        e83.v buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.n8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        f(d0Var, t4Var);
        return this;
    }

    public u(com.google.protobuf.r5 r5Var, e83.a aVar) {
        super(r5Var);
        boolean z17;
        this.f250237e = "";
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            e();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.v) {
            g((e83.v) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.v) {
            g((e83.v) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
