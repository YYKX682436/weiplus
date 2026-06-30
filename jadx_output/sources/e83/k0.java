package e83;

/* loaded from: classes16.dex */
public final class k0 extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final e83.k0 f250158h = new e83.k0();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250159i = new e83.i0();

    /* renamed from: d, reason: collision with root package name */
    public int f250160d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f250161e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f250162f;

    /* renamed from: g, reason: collision with root package name */
    public byte f250163g;

    public k0(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250163g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.k0)) {
            return super.equals(obj);
        }
        e83.k0 k0Var = (e83.k0) obj;
        int i17 = this.f250160d;
        if (((i17 & 1) != 0) != ((k0Var.f250160d & 1) != 0)) {
            return false;
        }
        if (((i17 & 1) != 0) && !g().equals(k0Var.g())) {
            return false;
        }
        int i18 = this.f250160d;
        if (((i18 & 2) != 0) != ((k0Var.f250160d & 2) != 0)) {
            return false;
        }
        return (!((i18 & 2) != 0) || h().equals(k0Var.h())) && this.unknownFields.equals(k0Var.unknownFields);
    }

    public java.lang.String g() {
        java.lang.Object obj = this.f250161e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250161e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250158h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f250160d & 1) != 0 ? 0 + com.google.protobuf.l6.computeStringSize(1, this.f250161e) : 0;
        if ((this.f250160d & 2) != 0) {
            computeStringSize += com.google.protobuf.l6.computeStringSize(2, this.f250162f);
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    public java.lang.String h() {
        java.lang.Object obj = this.f250162f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250162f = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = e83.o0.f250197c.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f250160d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + g().hashCode();
        }
        if ((this.f250160d & 2) != 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + h().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e83.j0 toBuilder() {
        if (this == f250158h) {
            return new e83.j0(null);
        }
        e83.j0 j0Var = new e83.j0(null);
        j0Var.e(this);
        return j0Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250198d;
        j6Var.c(e83.k0.class, e83.j0.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250163g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250163g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250158h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.k0();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f250160d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f250161e);
        }
        if ((this.f250160d & 2) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 2, this.f250162f);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250158h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250158h.toBuilder();
    }

    public k0() {
        this.f250163g = (byte) -1;
        this.f250161e = "";
        this.f250162f = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.j0(r5Var, null);
    }

    public k0(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f250160d = 1 | this.f250160d;
                            this.f250161e = m17;
                        } else if (F != 18) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            com.google.protobuf.y m18 = d0Var.m();
                            this.f250160d |= 2;
                            this.f250162f = m18;
                        }
                    }
                    z17 = true;
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
