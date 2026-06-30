package e83;

/* loaded from: classes16.dex */
public final class y extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: h, reason: collision with root package name */
    public static final e83.y f250250h = new e83.y();

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250251i = new e83.w();

    /* renamed from: d, reason: collision with root package name */
    public int f250252d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.Object f250253e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f250254f;

    /* renamed from: g, reason: collision with root package name */
    public byte f250255g;

    public y(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250255g = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.y)) {
            return super.equals(obj);
        }
        e83.y yVar = (e83.y) obj;
        int i17 = this.f250252d;
        if (((i17 & 1) != 0) != ((yVar.f250252d & 1) != 0)) {
            return false;
        }
        return (!((i17 & 1) != 0) || i().equals(yVar.i())) && this.f250254f.equals(yVar.f250254f) && this.unknownFields.equals(yVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250250h;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int computeStringSize = (this.f250252d & 1) != 0 ? com.google.protobuf.l6.computeStringSize(1, this.f250253e) + 0 : 0;
        for (int i18 = 0; i18 < this.f250254f.size(); i18++) {
            computeStringSize += com.google.protobuf.k0.n(2, (com.google.protobuf.o8) this.f250254f.get(i18));
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
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
        int hashCode = e83.o0.f250219y.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if ((this.f250252d & 1) != 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + i().hashCode();
        }
        if (this.f250254f.size() > 0) {
            hashCode = (((hashCode * 37) + 2) * 53) + this.f250254f.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public java.lang.String i() {
        java.lang.Object obj = this.f250253e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.google.protobuf.y yVar = (com.google.protobuf.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f250253e = r17;
        }
        return r17;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250220z;
        j6Var.c(e83.y.class, e83.x.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250255g;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250255g = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e83.x toBuilder() {
        if (this == f250250h) {
            return new e83.x(null);
        }
        e83.x xVar = new e83.x(null);
        xVar.f(this);
        return xVar;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250250h.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.y();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        if ((this.f250252d & 1) != 0) {
            com.google.protobuf.l6.writeString(k0Var, 1, this.f250253e);
        }
        for (int i17 = 0; i17 < this.f250254f.size(); i17++) {
            k0Var.J(2, (com.google.protobuf.o8) this.f250254f.get(i17));
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250250h;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250250h.toBuilder();
    }

    public y() {
        this.f250255g = (byte) -1;
        this.f250253e = "";
        this.f250254f = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.x(r5Var, null);
    }

    public y(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        int i17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F == 10) {
                            com.google.protobuf.y m17 = d0Var.m();
                            this.f250252d = 1 | this.f250252d;
                            this.f250253e = m17;
                        } else if (F != 18) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            if ((i17 & 2) == 0) {
                                this.f250254f = new java.util.ArrayList();
                                i17 |= 2;
                            }
                            this.f250254f.add((e83.h0) d0Var.v(e83.h0.f250143i, t4Var));
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
                if ((i17 & 2) != 0) {
                    this.f250254f = java.util.Collections.unmodifiableList(this.f250254f);
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
