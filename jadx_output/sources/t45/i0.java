package t45;

/* loaded from: classes4.dex */
public class i0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public t45.d1 f415592d;

    /* renamed from: e, reason: collision with root package name */
    public int f415593e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.i0)) {
            return false;
        }
        t45.i0 i0Var = (t45.i0) fVar;
        return n51.f.a(this.BaseRequest, i0Var.BaseRequest) && n51.f.a(this.f415592d, i0Var.f415592d) && n51.f.a(java.lang.Integer.valueOf(this.f415593e), java.lang.Integer.valueOf(i0Var.f415593e));
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
            t45.d1 d1Var = this.f415592d;
            if (d1Var != null) {
                fVar.i(2, d1Var.computeSize());
                this.f415592d.writeFields(fVar);
            }
            fVar.e(3, this.f415593e);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            t45.d1 d1Var2 = this.f415592d;
            if (d1Var2 != null) {
                i18 += b36.f.i(2, d1Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f415593e);
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
        t45.i0 i0Var = (t45.i0) objArr[1];
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
                i0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            i0Var.f415593e = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            t45.d1 d1Var3 = new t45.d1();
            if (bArr2 != null && bArr2.length > 0) {
                d1Var3.parseFrom(bArr2);
            }
            i0Var.f415592d = d1Var3;
        }
        return 0;
    }
}
