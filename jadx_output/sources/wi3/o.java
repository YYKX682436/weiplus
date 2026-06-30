package wi3;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.protobuf.f {
    public java.lang.String A;
    public com.tencent.mm.protobuf.g B;
    public final java.util.LinkedList C = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public long f446235d;

    /* renamed from: e, reason: collision with root package name */
    public int f446236e;

    /* renamed from: f, reason: collision with root package name */
    public int f446237f;

    /* renamed from: g, reason: collision with root package name */
    public long f446238g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f446239h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f446240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f446241m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f446242n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f446243o;

    /* renamed from: p, reason: collision with root package name */
    public long f446244p;

    /* renamed from: q, reason: collision with root package name */
    public int f446245q;

    /* renamed from: r, reason: collision with root package name */
    public int f446246r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f446247s;

    /* renamed from: t, reason: collision with root package name */
    public int f446248t;

    /* renamed from: u, reason: collision with root package name */
    public int f446249u;

    /* renamed from: v, reason: collision with root package name */
    public int f446250v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f446251w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f446252x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f446253y;

    /* renamed from: z, reason: collision with root package name */
    public int f446254z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wi3.o)) {
            return false;
        }
        wi3.o oVar = (wi3.o) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f446235d), java.lang.Long.valueOf(oVar.f446235d)) && n51.f.a(java.lang.Integer.valueOf(this.f446236e), java.lang.Integer.valueOf(oVar.f446236e)) && n51.f.a(java.lang.Integer.valueOf(this.f446237f), java.lang.Integer.valueOf(oVar.f446237f)) && n51.f.a(java.lang.Long.valueOf(this.f446238g), java.lang.Long.valueOf(oVar.f446238g)) && n51.f.a(this.f446239h, oVar.f446239h) && n51.f.a(this.f446240i, oVar.f446240i) && n51.f.a(this.f446241m, oVar.f446241m) && n51.f.a(this.f446242n, oVar.f446242n) && n51.f.a(this.f446243o, oVar.f446243o) && n51.f.a(java.lang.Long.valueOf(this.f446244p), java.lang.Long.valueOf(oVar.f446244p)) && n51.f.a(java.lang.Integer.valueOf(this.f446245q), java.lang.Integer.valueOf(oVar.f446245q)) && n51.f.a(java.lang.Integer.valueOf(this.f446246r), java.lang.Integer.valueOf(oVar.f446246r)) && n51.f.a(this.f446247s, oVar.f446247s) && n51.f.a(java.lang.Integer.valueOf(this.f446248t), java.lang.Integer.valueOf(oVar.f446248t)) && n51.f.a(java.lang.Integer.valueOf(this.f446249u), java.lang.Integer.valueOf(oVar.f446249u)) && n51.f.a(java.lang.Integer.valueOf(this.f446250v), java.lang.Integer.valueOf(oVar.f446250v)) && n51.f.a(this.f446251w, oVar.f446251w) && n51.f.a(this.f446252x, oVar.f446252x) && n51.f.a(this.f446253y, oVar.f446253y) && n51.f.a(java.lang.Integer.valueOf(this.f446254z), java.lang.Integer.valueOf(oVar.f446254z)) && n51.f.a(this.A, oVar.A) && n51.f.a(this.B, oVar.B) && n51.f.a(this.C, oVar.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.C;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f446235d);
            fVar.e(2, this.f446236e);
            fVar.e(3, this.f446237f);
            fVar.h(4, this.f446238g);
            java.lang.String str = this.f446239h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f446240i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f446241m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f446242n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f446243o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.h(10, this.f446244p);
            fVar.e(11, this.f446245q);
            fVar.e(12, this.f446246r);
            java.lang.String str6 = this.f446247s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            fVar.e(14, this.f446248t);
            fVar.e(15, this.f446249u);
            fVar.e(16, this.f446250v);
            java.lang.String str7 = this.f446251w;
            if (str7 != null) {
                fVar.j(17, str7);
            }
            java.lang.String str8 = this.f446252x;
            if (str8 != null) {
                fVar.j(18, str8);
            }
            java.lang.String str9 = this.f446253y;
            if (str9 != null) {
                fVar.j(19, str9);
            }
            fVar.e(20, this.f446254z);
            java.lang.String str10 = this.A;
            if (str10 != null) {
                fVar.j(21, str10);
            }
            com.tencent.mm.protobuf.g gVar = this.B;
            if (gVar != null) {
                fVar.b(22, gVar);
            }
            fVar.g(23, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f446235d) + 0 + b36.f.e(2, this.f446236e) + b36.f.e(3, this.f446237f) + b36.f.h(4, this.f446238g);
            java.lang.String str11 = this.f446239h;
            if (str11 != null) {
                h17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f446240i;
            if (str12 != null) {
                h17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f446241m;
            if (str13 != null) {
                h17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f446242n;
            if (str14 != null) {
                h17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f446243o;
            if (str15 != null) {
                h17 += b36.f.j(9, str15);
            }
            int h18 = h17 + b36.f.h(10, this.f446244p) + b36.f.e(11, this.f446245q) + b36.f.e(12, this.f446246r);
            java.lang.String str16 = this.f446247s;
            if (str16 != null) {
                h18 += b36.f.j(13, str16);
            }
            int e17 = h18 + b36.f.e(14, this.f446248t) + b36.f.e(15, this.f446249u) + b36.f.e(16, this.f446250v);
            java.lang.String str17 = this.f446251w;
            if (str17 != null) {
                e17 += b36.f.j(17, str17);
            }
            java.lang.String str18 = this.f446252x;
            if (str18 != null) {
                e17 += b36.f.j(18, str18);
            }
            java.lang.String str19 = this.f446253y;
            if (str19 != null) {
                e17 += b36.f.j(19, str19);
            }
            int e18 = e17 + b36.f.e(20, this.f446254z);
            java.lang.String str20 = this.A;
            if (str20 != null) {
                e18 += b36.f.j(21, str20);
            }
            com.tencent.mm.protobuf.g gVar2 = this.B;
            if (gVar2 != null) {
                e18 += b36.f.b(22, gVar2);
            }
            return e18 + b36.f.g(23, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        wi3.o oVar = (wi3.o) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                oVar.f446235d = aVar2.i(intValue);
                return 0;
            case 2:
                oVar.f446236e = aVar2.g(intValue);
                return 0;
            case 3:
                oVar.f446237f = aVar2.g(intValue);
                return 0;
            case 4:
                oVar.f446238g = aVar2.i(intValue);
                return 0;
            case 5:
                oVar.f446239h = aVar2.k(intValue);
                return 0;
            case 6:
                oVar.f446240i = aVar2.k(intValue);
                return 0;
            case 7:
                oVar.f446241m = aVar2.k(intValue);
                return 0;
            case 8:
                oVar.f446242n = aVar2.k(intValue);
                return 0;
            case 9:
                oVar.f446243o = aVar2.k(intValue);
                return 0;
            case 10:
                oVar.f446244p = aVar2.i(intValue);
                return 0;
            case 11:
                oVar.f446245q = aVar2.g(intValue);
                return 0;
            case 12:
                oVar.f446246r = aVar2.g(intValue);
                return 0;
            case 13:
                oVar.f446247s = aVar2.k(intValue);
                return 0;
            case 14:
                oVar.f446248t = aVar2.g(intValue);
                return 0;
            case 15:
                oVar.f446249u = aVar2.g(intValue);
                return 0;
            case 16:
                oVar.f446250v = aVar2.g(intValue);
                return 0;
            case 17:
                oVar.f446251w = aVar2.k(intValue);
                return 0;
            case 18:
                oVar.f446252x = aVar2.k(intValue);
                return 0;
            case 19:
                oVar.f446253y = aVar2.k(intValue);
                return 0;
            case 20:
                oVar.f446254z = aVar2.g(intValue);
                return 0;
            case 21:
                oVar.A = aVar2.k(intValue);
                return 0;
            case 22:
                oVar.B = aVar2.d(intValue);
                return 0;
            case 23:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    wi3.a aVar3 = new wi3.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar3.parseFrom(bArr2);
                    }
                    oVar.C.add(aVar3);
                }
                return 0;
            default:
                return -1;
        }
    }
}
