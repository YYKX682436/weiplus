package kg;

/* loaded from: classes16.dex */
public final class n2 extends com.google.protobuf.q5 implements kg.p2 {

    /* renamed from: d, reason: collision with root package name */
    public kg.f f307584d;

    /* renamed from: e, reason: collision with root package name */
    public kg.a2 f307585e;

    /* renamed from: f, reason: collision with root package name */
    public kg.d0 f307586f;

    /* renamed from: g, reason: collision with root package name */
    public kg.f1 f307587g;

    public n2(kg.b bVar) {
        super(null);
        kg.o2.access$12300();
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        kg.o2 buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.o2 buildPartial() {
        kg.o2 o2Var = new kg.o2(this);
        kg.o2.access$12502(o2Var, this.f307584d);
        kg.o2.access$12602(o2Var, this.f307585e);
        kg.o2.access$12702(o2Var, this.f307586f);
        kg.o2.access$12802(o2Var, this.f307587g);
        onBuilt();
        return o2Var;
    }

    public java.lang.Object clone() {
        return (kg.n2) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.n2 d(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.o2.access$13000()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.o2 r3 = (kg.o2) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
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
            kg.o2 r4 = (kg.o2) r4     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: kg.n2.d(com.google.protobuf.d0, com.google.protobuf.t4):kg.n2");
    }

    public kg.n2 e(kg.o2 o2Var) {
        if (o2Var == kg.o2.getDefaultInstance()) {
            return this;
        }
        if (o2Var.hasAsset()) {
            kg.f asset = o2Var.getAsset();
            kg.f fVar = this.f307584d;
            if (fVar != null) {
                kg.d newBuilder = kg.f.newBuilder(fVar);
                newBuilder.e(asset);
                this.f307584d = newBuilder.buildPartial();
            } else {
                this.f307584d = asset;
            }
            onChanged();
        }
        if (o2Var.hasTimeRange()) {
            kg.a2 timeRange = o2Var.getTimeRange();
            kg.a2 a2Var = this.f307585e;
            if (a2Var != null) {
                kg.z1 newBuilder2 = kg.a2.newBuilder(a2Var);
                newBuilder2.e(timeRange);
                this.f307585e = newBuilder2.buildPartial();
            } else {
                this.f307585e = timeRange;
            }
            onChanged();
        }
        if (o2Var.hasContentSpatialDesc()) {
            kg.d0 contentSpatialDesc = o2Var.getContentSpatialDesc();
            kg.d0 d0Var = this.f307586f;
            if (d0Var != null) {
                kg.c0 newBuilder3 = kg.d0.newBuilder(d0Var);
                newBuilder3.e(contentSpatialDesc);
                this.f307586f = newBuilder3.buildPartial();
            } else {
                this.f307586f = contentSpatialDesc;
            }
            onChanged();
        }
        if (o2Var.hasContentCropRect()) {
            kg.f1 contentCropRect = o2Var.getContentCropRect();
            kg.f1 f1Var = this.f307587g;
            if (f1Var != null) {
                kg.e1 newBuilder4 = kg.f1.newBuilder(f1Var);
                newBuilder4.e(contentCropRect);
                this.f307587g = newBuilder4.buildPartial();
            } else {
                this.f307587g = contentCropRect;
            }
            onChanged();
        }
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.o2.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.f307619u;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307620v;
        j6Var.c(kg.o2.class, kg.n2.class);
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
        return (kg.n2) m84mergeUnknownFields(waVar);
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
        return kg.o2.getDefaultInstance();
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

    public n2(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        kg.o2.access$12300();
    }

    @Override // com.google.protobuf.a, com.google.protobuf.n8
    public /* bridge */ /* synthetic */ com.google.protobuf.j8 mergeFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
        d(d0Var, t4Var);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        kg.o2 buildPartial = buildPartial();
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
        if (k8Var instanceof kg.o2) {
            e((kg.o2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.o2) {
            e((kg.o2) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
