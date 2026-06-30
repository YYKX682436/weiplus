package r45;

/* loaded from: classes2.dex */
public class fa3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374140d;

    /* renamed from: e, reason: collision with root package name */
    public int f374141e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374142f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa3)) {
            return false;
        }
        r45.fa3 fa3Var = (r45.fa3) fVar;
        return n51.f.a(this.BaseResponse, fa3Var.BaseResponse) && n51.f.a(this.f374140d, fa3Var.f374140d) && n51.f.a(java.lang.Integer.valueOf(this.f374141e), java.lang.Integer.valueOf(fa3Var.f374141e)) && n51.f.a(this.f374142f, fa3Var.f374142f);
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
            java.lang.String str = this.f374140d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f374141e);
            com.tencent.mm.protobuf.g gVar = this.f374142f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f374140d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f374141e);
            com.tencent.mm.protobuf.g gVar2 = this.f374142f;
            return gVar2 != null ? e17 + b36.f.b(4, gVar2) : e17;
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
        r45.fa3 fa3Var = (r45.fa3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                fa3Var.f374140d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                fa3Var.f374141e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            fa3Var.f374142f = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            fa3Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
