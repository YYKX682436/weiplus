package r45;

/* loaded from: classes8.dex */
public class kx6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.vt4 f379031d;

    /* renamed from: e, reason: collision with root package name */
    public int f379032e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379033f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kx6)) {
            return false;
        }
        r45.kx6 kx6Var = (r45.kx6) fVar;
        return n51.f.a(this.BaseResponse, kx6Var.BaseResponse) && n51.f.a(this.f379031d, kx6Var.f379031d) && n51.f.a(java.lang.Integer.valueOf(this.f379032e), java.lang.Integer.valueOf(kx6Var.f379032e)) && n51.f.a(this.f379033f, kx6Var.f379033f);
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
            r45.vt4 vt4Var = this.f379031d;
            if (vt4Var != null) {
                fVar.i(2, vt4Var.computeSize());
                this.f379031d.writeFields(fVar);
            }
            fVar.e(3, this.f379032e);
            java.lang.String str = this.f379033f;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.vt4 vt4Var2 = this.f379031d;
            if (vt4Var2 != null) {
                i18 += b36.f.i(2, vt4Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f379032e);
            java.lang.String str2 = this.f379033f;
            return str2 != null ? e17 + b36.f.j(4, str2) : e17;
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
        r45.kx6 kx6Var = (r45.kx6) objArr[1];
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
                kx6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                kx6Var.f379032e = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            kx6Var.f379033f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.vt4 vt4Var3 = new r45.vt4();
            if (bArr2 != null && bArr2.length > 0) {
                vt4Var3.parseFrom(bArr2);
            }
            kx6Var.f379031d = vt4Var3;
        }
        return 0;
    }
}
