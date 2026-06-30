package r45;

/* loaded from: classes9.dex */
public class oa5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382096d;

    /* renamed from: e, reason: collision with root package name */
    public int f382097e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382098f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382099g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382100h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382101i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382102m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oa5)) {
            return false;
        }
        r45.oa5 oa5Var = (r45.oa5) fVar;
        return n51.f.a(this.f382096d, oa5Var.f382096d) && n51.f.a(java.lang.Integer.valueOf(this.f382097e), java.lang.Integer.valueOf(oa5Var.f382097e)) && n51.f.a(this.f382098f, oa5Var.f382098f) && n51.f.a(this.f382099g, oa5Var.f382099g) && n51.f.a(this.f382100h, oa5Var.f382100h) && n51.f.a(this.f382101i, oa5Var.f382101i) && n51.f.a(this.f382102m, oa5Var.f382102m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382096d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382097e);
            java.lang.String str2 = this.f382098f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382099g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f382100h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f382101i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f382102m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f382096d;
            int j17 = (str7 != null ? 0 + b36.f.j(1, str7) : 0) + b36.f.e(2, this.f382097e);
            java.lang.String str8 = this.f382098f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f382099g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f382100h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f382101i;
            if (str11 != null) {
                j17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f382102m;
            return str12 != null ? j17 + b36.f.j(7, str12) : j17;
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
        r45.oa5 oa5Var = (r45.oa5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oa5Var.f382096d = aVar2.k(intValue);
                return 0;
            case 2:
                oa5Var.f382097e = aVar2.g(intValue);
                return 0;
            case 3:
                oa5Var.f382098f = aVar2.k(intValue);
                return 0;
            case 4:
                oa5Var.f382099g = aVar2.k(intValue);
                return 0;
            case 5:
                oa5Var.f382100h = aVar2.k(intValue);
                return 0;
            case 6:
                oa5Var.f382101i = aVar2.k(intValue);
                return 0;
            case 7:
                oa5Var.f382102m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
