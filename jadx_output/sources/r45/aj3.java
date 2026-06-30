package r45;

/* loaded from: classes4.dex */
public class aj3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.zp4 f370050d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f370051e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aj3)) {
            return false;
        }
        r45.aj3 aj3Var = (r45.aj3) fVar;
        return n51.f.a(this.BaseRequest, aj3Var.BaseRequest) && n51.f.a(this.f370050d, aj3Var.f370050d) && n51.f.a(java.lang.Boolean.valueOf(this.f370051e), java.lang.Boolean.valueOf(aj3Var.f370051e));
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
            r45.zp4 zp4Var = this.f370050d;
            if (zp4Var != null) {
                fVar.i(2, zp4Var.computeSize());
                this.f370050d.writeFields(fVar);
            }
            fVar.a(3, this.f370051e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.zp4 zp4Var2 = this.f370050d;
            if (zp4Var2 != null) {
                i18 += b36.f.i(2, zp4Var2.computeSize());
            }
            return i18 + b36.f.a(3, this.f370051e);
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
        r45.aj3 aj3Var = (r45.aj3) objArr[1];
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
                aj3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            aj3Var.f370051e = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.zp4 zp4Var3 = new r45.zp4();
            if (bArr2 != null && bArr2.length > 0) {
                zp4Var3.parseFrom(bArr2);
            }
            aj3Var.f370050d = zp4Var3;
        }
        return 0;
    }
}
