package r45;

/* loaded from: classes2.dex */
public class fh5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374357d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374358e;

    /* renamed from: f, reason: collision with root package name */
    public r45.y1 f374359f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fh5)) {
            return false;
        }
        r45.fh5 fh5Var = (r45.fh5) fVar;
        return n51.f.a(this.BaseResponse, fh5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f374357d), java.lang.Integer.valueOf(fh5Var.f374357d)) && n51.f.a(this.f374358e, fh5Var.f374358e) && n51.f.a(this.f374359f, fh5Var.f374359f);
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
            fVar.e(2, this.f374357d);
            java.lang.String str = this.f374358e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.y1 y1Var = this.f374359f;
            if (y1Var != null) {
                fVar.i(4, y1Var.computeSize());
                this.f374359f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f374357d);
            java.lang.String str2 = this.f374358e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.y1 y1Var2 = this.f374359f;
            return y1Var2 != null ? i18 + b36.f.i(4, y1Var2.computeSize()) : i18;
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
        r45.fh5 fh5Var = (r45.fh5) objArr[1];
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
                fh5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            fh5Var.f374357d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            fh5Var.f374358e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.y1 y1Var3 = new r45.y1();
            if (bArr2 != null && bArr2.length > 0) {
                y1Var3.parseFrom(bArr2);
            }
            fh5Var.f374359f = y1Var3;
        }
        return 0;
    }
}
