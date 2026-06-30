package e83;

/* loaded from: classes16.dex */
public final class i extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f250148d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f250149e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.protobuf.p9 f250150f;

    public i(e83.a aVar) {
        super(null);
        boolean z17;
        this.f250149e = java.util.Collections.emptyList();
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
        e83.j buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e83.j buildPartial() {
        e83.j jVar = new e83.j(this, null);
        int i17 = this.f250148d;
        com.google.protobuf.p9 p9Var = this.f250150f;
        if (p9Var == null) {
            if ((i17 & 1) != 0) {
                this.f250149e = java.util.Collections.unmodifiableList(this.f250149e);
                this.f250148d &= -2;
            }
            jVar.f250153d = this.f250149e;
        } else {
            jVar.f250153d = p9Var.g();
        }
        onBuilt();
        return jVar;
    }

    public java.lang.Object clone() {
        return (e83.i) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f250150f == null) {
            this.f250150f = new com.google.protobuf.p9(this.f250149e, (this.f250148d & 1) != 0, getParentForChildren(), isClean());
            this.f250149e = null;
        }
        return this.f250150f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e83.i e(com.google.protobuf.d0 r2, com.google.protobuf.t4 r3) {
        /*
            r1 = this;
            com.google.protobuf.e9 r0 = e83.j.f250152g     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.h r0 = (e83.h) r0     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            java.lang.Object r2 = r0.parsePartialFrom(r2, r3)     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            e83.j r2 = (e83.j) r2     // Catch: java.lang.Throwable -> Le com.google.protobuf.y6 -> L10
            r1.f(r2)
            return r1
        Le:
            r2 = move-exception
            goto L1c
        L10:
            r2 = move-exception
            com.google.protobuf.o8 r3 = r2.f45739d     // Catch: java.lang.Throwable -> Le
            e83.j r3 = (e83.j) r3     // Catch: java.lang.Throwable -> Le
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
        throw new UnsupportedOperationException("Method not decompiled: e83.i.e(com.google.protobuf.d0, com.google.protobuf.t4):e83.i");
    }

    public e83.i f(e83.j jVar) {
        boolean z17;
        com.google.protobuf.wa waVar;
        if (jVar == e83.j.f250151f) {
            return this;
        }
        if (this.f250150f == null) {
            if (!jVar.f250153d.isEmpty()) {
                if (this.f250149e.isEmpty()) {
                    this.f250149e = jVar.f250153d;
                    this.f250148d &= -2;
                } else {
                    if ((this.f250148d & 1) == 0) {
                        this.f250149e = new java.util.ArrayList(this.f250149e);
                        this.f250148d |= 1;
                    }
                    this.f250149e.addAll(jVar.f250153d);
                }
                onChanged();
            }
        } else if (!jVar.f250153d.isEmpty()) {
            if (this.f250150f.p()) {
                this.f250150f.f45409a = null;
                this.f250150f = null;
                this.f250149e = jVar.f250153d;
                this.f250148d &= -2;
                z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                this.f250150f = z17 ? d() : null;
            } else {
                this.f250150f.b(jVar.f250153d);
            }
        }
        waVar = ((com.google.protobuf.l6) jVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return e83.j.f250151f;
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return e83.o0.f250205k;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250206l;
        j6Var.c(e83.j.class, e83.i.class);
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
        return (e83.i) m84mergeUnknownFields(waVar);
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
        return e83.j.f250151f;
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
        e83.j buildPartial = buildPartial();
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

    public i(com.google.protobuf.r5 r5Var, e83.a aVar) {
        super(r5Var);
        boolean z17;
        this.f250149e = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.a mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.j) {
            f((e83.j) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof e83.j) {
            f((e83.j) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
