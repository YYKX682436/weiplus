package r45;

/* loaded from: classes4.dex */
public class v36 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f387853d;

    /* renamed from: e, reason: collision with root package name */
    public int f387854e;

    /* renamed from: f, reason: collision with root package name */
    public int f387855f;

    /* renamed from: g, reason: collision with root package name */
    public int f387856g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v36)) {
            return false;
        }
        r45.v36 v36Var = (r45.v36) fVar;
        return n51.f.a(this.BaseResponse, v36Var.BaseResponse) && n51.f.a(this.f387853d, v36Var.f387853d) && n51.f.a(java.lang.Integer.valueOf(this.f387854e), java.lang.Integer.valueOf(v36Var.f387854e)) && n51.f.a(java.lang.Integer.valueOf(this.f387855f), java.lang.Integer.valueOf(v36Var.f387855f)) && n51.f.a(java.lang.Integer.valueOf(this.f387856g), java.lang.Integer.valueOf(v36Var.f387856g));
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
            r45.cu5 cu5Var = this.f387853d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f387853d.writeFields(fVar);
            }
            fVar.e(3, this.f387854e);
            fVar.e(4, this.f387855f);
            fVar.e(5, this.f387856g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f387853d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f387854e) + b36.f.e(4, this.f387855f) + b36.f.e(5, this.f387856g);
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
        r45.v36 v36Var = (r45.v36) objArr[1];
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
                v36Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                v36Var.f387854e = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                v36Var.f387855f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            v36Var.f387856g = aVar2.g(intValue);
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
            v36Var.f387853d = cu5Var3;
        }
        return 0;
    }
}
