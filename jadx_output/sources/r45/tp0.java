package r45;

/* loaded from: classes12.dex */
public class tp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386638d;

    /* renamed from: e, reason: collision with root package name */
    public int f386639e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386640f;

    /* renamed from: g, reason: collision with root package name */
    public int f386641g;

    /* renamed from: h, reason: collision with root package name */
    public int f386642h;

    /* renamed from: i, reason: collision with root package name */
    public int f386643i;

    /* renamed from: m, reason: collision with root package name */
    public int f386644m;

    /* renamed from: n, reason: collision with root package name */
    public int f386645n;

    /* renamed from: o, reason: collision with root package name */
    public int f386646o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tp0)) {
            return false;
        }
        r45.tp0 tp0Var = (r45.tp0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386638d), java.lang.Integer.valueOf(tp0Var.f386638d)) && n51.f.a(java.lang.Integer.valueOf(this.f386639e), java.lang.Integer.valueOf(tp0Var.f386639e)) && n51.f.a(this.f386640f, tp0Var.f386640f) && n51.f.a(java.lang.Integer.valueOf(this.f386641g), java.lang.Integer.valueOf(tp0Var.f386641g)) && n51.f.a(java.lang.Integer.valueOf(this.f386642h), java.lang.Integer.valueOf(tp0Var.f386642h)) && n51.f.a(java.lang.Integer.valueOf(this.f386643i), java.lang.Integer.valueOf(tp0Var.f386643i)) && n51.f.a(java.lang.Integer.valueOf(this.f386644m), java.lang.Integer.valueOf(tp0Var.f386644m)) && n51.f.a(java.lang.Integer.valueOf(this.f386645n), java.lang.Integer.valueOf(tp0Var.f386645n)) && n51.f.a(java.lang.Integer.valueOf(this.f386646o), java.lang.Integer.valueOf(tp0Var.f386646o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386638d);
            fVar.e(2, this.f386639e);
            java.lang.String str = this.f386640f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f386641g);
            fVar.e(5, this.f386642h);
            fVar.e(6, this.f386643i);
            fVar.e(7, this.f386644m);
            fVar.e(8, this.f386645n);
            fVar.e(9, this.f386646o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f386638d) + 0 + b36.f.e(2, this.f386639e);
            java.lang.String str2 = this.f386640f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f386641g) + b36.f.e(5, this.f386642h) + b36.f.e(6, this.f386643i) + b36.f.e(7, this.f386644m) + b36.f.e(8, this.f386645n) + b36.f.e(9, this.f386646o);
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
        r45.tp0 tp0Var = (r45.tp0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tp0Var.f386638d = aVar2.g(intValue);
                return 0;
            case 2:
                tp0Var.f386639e = aVar2.g(intValue);
                return 0;
            case 3:
                tp0Var.f386640f = aVar2.k(intValue);
                return 0;
            case 4:
                tp0Var.f386641g = aVar2.g(intValue);
                return 0;
            case 5:
                tp0Var.f386642h = aVar2.g(intValue);
                return 0;
            case 6:
                tp0Var.f386643i = aVar2.g(intValue);
                return 0;
            case 7:
                tp0Var.f386644m = aVar2.g(intValue);
                return 0;
            case 8:
                tp0Var.f386645n = aVar2.g(intValue);
                return 0;
            case 9:
                tp0Var.f386646o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
