package r45;

/* loaded from: classes2.dex */
public class lb3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379292d;

    /* renamed from: e, reason: collision with root package name */
    public int f379293e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lb3)) {
            return false;
        }
        r45.lb3 lb3Var = (r45.lb3) fVar;
        return n51.f.a(this.BaseRequest, lb3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f379292d), java.lang.Integer.valueOf(lb3Var.f379292d)) && n51.f.a(java.lang.Integer.valueOf(this.f379293e), java.lang.Integer.valueOf(lb3Var.f379293e));
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
            fVar.e(2, this.f379292d);
            fVar.e(3, this.f379293e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f379292d) + b36.f.e(3, this.f379293e);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.lb3 lb3Var = (r45.lb3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                lb3Var.f379292d = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            lb3Var.f379293e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            lb3Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
