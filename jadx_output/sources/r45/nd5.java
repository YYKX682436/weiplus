package r45;

/* loaded from: classes15.dex */
public class nd5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381279d;

    /* renamed from: f, reason: collision with root package name */
    public int f381281f;

    /* renamed from: g, reason: collision with root package name */
    public int f381282g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381283h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381284i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381285m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381286n;

    /* renamed from: o, reason: collision with root package name */
    public int f381287o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381288p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f381289q;

    /* renamed from: r, reason: collision with root package name */
    public int f381290r;

    /* renamed from: s, reason: collision with root package name */
    public int f381291s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f381292t;

    /* renamed from: u, reason: collision with root package name */
    public int f381293u;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f381280e = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f381294v = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nd5)) {
            return false;
        }
        r45.nd5 nd5Var = (r45.nd5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381279d), java.lang.Integer.valueOf(nd5Var.f381279d)) && n51.f.a(this.f381280e, nd5Var.f381280e) && n51.f.a(java.lang.Integer.valueOf(this.f381281f), java.lang.Integer.valueOf(nd5Var.f381281f)) && n51.f.a(java.lang.Integer.valueOf(this.f381282g), java.lang.Integer.valueOf(nd5Var.f381282g)) && n51.f.a(this.f381283h, nd5Var.f381283h) && n51.f.a(this.f381284i, nd5Var.f381284i) && n51.f.a(this.f381285m, nd5Var.f381285m) && n51.f.a(this.f381286n, nd5Var.f381286n) && n51.f.a(java.lang.Integer.valueOf(this.f381287o), java.lang.Integer.valueOf(nd5Var.f381287o)) && n51.f.a(this.f381288p, nd5Var.f381288p) && n51.f.a(this.f381289q, nd5Var.f381289q) && n51.f.a(java.lang.Integer.valueOf(this.f381290r), java.lang.Integer.valueOf(nd5Var.f381290r)) && n51.f.a(java.lang.Integer.valueOf(this.f381291s), java.lang.Integer.valueOf(nd5Var.f381291s)) && n51.f.a(this.f381292t, nd5Var.f381292t) && n51.f.a(java.lang.Integer.valueOf(this.f381293u), java.lang.Integer.valueOf(nd5Var.f381293u)) && n51.f.a(this.f381294v, nd5Var.f381294v);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381279d);
            fVar.g(2, 8, this.f381280e);
            fVar.e(3, this.f381281f);
            fVar.e(4, this.f381282g);
            java.lang.String str = this.f381283h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f381284i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f381285m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f381286n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f381287o);
            java.lang.String str5 = this.f381288p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f381289q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.e(12, this.f381290r);
            fVar.e(13, this.f381291s);
            java.lang.String str7 = this.f381292t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.e(15, this.f381293u);
            fVar.g(16, 8, this.f381294v);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381279d) + 0 + b36.f.g(2, 8, this.f381280e) + b36.f.e(3, this.f381281f) + b36.f.e(4, this.f381282g);
            java.lang.String str8 = this.f381283h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f381284i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f381285m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f381286n;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            int e18 = e17 + b36.f.e(9, this.f381287o);
            java.lang.String str12 = this.f381288p;
            if (str12 != null) {
                e18 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f381289q;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            int e19 = e18 + b36.f.e(12, this.f381290r) + b36.f.e(13, this.f381291s);
            java.lang.String str14 = this.f381292t;
            if (str14 != null) {
                e19 += b36.f.j(14, str14);
            }
            return e19 + b36.f.e(15, this.f381293u) + b36.f.g(16, 8, this.f381294v);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f381280e.clear();
            this.f381294v.clear();
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
        r45.nd5 nd5Var = (r45.nd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nd5Var.f381279d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.c44 c44Var = new r45.c44();
                    if (bArr2 != null && bArr2.length > 0) {
                        c44Var.parseFrom(bArr2);
                    }
                    nd5Var.f381280e.add(c44Var);
                }
                return 0;
            case 3:
                nd5Var.f381281f = aVar2.g(intValue);
                return 0;
            case 4:
                nd5Var.f381282g = aVar2.g(intValue);
                return 0;
            case 5:
                nd5Var.f381283h = aVar2.k(intValue);
                return 0;
            case 6:
                nd5Var.f381284i = aVar2.k(intValue);
                return 0;
            case 7:
                nd5Var.f381285m = aVar2.k(intValue);
                return 0;
            case 8:
                nd5Var.f381286n = aVar2.k(intValue);
                return 0;
            case 9:
                nd5Var.f381287o = aVar2.g(intValue);
                return 0;
            case 10:
                nd5Var.f381288p = aVar2.k(intValue);
                return 0;
            case 11:
                nd5Var.f381289q = aVar2.k(intValue);
                return 0;
            case 12:
                nd5Var.f381290r = aVar2.g(intValue);
                return 0;
            case 13:
                nd5Var.f381291s = aVar2.g(intValue);
                return 0;
            case 14:
                nd5Var.f381292t = aVar2.k(intValue);
                return 0;
            case 15:
                nd5Var.f381293u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.we0 we0Var = new r45.we0();
                    if (bArr3 != null && bArr3.length > 0) {
                        we0Var.parseFrom(bArr3);
                    }
                    nd5Var.f381294v.add(we0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
