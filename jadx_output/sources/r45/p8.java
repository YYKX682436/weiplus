package r45;

/* loaded from: classes4.dex */
public class p8 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382817d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f382818e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p8)) {
            return false;
        }
        r45.p8 p8Var = (r45.p8) fVar;
        return n51.f.a(this.BaseRequest, p8Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f382817d), java.lang.Integer.valueOf(p8Var.f382817d)) && n51.f.a(this.f382818e, p8Var.f382818e);
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
            fVar.e(2, this.f382817d);
            r45.cu5 cu5Var = this.f382818e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f382818e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f382817d);
            r45.cu5 cu5Var2 = this.f382818e;
            return cu5Var2 != null ? i18 + b36.f.i(3, cu5Var2.computeSize()) : i18;
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
        r45.p8 p8Var = (r45.p8) objArr[1];
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
                p8Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            p8Var.f382817d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            p8Var.f382818e = cu5Var3;
        }
        return 0;
    }
}
