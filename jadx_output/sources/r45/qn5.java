package r45;

/* loaded from: classes9.dex */
public class qn5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384109d;

    /* renamed from: e, reason: collision with root package name */
    public int f384110e;

    /* renamed from: f, reason: collision with root package name */
    public r45.i17 f384111f;

    /* renamed from: g, reason: collision with root package name */
    public int f384112g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qn5)) {
            return false;
        }
        r45.qn5 qn5Var = (r45.qn5) fVar;
        return n51.f.a(this.BaseResponse, qn5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384109d), java.lang.Integer.valueOf(qn5Var.f384109d)) && n51.f.a(java.lang.Integer.valueOf(this.f384110e), java.lang.Integer.valueOf(qn5Var.f384110e)) && n51.f.a(this.f384111f, qn5Var.f384111f) && n51.f.a(java.lang.Integer.valueOf(this.f384112g), java.lang.Integer.valueOf(qn5Var.f384112g));
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
            fVar.e(2, this.f384109d);
            fVar.e(3, this.f384110e);
            r45.i17 i17Var = this.f384111f;
            if (i17Var != null) {
                fVar.i(4, i17Var.computeSize());
                this.f384111f.writeFields(fVar);
            }
            fVar.e(5, this.f384112g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384109d) + b36.f.e(3, this.f384110e);
            r45.i17 i17Var2 = this.f384111f;
            if (i17Var2 != null) {
                i18 += b36.f.i(4, i17Var2.computeSize());
            }
            return i18 + b36.f.e(5, this.f384112g);
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
        r45.qn5 qn5Var = (r45.qn5) objArr[1];
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
                qn5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            qn5Var.f384109d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            qn5Var.f384110e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            qn5Var.f384112g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.i17 i17Var3 = new r45.i17();
            if (bArr2 != null && bArr2.length > 0) {
                i17Var3.parseFrom(bArr2);
            }
            qn5Var.f384111f = i17Var3;
        }
        return 0;
    }
}
