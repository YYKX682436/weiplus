package r45;

/* loaded from: classes2.dex */
public class fg2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f374306d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374307e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg2)) {
            return false;
        }
        r45.fg2 fg2Var = (r45.fg2) fVar;
        return n51.f.a(this.BaseResponse, fg2Var.BaseResponse) && n51.f.a(this.f374306d, fg2Var.f374306d) && n51.f.a(this.f374307e, fg2Var.f374307e);
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
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f374306d;
            if (finderObject != null) {
                fVar.i(2, finderObject.computeSize());
                this.f374306d.writeFields(fVar);
            }
            java.lang.String str = this.f374307e;
            if (str != null) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f374306d;
            if (finderObject2 != null) {
                i18 += b36.f.i(2, finderObject2.computeSize());
            }
            java.lang.String str2 = this.f374307e;
            return str2 != null ? i18 + b36.f.j(3, str2) : i18;
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
        r45.fg2 fg2Var = (r45.fg2) objArr[1];
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
                fg2Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            fg2Var.f374307e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = new com.tencent.mm.protocal.protobuf.FinderObject();
            if (bArr2 != null && bArr2.length > 0) {
                finderObject3.parseFrom(bArr2);
            }
            fg2Var.f374306d = finderObject3;
        }
        return 0;
    }
}
