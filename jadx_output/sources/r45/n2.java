package r45;

/* loaded from: classes4.dex */
public class n2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380999d;

    /* renamed from: e, reason: collision with root package name */
    public int f381000e;

    /* renamed from: f, reason: collision with root package name */
    public int f381001f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381002g;

    /* renamed from: h, reason: collision with root package name */
    public int f381003h;

    /* renamed from: i, reason: collision with root package name */
    public int f381004i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381005m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381006n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f381007o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381008p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f381009q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f381010r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381011s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f381012t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n2)) {
            return false;
        }
        r45.n2 n2Var = (r45.n2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380999d), java.lang.Integer.valueOf(n2Var.f380999d)) && n51.f.a(java.lang.Integer.valueOf(this.f381000e), java.lang.Integer.valueOf(n2Var.f381000e)) && n51.f.a(java.lang.Integer.valueOf(this.f381001f), java.lang.Integer.valueOf(n2Var.f381001f)) && n51.f.a(this.f381002g, n2Var.f381002g) && n51.f.a(java.lang.Integer.valueOf(this.f381003h), java.lang.Integer.valueOf(n2Var.f381003h)) && n51.f.a(java.lang.Integer.valueOf(this.f381004i), java.lang.Integer.valueOf(n2Var.f381004i)) && n51.f.a(this.f381005m, n2Var.f381005m) && n51.f.a(this.f381006n, n2Var.f381006n) && n51.f.a(this.f381007o, n2Var.f381007o) && n51.f.a(this.f381008p, n2Var.f381008p) && n51.f.a(this.f381009q, n2Var.f381009q) && n51.f.a(this.f381010r, n2Var.f381010r) && n51.f.a(this.f381011s, n2Var.f381011s) && n51.f.a(this.f381012t, n2Var.f381012t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380999d);
            fVar.e(2, this.f381000e);
            fVar.e(3, this.f381001f);
            com.tencent.mm.protobuf.g gVar = this.f381002g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f381003h);
            fVar.e(6, this.f381004i);
            java.lang.String str = this.f381005m;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f381006n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f381007o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            java.lang.String str4 = this.f381008p;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            java.lang.String str5 = this.f381009q;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f381010r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f381011s;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f381012t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380999d) + 0 + b36.f.e(2, this.f381000e) + b36.f.e(3, this.f381001f);
            com.tencent.mm.protobuf.g gVar2 = this.f381002g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            int e18 = e17 + b36.f.e(5, this.f381003h) + b36.f.e(6, this.f381004i);
            java.lang.String str9 = this.f381005m;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f381006n;
            if (str10 != null) {
                e18 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f381007o;
            if (str11 != null) {
                e18 += b36.f.j(9, str11);
            }
            java.lang.String str12 = this.f381008p;
            if (str12 != null) {
                e18 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f381009q;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f381010r;
            if (str14 != null) {
                e18 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f381011s;
            if (str15 != null) {
                e18 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f381012t;
            return str16 != null ? e18 + b36.f.j(14, str16) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.n2 n2Var = (r45.n2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n2Var.f380999d = aVar2.g(intValue);
                return 0;
            case 2:
                n2Var.f381000e = aVar2.g(intValue);
                return 0;
            case 3:
                n2Var.f381001f = aVar2.g(intValue);
                return 0;
            case 4:
                n2Var.f381002g = aVar2.d(intValue);
                return 0;
            case 5:
                n2Var.f381003h = aVar2.g(intValue);
                return 0;
            case 6:
                n2Var.f381004i = aVar2.g(intValue);
                return 0;
            case 7:
                n2Var.f381005m = aVar2.k(intValue);
                return 0;
            case 8:
                n2Var.f381006n = aVar2.k(intValue);
                return 0;
            case 9:
                n2Var.f381007o = aVar2.k(intValue);
                return 0;
            case 10:
                n2Var.f381008p = aVar2.k(intValue);
                return 0;
            case 11:
                n2Var.f381009q = aVar2.k(intValue);
                return 0;
            case 12:
                n2Var.f381010r = aVar2.k(intValue);
                return 0;
            case 13:
                n2Var.f381011s = aVar2.k(intValue);
                return 0;
            case 14:
                n2Var.f381012t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
