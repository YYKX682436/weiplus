package r45;

/* loaded from: classes4.dex */
public class nr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f381610d = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.nr) && n51.f.a(this.f381610d, ((r45.nr) fVar).f381610d);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381610d;
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 2, linkedList) + 0;
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
        r45.nr nrVar = (r45.nr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        nrVar.f381610d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}
