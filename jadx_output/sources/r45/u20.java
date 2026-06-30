package r45;

/* loaded from: classes9.dex */
public class u20 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386954d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386955e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386956f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386957g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386958h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386959i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386960m;

    /* renamed from: n, reason: collision with root package name */
    public int f386961n;

    /* renamed from: o, reason: collision with root package name */
    public r45.r1 f386962o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f386963p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f386964q;

    /* renamed from: r, reason: collision with root package name */
    public int f386965r;

    /* renamed from: s, reason: collision with root package name */
    public int f386966s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f386967t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f386968u;

    /* renamed from: v, reason: collision with root package name */
    public int f386969v;

    /* renamed from: w, reason: collision with root package name */
    public int f386970w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f386971x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u20)) {
            return false;
        }
        r45.u20 u20Var = (r45.u20) fVar;
        return n51.f.a(this.BaseRequest, u20Var.BaseRequest) && n51.f.a(this.f386954d, u20Var.f386954d) && n51.f.a(this.f386955e, u20Var.f386955e) && n51.f.a(this.f386956f, u20Var.f386956f) && n51.f.a(this.f386957g, u20Var.f386957g) && n51.f.a(this.f386958h, u20Var.f386958h) && n51.f.a(this.f386959i, u20Var.f386959i) && n51.f.a(this.f386960m, u20Var.f386960m) && n51.f.a(java.lang.Integer.valueOf(this.f386961n), java.lang.Integer.valueOf(u20Var.f386961n)) && n51.f.a(this.f386962o, u20Var.f386962o) && n51.f.a(this.f386963p, u20Var.f386963p) && n51.f.a(this.f386964q, u20Var.f386964q) && n51.f.a(java.lang.Integer.valueOf(this.f386965r), java.lang.Integer.valueOf(u20Var.f386965r)) && n51.f.a(java.lang.Integer.valueOf(this.f386966s), java.lang.Integer.valueOf(u20Var.f386966s)) && n51.f.a(this.f386967t, u20Var.f386967t) && n51.f.a(this.f386968u, u20Var.f386968u) && n51.f.a(java.lang.Integer.valueOf(this.f386969v), java.lang.Integer.valueOf(u20Var.f386969v)) && n51.f.a(java.lang.Integer.valueOf(this.f386970w), java.lang.Integer.valueOf(u20Var.f386970w)) && n51.f.a(this.f386971x, u20Var.f386971x);
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
            java.lang.String str = this.f386954d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386955e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386956f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386957g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f386958h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f386959i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f386960m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f386961n);
            r45.r1 r1Var = this.f386962o;
            if (r1Var != null) {
                fVar.i(10, r1Var.computeSize());
                this.f386962o.writeFields(fVar);
            }
            java.lang.String str8 = this.f386963p;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f386964q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f386965r);
            fVar.e(14, this.f386966s);
            java.lang.String str10 = this.f386967t;
            if (str10 != null) {
                fVar.j(15, str10);
            }
            java.lang.String str11 = this.f386968u;
            if (str11 != null) {
                fVar.j(16, str11);
            }
            fVar.e(17, this.f386969v);
            fVar.e(18, this.f386970w);
            java.lang.String str12 = this.f386971x;
            if (str12 != null) {
                fVar.j(19, str12);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str13 = this.f386954d;
            if (str13 != null) {
                i18 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f386955e;
            if (str14 != null) {
                i18 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f386956f;
            if (str15 != null) {
                i18 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f386957g;
            if (str16 != null) {
                i18 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f386958h;
            if (str17 != null) {
                i18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f386959i;
            if (str18 != null) {
                i18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f386960m;
            if (str19 != null) {
                i18 += b36.f.j(8, str19);
            }
            int e17 = i18 + b36.f.e(9, this.f386961n);
            r45.r1 r1Var2 = this.f386962o;
            if (r1Var2 != null) {
                e17 += b36.f.i(10, r1Var2.computeSize());
            }
            java.lang.String str20 = this.f386963p;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f386964q;
            if (str21 != null) {
                e17 += b36.f.j(12, str21);
            }
            int e18 = e17 + b36.f.e(13, this.f386965r) + b36.f.e(14, this.f386966s);
            java.lang.String str22 = this.f386967t;
            if (str22 != null) {
                e18 += b36.f.j(15, str22);
            }
            java.lang.String str23 = this.f386968u;
            if (str23 != null) {
                e18 += b36.f.j(16, str23);
            }
            int e19 = e18 + b36.f.e(17, this.f386969v) + b36.f.e(18, this.f386970w);
            java.lang.String str24 = this.f386971x;
            return str24 != null ? e19 + b36.f.j(19, str24) : e19;
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
        r45.u20 u20Var = (r45.u20) objArr[1];
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
                    u20Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                u20Var.f386954d = aVar2.k(intValue);
                return 0;
            case 3:
                u20Var.f386955e = aVar2.k(intValue);
                return 0;
            case 4:
                u20Var.f386956f = aVar2.k(intValue);
                return 0;
            case 5:
                u20Var.f386957g = aVar2.k(intValue);
                return 0;
            case 6:
                u20Var.f386958h = aVar2.k(intValue);
                return 0;
            case 7:
                u20Var.f386959i = aVar2.k(intValue);
                return 0;
            case 8:
                u20Var.f386960m = aVar2.k(intValue);
                return 0;
            case 9:
                u20Var.f386961n = aVar2.g(intValue);
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
                    u20Var.f386962o = r1Var3;
                }
                return 0;
            case 11:
                u20Var.f386963p = aVar2.k(intValue);
                return 0;
            case 12:
                u20Var.f386964q = aVar2.k(intValue);
                return 0;
            case 13:
                u20Var.f386965r = aVar2.g(intValue);
                return 0;
            case 14:
                u20Var.f386966s = aVar2.g(intValue);
                return 0;
            case 15:
                u20Var.f386967t = aVar2.k(intValue);
                return 0;
            case 16:
                u20Var.f386968u = aVar2.k(intValue);
                return 0;
            case 17:
                u20Var.f386969v = aVar2.g(intValue);
                return 0;
            case 18:
                u20Var.f386970w = aVar2.g(intValue);
                return 0;
            case 19:
                u20Var.f386971x = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
