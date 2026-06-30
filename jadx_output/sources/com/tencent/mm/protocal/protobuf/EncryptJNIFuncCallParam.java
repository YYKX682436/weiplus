package com.tencent.mm.protocal.protobuf;

/* loaded from: classes4.dex */
public class EncryptJNIFuncCallParam extends com.tencent.mm.protobuf.f {
    public r45.p80 ContactInfoUIScreenShotInfoParam;
    public int FuncID;
    public r45.n45 PaiedOrderUIScreenShotInfoParam;

    public static final com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam create() {
        return new com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam encryptJNIFuncCallParam = (com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.FuncID), java.lang.Integer.valueOf(encryptJNIFuncCallParam.FuncID)) && n51.f.a(this.PaiedOrderUIScreenShotInfoParam, encryptJNIFuncCallParam.PaiedOrderUIScreenShotInfoParam) && n51.f.a(this.ContactInfoUIScreenShotInfoParam, encryptJNIFuncCallParam.ContactInfoUIScreenShotInfoParam);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.FuncID);
            r45.n45 n45Var = this.PaiedOrderUIScreenShotInfoParam;
            if (n45Var != null) {
                fVar.i(2, n45Var.computeSize());
                this.PaiedOrderUIScreenShotInfoParam.writeFields(fVar);
            }
            r45.p80 p80Var = this.ContactInfoUIScreenShotInfoParam;
            if (p80Var != null) {
                fVar.i(3, p80Var.computeSize());
                this.ContactInfoUIScreenShotInfoParam.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.FuncID) + 0;
            r45.n45 n45Var2 = this.PaiedOrderUIScreenShotInfoParam;
            if (n45Var2 != null) {
                e17 += b36.f.i(2, n45Var2.computeSize());
            }
            r45.p80 p80Var2 = this.ContactInfoUIScreenShotInfoParam;
            return p80Var2 != null ? e17 + b36.f.i(3, p80Var2.computeSize()) : e17;
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
        com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam encryptJNIFuncCallParam = (com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            encryptJNIFuncCallParam.FuncID = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.n45 n45Var3 = new r45.n45();
                if (bArr != null && bArr.length > 0) {
                    n45Var3.parseFrom(bArr);
                }
                encryptJNIFuncCallParam.PaiedOrderUIScreenShotInfoParam = n45Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.p80 p80Var3 = new r45.p80();
            if (bArr2 != null && bArr2.length > 0) {
                p80Var3.parseFrom(bArr2);
            }
            encryptJNIFuncCallParam.ContactInfoUIScreenShotInfoParam = p80Var3;
        }
        return 0;
    }

    public com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam setContactInfoUIScreenShotInfoParam(r45.p80 p80Var) {
        this.ContactInfoUIScreenShotInfoParam = p80Var;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam setFuncID(int i17) {
        this.FuncID = i17;
        return this;
    }

    public com.tencent.mm.protocal.protobuf.EncryptJNIFuncCallParam setPaiedOrderUIScreenShotInfoParam(r45.n45 n45Var) {
        this.PaiedOrderUIScreenShotInfoParam = n45Var;
        return this;
    }
}
