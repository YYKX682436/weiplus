package s95;

/* loaded from: classes16.dex */
public final class t0 extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f405212d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f405213e;

    /* renamed from: f, reason: collision with root package name */
    public long f405214f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405215g;

    public t0(com.google.protobuf.r5 r5Var, s95.s0 s0Var) {
        super(r5Var);
        this.f405212d = "";
        this.f405213e = "";
        s95.u0 u0Var = s95.u0.f405223i;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        s95.u0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public s95.u0 buildPartial() {
        s95.u0 u0Var = new s95.u0(this, null);
        u0Var.f405225d = this.f405212d;
        u0Var.f405226e = this.f405213e;
        u0Var.f405227f = this.f405214f;
        u0Var.f405228g = this.f405215g;
        onBuilt();
        return u0Var;
    }

    public java.lang.Object clone() {
        return (s95.t0) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s95.t0 d(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = s95.u0.f405224m     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.s0 r0 = (s95.s0) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            s95.u0 r2 = (s95.u0) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.e(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            s95.u0 r3 = (s95.u0) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: s95.t0.d(com.google.protobuf.d0, com.google.protobuf.t4):s95.t0");
    }

    public s95.t0 e(s95.u0 u0Var) {
        com.google.protobuf.wa waVar;
        if (u0Var == s95.u0.f405223i) {
            return this;
        }
        if (!u0Var.h().isEmpty()) {
            this.f405212d = u0Var.f405225d;
            onChanged();
        }
        if (!u0Var.g().isEmpty()) {
            this.f405213e = u0Var.f405226e;
            onChanged();
        }
        long j17 = u0Var.f405227f;
        if (j17 != 0) {
            this.f405214f = j17;
            onChanged();
        }
        boolean z17 = u0Var.f405228g;
        if (z17) {
            this.f405215g = z17;
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) u0Var).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return s95.u0.f405223i;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return s95.r0.f405194s;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405195t;
        j6Var.c(s95.u0.class, s95.t0.class);
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
        return (s95.t0) m84mergeUnknownFields(waVar);
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
        return s95.u0.f405223i;
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
        s95.u0 buildPartial = buildPartial();
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

    public t0(s95.s0 s0Var) {
        super(null);
        this.f405212d = "";
        this.f405213e = "";
        s95.u0 u0Var = s95.u0.f405223i;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.u0) {
            e((s95.u0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof s95.u0) {
            e((s95.u0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
