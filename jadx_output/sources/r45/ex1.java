package r45;

/* loaded from: classes8.dex */
public class ex1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.rx1 f373779d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sx1 f373780e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ex1)) {
            return false;
        }
        r45.ex1 ex1Var = (r45.ex1) fVar;
        return n51.f.a(this.BaseResponse, ex1Var.BaseResponse) && n51.f.a(this.f373779d, ex1Var.f373779d) && n51.f.a(this.f373780e, ex1Var.f373780e);
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
            r45.rx1 rx1Var = this.f373779d;
            if (rx1Var != null) {
                fVar.i(2, rx1Var.computeSize());
                this.f373779d.writeFields(fVar);
            }
            r45.sx1 sx1Var = this.f373780e;
            if (sx1Var != null) {
                fVar.i(3, sx1Var.computeSize());
                this.f373780e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.rx1 rx1Var2 = this.f373779d;
            if (rx1Var2 != null) {
                i18 += b36.f.i(2, rx1Var2.computeSize());
            }
            r45.sx1 sx1Var2 = this.f373780e;
            return sx1Var2 != null ? i18 + b36.f.i(3, sx1Var2.computeSize()) : i18;
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
        r45.ex1 ex1Var = (r45.ex1) objArr[1];
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
                ex1Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rx1 rx1Var3 = new r45.rx1();
                if (bArr2 != null && bArr2.length > 0) {
                    rx1Var3.parseFrom(bArr2);
                }
                ex1Var.f373779d = rx1Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.sx1 sx1Var3 = new r45.sx1();
            if (bArr3 != null && bArr3.length > 0) {
                sx1Var3.parseFrom(bArr3);
            }
            ex1Var.f373780e = sx1Var3;
        }
        return 0;
    }
}
