package vg;

/* loaded from: classes16.dex */
public final class g extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f436436d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f436437e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f436438f;

    /* renamed from: g, reason: collision with root package name */
    public int f436439g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f436440h;

    /* renamed from: i, reason: collision with root package name */
    public com.google.protobuf.p9 f436441i;

    public g(vg.a aVar) {
        super(null);
        boolean z17;
        this.f436437e = "";
        this.f436438f = "";
        this.f436440h = java.util.Collections.emptyList();
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
        vg.h buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public vg.h buildPartial() {
        vg.h hVar = new vg.h(this);
        hVar.traceId_ = this.f436437e;
        hVar.traceName_ = this.f436438f;
        hVar.rootTaskId_ = this.f436439g;
        com.google.protobuf.p9 p9Var = this.f436441i;
        if (p9Var == null) {
            if ((this.f436436d & 1) != 0) {
                this.f436440h = java.util.Collections.unmodifiableList(this.f436440h);
                this.f436436d &= -2;
            }
            hVar.taskTimeTrace_ = this.f436440h;
        } else {
            hVar.taskTimeTrace_ = p9Var.g();
        }
        onBuilt();
        return hVar;
    }

    public java.lang.Object clone() {
        return (vg.g) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f436441i == null) {
            this.f436441i = new com.google.protobuf.p9(this.f436440h, (this.f436436d & 1) != 0, getParentForChildren(), isClean());
            this.f436440h = null;
        }
        return this.f436441i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vg.g e(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = vg.h.access$3400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            vg.h r3 = (vg.h) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            if (r3 == 0) goto L10
            r2.f(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f45739d     // Catch: java.lang.Throwable -> L11
            vg.h r4 = (vg.h) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.f(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.g.e(com.google.protobuf.d0, com.google.protobuf.t4):vg.g");
    }

    public vg.g f(vg.h hVar) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        boolean z17;
        com.google.protobuf.wa waVar;
        java.util.List list4;
        java.util.List list5;
        java.util.List list6;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (hVar == vg.h.getDefaultInstance()) {
            return this;
        }
        if (!hVar.getTraceId().isEmpty()) {
            obj2 = hVar.traceId_;
            this.f436437e = obj2;
            onChanged();
        }
        if (!hVar.getTraceName().isEmpty()) {
            obj = hVar.traceName_;
            this.f436438f = obj;
            onChanged();
        }
        if (hVar.getRootTaskId() != 0) {
            this.f436439g = hVar.getRootTaskId();
            onChanged();
        }
        if (this.f436441i == null) {
            list4 = hVar.taskTimeTrace_;
            if (!list4.isEmpty()) {
                if (this.f436440h.isEmpty()) {
                    list6 = hVar.taskTimeTrace_;
                    this.f436440h = list6;
                    this.f436436d &= -2;
                } else {
                    if ((this.f436436d & 1) == 0) {
                        this.f436440h = new java.util.ArrayList(this.f436440h);
                        this.f436436d |= 1;
                    }
                    java.util.List list7 = this.f436440h;
                    list5 = hVar.taskTimeTrace_;
                    list7.addAll(list5);
                }
                onChanged();
            }
        } else {
            list = hVar.taskTimeTrace_;
            if (!list.isEmpty()) {
                if (this.f436441i.p()) {
                    this.f436441i.f45409a = null;
                    this.f436441i = null;
                    list3 = hVar.taskTimeTrace_;
                    this.f436440h = list3;
                    this.f436436d &= -2;
                    z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
                    this.f436441i = z17 ? d() : null;
                } else {
                    com.google.protobuf.p9 p9Var = this.f436441i;
                    list2 = hVar.taskTimeTrace_;
                    p9Var.b(list2);
                }
            }
        }
        waVar = ((com.google.protobuf.l6) hVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return vg.h.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return vg.i.f436444c;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = vg.i.f436445d;
        j6Var.c(vg.h.class, vg.g.class);
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
        return (vg.g) m84mergeUnknownFields(waVar);
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
        return vg.h.getDefaultInstance();
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
        vg.h buildPartial = buildPartial();
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
        if (k8Var instanceof vg.h) {
            f((vg.h) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public g(com.google.protobuf.r5 r5Var, vg.a aVar) {
        super(r5Var);
        boolean z17;
        this.f436437e = "";
        this.f436438f = "";
        this.f436440h = java.util.Collections.emptyList();
        z17 = com.google.protobuf.l6.alwaysUseFieldBuilders;
        if (z17) {
            d();
        }
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof vg.h) {
            f((vg.h) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
