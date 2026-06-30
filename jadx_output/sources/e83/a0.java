package e83;

/* loaded from: classes16.dex */
public final class a0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f250091d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f250092e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f250093f;

    /* renamed from: g, reason: collision with root package name */
    public int f250094g;

    /* renamed from: h, reason: collision with root package name */
    public int f250095h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f250096i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f250097m;

    /* renamed from: n, reason: collision with root package name */
    public int f250098n;

    /* renamed from: o, reason: collision with root package name */
    public e83.j f250099o;

    /* renamed from: p, reason: collision with root package name */
    public com.google.protobuf.t9 f250100p;

    public a0(e83.a aVar) {
        super(null);
        this.f250092e = "";
        this.f250093f = "";
        this.f250096i = "";
        this.f250097m = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        e83.b0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e83.b0 buildPartial() {
        e83.b0 b0Var = new e83.b0(this, null);
        int i17 = this.f250091d;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        b0Var.f250104e = this.f250092e;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        b0Var.f250105f = this.f250093f;
        if ((i17 & 4) != 0) {
            b0Var.f250106g = this.f250094g;
            i18 |= 4;
        }
        if ((i17 & 8) != 0) {
            b0Var.f250107h = this.f250095h;
            i18 |= 8;
        }
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        b0Var.f250108i = this.f250096i;
        if ((i17 & 32) != 0) {
            i18 |= 32;
        }
        b0Var.f250109m = this.f250097m;
        if ((i17 & 64) != 0) {
            b0Var.f250110n = this.f250098n;
            i18 |= 64;
        }
        if ((i17 & 128) != 0) {
            com.google.protobuf.t9 t9Var = this.f250100p;
            if (t9Var == null) {
                b0Var.f250111o = this.f250099o;
            } else {
                b0Var.f250111o = (e83.j) t9Var.b();
            }
            i18 |= 128;
        }
        b0Var.f250103d = i18;
        onBuilt();
        return b0Var;
    }

    public java.lang.Object clone() {
        return (e83.a0) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.a0 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.b0.f250102r     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.z r0 = (e83.z) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.b0 r2 = (e83.b0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            e83.b0 r3 = (e83.b0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: e83.a0.d(com.google.protobuf.d0, com.google.protobuf.t4):e83.a0");
    }

    public e83.a0 e(e83.b0 b0Var) {
        com.google.protobuf.wa waVar;
        e83.j jVar;
        e83.j jVar2;
        if (b0Var == e83.b0.f250101q) {
            return this;
        }
        if ((b0Var.f250103d & 1) != 0) {
            this.f250091d |= 1;
            this.f250092e = b0Var.f250104e;
            onChanged();
        }
        if ((b0Var.f250103d & 2) != 0) {
            this.f250091d |= 2;
            this.f250093f = b0Var.f250105f;
            onChanged();
        }
        if ((b0Var.f250103d & 4) != 0) {
            int i17 = b0Var.f250106g;
            this.f250091d |= 4;
            this.f250094g = i17;
            onChanged();
        }
        if ((b0Var.f250103d & 8) != 0) {
            int i18 = b0Var.f250107h;
            this.f250091d |= 8;
            this.f250095h = i18;
            onChanged();
        }
        if ((b0Var.f250103d & 16) != 0) {
            this.f250091d |= 16;
            this.f250096i = b0Var.f250108i;
            onChanged();
        }
        if ((b0Var.f250103d & 32) != 0) {
            this.f250091d |= 32;
            this.f250097m = b0Var.f250109m;
            onChanged();
        }
        if ((b0Var.f250103d & 64) != 0) {
            int i19 = b0Var.f250110n;
            this.f250091d |= 64;
            this.f250098n = i19;
            onChanged();
        }
        if ((b0Var.f250103d & 128) != 0) {
            e83.j h17 = b0Var.h();
            com.google.protobuf.t9 t9Var = this.f250100p;
            if (t9Var == null) {
                if ((this.f250091d & 128) == 0 || (jVar = this.f250099o) == null || jVar == (jVar2 = e83.j.f250151f)) {
                    this.f250099o = h17;
                } else {
                    e83.i builder = jVar2.toBuilder();
                    builder.f(jVar);
                    builder.f(h17);
                    this.f250099o = builder.buildPartial();
                }
                onChanged();
            } else {
                t9Var.g(h17);
            }
            this.f250091d |= 128;
        }
        waVar = ((com.google.protobuf.l6) b0Var).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return e83.b0.f250101q;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return e83.o0.f250207m;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250208n;
        j6Var.c(e83.b0.class, e83.a0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5, com.google.protobuf.p8
    public final boolean isInitialized() {
        return true;
    }

    public final void maybeForceBuilderInitialization() {
        boolean z17;
        com.google.protobuf.t9 t9Var;
        e83.j jVar;
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17 && (t9Var = this.f250100p) == null) {
            if (t9Var == null) {
                jVar = this.f250099o;
                if (jVar == null) {
                    jVar = e83.j.f250151f;
                }
            } else {
                jVar = (e83.j) t9Var.e();
            }
            this.f250100p = new com.google.protobuf.t9(jVar, getParentForChildren(), isClean());
            this.f250099o = null;
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
        return (e83.a0) m84mergeUnknownFields(waVar);
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
        return e83.b0.f250101q;
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
        e83.b0 buildPartial = buildPartial();
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
        if (k8Var instanceof e83.b0) {
            e((e83.b0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public a0(com.google.protobuf.r5 r5Var, e83.a aVar) {
        super(r5Var);
        this.f250092e = "";
        this.f250093f = "";
        this.f250096i = "";
        this.f250097m = "";
        maybeForceBuilderInitialization();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.b0) {
            e((e83.b0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
