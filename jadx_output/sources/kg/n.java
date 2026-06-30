package kg;

/* loaded from: classes16.dex */
public final class n extends com.google.protobuf.q5 implements kg.q {

    /* renamed from: d, reason: collision with root package name */
    public int f307576d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f307577e;

    public n(kg.b bVar) {
        super(null);
        boolean unused;
        this.f307576d = 0;
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.j8
    public com.google.protobuf.j8 addRepeatedField(com.google.protobuf.b4 b4Var, java.lang.Object obj) {
        addRepeatedField(b4Var, obj);
        return this;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.k8 build() {
        kg.p buildPartial = buildPartial();
        if (buildPartial.isInitialized()) {
            return buildPartial;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kg.p buildPartial() {
        kg.p pVar = new kg.p(this);
        if (this.f307576d == 1) {
            pVar.clip_ = this.f307577e;
        }
        if (this.f307576d == 2) {
            pVar.clip_ = this.f307577e;
        }
        if (this.f307576d == 3) {
            pVar.clip_ = this.f307577e;
        }
        pVar.clipCase_ = this.f307576d;
        onBuilt();
        return pVar;
    }

    public java.lang.Object clone() {
        return (kg.n) m83clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kg.n d(com.google.protobuf.d0 r3, com.google.protobuf.t4 r4) {
        /*
            r2 = this;
            r0 = 0
            com.google.protobuf.e9 r1 = kg.p.access$15400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
            kg.p r3 = (kg.p) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.y6 -> L13
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
            kg.p r4 = (kg.p) r4     // Catch: java.lang.Throwable -> L11
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
        throw new UnsupportedOperationException("Method not decompiled: kg.n.d(com.google.protobuf.d0, com.google.protobuf.t4):kg.n");
    }

    public kg.n e(kg.p pVar) {
        com.google.protobuf.wa waVar;
        if (pVar == kg.p.getDefaultInstance()) {
            return this;
        }
        int ordinal = pVar.getClipCase().ordinal();
        if (ordinal == 0) {
            kg.l0 imageClip = pVar.getImageClip();
            if (this.f307576d != 1 || this.f307577e == kg.l0.getDefaultInstance()) {
                this.f307577e = imageClip;
            } else {
                kg.k0 newBuilder = kg.l0.newBuilder((kg.l0) this.f307577e);
                newBuilder.e(imageClip);
                this.f307577e = newBuilder.buildPartial();
            }
            onChanged();
            this.f307576d = 1;
        } else if (ordinal == 1) {
            kg.o2 videoClip = pVar.getVideoClip();
            if (this.f307576d != 2 || this.f307577e == kg.o2.getDefaultInstance()) {
                this.f307577e = videoClip;
            } else {
                kg.n2 newBuilder2 = kg.o2.newBuilder((kg.o2) this.f307577e);
                newBuilder2.e(videoClip);
                this.f307577e = newBuilder2.buildPartial();
            }
            onChanged();
            this.f307576d = 2;
        } else if (ordinal == 2) {
            kg.j audioClip = pVar.getAudioClip();
            if (this.f307576d != 3 || this.f307577e == kg.j.getDefaultInstance()) {
                this.f307577e = audioClip;
            } else {
                kg.i newBuilder3 = kg.j.newBuilder((kg.j) this.f307577e);
                newBuilder3.e(audioClip);
                this.f307577e = newBuilder3.buildPartial();
            }
            onChanged();
            this.f307576d = 3;
        }
        waVar = ((com.google.protobuf.l6) pVar).unknownFields;
        onChanged();
        return this;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return kg.p.getDefaultInstance();
    }

    @Override // com.google.protobuf.j8, com.google.protobuf.r8
    public com.google.protobuf.r3 getDescriptorForType() {
        return kg.q2.f307623y;
    }

    @Override // com.google.protobuf.q5
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = kg.q2.f307624z;
        j6Var.c(kg.p.class, kg.n.class);
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
        return (kg.n) m84mergeUnknownFields(waVar);
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
        return kg.p.getDefaultInstance();
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

    public n(com.google.protobuf.r5 r5Var, kg.b bVar) {
        super(r5Var);
        boolean unused;
        this.f307576d = 0;
        unused = com.google.protobuf.l6.alwaysUseFieldBuilders;
    }

    @Override // com.google.protobuf.n8, com.google.protobuf.j8
    public com.google.protobuf.o8 build() {
        kg.p buildPartial = buildPartial();
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
        if (k8Var instanceof kg.p) {
            e((kg.p) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }

    @Override // com.google.protobuf.a, com.google.protobuf.j8
    public com.google.protobuf.j8 mergeFrom(com.google.protobuf.k8 k8Var) {
        if (k8Var instanceof kg.p) {
            e((kg.p) k8Var);
        } else {
            super.mergeFrom(k8Var);
        }
        return this;
    }
}
