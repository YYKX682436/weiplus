package r45;

/* loaded from: classes2.dex */
public class tb0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386270d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f386271e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tb0)) {
            return false;
        }
        r45.tb0 tb0Var = (r45.tb0) fVar;
        return n51.f.a(this.BaseRequest, tb0Var.BaseRequest) && n51.f.a(this.f386270d, tb0Var.f386270d) && n51.f.a(this.f386271e, tb0Var.f386271e);
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
            java.lang.String str = this.f386270d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, this.f386271e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f386270d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 1, this.f386271e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386271e.clear();
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
        r45.tb0 tb0Var = (r45.tb0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                tb0Var.f386270d = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            tb0Var.f386271e.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr2 = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr2 != null && bArr2.length > 0) {
                heVar3.parseFrom(bArr2);
            }
            tb0Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
