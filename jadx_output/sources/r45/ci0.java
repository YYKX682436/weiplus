package r45;

/* loaded from: classes10.dex */
public class ci0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371565d;

    /* renamed from: e, reason: collision with root package name */
    public int f371566e;

    /* renamed from: f, reason: collision with root package name */
    public int f371567f;

    /* renamed from: g, reason: collision with root package name */
    public int f371568g;

    /* renamed from: h, reason: collision with root package name */
    public int f371569h;

    /* renamed from: i, reason: collision with root package name */
    public float f371570i;

    /* renamed from: m, reason: collision with root package name */
    public int f371571m;

    /* renamed from: n, reason: collision with root package name */
    public int f371572n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ci0)) {
            return false;
        }
        r45.ci0 ci0Var = (r45.ci0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371565d), java.lang.Integer.valueOf(ci0Var.f371565d)) && n51.f.a(java.lang.Integer.valueOf(this.f371566e), java.lang.Integer.valueOf(ci0Var.f371566e)) && n51.f.a(java.lang.Integer.valueOf(this.f371567f), java.lang.Integer.valueOf(ci0Var.f371567f)) && n51.f.a(java.lang.Integer.valueOf(this.f371568g), java.lang.Integer.valueOf(ci0Var.f371568g)) && n51.f.a(java.lang.Integer.valueOf(this.f371569h), java.lang.Integer.valueOf(ci0Var.f371569h)) && n51.f.a(java.lang.Float.valueOf(this.f371570i), java.lang.Float.valueOf(ci0Var.f371570i)) && n51.f.a(java.lang.Integer.valueOf(this.f371571m), java.lang.Integer.valueOf(ci0Var.f371571m)) && n51.f.a(java.lang.Integer.valueOf(this.f371572n), java.lang.Integer.valueOf(ci0Var.f371572n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371565d);
            fVar.e(2, this.f371566e);
            fVar.e(3, this.f371567f);
            fVar.e(4, this.f371568g);
            fVar.e(5, this.f371569h);
            fVar.d(6, this.f371570i);
            fVar.e(7, this.f371571m);
            fVar.e(8, this.f371572n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f371565d) + 0 + b36.f.e(2, this.f371566e) + b36.f.e(3, this.f371567f) + b36.f.e(4, this.f371568g) + b36.f.e(5, this.f371569h) + b36.f.d(6, this.f371570i) + b36.f.e(7, this.f371571m) + b36.f.e(8, this.f371572n);
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
        r45.ci0 ci0Var = (r45.ci0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ci0Var.f371565d = aVar2.g(intValue);
                return 0;
            case 2:
                ci0Var.f371566e = aVar2.g(intValue);
                return 0;
            case 3:
                ci0Var.f371567f = aVar2.g(intValue);
                return 0;
            case 4:
                ci0Var.f371568g = aVar2.g(intValue);
                return 0;
            case 5:
                ci0Var.f371569h = aVar2.g(intValue);
                return 0;
            case 6:
                ci0Var.f371570i = aVar2.f(intValue);
                return 0;
            case 7:
                ci0Var.f371571m = aVar2.g(intValue);
                return 0;
            case 8:
                ci0Var.f371572n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
