package r45;

/* loaded from: classes4.dex */
public class aa6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.SnsObject f369870d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369871e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wa6 f369872f;

    /* renamed from: g, reason: collision with root package name */
    public int f369873g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f369874h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aa6)) {
            return false;
        }
        r45.aa6 aa6Var = (r45.aa6) fVar;
        return n51.f.a(this.BaseResponse, aa6Var.BaseResponse) && n51.f.a(this.f369870d, aa6Var.f369870d) && n51.f.a(this.f369871e, aa6Var.f369871e) && n51.f.a(this.f369872f, aa6Var.f369872f) && n51.f.a(java.lang.Integer.valueOf(this.f369873g), java.lang.Integer.valueOf(aa6Var.f369873g)) && n51.f.a(this.f369874h, aa6Var.f369874h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f369874h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = this.f369870d;
            if (snsObject != null) {
                fVar.i(2, snsObject.computeSize());
                this.f369870d.writeFields(fVar);
            }
            java.lang.String str = this.f369871e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.wa6 wa6Var = this.f369872f;
            if (wa6Var != null) {
                fVar.i(4, wa6Var.computeSize());
                this.f369872f.writeFields(fVar);
            }
            fVar.e(5, this.f369873g);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            com.tencent.mm.protocal.protobuf.SnsObject snsObject2 = this.f369870d;
            if (snsObject2 != null) {
                i18 += b36.f.i(2, snsObject2.computeSize());
            }
            java.lang.String str2 = this.f369871e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.wa6 wa6Var2 = this.f369872f;
            if (wa6Var2 != null) {
                i18 += b36.f.i(4, wa6Var2.computeSize());
            }
            return i18 + b36.f.e(5, this.f369873g) + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.aa6 aa6Var = (r45.aa6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    aa6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject3 = new com.tencent.mm.protocal.protobuf.SnsObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        snsObject3.parseFrom(bArr3);
                    }
                    aa6Var.f369870d = snsObject3;
                }
                return 0;
            case 3:
                aa6Var.f369871e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wa6 wa6Var3 = new r45.wa6();
                    if (bArr4 != null && bArr4.length > 0) {
                        wa6Var3.parseFrom(bArr4);
                    }
                    aa6Var.f369872f = wa6Var3;
                }
                return 0;
            case 5:
                aa6Var.f369873g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var.b(bArr5);
                    }
                    aa6Var.f369874h.add(du5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
