package m53;

/* loaded from: classes8.dex */
public class h6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323756d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323757e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323758f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323759g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323760h;

    /* renamed from: i, reason: collision with root package name */
    public int f323761i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f323762m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.h6)) {
            return false;
        }
        m53.h6 h6Var = (m53.h6) fVar;
        return n51.f.a(this.f323756d, h6Var.f323756d) && n51.f.a(this.f323757e, h6Var.f323757e) && n51.f.a(this.f323758f, h6Var.f323758f) && n51.f.a(this.f323759g, h6Var.f323759g) && n51.f.a(this.f323760h, h6Var.f323760h) && n51.f.a(java.lang.Integer.valueOf(this.f323761i), java.lang.Integer.valueOf(h6Var.f323761i)) && n51.f.a(this.f323762m, h6Var.f323762m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323756d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323757e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323758f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323759g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f323760h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f323761i);
            java.lang.String str6 = this.f323762m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f323756d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f323757e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f323758f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f323759g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f323760h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f323761i);
            java.lang.String str12 = this.f323762m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        m53.h6 h6Var = (m53.h6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h6Var.f323756d = aVar2.k(intValue);
                return 0;
            case 2:
                h6Var.f323757e = aVar2.k(intValue);
                return 0;
            case 3:
                h6Var.f323758f = aVar2.k(intValue);
                return 0;
            case 4:
                h6Var.f323759g = aVar2.k(intValue);
                return 0;
            case 5:
                h6Var.f323760h = aVar2.k(intValue);
                return 0;
            case 6:
                h6Var.f323761i = aVar2.g(intValue);
                return 0;
            case 7:
                h6Var.f323762m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
