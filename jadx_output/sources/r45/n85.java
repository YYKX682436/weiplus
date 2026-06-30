package r45;

/* loaded from: classes8.dex */
public class n85 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381163d;

    /* renamed from: e, reason: collision with root package name */
    public long f381164e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381165f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381166g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381167h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381168i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ro6 f381169m;

    /* renamed from: n, reason: collision with root package name */
    public r45.eq4 f381170n;

    /* renamed from: o, reason: collision with root package name */
    public r45.dn4 f381171o;

    /* renamed from: p, reason: collision with root package name */
    public int f381172p;

    /* renamed from: q, reason: collision with root package name */
    public int f381173q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f381174r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381175s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f381176t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n85)) {
            return false;
        }
        r45.n85 n85Var = (r45.n85) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381163d), java.lang.Integer.valueOf(n85Var.f381163d)) && n51.f.a(java.lang.Long.valueOf(this.f381164e), java.lang.Long.valueOf(n85Var.f381164e)) && n51.f.a(this.f381165f, n85Var.f381165f) && n51.f.a(this.f381166g, n85Var.f381166g) && n51.f.a(this.f381167h, n85Var.f381167h) && n51.f.a(this.f381168i, n85Var.f381168i) && n51.f.a(this.f381169m, n85Var.f381169m) && n51.f.a(this.f381170n, n85Var.f381170n) && n51.f.a(this.f381171o, n85Var.f381171o) && n51.f.a(java.lang.Integer.valueOf(this.f381172p), java.lang.Integer.valueOf(n85Var.f381172p)) && n51.f.a(java.lang.Integer.valueOf(this.f381173q), java.lang.Integer.valueOf(n85Var.f381173q)) && n51.f.a(this.f381174r, n85Var.f381174r) && n51.f.a(this.f381175s, n85Var.f381175s) && n51.f.a(this.f381176t, n85Var.f381176t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381163d);
            fVar.h(2, this.f381164e);
            java.lang.String str = this.f381165f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381166g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381167h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f381168i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.ro6 ro6Var = this.f381169m;
            if (ro6Var != null) {
                fVar.i(7, ro6Var.computeSize());
                this.f381169m.writeFields(fVar);
            }
            r45.eq4 eq4Var = this.f381170n;
            if (eq4Var != null) {
                fVar.i(8, eq4Var.computeSize());
                this.f381170n.writeFields(fVar);
            }
            r45.dn4 dn4Var = this.f381171o;
            if (dn4Var != null) {
                fVar.i(9, dn4Var.computeSize());
                this.f381171o.writeFields(fVar);
            }
            fVar.e(10, this.f381172p);
            fVar.e(11, this.f381173q);
            java.lang.String str5 = this.f381174r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f381175s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f381176t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381163d) + 0 + b36.f.h(2, this.f381164e);
            java.lang.String str8 = this.f381165f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f381166g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f381167h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f381168i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            r45.ro6 ro6Var2 = this.f381169m;
            if (ro6Var2 != null) {
                e17 += b36.f.i(7, ro6Var2.computeSize());
            }
            r45.eq4 eq4Var2 = this.f381170n;
            if (eq4Var2 != null) {
                e17 += b36.f.i(8, eq4Var2.computeSize());
            }
            r45.dn4 dn4Var2 = this.f381171o;
            if (dn4Var2 != null) {
                e17 += b36.f.i(9, dn4Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(10, this.f381172p) + b36.f.e(11, this.f381173q);
            java.lang.String str12 = this.f381174r;
            if (str12 != null) {
                e18 += b36.f.j(12, str12);
            }
            java.lang.String str13 = this.f381175s;
            if (str13 != null) {
                e18 += b36.f.j(13, str13);
            }
            java.lang.String str14 = this.f381176t;
            return str14 != null ? e18 + b36.f.j(14, str14) : e18;
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
        r45.n85 n85Var = (r45.n85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n85Var.f381163d = aVar2.g(intValue);
                return 0;
            case 2:
                n85Var.f381164e = aVar2.i(intValue);
                return 0;
            case 3:
                n85Var.f381165f = aVar2.k(intValue);
                return 0;
            case 4:
                n85Var.f381166g = aVar2.k(intValue);
                return 0;
            case 5:
                n85Var.f381167h = aVar2.k(intValue);
                return 0;
            case 6:
                n85Var.f381168i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ro6 ro6Var3 = new r45.ro6();
                    if (bArr != null && bArr.length > 0) {
                        ro6Var3.parseFrom(bArr);
                    }
                    n85Var.f381169m = ro6Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.eq4 eq4Var3 = new r45.eq4();
                    if (bArr2 != null && bArr2.length > 0) {
                        eq4Var3.parseFrom(bArr2);
                    }
                    n85Var.f381170n = eq4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.dn4 dn4Var3 = new r45.dn4();
                    if (bArr3 != null && bArr3.length > 0) {
                        dn4Var3.parseFrom(bArr3);
                    }
                    n85Var.f381171o = dn4Var3;
                }
                return 0;
            case 10:
                n85Var.f381172p = aVar2.g(intValue);
                return 0;
            case 11:
                n85Var.f381173q = aVar2.g(intValue);
                return 0;
            case 12:
                n85Var.f381174r = aVar2.k(intValue);
                return 0;
            case 13:
                n85Var.f381175s = aVar2.k(intValue);
                return 0;
            case 14:
                n85Var.f381176t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
