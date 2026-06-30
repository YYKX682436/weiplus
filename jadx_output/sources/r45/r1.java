package r45;

/* loaded from: classes9.dex */
public class r1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384407d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384408e;

    /* renamed from: f, reason: collision with root package name */
    public double f384409f;

    /* renamed from: g, reason: collision with root package name */
    public double f384410g;

    /* renamed from: h, reason: collision with root package name */
    public long f384411h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f384412i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384413m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384414n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f384415o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f384416p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r1)) {
            return false;
        }
        r45.r1 r1Var = (r45.r1) fVar;
        return n51.f.a(this.f384407d, r1Var.f384407d) && n51.f.a(this.f384408e, r1Var.f384408e) && n51.f.a(java.lang.Double.valueOf(this.f384409f), java.lang.Double.valueOf(r1Var.f384409f)) && n51.f.a(java.lang.Double.valueOf(this.f384410g), java.lang.Double.valueOf(r1Var.f384410g)) && n51.f.a(java.lang.Long.valueOf(this.f384411h), java.lang.Long.valueOf(r1Var.f384411h)) && n51.f.a(this.f384412i, r1Var.f384412i) && n51.f.a(this.f384413m, r1Var.f384413m) && n51.f.a(this.f384414n, r1Var.f384414n) && n51.f.a(this.f384415o, r1Var.f384415o) && n51.f.a(this.f384416p, r1Var.f384416p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384407d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384408e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.c(3, this.f384409f);
            fVar.c(4, this.f384410g);
            fVar.h(5, this.f384411h);
            java.lang.String str3 = this.f384412i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f384413m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f384414n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f384415o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f384416p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f384407d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f384408e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int c17 = j17 + b36.f.c(3, this.f384409f) + b36.f.c(4, this.f384410g) + b36.f.h(5, this.f384411h);
            java.lang.String str10 = this.f384412i;
            if (str10 != null) {
                c17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f384413m;
            if (str11 != null) {
                c17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f384414n;
            if (str12 != null) {
                c17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f384415o;
            if (str13 != null) {
                c17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f384416p;
            return str14 != null ? c17 + b36.f.j(10, str14) : c17;
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
        r45.r1 r1Var = (r45.r1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                r1Var.f384407d = aVar2.k(intValue);
                return 0;
            case 2:
                r1Var.f384408e = aVar2.k(intValue);
                return 0;
            case 3:
                r1Var.f384409f = aVar2.e(intValue);
                return 0;
            case 4:
                r1Var.f384410g = aVar2.e(intValue);
                return 0;
            case 5:
                r1Var.f384411h = aVar2.i(intValue);
                return 0;
            case 6:
                r1Var.f384412i = aVar2.k(intValue);
                return 0;
            case 7:
                r1Var.f384413m = aVar2.k(intValue);
                return 0;
            case 8:
                r1Var.f384414n = aVar2.k(intValue);
                return 0;
            case 9:
                r1Var.f384415o = aVar2.k(intValue);
                return 0;
            case 10:
                r1Var.f384416p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
