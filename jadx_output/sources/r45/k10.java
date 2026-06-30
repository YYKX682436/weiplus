package r45;

/* loaded from: classes4.dex */
public class k10 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378283d;

    /* renamed from: e, reason: collision with root package name */
    public int f378284e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378285f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378286g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378288i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378289m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378290n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378291o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k10)) {
            return false;
        }
        r45.k10 k10Var = (r45.k10) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378283d), java.lang.Integer.valueOf(k10Var.f378283d)) && n51.f.a(java.lang.Integer.valueOf(this.f378284e), java.lang.Integer.valueOf(k10Var.f378284e)) && n51.f.a(this.f378285f, k10Var.f378285f) && n51.f.a(this.f378286g, k10Var.f378286g) && n51.f.a(this.f378287h, k10Var.f378287h) && n51.f.a(this.f378288i, k10Var.f378288i) && n51.f.a(this.f378289m, k10Var.f378289m) && n51.f.a(this.f378290n, k10Var.f378290n) && n51.f.a(this.f378291o, k10Var.f378291o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378283d);
            fVar.e(2, this.f378284e);
            java.lang.String str = this.f378285f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f378286g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378287h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378288i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f378289m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f378290n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f378291o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378283d) + 0 + b36.f.e(2, this.f378284e);
            java.lang.String str8 = this.f378285f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f378286g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f378287h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f378288i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f378289m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f378290n;
            if (str13 != null) {
                e17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f378291o;
            return str14 != null ? e17 + b36.f.j(9, str14) : e17;
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
        r45.k10 k10Var = (r45.k10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k10Var.f378283d = aVar2.g(intValue);
                return 0;
            case 2:
                k10Var.f378284e = aVar2.g(intValue);
                return 0;
            case 3:
                k10Var.f378285f = aVar2.k(intValue);
                return 0;
            case 4:
                k10Var.f378286g = aVar2.k(intValue);
                return 0;
            case 5:
                k10Var.f378287h = aVar2.k(intValue);
                return 0;
            case 6:
                k10Var.f378288i = aVar2.k(intValue);
                return 0;
            case 7:
                k10Var.f378289m = aVar2.k(intValue);
                return 0;
            case 8:
                k10Var.f378290n = aVar2.k(intValue);
                return 0;
            case 9:
                k10Var.f378291o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
