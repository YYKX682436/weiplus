package r45;

/* loaded from: classes14.dex */
public class a46 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369718d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369719e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369720f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369721g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369722h;

    /* renamed from: i, reason: collision with root package name */
    public int f369723i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369724m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a46)) {
            return false;
        }
        r45.a46 a46Var = (r45.a46) fVar;
        return n51.f.a(this.f369718d, a46Var.f369718d) && n51.f.a(this.f369719e, a46Var.f369719e) && n51.f.a(this.f369720f, a46Var.f369720f) && n51.f.a(this.f369721g, a46Var.f369721g) && n51.f.a(this.f369722h, a46Var.f369722h) && n51.f.a(java.lang.Integer.valueOf(this.f369723i), java.lang.Integer.valueOf(a46Var.f369723i)) && n51.f.a(this.f369724m, a46Var.f369724m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f369718d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f369719e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f369720f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f369721g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f369722h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f369723i);
            java.lang.String str6 = this.f369724m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f369718d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f369719e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f369720f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f369721g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f369722h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f369723i);
            java.lang.String str12 = this.f369724m;
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
        r45.a46 a46Var = (r45.a46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a46Var.f369718d = aVar2.k(intValue);
                return 0;
            case 2:
                a46Var.f369719e = aVar2.k(intValue);
                return 0;
            case 3:
                a46Var.f369720f = aVar2.k(intValue);
                return 0;
            case 4:
                a46Var.f369721g = aVar2.k(intValue);
                return 0;
            case 5:
                a46Var.f369722h = aVar2.k(intValue);
                return 0;
            case 6:
                a46Var.f369723i = aVar2.g(intValue);
                return 0;
            case 7:
                a46Var.f369724m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
