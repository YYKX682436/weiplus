package r45;

/* loaded from: classes4.dex */
public class v93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388001d;

    /* renamed from: f, reason: collision with root package name */
    public int f388003f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f388002e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f388004g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v93)) {
            return false;
        }
        r45.v93 v93Var = (r45.v93) fVar;
        return n51.f.a(this.BaseRequest, v93Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f388001d), java.lang.Integer.valueOf(v93Var.f388001d)) && n51.f.a(this.f388002e, v93Var.f388002e) && n51.f.a(java.lang.Integer.valueOf(this.f388003f), java.lang.Integer.valueOf(v93Var.f388003f)) && n51.f.a(this.f388004g, v93Var.f388004g);
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
            fVar.e(2, this.f388001d);
            fVar.g(3, 8, this.f388002e);
            fVar.e(4, this.f388003f);
            fVar.g(5, 8, this.f388004g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f388001d) + b36.f.g(3, 8, this.f388002e) + b36.f.e(4, this.f388003f) + b36.f.g(5, 8, this.f388004g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388002e.clear();
            this.f388004g.clear();
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
        r45.v93 v93Var = (r45.v93) objArr[1];
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
                v93Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            v93Var.f388001d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.du5 du5Var = new r45.du5();
                if (bArr3 != null && bArr3.length > 0) {
                    du5Var.b(bArr3);
                }
                v93Var.f388002e.add(du5Var);
            }
            return 0;
        }
        if (intValue == 4) {
            v93Var.f388003f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.du5 du5Var2 = new r45.du5();
            if (bArr4 != null && bArr4.length > 0) {
                du5Var2.b(bArr4);
            }
            v93Var.f388004g.add(du5Var2);
        }
        return 0;
    }
}
