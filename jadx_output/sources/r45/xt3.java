package r45;

/* loaded from: classes4.dex */
public class xt3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390391d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390392e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390393f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390394g;

    /* renamed from: h, reason: collision with root package name */
    public int f390395h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f390396i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390397m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xt3)) {
            return false;
        }
        r45.xt3 xt3Var = (r45.xt3) fVar;
        return n51.f.a(this.f390391d, xt3Var.f390391d) && n51.f.a(this.f390392e, xt3Var.f390392e) && n51.f.a(this.f390393f, xt3Var.f390393f) && n51.f.a(this.f390394g, xt3Var.f390394g) && n51.f.a(java.lang.Integer.valueOf(this.f390395h), java.lang.Integer.valueOf(xt3Var.f390395h)) && n51.f.a(this.f390396i, xt3Var.f390396i) && n51.f.a(this.f390397m, xt3Var.f390397m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f390391d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f390392e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f390393f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f390394g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f390395h);
            java.lang.String str5 = this.f390396i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f390397m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f390391d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f390392e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f390393f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f390394g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f390395h);
            java.lang.String str11 = this.f390396i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f390397m;
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
        r45.xt3 xt3Var = (r45.xt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xt3Var.f390391d = aVar2.k(intValue);
                return 0;
            case 2:
                xt3Var.f390392e = aVar2.k(intValue);
                return 0;
            case 3:
                xt3Var.f390393f = aVar2.k(intValue);
                return 0;
            case 4:
                xt3Var.f390394g = aVar2.k(intValue);
                return 0;
            case 5:
                xt3Var.f390395h = aVar2.g(intValue);
                return 0;
            case 6:
                xt3Var.f390396i = aVar2.k(intValue);
                return 0;
            case 7:
                xt3Var.f390397m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
