package r45;

/* loaded from: classes9.dex */
public class sa3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f385597d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.wx3 f385598e;

    /* renamed from: f, reason: collision with root package name */
    public long f385599f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sa3)) {
            return false;
        }
        r45.sa3 sa3Var = (r45.sa3) fVar;
        return n51.f.a(this.BaseRequest, sa3Var.BaseRequest) && n51.f.a(this.f385597d, sa3Var.f385597d) && n51.f.a(this.f385598e, sa3Var.f385598e) && n51.f.a(java.lang.Long.valueOf(this.f385599f), java.lang.Long.valueOf(sa3Var.f385599f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385597d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.wx3 wx3Var = this.f385598e;
            if (wx3Var != null) {
                fVar.i(4, wx3Var.computeSize());
                this.f385598e.writeFields(fVar);
            }
            fVar.h(5, this.f385599f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            r45.wx3 wx3Var2 = this.f385598e;
            if (wx3Var2 != null) {
                i18 += b36.f.i(4, wx3Var2.computeSize());
            }
            return i18 + b36.f.h(5, this.f385599f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.sa3 sa3Var = (r45.sa3) objArr[1];
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
                sa3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.vx3 vx3Var = new r45.vx3();
                if (bArr3 != null && bArr3.length > 0) {
                    vx3Var.parseFrom(bArr3);
                }
                sa3Var.f385597d.add(vx3Var);
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            sa3Var.f385599f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.wx3 wx3Var3 = new r45.wx3();
            if (bArr4 != null && bArr4.length > 0) {
                wx3Var3.parseFrom(bArr4);
            }
            sa3Var.f385598e = wx3Var3;
        }
        return 0;
    }
}
