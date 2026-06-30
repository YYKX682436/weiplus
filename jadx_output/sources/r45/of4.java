package r45;

/* loaded from: classes4.dex */
public class of4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f382224d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f382225e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.of4)) {
            return false;
        }
        r45.of4 of4Var = (r45.of4) fVar;
        return n51.f.a(this.f382224d, of4Var.f382224d) && n51.f.a(java.lang.Integer.valueOf(this.f382225e), java.lang.Integer.valueOf(of4Var.f382225e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382224d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList);
            fVar.e(2, this.f382225e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 2, linkedList) + 0 + b36.f.e(2, this.f382225e);
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
        r45.of4 of4Var = (r45.of4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            of4Var.f382224d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        of4Var.f382225e = aVar2.g(intValue);
        return 0;
    }
}
