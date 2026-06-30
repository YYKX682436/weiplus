package t45;

/* loaded from: classes4.dex */
public class x0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f415655d;

    /* renamed from: e, reason: collision with root package name */
    public int f415656e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.x0)) {
            return false;
        }
        t45.x0 x0Var = (t45.x0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f415655d), java.lang.Integer.valueOf(x0Var.f415655d)) && n51.f.a(java.lang.Integer.valueOf(this.f415656e), java.lang.Integer.valueOf(x0Var.f415656e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f415655d);
            fVar.e(2, this.f415656e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f415655d) + 0 + b36.f.e(2, this.f415656e);
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
        t45.x0 x0Var = (t45.x0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x0Var.f415655d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        x0Var.f415656e = aVar2.g(intValue);
        return 0;
    }
}
