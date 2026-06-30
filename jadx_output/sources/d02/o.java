package d02;

/* loaded from: classes2.dex */
public class o extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f225344d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225345e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225346f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225347g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f225348h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f225349i;

    /* renamed from: m, reason: collision with root package name */
    public int f225350m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f225351n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f225352o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.o)) {
            return false;
        }
        d02.o oVar = (d02.o) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f225344d), java.lang.Integer.valueOf(oVar.f225344d)) && n51.f.a(this.f225345e, oVar.f225345e) && n51.f.a(this.f225346f, oVar.f225346f) && n51.f.a(this.f225347g, oVar.f225347g) && n51.f.a(this.f225348h, oVar.f225348h) && n51.f.a(this.f225349i, oVar.f225349i) && n51.f.a(java.lang.Integer.valueOf(this.f225350m), java.lang.Integer.valueOf(oVar.f225350m)) && n51.f.a(this.f225351n, oVar.f225351n) && n51.f.a(this.f225352o, oVar.f225352o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f225344d);
            java.lang.String str = this.f225345e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f225346f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f225347g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f225348h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f225349i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f225350m);
            java.lang.String str6 = this.f225351n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f225352o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f225344d) + 0;
            java.lang.String str8 = this.f225345e;
            if (str8 != null) {
                e17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f225346f;
            if (str9 != null) {
                e17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f225347g;
            if (str10 != null) {
                e17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f225348h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f225349i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            int e18 = e17 + b36.f.e(7, this.f225350m);
            java.lang.String str13 = this.f225351n;
            if (str13 != null) {
                e18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f225352o;
            return str14 != null ? e18 + b36.f.j(9, str14) : e18;
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
        d02.o oVar = (d02.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oVar.f225344d = aVar2.g(intValue);
                return 0;
            case 2:
                oVar.f225345e = aVar2.k(intValue);
                return 0;
            case 3:
                oVar.f225346f = aVar2.k(intValue);
                return 0;
            case 4:
                oVar.f225347g = aVar2.k(intValue);
                return 0;
            case 5:
                oVar.f225348h = aVar2.k(intValue);
                return 0;
            case 6:
                oVar.f225349i = aVar2.k(intValue);
                return 0;
            case 7:
                oVar.f225350m = aVar2.g(intValue);
                return 0;
            case 8:
                oVar.f225351n = aVar2.k(intValue);
                return 0;
            case 9:
                oVar.f225352o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
