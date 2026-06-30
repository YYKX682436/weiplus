package r45;

/* loaded from: classes4.dex */
public class mf0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f380438d;

    /* renamed from: e, reason: collision with root package name */
    public int f380439e;

    /* renamed from: f, reason: collision with root package name */
    public int f380440f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mf0)) {
            return false;
        }
        r45.mf0 mf0Var = (r45.mf0) fVar;
        return n51.f.a(this.BaseResponse, mf0Var.BaseResponse) && n51.f.a(this.f380438d, mf0Var.f380438d) && n51.f.a(java.lang.Integer.valueOf(this.f380439e), java.lang.Integer.valueOf(mf0Var.f380439e)) && n51.f.a(java.lang.Integer.valueOf(this.f380440f), java.lang.Integer.valueOf(mf0Var.f380440f));
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
            r45.cu5 cu5Var = this.f380438d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f380438d.writeFields(fVar);
            }
            fVar.e(3, this.f380439e);
            fVar.e(4, this.f380440f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f380438d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f380439e) + b36.f.e(4, this.f380440f);
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
        r45.mf0 mf0Var = (r45.mf0) objArr[1];
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
                mf0Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                mf0Var.f380439e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            mf0Var.f380440f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            mf0Var.f380438d = cu5Var3;
        }
        return 0;
    }
}
