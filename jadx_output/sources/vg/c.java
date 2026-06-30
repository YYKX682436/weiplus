package vg;

/* loaded from: classes16.dex */
public final class c extends com.google.protobuf.q5 implements vg.e {

    /* renamed from: d, reason: collision with root package name */
    public int f436428d;

    /* renamed from: e, reason: collision with root package name */
    public int f436429e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f436430f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f436431g;

    /* renamed from: h, reason: collision with root package name */
    public double f436432h;

    /* renamed from: i, reason: collision with root package name */
    public double f436433i;

    /* renamed from: m, reason: collision with root package name */
    public long f436434m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.t6 f436435n;

    public c(vg.a aVar) {
        super(null);
        com.google.protobuf.t6 emptyIntList;
        boolean unused;
        this.f436430f = "";
        this.f436431g = "";
        emptyIntList = com.google.protobuf.l6.emptyIntList();
        this.f436435n = emptyIntList;
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        vg.d buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public vg.d buildPartial() {
        vg.d dVar = new vg.d(this);
        dVar.taskId_ = this.f436429e;
        dVar.taskName_ = this.f436430f;
        dVar.taskTag_ = this.f436431g;
        dVar.startTime_ = this.f436432h;
        dVar.duration_ = this.f436433i;
        dVar.taskTraits_ = this.f436434m;
        int i17 = this.f436428d;
        if ((i17 & 1) != 0) {
            ((com.google.protobuf.h) this.f436435n).f45145d = false;
            this.f436428d = i17 & (-2);
        }
        dVar.subTaskId_ = this.f436435n;
        onBuilt();
        return dVar;
    }

    public java.lang.Object clone() {
        return (vg.c) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vg.c d(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = vg.d.access$1500()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            vg.d r3 = (vg.d) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            if (r3 == 0) goto L10
            r2.e(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f45739d     // Catch: java.lang.Throwable -> L11
            vg.d r4 = (vg.d) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.e(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.c.d(com.google.protobuf.d0, com.google.protobuf.t4):vg.c");
    }

    public vg.c e(vg.d dVar) {
        com.google.protobuf.t6 t6Var;
        com.google.protobuf.wa waVar;
        com.google.protobuf.t6 t6Var2;
        com.google.protobuf.t6 mutableCopy;
        com.google.protobuf.t6 t6Var3;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (dVar == vg.d.getDefaultInstance()) {
            return this;
        }
        if (dVar.getTaskId() != 0) {
            this.f436429e = dVar.getTaskId();
            onChanged();
        }
        if (!dVar.getTaskName().isEmpty()) {
            obj2 = dVar.taskName_;
            this.f436430f = obj2;
            onChanged();
        }
        if (!dVar.getTaskTag().isEmpty()) {
            obj = dVar.taskTag_;
            this.f436431g = obj;
            onChanged();
        }
        if (dVar.getStartTime() != 0.0d) {
            this.f436432h = dVar.getStartTime();
            onChanged();
        }
        if (dVar.getDuration() != 0.0d) {
            this.f436433i = dVar.getDuration();
            onChanged();
        }
        if (dVar.getTaskTraits() != 0) {
            this.f436434m = dVar.getTaskTraits();
            onChanged();
        }
        t6Var = dVar.subTaskId_;
        if (!t6Var.isEmpty()) {
            if (this.f436435n.isEmpty()) {
                t6Var3 = dVar.subTaskId_;
                this.f436435n = t6Var3;
                this.f436428d &= -2;
            } else {
                if ((this.f436428d & 1) == 0) {
                    mutableCopy = com.google.protobuf.l6.mutableCopy(this.f436435n);
                    this.f436435n = mutableCopy;
                    this.f436428d |= 1;
                }
                com.google.protobuf.t6 t6Var4 = this.f436435n;
                t6Var2 = dVar.subTaskId_;
                ((com.google.protobuf.m6) t6Var4).addAll(t6Var2);
            }
            onChanged();
        }
        waVar = ((com.google.protobuf.l6) dVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return vg.d.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return vg.i.f436442a;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = vg.i.f436443b;
        j6Var.c(vg.d.class, vg.c.class);
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
        return (vg.c) m84mergeUnknownFields(waVar);
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
        return vg.d.getDefaultInstance();
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
        vg.d buildPartial = buildPartial();
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
        if (k8Var instanceof vg.d) {
            e((vg.d) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public c(com.google.protobuf.r5 r5Var, vg.a aVar) {
        super(r5Var);
        com.google.protobuf.t6 emptyIntList;
        boolean unused;
        this.f436430f = "";
        this.f436431g = "";
        emptyIntList = com.google.protobuf.l6.emptyIntList();
        this.f436435n = emptyIntList;
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof vg.d) {
            e((vg.d) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
