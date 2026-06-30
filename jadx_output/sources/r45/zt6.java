package r45;

/* loaded from: classes4.dex */
public class zt6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f392368d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f392369e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f392370f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zt6)) {
            return false;
        }
        r45.zt6 zt6Var = (r45.zt6) fVar;
        return n51.f.a(this.BaseRequest, zt6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f392368d), java.lang.Integer.valueOf(zt6Var.f392368d)) && n51.f.a(this.f392369e, zt6Var.f392369e) && n51.f.a(java.lang.Integer.valueOf(this.f392370f), java.lang.Integer.valueOf(zt6Var.f392370f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f392369e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f392368d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f392370f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f392368d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f392370f);
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
        r45.zt6 zt6Var = (r45.zt6) objArr[1];
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
                zt6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            zt6Var.f392368d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            zt6Var.f392370f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.cj0 cj0Var = new r45.cj0();
            if (bArr3 != null && bArr3.length > 0) {
                cj0Var.parseFrom(bArr3);
            }
            zt6Var.f392369e.add(cj0Var);
        }
        return 0;
    }
}
