package r45;

/* loaded from: classes4.dex */
public class he0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376083d;

    /* renamed from: e, reason: collision with root package name */
    public int f376084e;

    /* renamed from: f, reason: collision with root package name */
    public int f376085f;

    /* renamed from: g, reason: collision with root package name */
    public int f376086g;

    /* renamed from: h, reason: collision with root package name */
    public int f376087h;

    /* renamed from: i, reason: collision with root package name */
    public int f376088i;

    /* renamed from: m, reason: collision with root package name */
    public int f376089m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.he0)) {
            return false;
        }
        r45.he0 he0Var = (r45.he0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376083d), java.lang.Integer.valueOf(he0Var.f376083d)) && n51.f.a(java.lang.Integer.valueOf(this.f376084e), java.lang.Integer.valueOf(he0Var.f376084e)) && n51.f.a(java.lang.Integer.valueOf(this.f376085f), java.lang.Integer.valueOf(he0Var.f376085f)) && n51.f.a(java.lang.Integer.valueOf(this.f376086g), java.lang.Integer.valueOf(he0Var.f376086g)) && n51.f.a(java.lang.Integer.valueOf(this.f376087h), java.lang.Integer.valueOf(he0Var.f376087h)) && n51.f.a(java.lang.Integer.valueOf(this.f376088i), java.lang.Integer.valueOf(he0Var.f376088i)) && n51.f.a(java.lang.Integer.valueOf(this.f376089m), java.lang.Integer.valueOf(he0Var.f376089m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376083d);
            fVar.e(2, this.f376084e);
            fVar.e(3, this.f376085f);
            fVar.e(4, this.f376086g);
            fVar.e(5, this.f376087h);
            fVar.e(6, this.f376088i);
            fVar.e(7, this.f376089m);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f376083d) + 0 + b36.f.e(2, this.f376084e) + b36.f.e(3, this.f376085f) + b36.f.e(4, this.f376086g) + b36.f.e(5, this.f376087h) + b36.f.e(6, this.f376088i) + b36.f.e(7, this.f376089m);
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
        r45.he0 he0Var = (r45.he0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                he0Var.f376083d = aVar2.g(intValue);
                return 0;
            case 2:
                he0Var.f376084e = aVar2.g(intValue);
                return 0;
            case 3:
                he0Var.f376085f = aVar2.g(intValue);
                return 0;
            case 4:
                he0Var.f376086g = aVar2.g(intValue);
                return 0;
            case 5:
                he0Var.f376087h = aVar2.g(intValue);
                return 0;
            case 6:
                he0Var.f376088i = aVar2.g(intValue);
                return 0;
            case 7:
                he0Var.f376089m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
