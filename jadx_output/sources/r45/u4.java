package r45;

/* loaded from: classes8.dex */
public class u4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387002d;

    /* renamed from: e, reason: collision with root package name */
    public r45.k05 f387003e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u4)) {
            return false;
        }
        r45.u4 u4Var = (r45.u4) fVar;
        return n51.f.a(this.BaseResponse, u4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387002d), java.lang.Integer.valueOf(u4Var.f387002d)) && n51.f.a(this.f387003e, u4Var.f387003e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f387002d);
            r45.k05 k05Var = this.f387003e;
            if (k05Var != null) {
                fVar.i(3, k05Var.computeSize());
                this.f387003e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387002d);
            r45.k05 k05Var2 = this.f387003e;
            return k05Var2 != null ? i18 + b36.f.i(3, k05Var2.computeSize()) : i18;
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
        r45.u4 u4Var = (r45.u4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                u4Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            u4Var.f387002d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.k05 k05Var3 = new r45.k05();
            if (bArr2 != null && bArr2.length > 0) {
                k05Var3.parseFrom(bArr2);
            }
            u4Var.f387003e = k05Var3;
        }
        return 0;
    }
}
