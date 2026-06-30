package r45;

/* loaded from: classes4.dex */
public class k44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f378363d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f378364e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k44)) {
            return false;
        }
        r45.k44 k44Var = (r45.k44) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f378363d), java.lang.Long.valueOf(k44Var.f378363d)) && n51.f.a(this.f378364e, k44Var.f378364e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378364e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f378363d);
            fVar.g(2, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f378363d) + 0 + b36.f.g(2, 1, linkedList);
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
        r45.k44 k44Var = (r45.k44) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k44Var.f378363d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        k44Var.f378364e.add(aVar2.k(intValue));
        return 0;
    }
}
