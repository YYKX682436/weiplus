package r45;

/* loaded from: classes9.dex */
public class co2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371685d;

    /* renamed from: e, reason: collision with root package name */
    public long f371686e;

    /* renamed from: f, reason: collision with root package name */
    public long f371687f;

    /* renamed from: g, reason: collision with root package name */
    public int f371688g;

    /* renamed from: h, reason: collision with root package name */
    public long f371689h;

    /* renamed from: i, reason: collision with root package name */
    public int f371690i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f371691m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f371692n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f371693o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f371694p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f371695q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f371696r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f371697s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f371698t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f371699u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f371700v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f371701w;

    /* renamed from: x, reason: collision with root package name */
    public int f371702x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co2)) {
            return false;
        }
        r45.co2 co2Var = (r45.co2) fVar;
        return n51.f.a(this.f371685d, co2Var.f371685d) && n51.f.a(java.lang.Long.valueOf(this.f371686e), java.lang.Long.valueOf(co2Var.f371686e)) && n51.f.a(java.lang.Long.valueOf(this.f371687f), java.lang.Long.valueOf(co2Var.f371687f)) && n51.f.a(java.lang.Integer.valueOf(this.f371688g), java.lang.Integer.valueOf(co2Var.f371688g)) && n51.f.a(java.lang.Long.valueOf(this.f371689h), java.lang.Long.valueOf(co2Var.f371689h)) && n51.f.a(java.lang.Integer.valueOf(this.f371690i), java.lang.Integer.valueOf(co2Var.f371690i)) && n51.f.a(this.f371691m, co2Var.f371691m) && n51.f.a(java.lang.Integer.valueOf(this.f371692n), java.lang.Integer.valueOf(co2Var.f371692n)) && n51.f.a(java.lang.Boolean.valueOf(this.f371693o), java.lang.Boolean.valueOf(co2Var.f371693o)) && n51.f.a(this.f371694p, co2Var.f371694p) && n51.f.a(this.f371695q, co2Var.f371695q) && n51.f.a(this.f371696r, co2Var.f371696r) && n51.f.a(this.f371697s, co2Var.f371697s) && n51.f.a(java.lang.Boolean.valueOf(this.f371698t), java.lang.Boolean.valueOf(co2Var.f371698t)) && n51.f.a(this.f371699u, co2Var.f371699u) && n51.f.a(this.f371700v, co2Var.f371700v) && n51.f.a(java.lang.Boolean.valueOf(this.f371701w), java.lang.Boolean.valueOf(co2Var.f371701w)) && n51.f.a(java.lang.Integer.valueOf(this.f371702x), java.lang.Integer.valueOf(co2Var.f371702x));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371691m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371685d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f371686e);
            fVar.h(3, this.f371687f);
            fVar.e(4, this.f371688g);
            fVar.h(5, this.f371689h);
            fVar.e(6, this.f371690i);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f371692n);
            fVar.a(9, this.f371693o);
            java.lang.String str2 = this.f371694p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f371695q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f371696r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f371697s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            fVar.a(14, this.f371698t);
            java.lang.String str6 = this.f371699u;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            java.lang.String str7 = this.f371700v;
            if (str7 != null) {
                fVar.j(16, str7);
            }
            fVar.a(17, this.f371701w);
            fVar.e(18, this.f371702x);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f371685d;
            int j17 = (str8 != null ? b36.f.j(1, str8) + 0 : 0) + b36.f.h(2, this.f371686e) + b36.f.h(3, this.f371687f) + b36.f.e(4, this.f371688g) + b36.f.h(5, this.f371689h) + b36.f.e(6, this.f371690i) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f371692n) + b36.f.a(9, this.f371693o);
            java.lang.String str9 = this.f371694p;
            if (str9 != null) {
                j17 += b36.f.j(10, str9);
            }
            java.lang.String str10 = this.f371695q;
            if (str10 != null) {
                j17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f371696r;
            if (str11 != null) {
                j17 += b36.f.j(12, str11);
            }
            java.lang.String str12 = this.f371697s;
            if (str12 != null) {
                j17 += b36.f.j(13, str12);
            }
            int a17 = j17 + b36.f.a(14, this.f371698t);
            java.lang.String str13 = this.f371699u;
            if (str13 != null) {
                a17 += b36.f.j(15, str13);
            }
            java.lang.String str14 = this.f371700v;
            if (str14 != null) {
                a17 += b36.f.j(16, str14);
            }
            return a17 + b36.f.a(17, this.f371701w) + b36.f.e(18, this.f371702x);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.co2 co2Var = (r45.co2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                co2Var.f371685d = aVar2.k(intValue);
                return 0;
            case 2:
                co2Var.f371686e = aVar2.i(intValue);
                return 0;
            case 3:
                co2Var.f371687f = aVar2.i(intValue);
                return 0;
            case 4:
                co2Var.f371688g = aVar2.g(intValue);
                return 0;
            case 5:
                co2Var.f371689h = aVar2.i(intValue);
                return 0;
            case 6:
                co2Var.f371690i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.co2 co2Var2 = new r45.co2();
                    if (bArr2 != null && bArr2.length > 0) {
                        co2Var2.parseFrom(bArr2);
                    }
                    co2Var.f371691m.add(co2Var2);
                }
                return 0;
            case 8:
                co2Var.f371692n = aVar2.g(intValue);
                return 0;
            case 9:
                co2Var.f371693o = aVar2.c(intValue);
                return 0;
            case 10:
                co2Var.f371694p = aVar2.k(intValue);
                return 0;
            case 11:
                co2Var.f371695q = aVar2.k(intValue);
                return 0;
            case 12:
                co2Var.f371696r = aVar2.k(intValue);
                return 0;
            case 13:
                co2Var.f371697s = aVar2.k(intValue);
                return 0;
            case 14:
                co2Var.f371698t = aVar2.c(intValue);
                return 0;
            case 15:
                co2Var.f371699u = aVar2.k(intValue);
                return 0;
            case 16:
                co2Var.f371700v = aVar2.k(intValue);
                return 0;
            case 17:
                co2Var.f371701w = aVar2.c(intValue);
                return 0;
            case 18:
                co2Var.f371702x = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
