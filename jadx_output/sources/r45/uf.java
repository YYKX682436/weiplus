package r45;

/* loaded from: classes4.dex */
public class uf extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387312d;

    /* renamed from: e, reason: collision with root package name */
    public r45.tf f387313e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lf5 f387314f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf)) {
            return false;
        }
        r45.uf ufVar = (r45.uf) fVar;
        return n51.f.a(this.BaseRequest, ufVar.BaseRequest) && n51.f.a(this.f387312d, ufVar.f387312d) && n51.f.a(this.f387313e, ufVar.f387313e) && n51.f.a(this.f387314f, ufVar.f387314f);
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
            java.lang.String str = this.f387312d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.tf tfVar = this.f387313e;
            if (tfVar != null) {
                fVar.i(3, tfVar.computeSize());
                this.f387313e.writeFields(fVar);
            }
            r45.lf5 lf5Var = this.f387314f;
            if (lf5Var != null) {
                fVar.i(4, lf5Var.computeSize());
                this.f387314f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f387312d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.tf tfVar2 = this.f387313e;
            if (tfVar2 != null) {
                i18 += b36.f.i(3, tfVar2.computeSize());
            }
            r45.lf5 lf5Var2 = this.f387314f;
            return lf5Var2 != null ? i18 + b36.f.i(4, lf5Var2.computeSize()) : i18;
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
        r45.uf ufVar = (r45.uf) objArr[1];
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
                ufVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ufVar.f387312d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.tf tfVar3 = new r45.tf();
                if (bArr2 != null && bArr2.length > 0) {
                    tfVar3.parseFrom(bArr2);
                }
                ufVar.f387313e = tfVar3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.lf5 lf5Var3 = new r45.lf5();
            if (bArr3 != null && bArr3.length > 0) {
                lf5Var3.parseFrom(bArr3);
            }
            ufVar.f387314f = lf5Var3;
        }
        return 0;
    }
}
