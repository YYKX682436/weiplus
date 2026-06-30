package r45;

/* loaded from: classes15.dex */
public class uf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387322d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387323e;

    /* renamed from: f, reason: collision with root package name */
    public int f387324f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387325g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387326h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387327i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387328m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f387329n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f387330o;

    /* renamed from: p, reason: collision with root package name */
    public int f387331p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f387332q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf4)) {
            return false;
        }
        r45.uf4 uf4Var = (r45.uf4) fVar;
        return n51.f.a(this.f387322d, uf4Var.f387322d) && n51.f.a(this.f387323e, uf4Var.f387323e) && n51.f.a(java.lang.Integer.valueOf(this.f387324f), java.lang.Integer.valueOf(uf4Var.f387324f)) && n51.f.a(this.f387325g, uf4Var.f387325g) && n51.f.a(this.f387326h, uf4Var.f387326h) && n51.f.a(this.f387327i, uf4Var.f387327i) && n51.f.a(this.f387328m, uf4Var.f387328m) && n51.f.a(this.f387329n, uf4Var.f387329n) && n51.f.a(this.f387330o, uf4Var.f387330o) && n51.f.a(java.lang.Integer.valueOf(this.f387331p), java.lang.Integer.valueOf(uf4Var.f387331p)) && n51.f.a(this.f387332q, uf4Var.f387332q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387322d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387323e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f387324f);
            java.lang.String str3 = this.f387325g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f387326h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f387327i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f387328m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f387329n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f387330o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f387331p);
            java.lang.String str9 = this.f387332q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f387322d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f387323e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            int e17 = j17 + b36.f.e(3, this.f387324f);
            java.lang.String str12 = this.f387325g;
            if (str12 != null) {
                e17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f387326h;
            if (str13 != null) {
                e17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f387327i;
            if (str14 != null) {
                e17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f387328m;
            if (str15 != null) {
                e17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f387329n;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f387330o;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            int e18 = e17 + b36.f.e(10, this.f387331p);
            java.lang.String str18 = this.f387332q;
            return str18 != null ? e18 + b36.f.j(11, str18) : e18;
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
        r45.uf4 uf4Var = (r45.uf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uf4Var.f387322d = aVar2.k(intValue);
                return 0;
            case 2:
                uf4Var.f387323e = aVar2.k(intValue);
                return 0;
            case 3:
                uf4Var.f387324f = aVar2.g(intValue);
                return 0;
            case 4:
                uf4Var.f387325g = aVar2.k(intValue);
                return 0;
            case 5:
                uf4Var.f387326h = aVar2.k(intValue);
                return 0;
            case 6:
                uf4Var.f387327i = aVar2.k(intValue);
                return 0;
            case 7:
                uf4Var.f387328m = aVar2.k(intValue);
                return 0;
            case 8:
                uf4Var.f387329n = aVar2.k(intValue);
                return 0;
            case 9:
                uf4Var.f387330o = aVar2.k(intValue);
                return 0;
            case 10:
                uf4Var.f387331p = aVar2.g(intValue);
                return 0;
            case 11:
                uf4Var.f387332q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
