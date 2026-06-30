package r45;

/* loaded from: classes8.dex */
public class g74 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374943d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374944e;

    /* renamed from: f, reason: collision with root package name */
    public int f374945f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374946g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374947h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374948i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374949m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g74)) {
            return false;
        }
        r45.g74 g74Var = (r45.g74) fVar;
        return n51.f.a(this.f374943d, g74Var.f374943d) && n51.f.a(this.f374944e, g74Var.f374944e) && n51.f.a(java.lang.Integer.valueOf(this.f374945f), java.lang.Integer.valueOf(g74Var.f374945f)) && n51.f.a(this.f374946g, g74Var.f374946g) && n51.f.a(this.f374947h, g74Var.f374947h) && n51.f.a(this.f374948i, g74Var.f374948i) && n51.f.a(this.f374949m, g74Var.f374949m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374943d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374944e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f374945f);
            java.lang.String str3 = this.f374946g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f374947h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f374948i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f374949m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f374943d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f374944e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f374945f);
            java.lang.String str9 = this.f374946g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f374947h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f374948i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f374949m;
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
        r45.g74 g74Var = (r45.g74) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g74Var.f374943d = aVar2.k(intValue);
                return 0;
            case 2:
                g74Var.f374944e = aVar2.k(intValue);
                return 0;
            case 3:
                g74Var.f374945f = aVar2.g(intValue);
                return 0;
            case 4:
                g74Var.f374946g = aVar2.k(intValue);
                return 0;
            case 5:
                g74Var.f374947h = aVar2.k(intValue);
                return 0;
            case 6:
                g74Var.f374948i = aVar2.k(intValue);
                return 0;
            case 7:
                g74Var.f374949m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
