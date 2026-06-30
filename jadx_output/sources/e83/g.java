package e83;

/* loaded from: classes16.dex */
public final class g extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: f, reason: collision with root package name */
    public static final e83.g f250135f = new e83.g();

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.e9 f250136g = new e83.b();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f250137d;

    /* renamed from: e, reason: collision with root package name */
    public byte f250138e;

    public g(com.google.protobuf.q5 q5Var, e83.a aVar) {
        super(q5Var);
        this.f250138e = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e83.g)) {
            return super.equals(obj);
        }
        e83.g gVar = (e83.g) obj;
        return this.f250137d.equals(gVar.f250137d) && this.unknownFields.equals(gVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f250135f;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f250137d.size(); i19++) {
            i18 += com.google.protobuf.k0.n(1, (com.google.protobuf.o8) this.f250137d.get(i19));
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
        int hashCode = com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + e83.o0.f250211q.hashCode();
        if (this.f250137d.size() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f250137d.hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e83.c toBuilder() {
        if (this == f250135f) {
            return new e83.c(null);
        }
        e83.c cVar = new e83.c(null);
        cVar.f(this);
        return cVar;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = e83.o0.f250212r;
        j6Var.c(e83.g.class, e83.c.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f250138e;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f250138e = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f250135f.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new e83.g();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        for (int i17 = 0; i17 < this.f250137d.size(); i17++) {
            k0Var.J(1, (com.google.protobuf.o8) this.f250137d.get(i17));
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f250135f;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f250135f.toBuilder();
    }

    public g() {
        this.f250138e = (byte) -1;
        this.f250137d = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new e83.c(r5Var, null);
    }

    public g(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, e83.a aVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    if (F != 0) {
                        if (F != 10) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            if (!(z18 & true)) {
                                this.f250137d = new java.util.ArrayList();
                                z18 |= true;
                            }
                            this.f250137d.add((e83.f) d0Var.v(e83.f.f250129m, t4Var));
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
                if (z18 & true) {
                    this.f250137d = java.util.Collections.unmodifiableList(this.f250137d);
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
