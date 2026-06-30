package r45;

/* loaded from: classes7.dex */
public class p97 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382900d;

    /* renamed from: e, reason: collision with root package name */
    public int f382901e;

    /* renamed from: f, reason: collision with root package name */
    public int f382902f;

    /* renamed from: g, reason: collision with root package name */
    public int f382903g;

    /* renamed from: h, reason: collision with root package name */
    public int f382904h;

    /* renamed from: i, reason: collision with root package name */
    public int f382905i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f382906m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f382907n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p97)) {
            return false;
        }
        r45.p97 p97Var = (r45.p97) fVar;
        return n51.f.a(this.f382900d, p97Var.f382900d) && n51.f.a(java.lang.Integer.valueOf(this.f382901e), java.lang.Integer.valueOf(p97Var.f382901e)) && n51.f.a(java.lang.Integer.valueOf(this.f382902f), java.lang.Integer.valueOf(p97Var.f382902f)) && n51.f.a(java.lang.Integer.valueOf(this.f382903g), java.lang.Integer.valueOf(p97Var.f382903g)) && n51.f.a(java.lang.Integer.valueOf(this.f382904h), java.lang.Integer.valueOf(p97Var.f382904h)) && n51.f.a(java.lang.Integer.valueOf(this.f382905i), java.lang.Integer.valueOf(p97Var.f382905i)) && n51.f.a(this.f382906m, p97Var.f382906m) && n51.f.a(this.f382907n, p97Var.f382907n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382900d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f382901e);
            fVar.e(3, this.f382902f);
            fVar.e(4, this.f382903g);
            fVar.e(5, this.f382904h);
            fVar.e(6, this.f382905i);
            java.lang.String str2 = this.f382906m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f382907n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f382900d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f382901e) + b36.f.e(3, this.f382902f) + b36.f.e(4, this.f382903g) + b36.f.e(5, this.f382904h) + b36.f.e(6, this.f382905i);
            java.lang.String str5 = this.f382906m;
            if (str5 != null) {
                j17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f382907n;
            return str6 != null ? j17 + b36.f.j(8, str6) : j17;
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
        r45.p97 p97Var = (r45.p97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p97Var.f382900d = aVar2.k(intValue);
                return 0;
            case 2:
                p97Var.f382901e = aVar2.g(intValue);
                return 0;
            case 3:
                p97Var.f382902f = aVar2.g(intValue);
                return 0;
            case 4:
                p97Var.f382903g = aVar2.g(intValue);
                return 0;
            case 5:
                p97Var.f382904h = aVar2.g(intValue);
                return 0;
            case 6:
                p97Var.f382905i = aVar2.g(intValue);
                return 0;
            case 7:
                p97Var.f382906m = aVar2.k(intValue);
                return 0;
            case 8:
                p97Var.f382907n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
