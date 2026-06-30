package m53;

/* loaded from: classes4.dex */
public class t4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public float f324075d;

    /* renamed from: e, reason: collision with root package name */
    public int f324076e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.t4)) {
            return false;
        }
        m53.t4 t4Var = (m53.t4) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f324075d), java.lang.Float.valueOf(t4Var.f324075d)) && n51.f.a(java.lang.Integer.valueOf(this.f324076e), java.lang.Integer.valueOf(t4Var.f324076e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f324075d);
            fVar.e(2, this.f324076e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f324075d) + 0 + b36.f.e(2, this.f324076e);
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
        m53.t4 t4Var = (m53.t4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t4Var.f324075d = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        t4Var.f324076e = aVar2.g(intValue);
        return 0;
    }
}
