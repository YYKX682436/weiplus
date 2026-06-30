package p33;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f351602d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f351603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f351604f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f351605g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f351606h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f351607i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f351608m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f351609n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f351610o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public long f351611p;

    /* renamed from: q, reason: collision with root package name */
    public long f351612q;

    /* renamed from: r, reason: collision with root package name */
    public long f351613r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f351614s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f351615t;

    /* renamed from: u, reason: collision with root package name */
    public int f351616u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f351617v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f351618w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f351619x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f351620y;

    /* renamed from: z, reason: collision with root package name */
    public p33.g0 f351621z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.l)) {
            return false;
        }
        p33.l lVar = (p33.l) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f351602d), java.lang.Boolean.valueOf(lVar.f351602d)) && n51.f.a(java.lang.Boolean.valueOf(this.f351603e), java.lang.Boolean.valueOf(lVar.f351603e)) && n51.f.a(java.lang.Boolean.valueOf(this.f351604f), java.lang.Boolean.valueOf(lVar.f351604f)) && n51.f.a(this.f351605g, lVar.f351605g) && n51.f.a(this.f351606h, lVar.f351606h) && n51.f.a(this.f351607i, lVar.f351607i) && n51.f.a(this.f351608m, lVar.f351608m) && n51.f.a(this.f351609n, lVar.f351609n) && n51.f.a(this.f351610o, lVar.f351610o) && n51.f.a(java.lang.Long.valueOf(this.f351611p), java.lang.Long.valueOf(lVar.f351611p)) && n51.f.a(java.lang.Long.valueOf(this.f351612q), java.lang.Long.valueOf(lVar.f351612q)) && n51.f.a(java.lang.Long.valueOf(this.f351613r), java.lang.Long.valueOf(lVar.f351613r)) && n51.f.a(this.f351614s, lVar.f351614s) && n51.f.a(this.f351615t, lVar.f351615t) && n51.f.a(java.lang.Integer.valueOf(this.f351616u), java.lang.Integer.valueOf(lVar.f351616u)) && n51.f.a(this.f351617v, lVar.f351617v) && n51.f.a(this.f351618w, lVar.f351618w) && n51.f.a(this.f351619x, lVar.f351619x) && n51.f.a(this.f351620y, lVar.f351620y) && n51.f.a(this.f351621z, lVar.f351621z);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f351602d);
            fVar.a(2, this.f351603e);
            fVar.a(3, this.f351604f);
            java.lang.String str = this.f351605g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f351606h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f351607i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f351608m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f351609n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.g(9, 8, this.f351610o);
            fVar.h(10, this.f351611p);
            fVar.h(11, this.f351612q);
            fVar.h(12, this.f351613r);
            java.lang.String str6 = this.f351614s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f351615t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.e(15, this.f351616u);
            java.lang.String str8 = this.f351617v;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            java.lang.String str9 = this.f351618w;
            if (str9 != null) {
                fVar.j(17, str9);
            }
            java.lang.String str10 = this.f351619x;
            if (str10 != null) {
                fVar.j(18, str10);
            }
            java.lang.String str11 = this.f351620y;
            if (str11 != null) {
                fVar.j(19, str11);
            }
            p33.g0 g0Var = this.f351621z;
            if (g0Var != null) {
                fVar.i(20, g0Var.computeSize());
                this.f351621z.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f351602d) + 0 + b36.f.a(2, this.f351603e) + b36.f.a(3, this.f351604f);
            java.lang.String str12 = this.f351605g;
            if (str12 != null) {
                a17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f351606h;
            if (str13 != null) {
                a17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f351607i;
            if (str14 != null) {
                a17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f351608m;
            if (str15 != null) {
                a17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f351609n;
            if (str16 != null) {
                a17 += b36.f.j(8, str16);
            }
            int g17 = a17 + b36.f.g(9, 8, this.f351610o) + b36.f.h(10, this.f351611p) + b36.f.h(11, this.f351612q) + b36.f.h(12, this.f351613r);
            java.lang.String str17 = this.f351614s;
            if (str17 != null) {
                g17 += b36.f.j(13, str17);
            }
            java.lang.String str18 = this.f351615t;
            if (str18 != null) {
                g17 += b36.f.j(14, str18);
            }
            int e17 = g17 + b36.f.e(15, this.f351616u);
            java.lang.String str19 = this.f351617v;
            if (str19 != null) {
                e17 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f351618w;
            if (str20 != null) {
                e17 += b36.f.j(17, str20);
            }
            java.lang.String str21 = this.f351619x;
            if (str21 != null) {
                e17 += b36.f.j(18, str21);
            }
            java.lang.String str22 = this.f351620y;
            if (str22 != null) {
                e17 += b36.f.j(19, str22);
            }
            p33.g0 g0Var2 = this.f351621z;
            return g0Var2 != null ? e17 + b36.f.i(20, g0Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f351610o.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        p33.l lVar = (p33.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lVar.f351602d = aVar2.c(intValue);
                return 0;
            case 2:
                lVar.f351603e = aVar2.c(intValue);
                return 0;
            case 3:
                lVar.f351604f = aVar2.c(intValue);
                return 0;
            case 4:
                lVar.f351605g = aVar2.k(intValue);
                return 0;
            case 5:
                lVar.f351606h = aVar2.k(intValue);
                return 0;
            case 6:
                lVar.f351607i = aVar2.k(intValue);
                return 0;
            case 7:
                lVar.f351608m = aVar2.k(intValue);
                return 0;
            case 8:
                lVar.f351609n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    p33.c0 c0Var = new p33.c0();
                    if (bArr2 != null && bArr2.length > 0) {
                        c0Var.parseFrom(bArr2);
                    }
                    lVar.f351610o.add(c0Var);
                }
                return 0;
            case 10:
                lVar.f351611p = aVar2.i(intValue);
                return 0;
            case 11:
                lVar.f351612q = aVar2.i(intValue);
                return 0;
            case 12:
                lVar.f351613r = aVar2.i(intValue);
                return 0;
            case 13:
                lVar.f351614s = aVar2.k(intValue);
                return 0;
            case 14:
                lVar.f351615t = aVar2.k(intValue);
                return 0;
            case 15:
                lVar.f351616u = aVar2.g(intValue);
                return 0;
            case 16:
                lVar.f351617v = aVar2.k(intValue);
                return 0;
            case 17:
                lVar.f351618w = aVar2.k(intValue);
                return 0;
            case 18:
                lVar.f351619x = aVar2.k(intValue);
                return 0;
            case 19:
                lVar.f351620y = aVar2.k(intValue);
                return 0;
            case 20:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    p33.g0 g0Var3 = new p33.g0();
                    if (bArr3 != null && bArr3.length > 0) {
                        g0Var3.parseFrom(bArr3);
                    }
                    lVar.f351621z = g0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
