package pj4;

/* loaded from: classes11.dex */
public class g2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public pj4.b0 f355062d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f355063e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f355064f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f355065g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355066h;

    /* renamed from: i, reason: collision with root package name */
    public int f355067i;

    /* renamed from: m, reason: collision with root package name */
    public int f355068m;

    /* renamed from: n, reason: collision with root package name */
    public long f355069n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f355070o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f355071p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f355072q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f355073r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f355074s;

    /* renamed from: t, reason: collision with root package name */
    public long f355075t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f355076u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.g2)) {
            return false;
        }
        pj4.g2 g2Var = (pj4.g2) fVar;
        return n51.f.a(this.f355062d, g2Var.f355062d) && n51.f.a(this.f355063e, g2Var.f355063e) && n51.f.a(java.lang.Boolean.valueOf(this.f355064f), java.lang.Boolean.valueOf(g2Var.f355064f)) && n51.f.a(this.f355065g, g2Var.f355065g) && n51.f.a(this.f355066h, g2Var.f355066h) && n51.f.a(java.lang.Integer.valueOf(this.f355067i), java.lang.Integer.valueOf(g2Var.f355067i)) && n51.f.a(java.lang.Integer.valueOf(this.f355068m), java.lang.Integer.valueOf(g2Var.f355068m)) && n51.f.a(java.lang.Long.valueOf(this.f355069n), java.lang.Long.valueOf(g2Var.f355069n)) && n51.f.a(java.lang.Boolean.valueOf(this.f355070o), java.lang.Boolean.valueOf(g2Var.f355070o)) && n51.f.a(this.f355071p, g2Var.f355071p) && n51.f.a(this.f355072q, g2Var.f355072q) && n51.f.a(this.f355073r, g2Var.f355073r) && n51.f.a(this.f355074s, g2Var.f355074s) && n51.f.a(java.lang.Long.valueOf(this.f355075t), java.lang.Long.valueOf(g2Var.f355075t)) && n51.f.a(this.f355076u, g2Var.f355076u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            pj4.b0 b0Var = this.f355062d;
            if (b0Var != null) {
                fVar.i(1, b0Var.computeSize());
                this.f355062d.writeFields(fVar);
            }
            fVar.g(2, 1, this.f355063e);
            fVar.a(3, this.f355064f);
            java.lang.String str = this.f355065g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f355066h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f355067i);
            fVar.e(7, this.f355068m);
            fVar.h(8, this.f355069n);
            fVar.a(9, this.f355070o);
            java.lang.String str3 = this.f355071p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f355072q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f355073r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f355074s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.h(14, this.f355075t);
            java.lang.String str7 = this.f355076u;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            pj4.b0 b0Var2 = this.f355062d;
            int i18 = (b0Var2 != null ? b36.f.i(1, b0Var2.computeSize()) + 0 : 0) + b36.f.g(2, 1, this.f355063e) + b36.f.a(3, this.f355064f);
            java.lang.String str8 = this.f355065g;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f355066h;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            int e17 = i18 + b36.f.e(6, this.f355067i) + b36.f.e(7, this.f355068m) + b36.f.h(8, this.f355069n) + b36.f.a(9, this.f355070o);
            java.lang.String str10 = this.f355071p;
            if (str10 != null) {
                e17 += b36.f.j(10, str10);
            }
            java.lang.String str11 = this.f355072q;
            if (str11 != null) {
                e17 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f355073r;
            if (str12 != null) {
                e17 += b36.f.j(12, str12);
            }
            java.lang.String str13 = this.f355074s;
            if (str13 != null) {
                e17 += b36.f.j(13, str13);
            }
            int h17 = e17 + b36.f.h(14, this.f355075t);
            java.lang.String str14 = this.f355076u;
            return str14 != null ? h17 + b36.f.j(15, str14) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f355063e.clear();
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
        pj4.g2 g2Var = (pj4.g2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    pj4.b0 b0Var3 = new pj4.b0();
                    if (bArr2 != null && bArr2.length > 0) {
                        b0Var3.parseFrom(bArr2);
                    }
                    g2Var.f355062d = b0Var3;
                }
                return 0;
            case 2:
                g2Var.f355063e.add(aVar2.k(intValue));
                return 0;
            case 3:
                g2Var.f355064f = aVar2.c(intValue);
                return 0;
            case 4:
                g2Var.f355065g = aVar2.k(intValue);
                return 0;
            case 5:
                g2Var.f355066h = aVar2.k(intValue);
                return 0;
            case 6:
                g2Var.f355067i = aVar2.g(intValue);
                return 0;
            case 7:
                g2Var.f355068m = aVar2.g(intValue);
                return 0;
            case 8:
                g2Var.f355069n = aVar2.i(intValue);
                return 0;
            case 9:
                g2Var.f355070o = aVar2.c(intValue);
                return 0;
            case 10:
                g2Var.f355071p = aVar2.k(intValue);
                return 0;
            case 11:
                g2Var.f355072q = aVar2.k(intValue);
                return 0;
            case 12:
                g2Var.f355073r = aVar2.k(intValue);
                return 0;
            case 13:
                g2Var.f355074s = aVar2.k(intValue);
                return 0;
            case 14:
                g2Var.f355075t = aVar2.i(intValue);
                return 0;
            case 15:
                g2Var.f355076u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
