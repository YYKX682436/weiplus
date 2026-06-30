package r45;

/* loaded from: classes4.dex */
public class cz5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371947d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f371948e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cz5)) {
            return false;
        }
        r45.cz5 cz5Var = (r45.cz5) fVar;
        return n51.f.a(this.BaseRequest, cz5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f371947d), java.lang.Integer.valueOf(cz5Var.f371947d)) && n51.f.a(this.f371948e, cz5Var.f371948e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f371947d);
            fVar.k(3, 2, this.f371948e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f371947d) + b36.f.k(3, 2, this.f371948e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371948e.clear();
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
        r45.cz5 cz5Var = (r45.cz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                cz5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            cz5Var.f371947d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        byte[] bArr3 = aVar2.d(intValue).f192156a;
        d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
        kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
        e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (aVar3.f247596c < aVar3.f247595b) {
            linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
        }
        cz5Var.f371948e = linkedList;
        return 0;
    }
}
