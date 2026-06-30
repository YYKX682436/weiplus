package r45;

/* loaded from: classes7.dex */
public class io3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.rz6 f377213d;

    /* renamed from: e, reason: collision with root package name */
    public int f377214e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k56 f377215f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.io3)) {
            return false;
        }
        r45.io3 io3Var = (r45.io3) fVar;
        return n51.f.a(this.BaseResponse, io3Var.BaseResponse) && n51.f.a(this.f377213d, io3Var.f377213d) && n51.f.a(java.lang.Integer.valueOf(this.f377214e), java.lang.Integer.valueOf(io3Var.f377214e)) && n51.f.a(this.f377215f, io3Var.f377215f);
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
            r45.rz6 rz6Var = this.f377213d;
            if (rz6Var != null) {
                fVar.i(2, rz6Var.computeSize());
                this.f377213d.writeFields(fVar);
            }
            fVar.e(3, this.f377214e);
            r45.k56 k56Var = this.f377215f;
            if (k56Var != null) {
                fVar.i(4, k56Var.computeSize());
                this.f377215f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.rz6 rz6Var2 = this.f377213d;
            if (rz6Var2 != null) {
                i18 += b36.f.i(2, rz6Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f377214e);
            r45.k56 k56Var2 = this.f377215f;
            return k56Var2 != null ? e17 + b36.f.i(4, k56Var2.computeSize()) : e17;
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
        r45.io3 io3Var = (r45.io3) objArr[1];
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
                io3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rz6 rz6Var3 = new r45.rz6();
                if (bArr2 != null && bArr2.length > 0) {
                    rz6Var3.parseFrom(bArr2);
                }
                io3Var.f377213d = rz6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            io3Var.f377214e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.k56 k56Var3 = new r45.k56();
            if (bArr3 != null && bArr3.length > 0) {
                k56Var3.parseFrom(bArr3);
            }
            io3Var.f377215f = k56Var3;
        }
        return 0;
    }
}
