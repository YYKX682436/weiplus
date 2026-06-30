package r45;

/* loaded from: classes2.dex */
public class p95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382876d;

    /* renamed from: e, reason: collision with root package name */
    public float f382877e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382878f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382879g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382880h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382881i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382882m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382883n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f382884o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f382885p;

    /* renamed from: q, reason: collision with root package name */
    public float f382886q;

    /* renamed from: r, reason: collision with root package name */
    public int f382887r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f382888s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f382889t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f382890u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p95)) {
            return false;
        }
        r45.p95 p95Var = (r45.p95) fVar;
        return n51.f.a(this.f382876d, p95Var.f382876d) && n51.f.a(java.lang.Float.valueOf(this.f382877e), java.lang.Float.valueOf(p95Var.f382877e)) && n51.f.a(this.f382878f, p95Var.f382878f) && n51.f.a(this.f382879g, p95Var.f382879g) && n51.f.a(this.f382880h, p95Var.f382880h) && n51.f.a(this.f382881i, p95Var.f382881i) && n51.f.a(this.f382882m, p95Var.f382882m) && n51.f.a(this.f382883n, p95Var.f382883n) && n51.f.a(this.f382884o, p95Var.f382884o) && n51.f.a(this.f382885p, p95Var.f382885p) && n51.f.a(java.lang.Float.valueOf(this.f382886q), java.lang.Float.valueOf(p95Var.f382886q)) && n51.f.a(java.lang.Integer.valueOf(this.f382887r), java.lang.Integer.valueOf(p95Var.f382887r)) && n51.f.a(this.f382888s, p95Var.f382888s) && n51.f.a(this.f382889t, p95Var.f382889t) && n51.f.a(this.f382890u, p95Var.f382890u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382889t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382876d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.d(2, this.f382877e);
            java.lang.String str2 = this.f382878f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382879g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f382880h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f382881i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f382882m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f382883n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f382884o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f382885p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            fVar.d(11, this.f382886q);
            fVar.e(12, this.f382887r);
            java.lang.String str10 = this.f382888s;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            fVar.g(14, 1, linkedList);
            java.lang.String str11 = this.f382890u;
            if (str11 != null) {
                fVar.j(101, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f382876d;
            int j17 = (str12 != null ? b36.f.j(1, str12) + 0 : 0) + b36.f.d(2, this.f382877e);
            java.lang.String str13 = this.f382878f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f382879g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f382880h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f382881i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f382882m;
            if (str17 != null) {
                j17 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f382883n;
            if (str18 != null) {
                j17 += b36.f.j(8, str18);
            }
            java.lang.String str19 = this.f382884o;
            if (str19 != null) {
                j17 += b36.f.j(9, str19);
            }
            java.lang.String str20 = this.f382885p;
            if (str20 != null) {
                j17 += b36.f.j(10, str20);
            }
            int d17 = j17 + b36.f.d(11, this.f382886q) + b36.f.e(12, this.f382887r);
            java.lang.String str21 = this.f382888s;
            if (str21 != null) {
                d17 += b36.f.j(13, str21);
            }
            int g17 = d17 + b36.f.g(14, 1, linkedList);
            java.lang.String str22 = this.f382890u;
            return str22 != null ? g17 + b36.f.j(101, str22) : g17;
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
        r45.p95 p95Var = (r45.p95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 101) {
            p95Var.f382890u = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                p95Var.f382876d = aVar2.k(intValue);
                return 0;
            case 2:
                p95Var.f382877e = aVar2.f(intValue);
                return 0;
            case 3:
                p95Var.f382878f = aVar2.k(intValue);
                return 0;
            case 4:
                p95Var.f382879g = aVar2.k(intValue);
                return 0;
            case 5:
                p95Var.f382880h = aVar2.k(intValue);
                return 0;
            case 6:
                p95Var.f382881i = aVar2.k(intValue);
                return 0;
            case 7:
                p95Var.f382882m = aVar2.k(intValue);
                return 0;
            case 8:
                p95Var.f382883n = aVar2.k(intValue);
                return 0;
            case 9:
                p95Var.f382884o = aVar2.k(intValue);
                return 0;
            case 10:
                p95Var.f382885p = aVar2.k(intValue);
                return 0;
            case 11:
                p95Var.f382886q = aVar2.f(intValue);
                return 0;
            case 12:
                p95Var.f382887r = aVar2.g(intValue);
                return 0;
            case 13:
                p95Var.f382888s = aVar2.k(intValue);
                return 0;
            case 14:
                p95Var.f382889t.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
