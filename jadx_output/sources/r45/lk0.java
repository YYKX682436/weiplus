package r45;

/* loaded from: classes9.dex */
public class lk0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.f35 f379541d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lk0)) {
            return false;
        }
        r45.lk0 lk0Var = (r45.lk0) fVar;
        return n51.f.a(this.BaseRequest, lk0Var.BaseRequest) && n51.f.a(this.f379541d, lk0Var.f379541d);
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
            r45.f35 f35Var = this.f379541d;
            if (f35Var != null) {
                fVar.i(2, f35Var.computeSize());
                this.f379541d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.f35 f35Var2 = this.f379541d;
            return f35Var2 != null ? i18 + b36.f.i(2, f35Var2.computeSize()) : i18;
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
        r45.lk0 lk0Var = (r45.lk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                lk0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.f35 f35Var3 = new r45.f35();
            if (bArr2 != null && bArr2.length > 0) {
                f35Var3.parseFrom(bArr2);
            }
            lk0Var.f379541d = f35Var3;
        }
        return 0;
    }
}
