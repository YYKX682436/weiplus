package cz5;

/* loaded from: classes16.dex */
public final class d extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public long f225041d;

    /* renamed from: e, reason: collision with root package name */
    public long f225042e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f225043f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.d8 f225044g;

    /* renamed from: h, reason: collision with root package name */
    public int f225045h;

    /* renamed from: i, reason: collision with root package name */
    public int f225046i;

    public d(cz5.b bVar) {
        super(null);
        this.f225043f = "";
        cz5.f fVar = cz5.f.f225048n;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        cz5.f buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public cz5.f buildPartial() {
        cz5.f fVar = new cz5.f(this, null);
        fVar.f225050d = this.f225041d;
        fVar.f225051e = this.f225042e;
        fVar.f225052f = this.f225043f;
        com.google.protobuf.d8 d8Var = this.f225044g;
        if (d8Var == null) {
            d8Var = new com.google.protobuf.d8(cz5.e.f225047a, com.google.protobuf.c8.MAP, java.util.Collections.emptyMap());
        }
        fVar.f225053g = d8Var;
        d8Var.f45025a = false;
        fVar.f225054h = this.f225045h;
        fVar.f225055i = this.f225046i;
        onBuilt();
        return fVar;
    }

    public java.lang.Object clone() {
        return (cz5.d) m83clone();
    }

    public final com.google.protobuf.d8 d() {
        onChanged();
        com.google.protobuf.d8 d8Var = this.f225044g;
        com.google.protobuf.c8 c8Var = com.google.protobuf.c8.MAP;
        if (d8Var == null) {
            this.f225044g = new com.google.protobuf.d8(cz5.e.f225047a, c8Var, new java.util.LinkedHashMap());
        }
        if (!this.f225044g.f45025a) {
            com.google.protobuf.d8 d8Var2 = this.f225044g;
            this.f225044g = new com.google.protobuf.d8(d8Var2.f45029e, c8Var, com.google.protobuf.e8.c(d8Var2.e()));
        }
        return this.f225044g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cz5.d e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = cz5.f.f225049o     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            cz5.c r0 = (cz5.c) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            cz5.f r2 = (cz5.f) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            cz5.f r3 = (cz5.f) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: cz5.d.e(com.google.protobuf.d0, com.google.protobuf.t4):cz5.d");
    }

    public cz5.d f(cz5.f fVar) {
        com.google.protobuf.wa waVar;
        if (fVar == cz5.f.f225048n) {
            return this;
        }
        long j17 = fVar.f225050d;
        if (j17 != 0) {
            this.f225041d = j17;
            onChanged();
        }
        long j18 = fVar.f225051e;
        if (j18 != 0) {
            this.f225042e = j18;
            onChanged();
        }
        if (!fVar.getName().isEmpty()) {
            this.f225043f = fVar.f225052f;
            onChanged();
        }
        com.google.protobuf.d8 d17 = d();
        com.google.protobuf.d8 g17 = fVar.g();
        ((com.google.protobuf.b8) d17.g()).putAll(com.google.protobuf.e8.c(g17.e()));
        int i17 = fVar.f225054h;
        if (i17 != 0) {
            this.f225045h = i17;
            onChanged();
        }
        int i18 = fVar.f225055i;
        if (i18 != 0) {
            this.f225046i = i18;
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) fVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return cz5.f.f225048n;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return cz5.g.f225057a;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = cz5.g.f225058b;
        j6Var.c(cz5.f.class, cz5.d.class);
        return j6Var;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.d8 internalGetMapField(int i17) {
        if (i17 == 4) {
            com.google.protobuf.d8 d8Var = this.f225044g;
            return d8Var == null ? new com.google.protobuf.d8(cz5.e.f225047a, com.google.protobuf.c8.MAP, java.util.Collections.emptyMap()) : d8Var;
        }
        throw new java.lang.RuntimeException("Invalid map field number: " + i17);
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.d8 internalGetMutableMapField(int i17) {
        if (i17 == 4) {
            return d();
        }
        throw new java.lang.RuntimeException("Invalid map field number: " + i17);
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
        return (cz5.d) m84mergeUnknownFields(waVar);
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
        return cz5.f.f225048n;
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

    public d(com.google.protobuf.r5 r5Var, cz5.b bVar) {
        super(r5Var);
        this.f225043f = "";
        cz5.f fVar = cz5.f.f225048n;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        cz5.f buildPartial = buildPartial();
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
        if (k8Var instanceof cz5.f) {
            f((cz5.f) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof cz5.f) {
            f((cz5.f) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
