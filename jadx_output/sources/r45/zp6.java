package r45;

/* loaded from: classes9.dex */
public class zp6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f392282d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392283e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392284f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392285g;

    /* renamed from: h, reason: collision with root package name */
    public r45.m46 f392286h;

    /* renamed from: i, reason: collision with root package name */
    public int f392287i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f392288m;

    /* renamed from: n, reason: collision with root package name */
    public int f392289n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f392290o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f392291p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f392292q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f392293r;

    /* renamed from: s, reason: collision with root package name */
    public int f392294s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f392295t;

    /* renamed from: u, reason: collision with root package name */
    public r45.tv5 f392296u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f392297v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f392298w;

    /* renamed from: x, reason: collision with root package name */
    public int f392299x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zp6)) {
            return false;
        }
        r45.zp6 zp6Var = (r45.zp6) fVar;
        return n51.f.a(this.BaseResponse, zp6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f392282d), java.lang.Integer.valueOf(zp6Var.f392282d)) && n51.f.a(this.f392283e, zp6Var.f392283e) && n51.f.a(this.f392284f, zp6Var.f392284f) && n51.f.a(this.f392285g, zp6Var.f392285g) && n51.f.a(this.f392286h, zp6Var.f392286h) && n51.f.a(java.lang.Integer.valueOf(this.f392287i), java.lang.Integer.valueOf(zp6Var.f392287i)) && n51.f.a(this.f392288m, zp6Var.f392288m) && n51.f.a(java.lang.Integer.valueOf(this.f392289n), java.lang.Integer.valueOf(zp6Var.f392289n)) && n51.f.a(this.f392290o, zp6Var.f392290o) && n51.f.a(this.f392291p, zp6Var.f392291p) && n51.f.a(this.f392292q, zp6Var.f392292q) && n51.f.a(this.f392293r, zp6Var.f392293r) && n51.f.a(java.lang.Integer.valueOf(this.f392294s), java.lang.Integer.valueOf(zp6Var.f392294s)) && n51.f.a(this.f392295t, zp6Var.f392295t) && n51.f.a(this.f392296u, zp6Var.f392296u) && n51.f.a(this.f392297v, zp6Var.f392297v) && n51.f.a(this.f392298w, zp6Var.f392298w) && n51.f.a(java.lang.Integer.valueOf(this.f392299x), java.lang.Integer.valueOf(zp6Var.f392299x));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f392282d);
            java.lang.String str = this.f392283e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f392284f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f392285g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.m46 m46Var = this.f392286h;
            if (m46Var != null) {
                fVar.i(6, m46Var.computeSize());
                this.f392286h.writeFields(fVar);
            }
            fVar.e(7, this.f392287i);
            java.lang.String str4 = this.f392288m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f392289n);
            java.lang.String str5 = this.f392290o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f392291p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f392292q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            com.tencent.mm.protobuf.g gVar = this.f392293r;
            if (gVar != null) {
                fVar.b(13, gVar);
            }
            fVar.e(14, this.f392294s);
            java.lang.String str8 = this.f392295t;
            if (str8 != null) {
                fVar.j(15, str8);
            }
            r45.tv5 tv5Var = this.f392296u;
            if (tv5Var != null) {
                fVar.i(16, tv5Var.computeSize());
                this.f392296u.writeFields(fVar);
            }
            java.lang.String str9 = this.f392297v;
            if (str9 != null) {
                fVar.j(17, str9);
            }
            java.lang.String str10 = this.f392298w;
            if (str10 != null) {
                fVar.j(18, str10);
            }
            fVar.e(19, this.f392299x);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f392282d);
            java.lang.String str11 = this.f392283e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f392284f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f392285g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            r45.m46 m46Var2 = this.f392286h;
            if (m46Var2 != null) {
                i18 += b36.f.i(6, m46Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(7, this.f392287i);
            java.lang.String str14 = this.f392288m;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            int e18 = e17 + b36.f.e(9, this.f392289n);
            java.lang.String str15 = this.f392290o;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f392291p;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f392292q;
            if (str17 != null) {
                e18 += b36.f.j(12, str17);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f392293r;
            if (gVar2 != null) {
                e18 += b36.f.b(13, gVar2);
            }
            int e19 = e18 + b36.f.e(14, this.f392294s);
            java.lang.String str18 = this.f392295t;
            if (str18 != null) {
                e19 += b36.f.j(15, str18);
            }
            r45.tv5 tv5Var2 = this.f392296u;
            if (tv5Var2 != null) {
                e19 += b36.f.i(16, tv5Var2.computeSize());
            }
            java.lang.String str19 = this.f392297v;
            if (str19 != null) {
                e19 += b36.f.j(17, str19);
            }
            java.lang.String str20 = this.f392298w;
            if (str20 != null) {
                e19 += b36.f.j(18, str20);
            }
            return e19 + b36.f.e(19, this.f392299x);
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
        r45.zp6 zp6Var = (r45.zp6) objArr[1];
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
                    zp6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                zp6Var.f392282d = aVar2.g(intValue);
                return 0;
            case 3:
                zp6Var.f392283e = aVar2.k(intValue);
                return 0;
            case 4:
                zp6Var.f392284f = aVar2.k(intValue);
                return 0;
            case 5:
                zp6Var.f392285g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.m46 m46Var3 = new r45.m46();
                    if (bArr2 != null && bArr2.length > 0) {
                        m46Var3.parseFrom(bArr2);
                    }
                    zp6Var.f392286h = m46Var3;
                }
                return 0;
            case 7:
                zp6Var.f392287i = aVar2.g(intValue);
                return 0;
            case 8:
                zp6Var.f392288m = aVar2.k(intValue);
                return 0;
            case 9:
                zp6Var.f392289n = aVar2.g(intValue);
                return 0;
            case 10:
                zp6Var.f392290o = aVar2.k(intValue);
                return 0;
            case 11:
                zp6Var.f392291p = aVar2.k(intValue);
                return 0;
            case 12:
                zp6Var.f392292q = aVar2.k(intValue);
                return 0;
            case 13:
                zp6Var.f392293r = aVar2.d(intValue);
                return 0;
            case 14:
                zp6Var.f392294s = aVar2.g(intValue);
                return 0;
            case 15:
                zp6Var.f392295t = aVar2.k(intValue);
                return 0;
            case 16:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.tv5 tv5Var3 = new r45.tv5();
                    if (bArr3 != null && bArr3.length > 0) {
                        tv5Var3.parseFrom(bArr3);
                    }
                    zp6Var.f392296u = tv5Var3;
                }
                return 0;
            case 17:
                zp6Var.f392297v = aVar2.k(intValue);
                return 0;
            case 18:
                zp6Var.f392298w = aVar2.k(intValue);
                return 0;
            case 19:
                zp6Var.f392299x = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
