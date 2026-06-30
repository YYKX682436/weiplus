package r45;

/* loaded from: classes4.dex */
public class jp3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378006d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f378007e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378008f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jp3)) {
            return false;
        }
        r45.jp3 jp3Var = (r45.jp3) fVar;
        return n51.f.a(this.BaseRequest, jp3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f378006d), java.lang.Integer.valueOf(jp3Var.f378006d)) && n51.f.a(this.f378007e, jp3Var.f378007e) && n51.f.a(this.f378008f, jp3Var.f378008f);
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
            fVar.e(2, this.f378006d);
            fVar.g(3, 8, this.f378007e);
            java.lang.String str = this.f378008f;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f378006d) + b36.f.g(3, 8, this.f378007e);
            java.lang.String str2 = this.f378008f;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f378007e.clear();
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
        r45.jp3 jp3Var = (r45.jp3) objArr[1];
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
                jp3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            jp3Var.f378006d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            jp3Var.f378008f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.cq6 cq6Var = new r45.cq6();
            if (bArr3 != null && bArr3.length > 0) {
                cq6Var.parseFrom(bArr3);
            }
            jp3Var.f378007e.add(cq6Var);
        }
        return 0;
    }
}
