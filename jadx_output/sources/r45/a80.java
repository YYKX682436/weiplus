package r45;

/* loaded from: classes9.dex */
public class a80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f369811d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369812e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369813f;

    /* renamed from: g, reason: collision with root package name */
    public int f369814g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369815h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369816i;

    /* renamed from: m, reason: collision with root package name */
    public int f369817m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a80)) {
            return false;
        }
        r45.a80 a80Var = (r45.a80) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f369811d), java.lang.Integer.valueOf(a80Var.f369811d)) && n51.f.a(this.f369812e, a80Var.f369812e) && n51.f.a(this.f369813f, a80Var.f369813f) && n51.f.a(java.lang.Integer.valueOf(this.f369814g), java.lang.Integer.valueOf(a80Var.f369814g)) && n51.f.a(this.f369815h, a80Var.f369815h) && n51.f.a(this.f369816i, a80Var.f369816i) && n51.f.a(java.lang.Integer.valueOf(this.f369817m), java.lang.Integer.valueOf(a80Var.f369817m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f369811d);
            java.lang.String str = this.f369812e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f369813f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f369814g);
            java.lang.String str3 = this.f369815h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f369816i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f369817m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f369811d) + 0;
            java.lang.String str5 = this.f369812e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f369813f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            int e18 = e17 + b36.f.e(4, this.f369814g);
            java.lang.String str7 = this.f369815h;
            if (str7 != null) {
                e18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f369816i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            return e18 + b36.f.e(7, this.f369817m);
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
        r45.a80 a80Var = (r45.a80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a80Var.f369811d = aVar2.g(intValue);
                return 0;
            case 2:
                a80Var.f369812e = aVar2.k(intValue);
                return 0;
            case 3:
                a80Var.f369813f = aVar2.k(intValue);
                return 0;
            case 4:
                a80Var.f369814g = aVar2.g(intValue);
                return 0;
            case 5:
                a80Var.f369815h = aVar2.k(intValue);
                return 0;
            case 6:
                a80Var.f369816i = aVar2.k(intValue);
                return 0;
            case 7:
                a80Var.f369817m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
