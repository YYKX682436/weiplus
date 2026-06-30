package r45;

/* loaded from: classes9.dex */
public class oy3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382611d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382612e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382613f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382614g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382615h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382616i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382617m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oy3)) {
            return false;
        }
        r45.oy3 oy3Var = (r45.oy3) fVar;
        return n51.f.a(this.f382611d, oy3Var.f382611d) && n51.f.a(this.f382612e, oy3Var.f382612e) && n51.f.a(this.f382613f, oy3Var.f382613f) && n51.f.a(this.f382614g, oy3Var.f382614g) && n51.f.a(this.f382615h, oy3Var.f382615h) && n51.f.a(this.f382616i, oy3Var.f382616i) && n51.f.a(this.f382617m, oy3Var.f382617m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382611d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382612e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382613f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f382614g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f382615h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f382616i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f382617m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f382611d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f382612e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f382613f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f382614g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f382615h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f382616i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f382617m;
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
        r45.oy3 oy3Var = (r45.oy3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oy3Var.f382611d = aVar2.k(intValue);
                return 0;
            case 2:
                oy3Var.f382612e = aVar2.k(intValue);
                return 0;
            case 3:
                oy3Var.f382613f = aVar2.k(intValue);
                return 0;
            case 4:
                oy3Var.f382614g = aVar2.k(intValue);
                return 0;
            case 5:
                oy3Var.f382615h = aVar2.k(intValue);
                return 0;
            case 6:
                oy3Var.f382616i = aVar2.k(intValue);
                return 0;
            case 7:
                oy3Var.f382617m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
