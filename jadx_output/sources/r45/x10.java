package r45;

/* loaded from: classes9.dex */
public class x10 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389633d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389634e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389635f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389636g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389637h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f389638i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f389639m;

    /* renamed from: n, reason: collision with root package name */
    public int f389640n;

    /* renamed from: o, reason: collision with root package name */
    public r45.r1 f389641o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f389642p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f389643q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f389644r;

    /* renamed from: s, reason: collision with root package name */
    public int f389645s;

    /* renamed from: t, reason: collision with root package name */
    public int f389646t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f389647u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x10)) {
            return false;
        }
        r45.x10 x10Var = (r45.x10) fVar;
        return n51.f.a(this.BaseRequest, x10Var.BaseRequest) && n51.f.a(this.f389633d, x10Var.f389633d) && n51.f.a(this.f389634e, x10Var.f389634e) && n51.f.a(this.f389635f, x10Var.f389635f) && n51.f.a(this.f389636g, x10Var.f389636g) && n51.f.a(this.f389637h, x10Var.f389637h) && n51.f.a(this.f389638i, x10Var.f389638i) && n51.f.a(this.f389639m, x10Var.f389639m) && n51.f.a(java.lang.Integer.valueOf(this.f389640n), java.lang.Integer.valueOf(x10Var.f389640n)) && n51.f.a(this.f389641o, x10Var.f389641o) && n51.f.a(this.f389642p, x10Var.f389642p) && n51.f.a(this.f389643q, x10Var.f389643q) && n51.f.a(this.f389644r, x10Var.f389644r) && n51.f.a(java.lang.Integer.valueOf(this.f389645s), java.lang.Integer.valueOf(x10Var.f389645s)) && n51.f.a(java.lang.Integer.valueOf(this.f389646t), java.lang.Integer.valueOf(x10Var.f389646t)) && n51.f.a(this.f389647u, x10Var.f389647u);
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
            java.lang.String str = this.f389633d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389634e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f389635f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f389636g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f389637h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f389638i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f389639m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f389640n);
            r45.r1 r1Var = this.f389641o;
            if (r1Var != null) {
                fVar.i(10, r1Var.computeSize());
                this.f389641o.writeFields(fVar);
            }
            java.lang.String str8 = this.f389642p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f389643q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            java.lang.String str10 = this.f389644r;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            fVar.e(14, this.f389645s);
            fVar.e(15, this.f389646t);
            java.lang.String str11 = this.f389647u;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str12 = this.f389633d;
            if (str12 != null) {
                i18 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f389634e;
            if (str13 != null) {
                i18 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f389635f;
            if (str14 != null) {
                i18 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f389636g;
            if (str15 != null) {
                i18 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f389637h;
            if (str16 != null) {
                i18 += b36.f.j(6, str16);
            }
            java.lang.String str17 = this.f389638i;
            if (str17 != null) {
                i18 += b36.f.j(7, str17);
            }
            java.lang.String str18 = this.f389639m;
            if (str18 != null) {
                i18 += b36.f.j(8, str18);
            }
            int e17 = i18 + b36.f.e(9, this.f389640n);
            r45.r1 r1Var2 = this.f389641o;
            if (r1Var2 != null) {
                e17 += b36.f.i(10, r1Var2.computeSize());
            }
            java.lang.String str19 = this.f389642p;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f389643q;
            if (str20 != null) {
                e17 += b36.f.j(12, str20);
            }
            java.lang.String str21 = this.f389644r;
            if (str21 != null) {
                e17 += b36.f.j(13, str21);
            }
            int e18 = e17 + b36.f.e(14, this.f389645s) + b36.f.e(15, this.f389646t);
            java.lang.String str22 = this.f389647u;
            return str22 != null ? e18 + b36.f.j(16, str22) : e18;
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
        r45.x10 x10Var = (r45.x10) objArr[1];
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
                    x10Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                x10Var.f389633d = aVar2.k(intValue);
                return 0;
            case 3:
                x10Var.f389634e = aVar2.k(intValue);
                return 0;
            case 4:
                x10Var.f389635f = aVar2.k(intValue);
                return 0;
            case 5:
                x10Var.f389636g = aVar2.k(intValue);
                return 0;
            case 6:
                x10Var.f389637h = aVar2.k(intValue);
                return 0;
            case 7:
                x10Var.f389638i = aVar2.k(intValue);
                return 0;
            case 8:
                x10Var.f389639m = aVar2.k(intValue);
                return 0;
            case 9:
                x10Var.f389640n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.r1 r1Var3 = new r45.r1();
                    if (bArr2 != null && bArr2.length > 0) {
                        r1Var3.parseFrom(bArr2);
                    }
                    x10Var.f389641o = r1Var3;
                }
                return 0;
            case 11:
                x10Var.f389642p = aVar2.k(intValue);
                return 0;
            case 12:
                x10Var.f389643q = aVar2.k(intValue);
                return 0;
            case 13:
                x10Var.f389644r = aVar2.k(intValue);
                return 0;
            case 14:
                x10Var.f389645s = aVar2.g(intValue);
                return 0;
            case 15:
                x10Var.f389646t = aVar2.g(intValue);
                return 0;
            case 16:
                x10Var.f389647u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
