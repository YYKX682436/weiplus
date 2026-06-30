package r45;

/* loaded from: classes7.dex */
public class nc7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f381253d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.qp5 f381254e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nc7)) {
            return false;
        }
        r45.nc7 nc7Var = (r45.nc7) fVar;
        return n51.f.a(this.BaseRequest, nc7Var.BaseRequest) && n51.f.a(this.f381253d, nc7Var.f381253d) && n51.f.a(this.f381254e, nc7Var.f381254e);
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
            fVar.g(2, 8, this.f381253d);
            r45.qp5 qp5Var = this.f381254e;
            if (qp5Var != null) {
                fVar.i(3, qp5Var.computeSize());
                this.f381254e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, this.f381253d);
            r45.qp5 qp5Var2 = this.f381254e;
            return qp5Var2 != null ? i18 + b36.f.i(3, qp5Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381253d.clear();
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
        r45.nc7 nc7Var = (r45.nc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                nc7Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.uc7 uc7Var = new r45.uc7();
                if (bArr3 != null && bArr3.length > 0) {
                    uc7Var.parseFrom(bArr3);
                }
                nc7Var.f381253d.add(uc7Var);
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.qp5 qp5Var3 = new r45.qp5();
            if (bArr4 != null && bArr4.length > 0) {
                qp5Var3.parseFrom(bArr4);
            }
            nc7Var.f381254e = qp5Var3;
        }
        return 0;
    }
}
