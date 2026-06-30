package m53;

/* loaded from: classes8.dex */
public class u4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324104d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324105e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f324106f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324107g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f324108h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f324109i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f324110m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.u4)) {
            return false;
        }
        m53.u4 u4Var = (m53.u4) fVar;
        return n51.f.a(this.f324104d, u4Var.f324104d) && n51.f.a(this.f324105e, u4Var.f324105e) && n51.f.a(this.f324106f, u4Var.f324106f) && n51.f.a(this.f324107g, u4Var.f324107g) && n51.f.a(this.f324108h, u4Var.f324108h) && n51.f.a(this.f324109i, u4Var.f324109i) && n51.f.a(this.f324110m, u4Var.f324110m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324104d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324105e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f324106f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f324107g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f324108h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f324109i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f324110m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f324104d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f324105e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f324106f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f324107g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f324108h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f324109i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f324110m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        m53.u4 u4Var = (m53.u4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                u4Var.f324104d = aVar2.k(intValue);
                return 0;
            case 2:
                u4Var.f324105e = aVar2.k(intValue);
                return 0;
            case 3:
                u4Var.f324106f = aVar2.k(intValue);
                return 0;
            case 4:
                u4Var.f324107g = aVar2.k(intValue);
                return 0;
            case 5:
                u4Var.f324108h = aVar2.k(intValue);
                return 0;
            case 6:
                u4Var.f324109i = aVar2.k(intValue);
                return 0;
            case 7:
                u4Var.f324110m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
