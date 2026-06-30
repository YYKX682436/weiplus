package r45;

/* loaded from: classes2.dex */
public class oh4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f382269d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f382270e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oh4)) {
            return false;
        }
        r45.oh4 oh4Var = (r45.oh4) fVar;
        return n51.f.a(this.BaseRequest, oh4Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f382269d), java.lang.Long.valueOf(oh4Var.f382269d)) && n51.f.a(this.f382270e, oh4Var.f382270e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382270e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.h(2, this.f382269d);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f382269d) + b36.f.g(3, 8, linkedList);
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
        r45.oh4 oh4Var = (r45.oh4) objArr[1];
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
                oh4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            oh4Var.f382269d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.lh4 lh4Var = new r45.lh4();
            if (bArr3 != null && bArr3.length > 0) {
                lh4Var.parseFrom(bArr3);
            }
            oh4Var.f382270e.add(lh4Var);
        }
        return 0;
    }
}
