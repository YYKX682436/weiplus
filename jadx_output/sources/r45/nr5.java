package r45;

/* loaded from: classes9.dex */
public class nr5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381619d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381620e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381621f;

    /* renamed from: g, reason: collision with root package name */
    public int f381622g;

    /* renamed from: h, reason: collision with root package name */
    public int f381623h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381624i;

    /* renamed from: m, reason: collision with root package name */
    public int f381625m;

    /* renamed from: n, reason: collision with root package name */
    public int f381626n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f381627o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381628p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f381629q;

    /* renamed from: r, reason: collision with root package name */
    public int f381630r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nr5)) {
            return false;
        }
        r45.nr5 nr5Var = (r45.nr5) fVar;
        return n51.f.a(this.BaseRequest, nr5Var.BaseRequest) && n51.f.a(this.f381619d, nr5Var.f381619d) && n51.f.a(this.f381620e, nr5Var.f381620e) && n51.f.a(this.f381621f, nr5Var.f381621f) && n51.f.a(java.lang.Integer.valueOf(this.f381622g), java.lang.Integer.valueOf(nr5Var.f381622g)) && n51.f.a(java.lang.Integer.valueOf(this.f381623h), java.lang.Integer.valueOf(nr5Var.f381623h)) && n51.f.a(this.f381624i, nr5Var.f381624i) && n51.f.a(java.lang.Integer.valueOf(this.f381625m), java.lang.Integer.valueOf(nr5Var.f381625m)) && n51.f.a(java.lang.Integer.valueOf(this.f381626n), java.lang.Integer.valueOf(nr5Var.f381626n)) && n51.f.a(this.f381627o, nr5Var.f381627o) && n51.f.a(this.f381628p, nr5Var.f381628p) && n51.f.a(this.f381629q, nr5Var.f381629q) && n51.f.a(java.lang.Integer.valueOf(this.f381630r), java.lang.Integer.valueOf(nr5Var.f381630r));
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
            java.lang.String str = this.f381619d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f381620e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f381621f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f381622g);
            fVar.e(6, this.f381623h);
            java.lang.String str4 = this.f381624i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f381625m);
            fVar.e(9, this.f381626n);
            java.lang.String str5 = this.f381627o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f381628p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            com.tencent.mm.protobuf.g gVar = this.f381629q;
            if (gVar != null) {
                fVar.b(12, gVar);
            }
            fVar.e(13, this.f381630r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f381619d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f381620e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f381621f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            int e17 = i18 + b36.f.e(5, this.f381622g) + b36.f.e(6, this.f381623h);
            java.lang.String str10 = this.f381624i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f381625m) + b36.f.e(9, this.f381626n);
            java.lang.String str11 = this.f381627o;
            if (str11 != null) {
                e18 += b36.f.j(10, str11);
            }
            java.lang.String str12 = this.f381628p;
            if (str12 != null) {
                e18 += b36.f.j(11, str12);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f381629q;
            if (gVar2 != null) {
                e18 += b36.f.b(12, gVar2);
            }
            return e18 + b36.f.e(13, this.f381630r);
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
        r45.nr5 nr5Var = (r45.nr5) objArr[1];
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
                    nr5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                nr5Var.f381619d = aVar2.k(intValue);
                return 0;
            case 3:
                nr5Var.f381620e = aVar2.k(intValue);
                return 0;
            case 4:
                nr5Var.f381621f = aVar2.k(intValue);
                return 0;
            case 5:
                nr5Var.f381622g = aVar2.g(intValue);
                return 0;
            case 6:
                nr5Var.f381623h = aVar2.g(intValue);
                return 0;
            case 7:
                nr5Var.f381624i = aVar2.k(intValue);
                return 0;
            case 8:
                nr5Var.f381625m = aVar2.g(intValue);
                return 0;
            case 9:
                nr5Var.f381626n = aVar2.g(intValue);
                return 0;
            case 10:
                nr5Var.f381627o = aVar2.k(intValue);
                return 0;
            case 11:
                nr5Var.f381628p = aVar2.k(intValue);
                return 0;
            case 12:
                nr5Var.f381629q = aVar2.d(intValue);
                return 0;
            case 13:
                nr5Var.f381630r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
