package m53;

/* loaded from: classes8.dex */
public class f3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323676d;

    /* renamed from: e, reason: collision with root package name */
    public int f323677e;

    /* renamed from: f, reason: collision with root package name */
    public float f323678f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.f3)) {
            return false;
        }
        m53.f3 f3Var = (m53.f3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323676d), java.lang.Integer.valueOf(f3Var.f323676d)) && n51.f.a(java.lang.Integer.valueOf(this.f323677e), java.lang.Integer.valueOf(f3Var.f323677e)) && n51.f.a(java.lang.Float.valueOf(this.f323678f), java.lang.Float.valueOf(f3Var.f323678f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323676d);
            fVar.e(2, this.f323677e);
            fVar.d(3, this.f323678f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f323676d) + 0 + b36.f.e(2, this.f323677e) + b36.f.d(3, this.f323678f);
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
        m53.f3 f3Var = (m53.f3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f3Var.f323676d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            f3Var.f323677e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        f3Var.f323678f = aVar2.f(intValue);
        return 0;
    }
}
