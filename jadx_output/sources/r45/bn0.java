package r45;

/* loaded from: classes8.dex */
public class bn0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370885d;

    /* renamed from: e, reason: collision with root package name */
    public int f370886e;

    /* renamed from: f, reason: collision with root package name */
    public int f370887f;

    /* renamed from: g, reason: collision with root package name */
    public int f370888g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370889h;

    static {
        new r45.bn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bn0)) {
            return false;
        }
        r45.bn0 bn0Var = (r45.bn0) fVar;
        return n51.f.a(this.BaseRequest, bn0Var.BaseRequest) && n51.f.a(this.f370885d, bn0Var.f370885d) && n51.f.a(java.lang.Integer.valueOf(this.f370886e), java.lang.Integer.valueOf(bn0Var.f370886e)) && n51.f.a(java.lang.Integer.valueOf(this.f370887f), java.lang.Integer.valueOf(bn0Var.f370887f)) && n51.f.a(java.lang.Integer.valueOf(this.f370888g), java.lang.Integer.valueOf(bn0Var.f370888g)) && n51.f.a(this.f370889h, bn0Var.f370889h);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.BaseRequest;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.bn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f370885d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f370886e);
            fVar.e(4, this.f370887f);
            fVar.e(5, this.f370888g);
            java.lang.String str = this.f370889h;
            if (str != null) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f370885d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            int e17 = i18 + b36.f.e(3, this.f370886e) + b36.f.e(4, this.f370887f) + b36.f.e(5, this.f370888g);
            java.lang.String str2 = this.f370889h;
            return str2 != null ? e17 + b36.f.j(6, str2) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    this.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                this.f370885d = aVar2.d(intValue);
                return 0;
            case 3:
                this.f370886e = aVar2.g(intValue);
                return 0;
            case 4:
                this.f370887f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f370888g = aVar2.g(intValue);
                return 0;
            case 6:
                this.f370889h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.bn0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        return this;
    }
}
