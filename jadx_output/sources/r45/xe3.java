package r45;

/* loaded from: classes4.dex */
public class xe3 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public int f390010e;

    /* renamed from: g, reason: collision with root package name */
    public r45.vj0 f390012g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f390009d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f390011f = new java.util.LinkedList();

    static {
        new r45.xe3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.xe3 parseFrom(byte[] bArr) {
        return (r45.xe3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xe3)) {
            return false;
        }
        r45.xe3 xe3Var = (r45.xe3) fVar;
        return n51.f.a(this.BaseResponse, xe3Var.BaseResponse) && n51.f.a(this.f390009d, xe3Var.f390009d) && n51.f.a(java.lang.Integer.valueOf(this.f390010e), java.lang.Integer.valueOf(xe3Var.f390010e)) && n51.f.a(this.f390011f, xe3Var.f390011f) && n51.f.a(this.f390012g, xe3Var.f390012g);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.xe3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390011f;
        java.util.LinkedList linkedList2 = this.f390009d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.e(3, this.f390010e);
            fVar.g(4, 8, linkedList);
            r45.vj0 vj0Var = this.f390012g;
            if (vj0Var != null) {
                fVar.i(5, vj0Var.computeSize());
                this.f390012g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2) + b36.f.e(3, this.f390010e) + b36.f.g(4, 8, linkedList);
            r45.vj0 vj0Var2 = this.f390012g;
            return vj0Var2 != null ? i18 + b36.f.i(5, vj0Var2.computeSize()) : i18;
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
                r45.uj0 uj0Var = new r45.uj0();
                if (bArr2 != null && bArr2.length > 0) {
                    uj0Var.parseFrom(bArr2);
                }
                linkedList2.add(uj0Var);
            }
            return 0;
        }
        if (intValue == 3) {
            this.f390010e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.rj0 rj0Var = new r45.rj0();
                if (bArr3 != null && bArr3.length > 0) {
                    rj0Var.parseFrom(bArr3);
                }
                linkedList.add(rj0Var);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.vj0 vj0Var3 = new r45.vj0();
            if (bArr4 != null && bArr4.length > 0) {
                vj0Var3.parseFrom(bArr4);
            }
            this.f390012g = vj0Var3;
        }
        return 0;
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
