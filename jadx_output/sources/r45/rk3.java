package r45;

/* loaded from: classes8.dex */
public class rk3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384960d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f384961e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f384962f;

    /* renamed from: g, reason: collision with root package name */
    public int f384963g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rk3)) {
            return false;
        }
        r45.rk3 rk3Var = (r45.rk3) fVar;
        return n51.f.a(this.BaseRequest, rk3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384960d), java.lang.Integer.valueOf(rk3Var.f384960d)) && n51.f.a(this.f384961e, rk3Var.f384961e) && n51.f.a(java.lang.Integer.valueOf(this.f384962f), java.lang.Integer.valueOf(rk3Var.f384962f)) && n51.f.a(java.lang.Integer.valueOf(this.f384963g), java.lang.Integer.valueOf(rk3Var.f384963g));
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
            fVar.e(2, this.f384960d);
            fVar.g(3, 8, this.f384961e);
            fVar.e(4, this.f384962f);
            fVar.e(5, this.f384963g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f384960d) + b36.f.g(3, 8, this.f384961e) + b36.f.e(4, this.f384962f) + b36.f.e(5, this.f384963g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f384961e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.rk3 rk3Var = (r45.rk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                rk3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rk3Var.f384960d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                rk3Var.f384962f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            rk3Var.f384963g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.n35 n35Var = new r45.n35();
            if (bArr3 != null && bArr3.length > 0) {
                n35Var.parseFrom(bArr3);
            }
            rk3Var.f384961e.add(n35Var);
        }
        return 0;
    }
}
