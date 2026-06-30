package r45;

/* loaded from: classes2.dex */
public class rg4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384833d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384834e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384835f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384836g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384837h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384838i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384839m;

    /* renamed from: n, reason: collision with root package name */
    public long f384840n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f384841o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rg4)) {
            return false;
        }
        r45.rg4 rg4Var = (r45.rg4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384833d), java.lang.Integer.valueOf(rg4Var.f384833d)) && n51.f.a(this.f384834e, rg4Var.f384834e) && n51.f.a(this.f384835f, rg4Var.f384835f) && n51.f.a(this.f384836g, rg4Var.f384836g) && n51.f.a(this.f384837h, rg4Var.f384837h) && n51.f.a(this.f384838i, rg4Var.f384838i) && n51.f.a(this.f384839m, rg4Var.f384839m) && n51.f.a(java.lang.Long.valueOf(this.f384840n), java.lang.Long.valueOf(rg4Var.f384840n)) && n51.f.a(this.f384841o, rg4Var.f384841o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384833d);
            java.lang.String str = this.f384834e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384835f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f384836g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f384837h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f384838i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f384839m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.h(8, this.f384840n);
            java.lang.String str7 = this.f384841o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384833d) + 0;
            java.lang.String str8 = this.f384834e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f384835f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f384836g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f384837h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f384838i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f384839m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            int h17 = e17 + b36.f.h(8, this.f384840n);
            java.lang.String str14 = this.f384841o;
            return str14 != null ? h17 + b36.f.j(9, str14) : h17;
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
        r45.rg4 rg4Var = (r45.rg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rg4Var.f384833d = aVar2.g(intValue);
                return 0;
            case 2:
                rg4Var.f384834e = aVar2.k(intValue);
                return 0;
            case 3:
                rg4Var.f384835f = aVar2.k(intValue);
                return 0;
            case 4:
                rg4Var.f384836g = aVar2.k(intValue);
                return 0;
            case 5:
                rg4Var.f384837h = aVar2.k(intValue);
                return 0;
            case 6:
                rg4Var.f384838i = aVar2.k(intValue);
                return 0;
            case 7:
                rg4Var.f384839m = aVar2.k(intValue);
                return 0;
            case 8:
                rg4Var.f384840n = aVar2.i(intValue);
                return 0;
            case 9:
                rg4Var.f384841o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
