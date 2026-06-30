package r45;

/* loaded from: classes7.dex */
public class dg7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372453d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372454e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372455f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372456g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372457h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372458i;

    /* renamed from: m, reason: collision with root package name */
    public int f372459m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f372460n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dg7)) {
            return false;
        }
        r45.dg7 dg7Var = (r45.dg7) fVar;
        return n51.f.a(this.f372453d, dg7Var.f372453d) && n51.f.a(this.f372454e, dg7Var.f372454e) && n51.f.a(this.f372455f, dg7Var.f372455f) && n51.f.a(this.f372456g, dg7Var.f372456g) && n51.f.a(this.f372457h, dg7Var.f372457h) && n51.f.a(this.f372458i, dg7Var.f372458i) && n51.f.a(java.lang.Integer.valueOf(this.f372459m), java.lang.Integer.valueOf(dg7Var.f372459m)) && n51.f.a(this.f372460n, dg7Var.f372460n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372453d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372454e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f372455f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f372456g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f372457h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f372458i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f372459m);
            java.lang.String str7 = this.f372460n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f372453d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f372454e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f372455f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f372456g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f372457h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f372458i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            int e17 = j17 + b36.f.e(7, this.f372459m);
            java.lang.String str14 = this.f372460n;
            return str14 != null ? e17 + b36.f.j(8, str14) : e17;
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
        r45.dg7 dg7Var = (r45.dg7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dg7Var.f372453d = aVar2.k(intValue);
                return 0;
            case 2:
                dg7Var.f372454e = aVar2.k(intValue);
                return 0;
            case 3:
                dg7Var.f372455f = aVar2.k(intValue);
                return 0;
            case 4:
                dg7Var.f372456g = aVar2.k(intValue);
                return 0;
            case 5:
                dg7Var.f372457h = aVar2.k(intValue);
                return 0;
            case 6:
                dg7Var.f372458i = aVar2.k(intValue);
                return 0;
            case 7:
                dg7Var.f372459m = aVar2.g(intValue);
                return 0;
            case 8:
                dg7Var.f372460n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
