package s95;

/* loaded from: classes16.dex */
public final class e0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: s */
    public static final s95.e0 f405041s = new s95.e0();

    /* renamed from: t */
    public static final com.google.protobuf.e9 f405042t = new s95.c0();

    /* renamed from: d */
    public float f405043d;

    /* renamed from: e */
    public boolean f405044e;

    /* renamed from: f */
    public boolean f405045f;

    /* renamed from: g */
    public int f405046g;

    /* renamed from: h */
    public int f405047h;

    /* renamed from: i */
    public float f405048i;

    /* renamed from: m */
    public float f405049m;

    /* renamed from: n */
    public int f405050n;

    /* renamed from: o */
    public int f405051o;

    /* renamed from: p */
    public boolean f405052p;

    /* renamed from: q */
    public long f405053q;

    /* renamed from: r */
    public byte f405054r;

    public e0(com.google.protobuf.q5 q5Var, s95.c0 c0Var) {
        super(q5Var);
        this.f405054r = (byte) -1;
    }

    public static /* synthetic */ com.google.protobuf.wa f(s95.e0 e0Var) {
        return e0Var.unknownFields;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.e0)) {
            return super.equals(obj);
        }
        s95.e0 e0Var = (s95.e0) obj;
        return java.lang.Float.floatToIntBits(this.f405043d) == java.lang.Float.floatToIntBits(e0Var.f405043d) && this.f405044e == e0Var.f405044e && this.f405045f == e0Var.f405045f && this.f405046g == e0Var.f405046g && this.f405047h == e0Var.f405047h && java.lang.Float.floatToIntBits(this.f405048i) == java.lang.Float.floatToIntBits(e0Var.f405048i) && java.lang.Float.floatToIntBits(this.f405049m) == java.lang.Float.floatToIntBits(e0Var.f405049m) && this.f405050n == e0Var.f405050n && this.f405051o == e0Var.f405051o && this.f405052p == e0Var.f405052p && this.f405053q == e0Var.f405053q && this.unknownFields.equals(e0Var.unknownFields);
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: g */
    public s95.d0 toBuilder() {
        if (this == f405041s) {
            return new s95.d0(null);
        }
        s95.d0 d0Var = new s95.d0(null);
        d0Var.e(this);
        return d0Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405041s;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        float f17 = this.f405043d;
        int i18 = f17 != 0.0f ? 0 + com.google.protobuf.k0.i(1, f17) : 0;
        boolean z17 = this.f405044e;
        if (z17) {
            i18 += com.google.protobuf.k0.b(2, z17);
        }
        boolean z18 = this.f405045f;
        if (z18) {
            i18 += com.google.protobuf.k0.b(3, z18);
        }
        int i19 = this.f405046g;
        s95.p pVar = s95.p.PbDefault;
        if (i19 != pVar.getNumber()) {
            i18 += com.google.protobuf.k0.f(4, this.f405046g);
        }
        if (this.f405047h != pVar.getNumber()) {
            i18 += com.google.protobuf.k0.f(5, this.f405047h);
        }
        float f18 = this.f405048i;
        if (f18 != 0.0f) {
            i18 += com.google.protobuf.k0.i(6, f18);
        }
        float f19 = this.f405049m;
        if (f19 != 0.0f) {
            i18 += com.google.protobuf.k0.i(7, f19);
        }
        int i27 = this.f405050n;
        if (i27 != 0) {
            i18 += com.google.protobuf.k0.k(8, i27);
        }
        int i28 = this.f405051o;
        if (i28 != 0) {
            i18 += com.google.protobuf.k0.k(9, i28);
        }
        boolean z19 = this.f405052p;
        if (z19) {
            i18 += com.google.protobuf.k0.b(10, z19);
        }
        long j17 = this.f405053q;
        if (j17 != 0) {
            i18 += com.google.protobuf.k0.m(11, j17);
        }
        int serializedSize = i18 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + s95.r0.f405200y.hashCode()) * 37) + 1) * 53) + java.lang.Float.floatToIntBits(this.f405043d)) * 37) + 2) * 53) + com.google.protobuf.w6.a(this.f405044e)) * 37) + 3) * 53) + com.google.protobuf.w6.a(this.f405045f)) * 37) + 4) * 53) + this.f405046g) * 37) + 5) * 53) + this.f405047h) * 37) + 6) * 53) + java.lang.Float.floatToIntBits(this.f405048i)) * 37) + 7) * 53) + java.lang.Float.floatToIntBits(this.f405049m)) * 37) + 8) * 53) + this.f405050n) * 37) + 9) * 53) + this.f405051o) * 37) + 10) * 53) + com.google.protobuf.w6.a(this.f405052p)) * 37) + 11) * 53) + com.google.protobuf.w6.b(this.f405053q)) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405201z;
        j6Var.c(s95.e0.class, s95.d0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405054r;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405054r = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405041s.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.e0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        float f17 = this.f405043d;
        if (f17 != 0.0f) {
            k0Var.G(1, f17);
        }
        boolean z17 = this.f405044e;
        if (z17) {
            k0Var.x(2, z17);
        }
        boolean z18 = this.f405045f;
        if (z18) {
            k0Var.x(3, z18);
        }
        int i17 = this.f405046g;
        s95.p pVar = s95.p.PbDefault;
        if (i17 != pVar.getNumber()) {
            k0Var.H(4, this.f405046g);
        }
        if (this.f405047h != pVar.getNumber()) {
            k0Var.H(5, this.f405047h);
        }
        float f18 = this.f405048i;
        if (f18 != 0.0f) {
            k0Var.G(6, f18);
        }
        float f19 = this.f405049m;
        if (f19 != 0.0f) {
            k0Var.G(7, f19);
        }
        int i18 = this.f405050n;
        if (i18 != 0) {
            k0Var.H(8, i18);
        }
        int i19 = this.f405051o;
        if (i19 != 0) {
            k0Var.H(9, i19);
        }
        boolean z19 = this.f405052p;
        if (z19) {
            k0Var.x(10, z19);
        }
        long j17 = this.f405053q;
        if (j17 != 0) {
            k0Var.T(11, j17);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405041s;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405041s.toBuilder();
    }

    public e0() {
        this.f405054r = (byte) -1;
        this.f405046g = 0;
        this.f405047h = 0;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.d0(r5Var, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0011. Please report as an issue. */
    public e0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.c0 c0Var) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 13:
                            this.f405043d = d0Var.r();
                        case 16:
                            this.f405044e = d0Var.l();
                        case 24:
                            this.f405045f = d0Var.l();
                        case 32:
                            this.f405046g = d0Var.o();
                        case 40:
                            this.f405047h = d0Var.o();
                        case 53:
                            this.f405048i = d0Var.r();
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                            this.f405049m = d0Var.r();
                        case 64:
                            this.f405050n = d0Var.t();
                        case 72:
                            this.f405051o = d0Var.t();
                        case 80:
                            this.f405052p = d0Var.l();
                        case com.tencent.thumbplayer.core.common.TPCodecParamers.TP_PROFILE_H264_EXTENDED /* 88 */:
                            this.f405053q = d0Var.u();
                        default:
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                                z17 = true;
                            }
                    }
                } catch (com.google.protobuf.y6 e17) {
                    e17.f45739d = this;
                    throw e17;
                } catch (java.io.IOException e18) {
                    com.google.protobuf.y6 y6Var = new com.google.protobuf.y6(e18);
                    y6Var.f45739d = this;
                    throw y6Var;
                }
            } finally {
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
