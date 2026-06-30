package r45;

/* loaded from: classes8.dex */
public class sj3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385777d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385778e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385779f;

    /* renamed from: g, reason: collision with root package name */
    public int f385780g;

    /* renamed from: h, reason: collision with root package name */
    public int f385781h;

    static {
        new r45.sj3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sj3)) {
            return false;
        }
        r45.sj3 sj3Var = (r45.sj3) fVar;
        return n51.f.a(this.BaseResponse, sj3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385777d), java.lang.Integer.valueOf(sj3Var.f385777d)) && n51.f.a(this.f385778e, sj3Var.f385778e) && n51.f.a(this.f385779f, sj3Var.f385779f) && n51.f.a(java.lang.Integer.valueOf(this.f385780g), java.lang.Integer.valueOf(sj3Var.f385780g)) && n51.f.a(java.lang.Integer.valueOf(this.f385781h), java.lang.Integer.valueOf(sj3Var.f385781h));
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.sj3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385778e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385777d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f385779f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f385780g);
            fVar.e(6, this.f385781h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385777d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f385779f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f385780g) + b36.f.e(6, this.f385781h);
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
        switch (intValue) {
            case 1:
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
            case 2:
                this.f385777d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.zy4 zy4Var = new r45.zy4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zy4Var.parseFrom(bArr2);
                    }
                    linkedList.add(zy4Var);
                }
                return 0;
            case 4:
                this.f385779f = aVar2.k(intValue);
                return 0;
            case 5:
                this.f385780g = aVar2.g(intValue);
                return 0;
            case 6:
                this.f385781h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.sj3) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
