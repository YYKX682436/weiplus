package r45;

/* loaded from: classes4.dex */
public class cm3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f371663d;

    /* renamed from: e, reason: collision with root package name */
    public int f371664e;

    /* renamed from: f, reason: collision with root package name */
    public int f371665f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f371666g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cm3)) {
            return false;
        }
        r45.cm3 cm3Var = (r45.cm3) fVar;
        return n51.f.a(this.BaseRequest, cm3Var.BaseRequest) && n51.f.a(this.f371663d, cm3Var.f371663d) && n51.f.a(java.lang.Integer.valueOf(this.f371664e), java.lang.Integer.valueOf(cm3Var.f371664e)) && n51.f.a(java.lang.Integer.valueOf(this.f371665f), java.lang.Integer.valueOf(cm3Var.f371665f)) && n51.f.a(this.f371666g, cm3Var.f371666g);
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
            r45.du5 du5Var = this.f371663d;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f371663d.writeFields(fVar);
            }
            fVar.e(3, this.f371664e);
            fVar.e(4, this.f371665f);
            r45.du5 du5Var2 = this.f371666g;
            if (du5Var2 != null) {
                fVar.i(5, du5Var2.computeSize());
                this.f371666g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.du5 du5Var3 = this.f371663d;
            if (du5Var3 != null) {
                i18 += b36.f.i(2, du5Var3.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f371664e) + b36.f.e(4, this.f371665f);
            r45.du5 du5Var4 = this.f371666g;
            return du5Var4 != null ? e17 + b36.f.i(5, du5Var4.computeSize()) : e17;
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
        r45.cm3 cm3Var = (r45.cm3) objArr[1];
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
                cm3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.du5 du5Var5 = new r45.du5();
                if (bArr2 != null && bArr2.length > 0) {
                    du5Var5.b(bArr2);
                }
                cm3Var.f371663d = du5Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            cm3Var.f371664e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            cm3Var.f371665f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.du5 du5Var6 = new r45.du5();
            if (bArr3 != null && bArr3.length > 0) {
                du5Var6.b(bArr3);
            }
            cm3Var.f371666g = du5Var6;
        }
        return 0;
    }
}
