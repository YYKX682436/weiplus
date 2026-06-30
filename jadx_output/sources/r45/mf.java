package r45;

/* loaded from: classes9.dex */
public class mf extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380435d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f380436e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f380437f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mf)) {
            return false;
        }
        r45.mf mfVar = (r45.mf) fVar;
        return n51.f.a(this.BaseResponse, mfVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f380435d), java.lang.Integer.valueOf(mfVar.f380435d)) && n51.f.a(this.f380436e, mfVar.f380436e) && n51.f.a(this.f380437f, mfVar.f380437f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380436e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f380435d);
            fVar.g(3, 8, linkedList);
            r45.cu5 cu5Var = this.f380437f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f380437f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f380435d) + b36.f.g(3, 8, linkedList);
            r45.cu5 cu5Var2 = this.f380437f;
            return cu5Var2 != null ? i18 + b36.f.i(4, cu5Var2.computeSize()) : i18;
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
        r45.mf mfVar = (r45.mf) objArr[1];
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
                mfVar.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mfVar.f380435d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.tp0 tp0Var = new r45.tp0();
                if (bArr3 != null && bArr3.length > 0) {
                    tp0Var.parseFrom(bArr3);
                }
                mfVar.f380436e.add(tp0Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr4 != null && bArr4.length > 0) {
                cu5Var3.b(bArr4);
            }
            mfVar.f380437f = cu5Var3;
        }
        return 0;
    }
}
