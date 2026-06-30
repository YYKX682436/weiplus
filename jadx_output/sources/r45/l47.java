package r45;

/* loaded from: classes7.dex */
public class l47 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379129d;

    /* renamed from: e, reason: collision with root package name */
    public int f379130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379131f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379132g;

    /* renamed from: h, reason: collision with root package name */
    public int f379133h;

    /* renamed from: i, reason: collision with root package name */
    public int f379134i;

    /* renamed from: m, reason: collision with root package name */
    public int f379135m;

    /* renamed from: n, reason: collision with root package name */
    public int f379136n;

    /* renamed from: o, reason: collision with root package name */
    public int f379137o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l47)) {
            return false;
        }
        r45.l47 l47Var = (r45.l47) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379129d), java.lang.Integer.valueOf(l47Var.f379129d)) && n51.f.a(java.lang.Integer.valueOf(this.f379130e), java.lang.Integer.valueOf(l47Var.f379130e)) && n51.f.a(this.f379131f, l47Var.f379131f) && n51.f.a(this.f379132g, l47Var.f379132g) && n51.f.a(java.lang.Integer.valueOf(this.f379133h), java.lang.Integer.valueOf(l47Var.f379133h)) && n51.f.a(java.lang.Integer.valueOf(this.f379134i), java.lang.Integer.valueOf(l47Var.f379134i)) && n51.f.a(java.lang.Integer.valueOf(this.f379135m), java.lang.Integer.valueOf(l47Var.f379135m)) && n51.f.a(java.lang.Integer.valueOf(this.f379136n), java.lang.Integer.valueOf(l47Var.f379136n)) && n51.f.a(java.lang.Integer.valueOf(this.f379137o), java.lang.Integer.valueOf(l47Var.f379137o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379129d);
            fVar.e(2, this.f379130e);
            java.lang.String str = this.f379131f;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f379132g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f379133h);
            fVar.e(6, this.f379134i);
            fVar.e(7, this.f379135m);
            fVar.e(8, this.f379136n);
            fVar.e(9, this.f379137o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379129d) + 0 + b36.f.e(2, this.f379130e);
            java.lang.String str2 = this.f379131f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f379132g;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            return e17 + b36.f.e(5, this.f379133h) + b36.f.e(6, this.f379134i) + b36.f.e(7, this.f379135m) + b36.f.e(8, this.f379136n) + b36.f.e(9, this.f379137o);
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
        r45.l47 l47Var = (r45.l47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l47Var.f379129d = aVar2.g(intValue);
                return 0;
            case 2:
                l47Var.f379130e = aVar2.g(intValue);
                return 0;
            case 3:
                l47Var.f379131f = aVar2.k(intValue);
                return 0;
            case 4:
                l47Var.f379132g = aVar2.d(intValue);
                return 0;
            case 5:
                l47Var.f379133h = aVar2.g(intValue);
                return 0;
            case 6:
                l47Var.f379134i = aVar2.g(intValue);
                return 0;
            case 7:
                l47Var.f379135m = aVar2.g(intValue);
                return 0;
            case 8:
                l47Var.f379136n = aVar2.g(intValue);
                return 0;
            case 9:
                l47Var.f379137o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
