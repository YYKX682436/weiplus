package s95;

/* loaded from: classes16.dex */
public final class i extends com.google.protobuf.l6 implements com.google.protobuf.r8 {

    /* renamed from: s, reason: collision with root package name */
    public static final s95.i f405084s = new s95.i();

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.protobuf.e9 f405085t = new s95.g();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f405086d;

    /* renamed from: e, reason: collision with root package name */
    public long f405087e;

    /* renamed from: f, reason: collision with root package name */
    public long f405088f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f405089g;

    /* renamed from: h, reason: collision with root package name */
    public s95.f f405090h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f405091i;

    /* renamed from: m, reason: collision with root package name */
    public s95.u0 f405092m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f405093n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f405094o;

    /* renamed from: p, reason: collision with root package name */
    public s95.y f405095p;

    /* renamed from: q, reason: collision with root package name */
    public s95.y f405096q;

    /* renamed from: r, reason: collision with root package name */
    public byte f405097r;

    public i(com.google.protobuf.q5 q5Var, s95.g gVar) {
        super(q5Var);
        this.f405097r = (byte) -1;
    }

    public static s95.i n(byte[] bArr) {
        return (s95.i) f405085t.parseFrom(bArr);
    }

    @Override // com.google.protobuf.c
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s95.i)) {
            return super.equals(obj);
        }
        s95.i iVar = (s95.i) obj;
        if (!this.f405086d.equals(iVar.f405086d) || this.f405087e != iVar.f405087e || this.f405088f != iVar.f405088f || this.f405089g != iVar.f405089g) {
            return false;
        }
        s95.f fVar = this.f405090h;
        if ((fVar != null) != (iVar.f405090h != null)) {
            return false;
        }
        if (((fVar != null) && !k().equals(iVar.k())) || !this.f405091i.equals(iVar.f405091i)) {
            return false;
        }
        s95.u0 u0Var = this.f405092m;
        if ((u0Var != null) != (iVar.f405092m != null)) {
            return false;
        }
        if (((u0Var != null) && !m().equals(iVar.m())) || this.f405093n != iVar.f405093n || !this.f405094o.equals(iVar.f405094o)) {
            return false;
        }
        s95.y yVar = this.f405095p;
        if ((yVar != null) != (iVar.f405095p != null)) {
            return false;
        }
        if ((yVar != null) && !j().equals(iVar.j())) {
            return false;
        }
        s95.y yVar2 = this.f405096q;
        if ((yVar2 != null) != (iVar.f405096q != null)) {
            return false;
        }
        return (!(yVar2 != null) || l().equals(iVar.l())) && this.unknownFields.equals(iVar.unknownFields);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.k8 getDefaultInstanceForType() {
        return f405084s;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public int getSerializedSize() {
        int i17 = this.memoizedSize;
        if (i17 != -1) {
            return i17;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f405086d.size(); i19++) {
            i18 += com.google.protobuf.k0.n(1, (com.google.protobuf.o8) this.f405086d.get(i19));
        }
        long j17 = this.f405087e;
        if (j17 != 0) {
            i18 += com.google.protobuf.k0.m(2, j17);
        }
        long j18 = this.f405088f;
        if (j18 != 0) {
            i18 += com.google.protobuf.k0.m(3, j18);
        }
        boolean z17 = this.f405089g;
        if (z17) {
            i18 += com.google.protobuf.k0.b(4, z17);
        }
        if (this.f405090h != null) {
            i18 += com.google.protobuf.k0.n(5, k());
        }
        for (int i27 = 0; i27 < this.f405091i.size(); i27++) {
            i18 += com.google.protobuf.k0.n(6, (com.google.protobuf.o8) this.f405091i.get(i27));
        }
        if (this.f405092m != null) {
            i18 += com.google.protobuf.k0.n(7, m());
        }
        boolean z18 = this.f405093n;
        if (z18) {
            i18 += com.google.protobuf.k0.b(8, z18);
        }
        for (int i28 = 0; i28 < this.f405094o.size(); i28++) {
            i18 += com.google.protobuf.k0.n(9, (com.google.protobuf.o8) this.f405094o.get(i28));
        }
        if (this.f405095p != null) {
            i18 += com.google.protobuf.k0.n(10, j());
        }
        if (this.f405096q != null) {
            i18 += com.google.protobuf.k0.n(11, l());
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
        int hashCode = s95.r0.f405198w.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.share.l1.CTRL_INDEX;
        if (this.f405086d.size() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + this.f405086d.hashCode();
        }
        int b17 = (((((((((((hashCode * 37) + 2) * 53) + com.google.protobuf.w6.b(this.f405087e)) * 37) + 3) * 53) + com.google.protobuf.w6.b(this.f405088f)) * 37) + 4) * 53) + com.google.protobuf.w6.a(this.f405089g);
        if (this.f405090h != null) {
            b17 = (((b17 * 37) + 5) * 53) + k().hashCode();
        }
        if (this.f405091i.size() > 0) {
            b17 = (((b17 * 37) + 6) * 53) + this.f405091i.hashCode();
        }
        if (this.f405092m != null) {
            b17 = (((b17 * 37) + 7) * 53) + m().hashCode();
        }
        int a17 = (((b17 * 37) + 8) * 53) + com.google.protobuf.w6.a(this.f405093n);
        if (this.f405094o.size() > 0) {
            a17 = (((a17 * 37) + 9) * 53) + this.f405094o.hashCode();
        }
        if (this.f405095p != null) {
            a17 = (((a17 * 37) + 10) * 53) + j().hashCode();
        }
        if (this.f405096q != null) {
            a17 = (((a17 * 37) + 11) * 53) + l().hashCode();
        }
        int hashCode2 = (a17 * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j6 internalGetFieldAccessorTable() {
        com.google.protobuf.j6 j6Var = s95.r0.f405199x;
        j6Var.c(s95.i.class, s95.h.class);
        return j6Var;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.p8
    public final boolean isInitialized() {
        byte b17 = this.f405097r;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f405097r = (byte) 1;
        return true;
    }

    public s95.y j() {
        s95.y yVar = this.f405095p;
        return yVar == null ? s95.y.f405240i : yVar;
    }

    public s95.f k() {
        s95.f fVar = this.f405090h;
        return fVar == null ? s95.f.f405055i : fVar;
    }

    public s95.y l() {
        s95.y yVar = this.f405096q;
        return yVar == null ? s95.y.f405240i : yVar;
    }

    public s95.u0 m() {
        s95.u0 u0Var = this.f405092m;
        return u0Var == null ? s95.u0.f405223i : u0Var;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.j8 newBuilderForType() {
        return f405084s.toBuilder();
    }

    @Override // com.google.protobuf.l6
    public java.lang.Object newInstance(com.google.protobuf.k6 k6Var) {
        return new s95.i();
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public s95.h toBuilder() {
        if (this == f405084s) {
            return new s95.h(null);
        }
        s95.h hVar = new s95.h(null);
        hVar.h(this);
        return hVar;
    }

    @Override // com.google.protobuf.l6, com.google.protobuf.o8
    public void writeTo(com.google.protobuf.k0 k0Var) {
        for (int i17 = 0; i17 < this.f405086d.size(); i17++) {
            k0Var.J(1, (com.google.protobuf.o8) this.f405086d.get(i17));
        }
        long j17 = this.f405087e;
        if (j17 != 0) {
            k0Var.T(2, j17);
        }
        long j18 = this.f405088f;
        if (j18 != 0) {
            k0Var.T(3, j18);
        }
        boolean z17 = this.f405089g;
        if (z17) {
            k0Var.x(4, z17);
        }
        if (this.f405090h != null) {
            k0Var.J(5, k());
        }
        for (int i18 = 0; i18 < this.f405091i.size(); i18++) {
            k0Var.J(6, (com.google.protobuf.o8) this.f405091i.get(i18));
        }
        if (this.f405092m != null) {
            k0Var.J(7, m());
        }
        boolean z18 = this.f405093n;
        if (z18) {
            k0Var.x(8, z18);
        }
        for (int i19 = 0; i19 < this.f405094o.size(); i19++) {
            k0Var.J(9, (com.google.protobuf.o8) this.f405094o.get(i19));
        }
        if (this.f405095p != null) {
            k0Var.J(10, j());
        }
        if (this.f405096q != null) {
            k0Var.J(11, l());
        }
        this.unknownFields.writeTo(k0Var);
    }

    @Override // com.google.protobuf.p8, com.google.protobuf.r8
    public com.google.protobuf.o8 getDefaultInstanceForType() {
        return f405084s;
    }

    @Override // com.google.protobuf.o8, com.google.protobuf.k8
    public com.google.protobuf.n8 newBuilderForType() {
        return f405084s.toBuilder();
    }

    public i() {
        this.f405097r = (byte) -1;
        this.f405086d = java.util.Collections.emptyList();
        this.f405091i = java.util.Collections.emptyList();
        this.f405094o = java.util.Collections.emptyList();
    }

    @Override // com.google.protobuf.l6
    public com.google.protobuf.j8 newBuilderForType(com.google.protobuf.r5 r5Var) {
        return new s95.h(r5Var, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public i(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var, s95.g gVar) {
        this();
        t4Var.getClass();
        com.google.protobuf.sa b17 = com.google.protobuf.wa.b();
        boolean z17 = false;
        char c17 = 0;
        while (!z17) {
            try {
                try {
                    int F = d0Var.F();
                    switch (F) {
                        case 0:
                            z17 = true;
                        case 10:
                            int i17 = (c17 == true ? 1 : 0) & 1;
                            c17 = c17;
                            if (i17 == 0) {
                                this.f405086d = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 1;
                            }
                            this.f405086d.add(d0Var.v(s95.n0.A, t4Var));
                        case 16:
                            this.f405087e = d0Var.u();
                        case 24:
                            this.f405088f = d0Var.u();
                        case 32:
                            this.f405089g = d0Var.l();
                        case 42:
                            s95.f fVar = this.f405090h;
                            s95.e builder = fVar != null ? fVar.toBuilder() : null;
                            s95.f fVar2 = (s95.f) d0Var.v(s95.f.f405056m, t4Var);
                            this.f405090h = fVar2;
                            if (builder != null) {
                                builder.f(fVar2);
                                this.f405090h = builder.buildPartial();
                            }
                        case 50:
                            int i18 = (c17 == true ? 1 : 0) & 2;
                            c17 = c17;
                            if (i18 == 0) {
                                this.f405091i = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 2;
                            }
                            this.f405091i.add(d0Var.v(s95.s.f405203i, t4Var));
                        case 58:
                            s95.u0 u0Var = this.f405092m;
                            s95.t0 builder2 = u0Var != null ? u0Var.toBuilder() : null;
                            s95.u0 u0Var2 = (s95.u0) d0Var.v(s95.u0.f405224m, t4Var);
                            this.f405092m = u0Var2;
                            if (builder2 != null) {
                                builder2.e(u0Var2);
                                this.f405092m = builder2.buildPartial();
                            }
                        case 64:
                            this.f405093n = d0Var.l();
                        case 74:
                            int i19 = (c17 == true ? 1 : 0) & 4;
                            c17 = c17;
                            if (i19 == 0) {
                                this.f405094o = new java.util.ArrayList();
                                c17 = (c17 == true ? 1 : 0) | 4;
                            }
                            this.f405094o.add(d0Var.v(s95.l.f405109i, t4Var));
                        case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_ERROR_CREATE_JAVA_DATASOURCE /* 82 */:
                            s95.y yVar = this.f405095p;
                            s95.x builder3 = yVar != null ? yVar.toBuilder() : null;
                            s95.y yVar2 = (s95.y) d0Var.v(s95.y.f405241m, t4Var);
                            this.f405095p = yVar2;
                            if (builder3 != null) {
                                builder3.e(yVar2);
                                this.f405095p = builder3.buildPartial();
                            }
                        case 90:
                            s95.y yVar3 = this.f405096q;
                            s95.x builder4 = yVar3 != null ? yVar3.toBuilder() : null;
                            s95.y yVar4 = (s95.y) d0Var.v(s95.y.f405241m, t4Var);
                            this.f405096q = yVar4;
                            if (builder4 != null) {
                                builder4.e(yVar4);
                                this.f405096q = builder4.buildPartial();
                            }
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
                if (((c17 == true ? 1 : 0) & 1) != 0) {
                    this.f405086d = java.util.Collections.unmodifiableList(this.f405086d);
                }
                if (((c17 == true ? 1 : 0) & 2) != 0) {
                    this.f405091i = java.util.Collections.unmodifiableList(this.f405091i);
                }
                if (((c17 == true ? 1 : 0) & 4) != 0) {
                    this.f405094o = java.util.Collections.unmodifiableList(this.f405094o);
                }
                this.unknownFields = b17.build();
                makeExtensionsImmutable();
            }
        }
    }
}
