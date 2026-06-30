package r45;

/* loaded from: classes2.dex */
public class g86 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f374992d;

    /* renamed from: e, reason: collision with root package name */
    public r45.wa6 f374993e;

    /* renamed from: f, reason: collision with root package name */
    public int f374994f;

    /* renamed from: g, reason: collision with root package name */
    public r45.zb6 f374995g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g86)) {
            return false;
        }
        r45.g86 g86Var = (r45.g86) fVar;
        return n51.f.a(this.BaseResponse, g86Var.BaseResponse) && n51.f.a(this.f374992d, g86Var.f374992d) && n51.f.a(this.f374993e, g86Var.f374993e) && n51.f.a(java.lang.Integer.valueOf(this.f374994f), java.lang.Integer.valueOf(g86Var.f374994f)) && n51.f.a(this.f374995g, g86Var.f374995g);
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
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f374992d;
            if (snsObject != null) {
                fVar.i(2, snsObject.computeSize());
                this.f374992d.writeFields(fVar);
            }
            r45.wa6 wa6Var = this.f374993e;
            if (wa6Var != null) {
                fVar.i(3, wa6Var.computeSize());
                this.f374993e.writeFields(fVar);
            }
            fVar.e(4, this.f374994f);
            r45.zb6 zb6Var = this.f374995g;
            if (zb6Var != null) {
                fVar.i(5, zb6Var.computeSize());
                this.f374995g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f374992d;
            if (snsObject2 != null) {
                i18 += b36.f.i(2, snsObject2.computeSize());
            }
            r45.wa6 wa6Var2 = this.f374993e;
            if (wa6Var2 != null) {
                i18 += b36.f.i(3, wa6Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f374994f);
            r45.zb6 zb6Var2 = this.f374995g;
            return zb6Var2 != null ? e17 + b36.f.i(5, zb6Var2.computeSize()) : e17;
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
        r45.g86 g86Var = (r45.g86) objArr[1];
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
                g86Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.mm.protocal.protobuf.SnsObject snsObject3 = new com.tencent.mm.protocal.protobuf.SnsObject();
                if (bArr2 != null && bArr2.length > 0) {
                    snsObject3.parseFrom(bArr2);
                }
                g86Var.f374992d = snsObject3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.wa6 wa6Var3 = new r45.wa6();
                if (bArr3 != null && bArr3.length > 0) {
                    wa6Var3.parseFrom(bArr3);
                }
                g86Var.f374993e = wa6Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            g86Var.f374994f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.zb6 zb6Var3 = new r45.zb6();
            if (bArr4 != null && bArr4.length > 0) {
                zb6Var3.parseFrom(bArr4);
            }
            g86Var.f374995g = zb6Var3;
        }
        return 0;
    }
}
