package r45;

/* loaded from: classes4.dex */
public class xf extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390044d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f390045e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nm0 f390046f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xf)) {
            return false;
        }
        r45.xf xfVar = (r45.xf) fVar;
        return n51.f.a(this.BaseResponse, xfVar.BaseResponse) && n51.f.a(this.f390044d, xfVar.f390044d) && n51.f.a(this.f390045e, xfVar.f390045e) && n51.f.a(this.f390046f, xfVar.f390046f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390044d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.cu5 cu5Var = this.f390045e;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f390045e.writeFields(fVar);
            }
            r45.nm0 nm0Var = this.f390046f;
            if (nm0Var != null) {
                fVar.i(5, nm0Var.computeSize());
                this.f390046f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            r45.cu5 cu5Var2 = this.f390045e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.computeSize());
            }
            r45.nm0 nm0Var2 = this.f390046f;
            return nm0Var2 != null ? i18 + b36.f.i(5, nm0Var2.computeSize()) : i18;
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
        r45.xf xfVar = (r45.xf) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                xfVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
                if (bArr3 != null && bArr3.length > 0) {
                    snsObject.parseFrom(bArr3);
                }
                xfVar.f390044d.add(snsObject);
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr4 != null && bArr4.length > 0) {
                    cu5Var3.b(bArr4);
                }
                xfVar.f390045e = cu5Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr5 = (byte[]) j27.get(i29);
            r45.nm0 nm0Var3 = new r45.nm0();
            if (bArr5 != null && bArr5.length > 0) {
                nm0Var3.parseFrom(bArr5);
            }
            xfVar.f390046f = nm0Var3;
        }
        return 0;
    }
}
