package r45;

/* loaded from: classes9.dex */
public class pl0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383148d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383149e;

    /* renamed from: f, reason: collision with root package name */
    public int f383150f;

    /* renamed from: g, reason: collision with root package name */
    public int f383151g;

    /* renamed from: h, reason: collision with root package name */
    public int f383152h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f383153i;

    static {
        new r45.pl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pl0)) {
            return false;
        }
        r45.pl0 pl0Var = (r45.pl0) fVar;
        return n51.f.a(this.BaseRequest, pl0Var.BaseRequest) && n51.f.a(this.f383148d, pl0Var.f383148d) && n51.f.a(this.f383149e, pl0Var.f383149e) && n51.f.a(java.lang.Integer.valueOf(this.f383150f), java.lang.Integer.valueOf(pl0Var.f383150f)) && n51.f.a(java.lang.Integer.valueOf(this.f383151g), java.lang.Integer.valueOf(pl0Var.f383151g)) && n51.f.a(java.lang.Integer.valueOf(this.f383152h), java.lang.Integer.valueOf(pl0Var.f383152h)) && n51.f.a(this.f383153i, pl0Var.f383153i);
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.BaseRequest;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.pl0();
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
            java.lang.String str = this.f383148d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383149e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f383150f);
            fVar.e(5, this.f383151g);
            fVar.e(6, this.f383152h);
            r45.cu5 cu5Var = this.f383153i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.computeSize());
                this.f383153i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f383148d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f383149e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f383150f) + b36.f.e(5, this.f383151g) + b36.f.e(6, this.f383152h);
            r45.cu5 cu5Var2 = this.f383153i;
            return cu5Var2 != null ? e17 + b36.f.i(7, cu5Var2.computeSize()) : e17;
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
                this.f383148d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f383149e = aVar2.k(intValue);
                return 0;
            case 4:
                this.f383150f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f383151g = aVar2.g(intValue);
                return 0;
            case 6:
                this.f383152h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    this.f383153i = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.pl0) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        return this;
    }
}
