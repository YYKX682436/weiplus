package r45;

/* loaded from: classes9.dex */
public class wx6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f389555d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389556e;

    /* renamed from: f, reason: collision with root package name */
    public int f389557f;

    /* renamed from: g, reason: collision with root package name */
    public int f389558g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389559h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389560i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389561m;

    /* renamed from: n, reason: collision with root package name */
    public int f389562n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f389563o;

    /* renamed from: p, reason: collision with root package name */
    public int f389564p;

    static {
        new r45.wx6();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wx6)) {
            return false;
        }
        r45.wx6 wx6Var = (r45.wx6) fVar;
        return n51.f.a(this.BaseRequest, wx6Var.BaseRequest) && n51.f.a(this.f389555d, wx6Var.f389555d) && n51.f.a(this.f389556e, wx6Var.f389556e) && n51.f.a(java.lang.Integer.valueOf(this.f389557f), java.lang.Integer.valueOf(wx6Var.f389557f)) && n51.f.a(java.lang.Integer.valueOf(this.f389558g), java.lang.Integer.valueOf(wx6Var.f389558g)) && n51.f.a(this.f389559h, wx6Var.f389559h) && n51.f.a(this.f389560i, wx6Var.f389560i) && n51.f.a(this.f389561m, wx6Var.f389561m) && n51.f.a(java.lang.Integer.valueOf(this.f389562n), java.lang.Integer.valueOf(wx6Var.f389562n)) && n51.f.a(this.f389563o, wx6Var.f389563o) && n51.f.a(java.lang.Integer.valueOf(this.f389564p), java.lang.Integer.valueOf(wx6Var.f389564p));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.BaseRequest;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.wx6();
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
            r45.cu5 cu5Var = this.f389555d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f389555d.writeFields(fVar);
            }
            java.lang.String str = this.f389556e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f389557f);
            fVar.e(5, this.f389558g);
            java.lang.String str2 = this.f389559h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f389560i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f389561m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f389562n);
            java.lang.String str5 = this.f389563o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            fVar.e(11, this.f389564p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f389555d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            java.lang.String str6 = this.f389556e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f389557f) + b36.f.e(5, this.f389558g);
            java.lang.String str7 = this.f389559h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f389560i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f389561m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            int e18 = e17 + b36.f.e(9, this.f389562n);
            java.lang.String str10 = this.f389563o;
            if (str10 != null) {
                e18 += b36.f.j(10, str10);
            }
            return e18 + b36.f.e(11, this.f389564p);
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
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    this.f389555d = cu5Var3;
                }
                return 0;
            case 3:
                this.f389556e = aVar2.k(intValue);
                return 0;
            case 4:
                this.f389557f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f389558g = aVar2.g(intValue);
                return 0;
            case 6:
                this.f389559h = aVar2.k(intValue);
                return 0;
            case 7:
                this.f389560i = aVar2.k(intValue);
                return 0;
            case 8:
                this.f389561m = aVar2.k(intValue);
                return 0;
            case 9:
                this.f389562n = aVar2.g(intValue);
                return 0;
            case 10:
                this.f389563o = aVar2.k(intValue);
                return 0;
            case 11:
                this.f389564p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.wx6) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        return this;
    }
}
