package r45;

/* loaded from: classes11.dex */
public class yh extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f391073d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ov3 f391074e;

    /* renamed from: f, reason: collision with root package name */
    public int f391075f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yh)) {
            return false;
        }
        r45.yh yhVar = (r45.yh) fVar;
        return n51.f.a(this.BaseResponse, yhVar.BaseResponse) && n51.f.a(this.f391073d, yhVar.f391073d) && n51.f.a(this.f391074e, yhVar.f391074e) && n51.f.a(java.lang.Integer.valueOf(this.f391075f), java.lang.Integer.valueOf(yhVar.f391075f));
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
            r45.nv3 nv3Var = this.f391073d;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.computeSize());
                this.f391073d.writeFields(fVar);
            }
            r45.ov3 ov3Var = this.f391074e;
            if (ov3Var != null) {
                fVar.i(3, ov3Var.computeSize());
                this.f391074e.writeFields(fVar);
            }
            fVar.e(4, this.f391075f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.nv3 nv3Var2 = this.f391073d;
            if (nv3Var2 != null) {
                i18 += b36.f.i(2, nv3Var2.computeSize());
            }
            r45.ov3 ov3Var2 = this.f391074e;
            if (ov3Var2 != null) {
                i18 += b36.f.i(3, ov3Var2.computeSize());
            }
            return i18 + b36.f.e(4, this.f391075f);
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
        r45.yh yhVar = (r45.yh) objArr[1];
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
                yhVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nv3 nv3Var3 = new r45.nv3();
                if (bArr2 != null && bArr2.length > 0) {
                    nv3Var3.parseFrom(bArr2);
                }
                yhVar.f391073d = nv3Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            yhVar.f391075f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.ov3 ov3Var3 = new r45.ov3();
            if (bArr3 != null && bArr3.length > 0) {
                ov3Var3.parseFrom(bArr3);
            }
            yhVar.f391074e = ov3Var3;
        }
        return 0;
    }
}
