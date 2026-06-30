package m53;

/* loaded from: classes2.dex */
public class o1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.k3 f323936d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f323937e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.o1)) {
            return false;
        }
        m53.o1 o1Var = (m53.o1) fVar;
        return n51.f.a(this.f323936d, o1Var.f323936d) && n51.f.a(this.f323937e, o1Var.f323937e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323937e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.k3 k3Var = this.f323936d;
            if (k3Var != null) {
                fVar.i(1, k3Var.computeSize());
                this.f323936d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            m53.k3 k3Var2 = this.f323936d;
            return (k3Var2 != null ? 0 + b36.f.i(1, k3Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
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
        m53.o1 o1Var = (m53.o1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.k3 k3Var3 = new m53.k3();
                if (bArr2 != null && bArr2.length > 0) {
                    k3Var3.parseFrom(bArr2);
                }
                o1Var.f323936d = k3Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            m53.n0 n0Var = new m53.n0();
            if (bArr3 != null && bArr3.length > 0) {
                n0Var.parseFrom(bArr3);
            }
            o1Var.f323937e.add(n0Var);
        }
        return 0;
    }
}
