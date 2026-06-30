package r45;

/* loaded from: classes7.dex */
public class ff4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374272e;

    /* renamed from: f, reason: collision with root package name */
    public int f374273f;

    /* renamed from: g, reason: collision with root package name */
    public int f374274g;

    /* renamed from: h, reason: collision with root package name */
    public int f374275h;

    /* renamed from: i, reason: collision with root package name */
    public int f374276i;

    /* renamed from: m, reason: collision with root package name */
    public int f374277m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374278n;

    /* renamed from: o, reason: collision with root package name */
    public int f374279o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ff4)) {
            return false;
        }
        r45.ff4 ff4Var = (r45.ff4) fVar;
        return n51.f.a(this.f374271d, ff4Var.f374271d) && n51.f.a(this.f374272e, ff4Var.f374272e) && n51.f.a(java.lang.Integer.valueOf(this.f374273f), java.lang.Integer.valueOf(ff4Var.f374273f)) && n51.f.a(java.lang.Integer.valueOf(this.f374274g), java.lang.Integer.valueOf(ff4Var.f374274g)) && n51.f.a(java.lang.Integer.valueOf(this.f374275h), java.lang.Integer.valueOf(ff4Var.f374275h)) && n51.f.a(java.lang.Integer.valueOf(this.f374276i), java.lang.Integer.valueOf(ff4Var.f374276i)) && n51.f.a(java.lang.Integer.valueOf(this.f374277m), java.lang.Integer.valueOf(ff4Var.f374277m)) && n51.f.a(this.f374278n, ff4Var.f374278n) && n51.f.a(java.lang.Integer.valueOf(this.f374279o), java.lang.Integer.valueOf(ff4Var.f374279o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374271d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374272e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f374273f);
            fVar.e(4, this.f374274g);
            fVar.e(5, this.f374275h);
            fVar.e(6, this.f374276i);
            fVar.e(7, this.f374277m);
            java.lang.String str3 = this.f374278n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f374279o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f374271d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f374272e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f374273f) + b36.f.e(4, this.f374274g) + b36.f.e(5, this.f374275h) + b36.f.e(6, this.f374276i) + b36.f.e(7, this.f374277m);
            java.lang.String str6 = this.f374278n;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            return e17 + b36.f.e(9, this.f374279o);
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
        r45.ff4 ff4Var = (r45.ff4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ff4Var.f374271d = aVar2.k(intValue);
                return 0;
            case 2:
                ff4Var.f374272e = aVar2.k(intValue);
                return 0;
            case 3:
                ff4Var.f374273f = aVar2.g(intValue);
                return 0;
            case 4:
                ff4Var.f374274g = aVar2.g(intValue);
                return 0;
            case 5:
                ff4Var.f374275h = aVar2.g(intValue);
                return 0;
            case 6:
                ff4Var.f374276i = aVar2.g(intValue);
                return 0;
            case 7:
                ff4Var.f374277m = aVar2.g(intValue);
                return 0;
            case 8:
                ff4Var.f374278n = aVar2.k(intValue);
                return 0;
            case 9:
                ff4Var.f374279o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
