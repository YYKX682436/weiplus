package r45;

/* loaded from: classes4.dex */
public class ce3 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f371497e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371499g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f371496d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f371498f = new java.util.LinkedList();

    static {
        new r45.ce3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.ce3 parseFrom(byte[] bArr) {
        return (r45.ce3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ce3)) {
            return false;
        }
        r45.ce3 ce3Var = (r45.ce3) fVar;
        return n51.f.a(this.BaseResponse, ce3Var.BaseResponse) && n51.f.a(this.f371496d, ce3Var.f371496d) && n51.f.a(this.f371497e, ce3Var.f371497e) && n51.f.a(this.f371498f, ce3Var.f371498f) && n51.f.a(this.f371499g, ce3Var.f371499g);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ce3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371498f;
        java.util.LinkedList linkedList2 = this.f371496d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            r45.cu5 cu5Var = this.f371497e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f371497e.writeFields(fVar);
            }
            fVar.g(4, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f371499g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2);
            r45.cu5 cu5Var2 = this.f371497e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f371499g;
            return gVar2 != null ? g17 + b36.f.b(5, gVar2) : g17;
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.ri0 ri0Var = new r45.ri0();
                if (bArr2 != null && bArr2.length > 0) {
                    ri0Var.parseFrom(bArr2);
                }
                linkedList2.add(ri0Var);
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr3 != null && bArr3.length > 0) {
                    cu5Var3.b(bArr3);
                }
                this.f371497e = cu5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f371499g = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.zi0 zi0Var = new r45.zi0();
            if (bArr4 != null && bArr4.length > 0) {
                zi0Var.parseFrom(bArr4);
            }
            linkedList.add(zi0Var);
        }
        return 0;
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
