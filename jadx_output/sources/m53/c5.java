package m53;

/* loaded from: classes2.dex */
public class c5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f323604d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f323605e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f323606f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.c5)) {
            return false;
        }
        m53.c5 c5Var = (m53.c5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f323604d), java.lang.Boolean.valueOf(c5Var.f323604d)) && n51.f.a(this.f323605e, c5Var.f323605e) && n51.f.a(java.lang.Integer.valueOf(this.f323606f), java.lang.Integer.valueOf(c5Var.f323606f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323605e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f323604d);
            fVar.g(3, 1, linkedList);
            fVar.e(4, this.f323606f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f323604d) + 0 + b36.f.g(3, 1, linkedList) + b36.f.e(4, this.f323606f);
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
        m53.c5 c5Var = (m53.c5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c5Var.f323604d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            c5Var.f323605e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c5Var.f323606f = aVar2.g(intValue);
        return 0;
    }
}
