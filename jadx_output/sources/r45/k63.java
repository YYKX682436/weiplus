package r45;

/* loaded from: classes8.dex */
public class k63 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378425d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378426e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378427f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378428g;

    /* renamed from: h, reason: collision with root package name */
    public int f378429h;

    /* renamed from: i, reason: collision with root package name */
    public int f378430i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378431m;

    /* renamed from: n, reason: collision with root package name */
    public int f378432n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378433o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k63)) {
            return false;
        }
        r45.k63 k63Var = (r45.k63) fVar;
        return n51.f.a(this.f378425d, k63Var.f378425d) && n51.f.a(this.f378426e, k63Var.f378426e) && n51.f.a(this.f378427f, k63Var.f378427f) && n51.f.a(this.f378428g, k63Var.f378428g) && n51.f.a(java.lang.Integer.valueOf(this.f378429h), java.lang.Integer.valueOf(k63Var.f378429h)) && n51.f.a(java.lang.Integer.valueOf(this.f378430i), java.lang.Integer.valueOf(k63Var.f378430i)) && n51.f.a(this.f378431m, k63Var.f378431m) && n51.f.a(java.lang.Integer.valueOf(this.f378432n), java.lang.Integer.valueOf(k63Var.f378432n)) && n51.f.a(this.f378433o, k63Var.f378433o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378425d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f378426e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f378427f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f378428g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f378429h);
            fVar.e(6, this.f378430i);
            java.lang.String str5 = this.f378431m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f378432n);
            java.lang.String str6 = this.f378433o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f378425d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f378426e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f378427f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f378428g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f378429h) + b36.f.e(6, this.f378430i);
            java.lang.String str11 = this.f378431m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            int e18 = e17 + b36.f.e(8, this.f378432n);
            java.lang.String str12 = this.f378433o;
            return str12 != null ? e18 + b36.f.j(9, str12) : e18;
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
        r45.k63 k63Var = (r45.k63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k63Var.f378425d = aVar2.k(intValue);
                return 0;
            case 2:
                k63Var.f378426e = aVar2.k(intValue);
                return 0;
            case 3:
                k63Var.f378427f = aVar2.k(intValue);
                return 0;
            case 4:
                k63Var.f378428g = aVar2.k(intValue);
                return 0;
            case 5:
                k63Var.f378429h = aVar2.g(intValue);
                return 0;
            case 6:
                k63Var.f378430i = aVar2.g(intValue);
                return 0;
            case 7:
                k63Var.f378431m = aVar2.k(intValue);
                return 0;
            case 8:
                k63Var.f378432n = aVar2.g(intValue);
                return 0;
            case 9:
                k63Var.f378433o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
