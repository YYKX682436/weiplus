package r45;

/* loaded from: classes9.dex */
public class tq0 extends com.tencent.mm.protobuf.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386664d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386666f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386668h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386670m;

    /* renamed from: o, reason: collision with root package name */
    public int f386672o;

    /* renamed from: q, reason: collision with root package name */
    public int f386674q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f386676s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f386678u;

    /* renamed from: w, reason: collision with root package name */
    public int f386680w;

    /* renamed from: e, reason: collision with root package name */
    public boolean f386665e = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f386667g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f386669i = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f386671n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f386673p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f386675r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f386677t = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f386679v = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f386681x = false;

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f386682y = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public boolean f386683z = false;
    public boolean B = false;

    public final java.lang.String b() {
        return this.f386668h;
    }

    public final int c() {
        return this.f386674q;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tq0)) {
            return false;
        }
        r45.tq0 tq0Var = (r45.tq0) fVar;
        return n51.f.a(this.f386664d, tq0Var.f386664d) && n51.f.a(this.f386666f, tq0Var.f386666f) && n51.f.a(this.f386668h, tq0Var.f386668h) && n51.f.a(this.f386670m, tq0Var.f386670m) && n51.f.a(java.lang.Integer.valueOf(this.f386672o), java.lang.Integer.valueOf(tq0Var.f386672o)) && n51.f.a(java.lang.Integer.valueOf(this.f386674q), java.lang.Integer.valueOf(tq0Var.f386674q)) && n51.f.a(this.f386676s, tq0Var.f386676s) && n51.f.a(this.f386678u, tq0Var.f386678u) && n51.f.a(java.lang.Integer.valueOf(this.f386680w), java.lang.Integer.valueOf(tq0Var.f386680w)) && n51.f.a(this.f386682y, tq0Var.f386682y) && n51.f.a(this.A, tq0Var.A);
    }

    public final java.lang.String d() {
        return this.f386666f;
    }

    public final java.lang.String e() {
        return this.A;
    }

    public final int f() {
        return this.f386680w;
    }

    public final int g() {
        return this.f386672o;
    }

    public final java.lang.String getThumbUrl() {
        return this.f386670m;
    }

    public final java.lang.String getTitle() {
        return this.f386664d;
    }

    public final r45.tq0 i(java.lang.String str) {
        this.f386668h = str;
        this.f386669i = true;
        return this;
    }

    public final r45.tq0 j(java.lang.String str) {
        this.f386666f = str;
        this.f386667g = true;
        return this;
    }

    public final r45.tq0 k(java.lang.String str) {
        this.A = str;
        this.B = true;
        return this;
    }

    public final r45.tq0 l(int i17) {
        this.f386680w = i17;
        this.f386681x = true;
        return this;
    }

    public final r45.tq0 n(int i17) {
        this.f386672o = i17;
        this.f386673p = true;
        return this;
    }

    public final r45.tq0 o(java.lang.String str) {
        this.f386670m = str;
        this.f386671n = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386664d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386666f;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f386668h;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f386670m;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            if (this.f386673p) {
                fVar.e(5, this.f386672o);
            }
            if (this.f386675r) {
                fVar.e(6, this.f386674q);
            }
            java.lang.String str5 = this.f386676s;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f386678u;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            if (this.f386681x) {
                fVar.e(9, this.f386680w);
            }
            fVar.g(10, 8, this.f386682y);
            java.lang.String str7 = this.A;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f386664d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f386666f;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f386668h;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f386670m;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            if (this.f386673p) {
                j17 += b36.f.e(5, this.f386672o);
            }
            if (this.f386675r) {
                j17 += b36.f.e(6, this.f386674q);
            }
            java.lang.String str12 = this.f386676s;
            if (str12 != null) {
                j17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f386678u;
            if (str13 != null) {
                j17 += b36.f.j(8, str13);
            }
            if (this.f386681x) {
                j17 += b36.f.e(9, this.f386680w);
            }
            int g17 = j17 + b36.f.g(10, 8, this.f386682y);
            java.lang.String str14 = this.A;
            return str14 != null ? g17 + b36.f.j(11, str14) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386682y.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.tq0 tq0Var = (r45.tq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tq0Var.f386664d = aVar2.k(intValue);
                tq0Var.f386665e = true;
                return 0;
            case 2:
                tq0Var.f386666f = aVar2.k(intValue);
                tq0Var.f386667g = true;
                return 0;
            case 3:
                tq0Var.f386668h = aVar2.k(intValue);
                tq0Var.f386669i = true;
                return 0;
            case 4:
                tq0Var.f386670m = aVar2.k(intValue);
                tq0Var.f386671n = true;
                return 0;
            case 5:
                tq0Var.f386672o = aVar2.g(intValue);
                tq0Var.f386673p = true;
                return 0;
            case 6:
                tq0Var.f386674q = aVar2.g(intValue);
                tq0Var.f386675r = true;
                return 0;
            case 7:
                tq0Var.f386676s = aVar2.k(intValue);
                tq0Var.f386677t = true;
                return 0;
            case 8:
                tq0Var.f386678u = aVar2.k(intValue);
                tq0Var.f386679v = true;
                return 0;
            case 9:
                tq0Var.f386680w = aVar2.g(intValue);
                tq0Var.f386681x = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.np0 np0Var = new r45.np0();
                    if (bArr2 != null && bArr2.length > 0) {
                        np0Var.parseFrom(bArr2);
                    }
                    tq0Var.f386682y.add(np0Var);
                }
                tq0Var.f386683z = true;
                return 0;
            case 11:
                tq0Var.A = aVar2.k(intValue);
                tq0Var.B = true;
                return 0;
            default:
                return -1;
        }
    }

    public final r45.tq0 p(java.lang.String str) {
        this.f386664d = str;
        this.f386665e = true;
        return this;
    }

    public final r45.tq0 q(java.lang.String str) {
        this.f386678u = str;
        this.f386679v = true;
        return this;
    }
}
