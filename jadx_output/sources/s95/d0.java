package s95;

/* loaded from: classes16.dex */
public final class d0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public float f405024d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f405025e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f405026f;

    /* renamed from: g, reason: collision with root package name */
    public int f405027g;

    /* renamed from: h, reason: collision with root package name */
    public int f405028h;

    /* renamed from: i, reason: collision with root package name */
    public float f405029i;

    /* renamed from: m, reason: collision with root package name */
    public float f405030m;

    /* renamed from: n, reason: collision with root package name */
    public int f405031n;

    /* renamed from: o, reason: collision with root package name */
    public int f405032o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f405033p;

    /* renamed from: q, reason: collision with root package name */
    public long f405034q;

    public d0(s95.c0 c0Var) {
        super(null);
        this.f405027g = 0;
        this.f405028h = 0;
        s95.e0 e0Var = s95.e0.f405041s;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        s95.e0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s95.e0 buildPartial() {
        s95.e0 e0Var = new s95.e0(this, null);
        e0Var.f405043d = this.f405024d;
        e0Var.f405044e = this.f405025e;
        e0Var.f405045f = this.f405026f;
        e0Var.f405046g = this.f405027g;
        e0Var.f405047h = this.f405028h;
        e0Var.f405048i = this.f405029i;
        e0Var.f405049m = this.f405030m;
        e0Var.f405050n = this.f405031n;
        e0Var.f405051o = this.f405032o;
        e0Var.f405052p = this.f405033p;
        e0Var.f405053q = this.f405034q;
        onBuilt();
        return e0Var;
    }

    public java.lang.Object clone() {
        return (s95.d0) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s95.d0 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = s95.e0.f405042t     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.c0 r0 = (s95.c0) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.e0 r2 = (s95.e0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            s95.e0 r3 = (s95.e0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: s95.d0.d(com.google.protobuf.d0, com.google.protobuf.t4):s95.d0");
    }

    public s95.d0 e(s95.e0 e0Var) {
        if (e0Var == s95.e0.f405041s) {
            return this;
        }
        float f17 = e0Var.f405043d;
        if (f17 != 0.0f) {
            this.f405024d = f17;
            onChanged();
        }
        boolean z17 = e0Var.f405044e;
        if (z17) {
            this.f405025e = z17;
            onChanged();
        }
        boolean z18 = e0Var.f405045f;
        if (z18) {
            this.f405026f = z18;
            onChanged();
        }
        int i17 = e0Var.f405046g;
        if (i17 != 0) {
            this.f405027g = i17;
            onChanged();
        }
        int i18 = e0Var.f405047h;
        if (i18 != 0) {
            this.f405028h = i18;
            onChanged();
        }
        float f18 = e0Var.f405048i;
        if (f18 != 0.0f) {
            this.f405029i = f18;
            onChanged();
        }
        float f19 = e0Var.f405049m;
        if (f19 != 0.0f) {
            this.f405030m = f19;
            onChanged();
        }
        int i19 = e0Var.f405050n;
        if (i19 != 0) {
            this.f405031n = i19;
            onChanged();
        }
        int i27 = e0Var.f405051o;
        if (i27 != 0) {
            this.f405032o = i27;
            onChanged();
        }
        boolean z19 = e0Var.f405052p;
        if (z19) {
            this.f405033p = z19;
            onChanged();
        }
        long j17 = e0Var.f405053q;
        if (j17 != 0) {
            this.f405034q = j17;
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return s95.e0.f405041s;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return s95.r0.f405200y;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405201z;
        j6Var.c(s95.e0.class, s95.d0.class);
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
        return (s95.d0) m84mergeUnknownFields(waVar);
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
        return s95.e0.f405041s;
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
        s95.e0 buildPartial = buildPartial();
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

    public d0(com.google.protobuf.r5 r5Var, s95.c0 c0Var) {
        super(r5Var);
        this.f405027g = 0;
        this.f405028h = 0;
        s95.e0 e0Var = s95.e0.f405041s;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.e0) {
            e((s95.e0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.e0) {
            e((s95.e0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
