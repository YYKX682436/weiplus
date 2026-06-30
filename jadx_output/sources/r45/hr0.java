package r45;

/* loaded from: classes2.dex */
public class hr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f376397d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f376398e = 1;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hr0)) {
            return false;
        }
        r45.hr0 hr0Var = (r45.hr0) fVar;
        return n51.f.a(this.f376397d, hr0Var.f376397d) && n51.f.a(java.lang.Integer.valueOf(this.f376398e), java.lang.Integer.valueOf(hr0Var.f376398e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376397d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList);
            fVar.e(2, this.f376398e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList) + 0 + b36.f.e(2, this.f376398e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.hr0 hr0Var = (r45.hr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hr0Var.f376397d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        hr0Var.f376398e = aVar2.g(intValue);
        return 0;
    }
}
