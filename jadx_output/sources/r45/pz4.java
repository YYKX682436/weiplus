package r45;

/* loaded from: classes9.dex */
public class pz4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383491d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383492e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383493f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383494g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383495h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383496i;

    /* renamed from: m, reason: collision with root package name */
    public int f383497m;

    /* renamed from: n, reason: collision with root package name */
    public int f383498n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f383499o;

    /* renamed from: p, reason: collision with root package name */
    public int f383500p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383501q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pz4)) {
            return false;
        }
        r45.pz4 pz4Var = (r45.pz4) fVar;
        return n51.f.a(this.BaseRequest, pz4Var.BaseRequest) && n51.f.a(this.f383491d, pz4Var.f383491d) && n51.f.a(this.f383492e, pz4Var.f383492e) && n51.f.a(this.f383493f, pz4Var.f383493f) && n51.f.a(this.f383494g, pz4Var.f383494g) && n51.f.a(this.f383495h, pz4Var.f383495h) && n51.f.a(this.f383496i, pz4Var.f383496i) && n51.f.a(java.lang.Integer.valueOf(this.f383497m), java.lang.Integer.valueOf(pz4Var.f383497m)) && n51.f.a(java.lang.Integer.valueOf(this.f383498n), java.lang.Integer.valueOf(pz4Var.f383498n)) && n51.f.a(java.lang.Boolean.valueOf(this.f383499o), java.lang.Boolean.valueOf(pz4Var.f383499o)) && n51.f.a(java.lang.Integer.valueOf(this.f383500p), java.lang.Integer.valueOf(pz4Var.f383500p)) && n51.f.a(this.f383501q, pz4Var.f383501q);
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
            java.lang.String str = this.f383491d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383492e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383493f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383494g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f383495h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f383496i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f383497m);
            fVar.e(9, this.f383498n);
            fVar.a(10, this.f383499o);
            fVar.e(11, this.f383500p);
            java.lang.String str7 = this.f383501q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str8 = this.f383491d;
            if (str8 != null) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f383492e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f383493f;
            if (str10 != null) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f383494g;
            if (str11 != null) {
                i18 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f383495h;
            if (str12 != null) {
                i18 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f383496i;
            if (str13 != null) {
                i18 += b36.f.j(7, str13);
            }
            int e17 = i18 + b36.f.e(8, this.f383497m) + b36.f.e(9, this.f383498n) + b36.f.a(10, this.f383499o) + b36.f.e(11, this.f383500p);
            java.lang.String str14 = this.f383501q;
            return str14 != null ? e17 + b36.f.j(12, str14) : e17;
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
        r45.pz4 pz4Var = (r45.pz4) objArr[1];
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
                    pz4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                pz4Var.f383491d = aVar2.k(intValue);
                return 0;
            case 3:
                pz4Var.f383492e = aVar2.k(intValue);
                return 0;
            case 4:
                pz4Var.f383493f = aVar2.k(intValue);
                return 0;
            case 5:
                pz4Var.f383494g = aVar2.k(intValue);
                return 0;
            case 6:
                pz4Var.f383495h = aVar2.k(intValue);
                return 0;
            case 7:
                pz4Var.f383496i = aVar2.k(intValue);
                return 0;
            case 8:
                pz4Var.f383497m = aVar2.g(intValue);
                return 0;
            case 9:
                pz4Var.f383498n = aVar2.g(intValue);
                return 0;
            case 10:
                pz4Var.f383499o = aVar2.c(intValue);
                return 0;
            case 11:
                pz4Var.f383500p = aVar2.g(intValue);
                return 0;
            case 12:
                pz4Var.f383501q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
