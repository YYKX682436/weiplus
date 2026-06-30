package r45;

/* loaded from: classes8.dex */
public class az5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f370379d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rv3 f370380e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f370381f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.az5)) {
            return false;
        }
        r45.az5 az5Var = (r45.az5) fVar;
        return n51.f.a(this.BaseRequest, az5Var.BaseRequest) && n51.f.a(this.f370379d, az5Var.f370379d) && n51.f.a(this.f370380e, az5Var.f370380e) && n51.f.a(this.f370381f, az5Var.f370381f);
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
            r45.nv3 nv3Var = this.f370379d;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.computeSize());
                this.f370379d.writeFields(fVar);
            }
            r45.rv3 rv3Var = this.f370380e;
            if (rv3Var != null) {
                fVar.i(3, rv3Var.computeSize());
                this.f370380e.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f370381f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f370381f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.nv3 nv3Var2 = this.f370379d;
            if (nv3Var2 != null) {
                i18 += b36.f.i(2, nv3Var2.computeSize());
            }
            r45.rv3 rv3Var2 = this.f370380e;
            if (rv3Var2 != null) {
                i18 += b36.f.i(3, rv3Var2.computeSize());
            }
            r45.cu5 cu5Var2 = this.f370381f;
            return cu5Var2 != null ? i18 + b36.f.i(4, cu5Var2.computeSize()) : i18;
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
        r45.az5 az5Var = (r45.az5) objArr[1];
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
                az5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nv3 nv3Var3 = new r45.nv3();
                if (bArr2 != null && bArr2.length > 0) {
                    nv3Var3.parseFrom(bArr2);
                }
                az5Var.f370379d = nv3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.rv3 rv3Var3 = new r45.rv3();
                if (bArr3 != null && bArr3.length > 0) {
                    rv3Var3.parseFrom(bArr3);
                }
                az5Var.f370380e = rv3Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr4 != null && bArr4.length > 0) {
                cu5Var3.b(bArr4);
            }
            az5Var.f370381f = cu5Var3;
        }
        return 0;
    }
}
