package r45;

/* loaded from: classes4.dex */
public class rq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f385095d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385096e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f385097f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rq0)) {
            return false;
        }
        r45.rq0 rq0Var = (r45.rq0) fVar;
        return n51.f.a(this.f385095d, rq0Var.f385095d) && n51.f.a(this.f385096e, rq0Var.f385096e) && n51.f.a(this.f385097f, rq0Var.f385097f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385097f;
        java.util.LinkedList linkedList2 = this.f385096e;
        java.util.LinkedList linkedList3 = this.f385095d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList3);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList3) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 2, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.rq0 rq0Var = (r45.rq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rq0Var.f385095d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            rq0Var.f385096e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        rq0Var.f385097f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}
