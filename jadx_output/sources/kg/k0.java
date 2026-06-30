package kg;

/* loaded from: classes16.dex */
public final class k0 extends com.google.protobuf.q5 implements kg.m0 {

    /* renamed from: d, reason: collision with root package name */
    public kg.f f307567d;

    /* renamed from: e, reason: collision with root package name */
    public kg.w1 f307568e;

    /* renamed from: f, reason: collision with root package name */
    public kg.d0 f307569f;

    /* renamed from: g, reason: collision with root package name */
    public kg.f1 f307570g;

    public k0(kg.b bVar) {
        super(null);
        kg.l0.access$11000();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        kg.l0 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.l0 buildPartial() {
        kg.l0 l0Var = new kg.l0(this);
        kg.l0.access$11202(l0Var, this.f307567d);
        kg.l0.access$11302(l0Var, this.f307568e);
        kg.l0.access$11402(l0Var, this.f307569f);
        kg.l0.access$11502(l0Var, this.f307570g);
        onBuilt();
        return l0Var;
    }

    public java.lang.Object clone() {
        return (kg.k0) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.k0 d(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.l0.access$11700()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.l0 r3 = (kg.l0) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
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
            kg.l0 r4 = (kg.l0) r4     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: kg.k0.d(com.google.protobuf.d0, com.google.protobuf.t4):kg.k0");
    }

    public kg.k0 e(kg.l0 l0Var) {
        if (l0Var == kg.l0.getDefaultInstance()) {
            return this;
        }
        if (l0Var.hasAsset()) {
            kg.f asset = l0Var.getAsset();
            kg.f fVar = this.f307567d;
            if (fVar != null) {
                kg.d newBuilder = kg.f.newBuilder(fVar);
                newBuilder.e(asset);
                this.f307567d = newBuilder.buildPartial();
            } else {
                this.f307567d = asset;
            }
            onChanged();
        }
        if (l0Var.hasDuration()) {
            kg.w1 duration = l0Var.getDuration();
            kg.w1 w1Var = this.f307568e;
            if (w1Var != null) {
                kg.v1 newBuilder2 = kg.w1.newBuilder(w1Var);
                newBuilder2.e(duration);
                this.f307568e = newBuilder2.buildPartial();
            } else {
                this.f307568e = duration;
            }
            onChanged();
        }
        if (l0Var.hasContentSpatialDesc()) {
            kg.d0 contentSpatialDesc = l0Var.getContentSpatialDesc();
            kg.d0 d0Var = this.f307569f;
            if (d0Var != null) {
                kg.c0 newBuilder3 = kg.d0.newBuilder(d0Var);
                newBuilder3.e(contentSpatialDesc);
                this.f307569f = newBuilder3.buildPartial();
            } else {
                this.f307569f = contentSpatialDesc;
            }
            onChanged();
        }
        if (l0Var.hasContentCropRect()) {
            kg.f1 contentCropRect = l0Var.getContentCropRect();
            kg.f1 f1Var = this.f307570g;
            if (f1Var != null) {
                kg.e1 newBuilder4 = kg.f1.newBuilder(f1Var);
                newBuilder4.e(contentCropRect);
                this.f307570g = newBuilder4.buildPartial();
            } else {
                this.f307570g = contentCropRect;
            }
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.l0.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.f307617s;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307618t;
        j6Var.c(kg.l0.class, kg.k0.class);
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
        return (kg.k0) m84mergeUnknownFields(waVar);
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
        return kg.l0.getDefaultInstance();
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

    public k0(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        kg.l0.access$11000();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        kg.l0 buildPartial = buildPartial();
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
        if (k8Var instanceof kg.l0) {
            e((kg.l0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.l0) {
            e((kg.l0) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
