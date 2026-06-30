package r45;

/* loaded from: classes15.dex */
public class cw4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371862d;

    /* renamed from: e, reason: collision with root package name */
    public int f371863e;

    /* renamed from: f, reason: collision with root package name */
    public int f371864f;

    /* renamed from: g, reason: collision with root package name */
    public int f371865g;

    /* renamed from: h, reason: collision with root package name */
    public int f371866h;

    /* renamed from: i, reason: collision with root package name */
    public int f371867i;

    /* renamed from: m, reason: collision with root package name */
    public int f371868m;

    /* renamed from: n, reason: collision with root package name */
    public int f371869n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cw4)) {
            return false;
        }
        r45.cw4 cw4Var = (r45.cw4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371862d), java.lang.Integer.valueOf(cw4Var.f371862d)) && n51.f.a(java.lang.Integer.valueOf(this.f371863e), java.lang.Integer.valueOf(cw4Var.f371863e)) && n51.f.a(java.lang.Integer.valueOf(this.f371864f), java.lang.Integer.valueOf(cw4Var.f371864f)) && n51.f.a(java.lang.Integer.valueOf(this.f371865g), java.lang.Integer.valueOf(cw4Var.f371865g)) && n51.f.a(java.lang.Integer.valueOf(this.f371866h), java.lang.Integer.valueOf(cw4Var.f371866h)) && n51.f.a(java.lang.Integer.valueOf(this.f371867i), java.lang.Integer.valueOf(cw4Var.f371867i)) && n51.f.a(java.lang.Integer.valueOf(this.f371868m), java.lang.Integer.valueOf(cw4Var.f371868m)) && n51.f.a(java.lang.Integer.valueOf(this.f371869n), java.lang.Integer.valueOf(cw4Var.f371869n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371862d);
            fVar.e(2, this.f371863e);
            fVar.e(3, this.f371864f);
            fVar.e(4, this.f371865g);
            fVar.e(5, this.f371866h);
            fVar.e(6, this.f371867i);
            fVar.e(7, this.f371868m);
            fVar.e(8, this.f371869n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f371862d) + 0 + b36.f.e(2, this.f371863e) + b36.f.e(3, this.f371864f) + b36.f.e(4, this.f371865g) + b36.f.e(5, this.f371866h) + b36.f.e(6, this.f371867i) + b36.f.e(7, this.f371868m) + b36.f.e(8, this.f371869n);
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
        r45.cw4 cw4Var = (r45.cw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cw4Var.f371862d = aVar2.g(intValue);
                return 0;
            case 2:
                cw4Var.f371863e = aVar2.g(intValue);
                return 0;
            case 3:
                cw4Var.f371864f = aVar2.g(intValue);
                return 0;
            case 4:
                cw4Var.f371865g = aVar2.g(intValue);
                return 0;
            case 5:
                cw4Var.f371866h = aVar2.g(intValue);
                return 0;
            case 6:
                cw4Var.f371867i = aVar2.g(intValue);
                return 0;
            case 7:
                cw4Var.f371868m = aVar2.g(intValue);
                return 0;
            case 8:
                cw4Var.f371869n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
