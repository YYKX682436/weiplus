package r45;

/* loaded from: classes9.dex */
public class o46 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f381906d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f381907e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f381908f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f381909g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o46)) {
            return false;
        }
        r45.o46 o46Var = (r45.o46) fVar;
        return n51.f.a(this.f381906d, o46Var.f381906d) && n51.f.a(this.f381907e, o46Var.f381907e) && n51.f.a(this.f381908f, o46Var.f381908f) && n51.f.a(this.f381909g, o46Var.f381909g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381909g;
        java.util.LinkedList linkedList2 = this.f381908f;
        java.util.LinkedList linkedList3 = this.f381907e;
        java.util.LinkedList linkedList4 = this.f381906d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList4);
            fVar.g(2, 1, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList4) + 0 + b36.f.g(2, 1, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 2, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        r45.o46 o46Var = (r45.o46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o46Var.f381906d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            o46Var.f381907e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            o46Var.f381908f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        o46Var.f381909g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}
