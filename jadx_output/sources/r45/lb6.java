package r45;

/* loaded from: classes2.dex */
public class lb6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f379294d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lb6)) {
            return false;
        }
        r45.lb6 lb6Var = (r45.lb6) fVar;
        return n51.f.a(this.BaseResponse, lb6Var.BaseResponse) && n51.f.a(this.f379294d, lb6Var.f379294d);
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
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f379294d;
            if (snsObject != null) {
                fVar.i(2, snsObject.computeSize());
                this.f379294d.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f379294d;
            return snsObject2 != null ? i18 + b36.f.i(2, snsObject2.computeSize()) : i18;
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
        r45.lb6 lb6Var = (r45.lb6) objArr[1];
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
                lb6Var.BaseResponse = ieVar3;
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
            com.tencent.mm.protocal.protobuf.SnsObject snsObject3 = new com.tencent.mm.protocal.protobuf.SnsObject();
            if (bArr2 != null && bArr2.length > 0) {
                snsObject3.parseFrom(bArr2);
            }
            lb6Var.f379294d = snsObject3;
        }
        return 0;
    }
}
