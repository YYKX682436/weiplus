package r45;

/* loaded from: classes8.dex */
public class qc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ji5 f383834d;

    /* renamed from: e, reason: collision with root package name */
    public int f383835e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qc3)) {
            return false;
        }
        r45.qc3 qc3Var = (r45.qc3) fVar;
        return n51.f.a(this.BaseResponse, qc3Var.BaseResponse) && n51.f.a(this.f383834d, qc3Var.f383834d) && n51.f.a(java.lang.Integer.valueOf(this.f383835e), java.lang.Integer.valueOf(qc3Var.f383835e));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.ji5 ji5Var = this.f383834d;
            if (ji5Var != null) {
                fVar.i(2, ji5Var.computeSize());
                this.f383834d.writeFields(fVar);
            }
            fVar.e(3, this.f383835e);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.ji5 ji5Var2 = this.f383834d;
            if (ji5Var2 != null) {
                i18 += b36.f.i(2, ji5Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f383835e);
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
        r45.qc3 qc3Var = (r45.qc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                qc3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            qc3Var.f383835e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ji5 ji5Var3 = new r45.ji5();
            if (bArr2 != null && bArr2.length > 0) {
                ji5Var3.parseFrom(bArr2);
            }
            qc3Var.f383834d = ji5Var3;
        }
        return 0;
    }
}
