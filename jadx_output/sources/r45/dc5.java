package r45;

/* loaded from: classes8.dex */
public class dc5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372308d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372309e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372310f;

    /* renamed from: g, reason: collision with root package name */
    public int f372311g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372312h;

    /* renamed from: i, reason: collision with root package name */
    public int f372313i;

    static {
        new r45.dc5();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dc5)) {
            return false;
        }
        r45.dc5 dc5Var = (r45.dc5) fVar;
        return n51.f.a(this.BaseRequest, dc5Var.BaseRequest) && n51.f.a(this.f372308d, dc5Var.f372308d) && n51.f.a(this.f372309e, dc5Var.f372309e) && n51.f.a(this.f372310f, dc5Var.f372310f) && n51.f.a(java.lang.Integer.valueOf(this.f372311g), java.lang.Integer.valueOf(dc5Var.f372311g)) && n51.f.a(this.f372312h, dc5Var.f372312h) && n51.f.a(java.lang.Integer.valueOf(this.f372313i), java.lang.Integer.valueOf(dc5Var.f372313i));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.BaseRequest;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.dc5();
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
            java.lang.String str = this.f372308d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f372309e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f372310f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f372311g);
            java.lang.String str4 = this.f372312h;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f372313i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f372308d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f372309e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f372310f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f372311g);
            java.lang.String str8 = this.f372312h;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            return e17 + b36.f.e(8, this.f372313i);
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
                this.f372308d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f372309e = aVar2.k(intValue);
                return 0;
            case 4:
                this.f372310f = aVar2.k(intValue);
                return 0;
            case 5:
                this.f372311g = aVar2.g(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f372312h = aVar2.k(intValue);
                return 0;
            case 8:
                this.f372313i = aVar2.g(intValue);
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.dc5) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        return this;
    }
}
