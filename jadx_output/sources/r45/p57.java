package r45;

/* loaded from: classes15.dex */
public class p57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382775d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382776e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382777f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382778g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382779h;

    /* renamed from: i, reason: collision with root package name */
    public int f382780i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382781m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p57)) {
            return false;
        }
        r45.p57 p57Var = (r45.p57) fVar;
        return n51.f.a(this.f382775d, p57Var.f382775d) && n51.f.a(this.f382776e, p57Var.f382776e) && n51.f.a(this.f382777f, p57Var.f382777f) && n51.f.a(this.f382778g, p57Var.f382778g) && n51.f.a(this.f382779h, p57Var.f382779h) && n51.f.a(java.lang.Integer.valueOf(this.f382780i), java.lang.Integer.valueOf(p57Var.f382780i)) && n51.f.a(this.f382781m, p57Var.f382781m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382775d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382776e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382777f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f382778g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f382779h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f382780i);
            java.lang.String str6 = this.f382781m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f382775d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f382776e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f382777f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f382778g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f382779h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f382780i);
            java.lang.String str12 = this.f382781m;
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
        r45.p57 p57Var = (r45.p57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p57Var.f382775d = aVar2.k(intValue);
                return 0;
            case 2:
                p57Var.f382776e = aVar2.k(intValue);
                return 0;
            case 3:
                p57Var.f382777f = aVar2.k(intValue);
                return 0;
            case 4:
                p57Var.f382778g = aVar2.k(intValue);
                return 0;
            case 5:
                p57Var.f382779h = aVar2.k(intValue);
                return 0;
            case 6:
                p57Var.f382780i = aVar2.g(intValue);
                return 0;
            case 7:
                p57Var.f382781m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
