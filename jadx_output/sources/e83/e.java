package e83;

/* loaded from: classes16.dex */
public final class e extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f250119d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250120e;

    /* renamed from: f, reason: collision with root package name */
    public int f250121f;

    /* renamed from: g, reason: collision with root package name */
    public e83.e0 f250122g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.protobuf.t9 f250123h;

    public e(e83.a aVar) {
        super(null);
        this.f250120e = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        e83.f buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e83.f buildPartial() {
        e83.f fVar = new e83.f(this, null);
        int i17 = this.f250119d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        fVar.f250131e = this.f250120e;
        if ((i17 & 2) != 0) {
            fVar.f250132f = this.f250121f;
            i18 |= 2;
        }
        if ((i17 & 4) != 0) {
            com.google.protobuf.t9 t9Var = this.f250123h;
            if (t9Var == null) {
                fVar.f250133g = this.f250122g;
            } else {
                fVar.f250133g = (e83.e0) t9Var.b();
            }
            i18 |= 4;
        }
        fVar.f250130d = i18;
        onBuilt();
        return fVar;
    }

    public java.lang.Object clone() {
        return (e83.e) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.e d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.f.f250129m     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.d r0 = (e83.d) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.f r2 = (e83.f) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            e83.f r3 = (e83.f) r3     // Catch: java.lang.Throwable -> Le
            java.io.IOException r2 = r2.j()     // Catch: java.lang.Throwable -> L1a
            throw r2     // Catch: java.lang.Throwable -> L1a
        L1a:
            r2 = move-exception
            goto L1d
        L1c:
            r3 = 0
        L1d:
            if (r3 == 0) goto L22
            r1.e(r3)
        L22:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e83.e.d(com.google.protobuf.d0, com.google.protobuf.t4):e83.e");
    }

    public e83.e e(e83.f fVar) {
        com.google.protobuf.wa waVar;
        e83.e0 e0Var;
        e83.e0 e0Var2;
        if (fVar == e83.f.f250128i) {
            return this;
        }
        if ((fVar.f250130d & 1) != 0) {
            this.f250119d |= 1;
            this.f250120e = fVar.f250131e;
            onChanged();
        }
        if ((fVar.f250130d & 2) != 0) {
            int i17 = fVar.f250132f;
            this.f250119d |= 2;
            this.f250121f = i17;
            onChanged();
        }
        if ((fVar.f250130d & 4) != 0) {
            e83.e0 i18 = fVar.i();
            com.google.protobuf.t9 t9Var = this.f250123h;
            if (t9Var == null) {
                if ((this.f250119d & 4) == 0 || (e0Var = this.f250122g) == null || e0Var == (e0Var2 = e83.e0.f250124f)) {
                    this.f250122g = i18;
                } else {
                    e83.d0 builder = e0Var2.toBuilder();
                    builder.f(e0Var);
                    builder.f(i18);
                    this.f250122g = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(i18);
            }
            this.f250119d |= 4;
        }
        waVar = ((com.google.protobuf.l6) fVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return e83.f.f250128i;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return e83.o0.f250213s;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250214t;
        j6Var.c(e83.f.class, e83.e.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    public final void maybeForceBuilderInitialization() {
        boolean z17;
        com.google.protobuf.t9 t9Var;
        e83.e0 e0Var;
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17 && (t9Var = this.f250123h) == null) {
            if (t9Var == null) {
                e0Var = this.f250122g;
                if (e0Var == null) {
                    e0Var = e83.e0.f250124f;
                }
            } else {
                e0Var = (e83.e0) t9Var.e();
            }
            this.f250123h = new com.google.protobuf.t9(e0Var, getParentForChildren(), isClean());
            this.f250122g = null;
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.e, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.a mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.a
    /* renamed from: mergeUnknownFields */
    public com.google.protobuf.a m84mergeUnknownFields(com.google.protobuf.wa waVar) {
        return (e83.e) m84mergeUnknownFields(waVar);
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
        return e83.f.f250128i;
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

    public e(com.google.protobuf.r5 r5Var, e83.a aVar) {
        super(r5Var);
        this.f250120e = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        e83.f buildPartial = buildPartial();
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
        if (k8Var instanceof e83.f) {
            e((e83.f) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.f) {
            e((e83.f) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
