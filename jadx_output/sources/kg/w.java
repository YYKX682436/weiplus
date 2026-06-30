package kg;

/* loaded from: classes16.dex */
public final class w extends com.google.protobuf.q5 implements com.google.protobuf.r8 {

    /* renamed from: d, reason: collision with root package name */
    public int f307643d;

    /* renamed from: e, reason: collision with root package name */
    public kg.h0 f307644e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f307645f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.p9 f307646g;

    /* renamed from: h, reason: collision with root package name */
    public kg.j f307647h;

    /* renamed from: i, reason: collision with root package name */
    public kg.b1 f307648i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f307649m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.p9 f307650n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f307651o;

    /* renamed from: p, reason: collision with root package name */
    public com.google.protobuf.p9 f307652p;

    public w(kg.b bVar) {
        super(null);
        this.f307645f = java.util.Collections.emptyList();
        this.f307649m = java.util.Collections.emptyList();
        this.f307651o = java.util.Collections.emptyList();
        if (kg.x.access$26400()) {
            d();
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
        kg.x buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.x buildPartial() {
        kg.x xVar = new kg.x(this);
        kg.x.access$26602(xVar, this.f307644e);
        com.google.protobuf.p9 p9Var = this.f307646g;
        if (p9Var == null) {
            if ((this.f307643d & 1) != 0) {
                this.f307645f = java.util.Collections.unmodifiableList(this.f307645f);
                this.f307643d &= -2;
            }
            kg.x.access$26702(xVar, this.f307645f);
        } else {
            kg.x.access$26702(xVar, p9Var.g());
        }
        kg.x.access$26802(xVar, this.f307647h);
        kg.x.access$26902(xVar, this.f307648i);
        com.google.protobuf.p9 p9Var2 = this.f307650n;
        if (p9Var2 == null) {
            if ((this.f307643d & 2) != 0) {
                this.f307649m = java.util.Collections.unmodifiableList(this.f307649m);
                this.f307643d &= -3;
            }
            kg.x.access$27002(xVar, this.f307649m);
        } else {
            kg.x.access$27002(xVar, p9Var2.g());
        }
        com.google.protobuf.p9 p9Var3 = this.f307652p;
        if (p9Var3 == null) {
            if ((this.f307643d & 4) != 0) {
                this.f307651o = java.util.Collections.unmodifiableList(this.f307651o);
                this.f307643d &= -5;
            }
            kg.x.access$27102(xVar, this.f307651o);
        } else {
            kg.x.access$27102(xVar, p9Var3.g());
        }
        onBuilt();
        return xVar;
    }

    public java.lang.Object clone() {
        return (kg.w) m83clone();
    }

    public final com.google.protobuf.p9 d() {
        if (this.f307646g == null) {
            this.f307646g = new com.google.protobuf.p9(this.f307645f, (this.f307643d & 1) != 0, getParentForChildren(), isClean());
            this.f307645f = null;
        }
        return this.f307646g;
    }

    public final com.google.protobuf.p9 e() {
        if (this.f307650n == null) {
            this.f307650n = new com.google.protobuf.p9(this.f307649m, (this.f307643d & 2) != 0, getParentForChildren(), isClean());
            this.f307649m = null;
        }
        return this.f307650n;
    }

    public final com.google.protobuf.p9 f() {
        if (this.f307652p == null) {
            this.f307652p = new com.google.protobuf.p9(this.f307651o, (this.f307643d & 4) != 0, getParentForChildren(), isClean());
            this.f307651o = null;
        }
        return this.f307652p;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.w g(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.x.access$27600()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.x r3 = (kg.x) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            if (r3 == 0) goto L10
            r2.h(r3)
        L10:
            return r2
        L11:
            r3 = move-exception
            goto L1f
        L13:
            r3 = move-exception
            com.google.protobuf.o8 r4 = r3.f45739d     // Catch: java.lang.Throwable -> L11
            kg.x r4 = (kg.x) r4     // Catch: java.lang.Throwable -> L11
            java.io.IOException r3 = r3.j()     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            r0 = r4
        L1f:
            if (r0 == 0) goto L24
            r2.h(r0)
        L24:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.w.g(com.google.protobuf.d0, com.google.protobuf.t4):kg.w");
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.x.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.O;
    }

    public kg.w h(kg.x xVar) {
        if (xVar == kg.x.getDefaultInstance()) {
            return this;
        }
        if (xVar.hasCoordinatingDesc()) {
            kg.h0 coordinatingDesc = xVar.getCoordinatingDesc();
            kg.h0 h0Var = this.f307644e;
            if (h0Var != null) {
                kg.g0 newBuilder = kg.h0.newBuilder(h0Var);
                newBuilder.e(coordinatingDesc);
                this.f307644e = newBuilder.buildPartial();
            } else {
                this.f307644e = coordinatingDesc;
            }
            onChanged();
        }
        if (this.f307646g == null) {
            if (!kg.x.access$26700(xVar).isEmpty()) {
                if (this.f307645f.isEmpty()) {
                    this.f307645f = kg.x.access$26700(xVar);
                    this.f307643d &= -2;
                } else {
                    if ((this.f307643d & 1) == 0) {
                        this.f307645f = new java.util.ArrayList(this.f307645f);
                        this.f307643d |= 1;
                    }
                    this.f307645f.addAll(kg.x.access$26700(xVar));
                }
                onChanged();
            }
        } else if (!kg.x.access$26700(xVar).isEmpty()) {
            if (this.f307646g.p()) {
                this.f307646g.f45409a = null;
                this.f307646g = null;
                this.f307645f = kg.x.access$26700(xVar);
                this.f307643d &= -2;
                this.f307646g = kg.x.access$27200() ? d() : null;
            } else {
                this.f307646g.b(kg.x.access$26700(xVar));
            }
        }
        if (xVar.hasBgmClip()) {
            kg.j bgmClip = xVar.getBgmClip();
            kg.j jVar = this.f307647h;
            if (jVar != null) {
                kg.i newBuilder2 = kg.j.newBuilder(jVar);
                newBuilder2.e(bgmClip);
                this.f307647h = newBuilder2.buildPartial();
            } else {
                this.f307647h = bgmClip;
            }
            onChanged();
        }
        if (xVar.hasLyricOverlayDesc()) {
            kg.b1 lyricOverlayDesc = xVar.getLyricOverlayDesc();
            kg.b1 b1Var = this.f307648i;
            if (b1Var != null) {
                kg.a1 newBuilder3 = kg.b1.newBuilder(b1Var);
                newBuilder3.f(lyricOverlayDesc);
                this.f307648i = newBuilder3.buildPartial();
            } else {
                this.f307648i = lyricOverlayDesc;
            }
            onChanged();
        }
        if (this.f307650n == null) {
            if (!kg.x.access$27000(xVar).isEmpty()) {
                if (this.f307649m.isEmpty()) {
                    this.f307649m = kg.x.access$27000(xVar);
                    this.f307643d &= -3;
                } else {
                    if ((this.f307643d & 2) == 0) {
                        this.f307649m = new java.util.ArrayList(this.f307649m);
                        this.f307643d |= 2;
                    }
                    this.f307649m.addAll(kg.x.access$27000(xVar));
                }
                onChanged();
            }
        } else if (!kg.x.access$27000(xVar).isEmpty()) {
            if (this.f307650n.p()) {
                this.f307650n.f45409a = null;
                this.f307650n = null;
                this.f307649m = kg.x.access$27000(xVar);
                this.f307643d &= -3;
                this.f307650n = kg.x.access$27300() ? e() : null;
            } else {
                this.f307650n.b(kg.x.access$27000(xVar));
            }
        }
        if (this.f307652p == null) {
            if (!kg.x.access$27100(xVar).isEmpty()) {
                if (this.f307651o.isEmpty()) {
                    this.f307651o = kg.x.access$27100(xVar);
                    this.f307643d &= -5;
                } else {
                    if ((this.f307643d & 4) == 0) {
                        this.f307651o = new java.util.ArrayList(this.f307651o);
                        this.f307643d |= 4;
                    }
                    this.f307651o.addAll(kg.x.access$27100(xVar));
                }
                onChanged();
            }
        } else if (!kg.x.access$27100(xVar).isEmpty()) {
            if (this.f307652p.p()) {
                this.f307652p.f45409a = null;
                this.f307652p = null;
                this.f307651o = kg.x.access$27100(xVar);
                this.f307643d &= -5;
                this.f307652p = kg.x.access$27400() ? f() : null;
            } else {
                this.f307652p.b(kg.x.access$27100(xVar));
            }
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.P;
        j6Var.c(kg.x.class, kg.w.class);
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
        return (kg.w) m84mergeUnknownFields(waVar);
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
        return kg.x.getDefaultInstance();
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
        kg.x buildPartial = buildPartial();
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
        if (k8Var instanceof kg.x) {
            h((kg.x) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.x) {
            h((kg.x) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    public w(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        this.f307645f = java.util.Collections.emptyList();
        this.f307649m = java.util.Collections.emptyList();
        this.f307651o = java.util.Collections.emptyList();
        if (kg.x.access$26400()) {
            d();
            e();
            f();
        }
    }
}
