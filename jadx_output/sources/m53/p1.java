package m53;

/* loaded from: classes8.dex */
public class p1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323959d;

    /* renamed from: e, reason: collision with root package name */
    public long f323960e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.p1)) {
            return false;
        }
        m53.p1 p1Var = (m53.p1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323959d), java.lang.Integer.valueOf(p1Var.f323959d)) && n51.f.a(java.lang.Long.valueOf(this.f323960e), java.lang.Long.valueOf(p1Var.f323960e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323959d);
            fVar.h(2, this.f323960e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f323959d) + 0 + b36.f.h(2, this.f323960e);
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
        m53.p1 p1Var = (m53.p1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p1Var.f323959d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        p1Var.f323960e = aVar2.i(intValue);
        return 0;
    }
}
