package r45;

/* loaded from: classes4.dex */
public class qz extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384359d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j8 f384360e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qz)) {
            return false;
        }
        r45.qz qzVar = (r45.qz) fVar;
        return n51.f.a(this.BaseResponse, qzVar.BaseResponse) && n51.f.a(this.f384359d, qzVar.f384359d) && n51.f.a(this.f384360e, qzVar.f384360e);
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
            java.lang.String str = this.f384359d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.j8 j8Var = this.f384360e;
            if (j8Var != null) {
                fVar.i(3, j8Var.computeSize());
                this.f384360e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f384359d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.j8 j8Var2 = this.f384360e;
            return j8Var2 != null ? i18 + b36.f.i(3, j8Var2.computeSize()) : i18;
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
        r45.qz qzVar = (r45.qz) objArr[1];
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
                qzVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qzVar.f384359d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.j8 j8Var3 = new r45.j8();
            if (bArr2 != null && bArr2.length > 0) {
                j8Var3.parseFrom(bArr2);
            }
            qzVar.f384360e = j8Var3;
        }
        return 0;
    }
}
