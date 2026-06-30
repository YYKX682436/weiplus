package cz5;

/* loaded from: classes16.dex */
public final class f extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: n, reason: collision with root package name */
    public static final cz5.f f225048n = new cz5.f();

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.protobuf.e9 f225049o = new cz5.c();

    /* renamed from: d, reason: collision with root package name */
    public long f225050d;

    /* renamed from: e, reason: collision with root package name */
    public long f225051e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Object f225052f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.protobuf.d8 f225053g;

    /* renamed from: h, reason: collision with root package name */
    public int f225054h;

    /* renamed from: i, reason: collision with root package name */
    public int f225055i;

    /* renamed from: m, reason: collision with root package name */
    public byte f225056m;

    public f(com.google.protobuf.q5 q5Var, cz5.b bVar) {
        super(q5Var);
        this.f225056m = (byte) -1;
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cz5.f)) {
            return super.equals(obj);
        }
        cz5.f fVar = (cz5.f) obj;
        return this.f225050d == fVar.f225050d && this.f225051e == fVar.f225051e && getName().equals(fVar.getName()) && g().equals(fVar.g()) && this.f225054h == fVar.f225054h && this.f225055i == fVar.f225055i && this.unknownFields.equals(fVar.unknownFields);
    }

    public final com.google.protobuf.d8 g() {
        com.google.protobuf.d8 d8Var = this.f225053g;
        return d8Var == null ? new com.google.protobuf.d8(cz5.e.f225047a, com.google.protobuf.c8.MAP, java.util.Collections.emptyMap()) : d8Var;
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f225048n;
    }

    public java.lang.String getName() {
        java.lang.Object obj = this.f225052f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.google.protobuf.y) obj).r();
        this.f225052f = r17;
        return r17;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        com.google.protobuf.y yVar;
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        long j17 = this.f225050d;
        int s17 = j17 != 0 ? 0 + com.google.protobuf.k0.s(1, j17) : 0;
        long j18 = this.f225051e;
        if (j18 != 0) {
            s17 += com.google.protobuf.k0.s(2, j18);
        }
        java.lang.Object obj = this.f225052f;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f225052f = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        if (!yVar.isEmpty()) {
            s17 += com.google.protobuf.l6.computeStringSize(3, this.f225052f);
        }
        for (java.util.Map.Entry entry : g().e().entrySet()) {
            com.google.protobuf.q7 newBuilderForType = cz5.e.f225047a.newBuilderForType();
            newBuilderForType.f45449e = entry.getKey();
            newBuilderForType.f45451g = true;
            newBuilderForType.f45450f = entry.getValue();
            newBuilderForType.f45452h = true;
            s17 += com.google.protobuf.k0.n(4, newBuilderForType.build());
        }
        int i18 = this.f225054h;
        if (i18 != 0) {
            s17 += com.google.protobuf.k0.k(5, i18);
        }
        int i19 = this.f225055i;
        if (i19 != 0) {
            s17 += com.google.protobuf.k0.k(6, i19);
        }
        int serializedSize = s17 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.r8
    public final com.google.protobuf.wa getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public cz5.d toBuilder() {
        if (this == f225048n) {
            return new cz5.d(null);
        }
        cz5.d dVar = new cz5.d(null);
        dVar.f(this);
        return dVar;
    }

    @Override // com.google.protobuf.c
    public int hashCode() {
        int i17 = this.memoizedHashCode;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX + cz5.g.f225057a.hashCode()) * 37) + 1) * 53) + com.google.protobuf.w6.b(this.f225050d)) * 37) + 2) * 53) + com.google.protobuf.w6.b(this.f225051e)) * 37) + 3) * 53) + getName().hashCode();
        if (!g().e().isEmpty()) {
            hashCode = (((hashCode * 37) + 4) * 53) + g().hashCode();
        }
        int hashCode2 = (((((((((hashCode * 37) + 5) * 53) + this.f225054h) * 37) + 6) * 53) + this.f225055i) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = cz5.g.f225058b;
        j6Var.c(cz5.f.class, cz5.d.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.d8 internalGetMapField(int i17) {
        if (i17 == 4) {
            return g();
        }
        throw new java.lang.RuntimeException("Invalid map field number: " + i17);
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f225056m;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f225056m = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f225048n.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new cz5.f();
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        com.google.protobuf.y yVar;
        long j17 = this.f225050d;
        if (j17 != 0) {
            k0Var.T(1, j17);
        }
        long j18 = this.f225051e;
        if (j18 != 0) {
            k0Var.T(2, j18);
        }
        java.lang.Object obj = this.f225052f;
        if (obj instanceof java.lang.String) {
            yVar = com.google.protobuf.y.h((java.lang.String) obj);
            this.f225052f = yVar;
        } else {
            yVar = (com.google.protobuf.y) obj;
        }
        if (!yVar.isEmpty()) {
            com.google.protobuf.l6.writeString(k0Var, 3, this.f225052f);
        }
        com.google.protobuf.l6.serializeStringMapTo(k0Var, g(), cz5.e.f225047a, 4);
        int i17 = this.f225054h;
        if (i17 != 0) {
            k0Var.H(5, i17);
        }
        int i18 = this.f225055i;
        if (i18 != 0) {
            k0Var.H(6, i18);
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f225048n;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f225048n.toBuilder();
    }

    public f() {
        this.f225056m = (byte) -1;
        this.f225052f = "";
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new cz5.d(r5Var, null);
    }

    public f(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, cz5.b bVar) {
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
                        if (F == 8) {
                            this.f225050d = d0Var.H();
                        } else if (F == 16) {
                            this.f225051e = d0Var.H();
                        } else if (F == 26) {
                            this.f225052f = d0Var.E();
                        } else if (F == 34) {
                            if (!(z18 & true)) {
                                this.f225053g = new com.google.protobuf.d8(cz5.e.f225047a, com.google.protobuf.c8.MAP, new java.util.LinkedHashMap());
                                z18 |= true;
                            }
                            com.google.protobuf.t7 t7Var = (com.google.protobuf.t7) d0Var.v(cz5.e.f225047a.f45551f.f45496f, t4Var);
                            ((com.google.protobuf.b8) this.f225053g.g()).put(t7Var.f45549d, t7Var.f45550e);
                        } else if (F == 40) {
                            this.f225054h = d0Var.t();
                        } else if (F != 48) {
                            if (!parseUnknownField(d0Var, b17, t4Var, F)) {
                            }
                        } else {
                            this.f225055i = d0Var.t();
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
            } catch (java.lang.Throwable th6) {
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
                throw th6;
            }
        }
        this.unknownFields = b17.build();
        makeExtensionsImmutable();
    }
}
