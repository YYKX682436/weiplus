package r45;

/* loaded from: classes4.dex */
public class ue3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387296d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f387297e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f387298f;

    static {
        new r45.ue3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue3)) {
            return false;
        }
        r45.ue3 ue3Var = (r45.ue3) fVar;
        return n51.f.a(this.BaseResponse, ue3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387296d), java.lang.Integer.valueOf(ue3Var.f387296d)) && n51.f.a(this.f387297e, ue3Var.f387297e) && n51.f.a(this.f387298f, ue3Var.f387298f);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ue3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387297e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f387296d);
            fVar.g(3, 8, linkedList);
            r45.cu5 cu5Var = this.f387298f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f387298f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387296d) + b36.f.g(3, 8, linkedList);
            r45.cu5 cu5Var2 = this.f387298f;
            return cu5Var2 != null ? i18 + b36.f.i(4, cu5Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f387296d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rj0 rj0Var = new r45.rj0();
                if (bArr2 != null && bArr2.length > 0) {
                    rj0Var.parseFrom(bArr2);
                }
                linkedList.add(rj0Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr3 != null && bArr3.length > 0) {
                cu5Var3.b(bArr3);
            }
            this.f387298f = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.ue3) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
