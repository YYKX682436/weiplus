package r45;

/* loaded from: classes9.dex */
public class q60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383701d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383702e;

    /* renamed from: f, reason: collision with root package name */
    public int f383703f;

    /* renamed from: g, reason: collision with root package name */
    public int f383704g;

    /* renamed from: h, reason: collision with root package name */
    public int f383705h;

    /* renamed from: i, reason: collision with root package name */
    public int f383706i;

    /* renamed from: m, reason: collision with root package name */
    public int f383707m;

    /* renamed from: n, reason: collision with root package name */
    public int f383708n;

    /* renamed from: o, reason: collision with root package name */
    public int f383709o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q60)) {
            return false;
        }
        r45.q60 q60Var = (r45.q60) fVar;
        return n51.f.a(this.f383701d, q60Var.f383701d) && n51.f.a(this.f383702e, q60Var.f383702e) && n51.f.a(java.lang.Integer.valueOf(this.f383703f), java.lang.Integer.valueOf(q60Var.f383703f)) && n51.f.a(java.lang.Integer.valueOf(this.f383704g), java.lang.Integer.valueOf(q60Var.f383704g)) && n51.f.a(java.lang.Integer.valueOf(this.f383705h), java.lang.Integer.valueOf(q60Var.f383705h)) && n51.f.a(java.lang.Integer.valueOf(this.f383706i), java.lang.Integer.valueOf(q60Var.f383706i)) && n51.f.a(java.lang.Integer.valueOf(this.f383707m), java.lang.Integer.valueOf(q60Var.f383707m)) && n51.f.a(java.lang.Integer.valueOf(this.f383708n), java.lang.Integer.valueOf(q60Var.f383708n)) && n51.f.a(java.lang.Integer.valueOf(this.f383709o), java.lang.Integer.valueOf(q60Var.f383709o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383701d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383702e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f383703f);
            fVar.e(5, this.f383704g);
            fVar.e(6, this.f383705h);
            fVar.e(8, this.f383706i);
            fVar.e(9, this.f383707m);
            fVar.e(10, this.f383708n);
            fVar.e(11, this.f383709o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383701d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f383702e;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f383703f) + b36.f.e(5, this.f383704g) + b36.f.e(6, this.f383705h) + b36.f.e(8, this.f383706i) + b36.f.e(9, this.f383707m) + b36.f.e(10, this.f383708n) + b36.f.e(11, this.f383709o);
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
        r45.q60 q60Var = (r45.q60) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q60Var.f383701d = aVar2.k(intValue);
                return 0;
            case 2:
            case 7:
            default:
                return -1;
            case 3:
                q60Var.f383702e = aVar2.k(intValue);
                return 0;
            case 4:
                q60Var.f383703f = aVar2.g(intValue);
                return 0;
            case 5:
                q60Var.f383704g = aVar2.g(intValue);
                return 0;
            case 6:
                q60Var.f383705h = aVar2.g(intValue);
                return 0;
            case 8:
                q60Var.f383706i = aVar2.g(intValue);
                return 0;
            case 9:
                q60Var.f383707m = aVar2.g(intValue);
                return 0;
            case 10:
                q60Var.f383708n = aVar2.g(intValue);
                return 0;
            case 11:
                q60Var.f383709o = aVar2.g(intValue);
                return 0;
        }
    }
}
