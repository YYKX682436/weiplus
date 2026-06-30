package r45;

/* loaded from: classes11.dex */
public class je4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377746e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377747f;

    /* renamed from: g, reason: collision with root package name */
    public int f377748g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377749h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377750i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377751m;

    /* renamed from: n, reason: collision with root package name */
    public int f377752n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f377753o;

    /* renamed from: p, reason: collision with root package name */
    public r45.tn0 f377754p;

    /* renamed from: q, reason: collision with root package name */
    public int f377755q;

    /* renamed from: r, reason: collision with root package name */
    public int f377756r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f377757s;

    /* renamed from: t, reason: collision with root package name */
    public r45.cb6 f377758t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f377759u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f377760v;

    /* renamed from: w, reason: collision with root package name */
    public r45.va0 f377761w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f377762x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f377763y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f377764z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.je4)) {
            return false;
        }
        r45.je4 je4Var = (r45.je4) fVar;
        return n51.f.a(this.f377745d, je4Var.f377745d) && n51.f.a(this.f377746e, je4Var.f377746e) && n51.f.a(this.f377747f, je4Var.f377747f) && n51.f.a(java.lang.Integer.valueOf(this.f377748g), java.lang.Integer.valueOf(je4Var.f377748g)) && n51.f.a(this.f377749h, je4Var.f377749h) && n51.f.a(this.f377750i, je4Var.f377750i) && n51.f.a(this.f377751m, je4Var.f377751m) && n51.f.a(java.lang.Integer.valueOf(this.f377752n), java.lang.Integer.valueOf(je4Var.f377752n)) && n51.f.a(this.f377753o, je4Var.f377753o) && n51.f.a(this.f377754p, je4Var.f377754p) && n51.f.a(java.lang.Integer.valueOf(this.f377755q), java.lang.Integer.valueOf(je4Var.f377755q)) && n51.f.a(java.lang.Integer.valueOf(this.f377756r), java.lang.Integer.valueOf(je4Var.f377756r)) && n51.f.a(this.f377757s, je4Var.f377757s) && n51.f.a(this.f377758t, je4Var.f377758t) && n51.f.a(this.f377759u, je4Var.f377759u) && n51.f.a(this.f377760v, je4Var.f377760v) && n51.f.a(this.f377761w, je4Var.f377761w) && n51.f.a(this.f377762x, je4Var.f377762x) && n51.f.a(this.f377763y, je4Var.f377763y) && n51.f.a(this.f377764z, je4Var.f377764z);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377745d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f377746e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f377747f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f377748g);
            java.lang.String str4 = this.f377749h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f377750i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f377751m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f377752n);
            java.lang.String str7 = this.f377753o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            r45.tn0 tn0Var = this.f377754p;
            if (tn0Var != null) {
                fVar.i(10, tn0Var.computeSize());
                this.f377754p.writeFields(fVar);
            }
            fVar.e(11, this.f377755q);
            fVar.e(12, this.f377756r);
            java.lang.String str8 = this.f377757s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            r45.cb6 cb6Var = this.f377758t;
            if (cb6Var != null) {
                fVar.i(14, cb6Var.computeSize());
                this.f377758t.writeFields(fVar);
            }
            java.lang.String str9 = this.f377759u;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            java.lang.String str10 = this.f377760v;
            if (str10 != null) {
                fVar.j(16, str10);
            }
            r45.va0 va0Var = this.f377761w;
            if (va0Var != null) {
                fVar.i(17, va0Var.computeSize());
                this.f377761w.writeFields(fVar);
            }
            java.lang.String str11 = this.f377762x;
            if (str11 != null) {
                fVar.j(20, str11);
            }
            java.lang.String str12 = this.f377763y;
            if (str12 != null) {
                fVar.j(21, str12);
            }
            java.lang.String str13 = this.f377764z;
            if (str13 != null) {
                fVar.j(22, str13);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str14 = this.f377745d;
            int j17 = str14 != null ? b36.f.j(1, str14) + 0 : 0;
            java.lang.String str15 = this.f377746e;
            if (str15 != null) {
                j17 += b36.f.j(2, str15);
            }
            java.lang.String str16 = this.f377747f;
            if (str16 != null) {
                j17 += b36.f.j(3, str16);
            }
            int e17 = j17 + b36.f.e(4, this.f377748g);
            java.lang.String str17 = this.f377749h;
            if (str17 != null) {
                e17 += b36.f.j(5, str17);
            }
            java.lang.String str18 = this.f377750i;
            if (str18 != null) {
                e17 += b36.f.j(6, str18);
            }
            java.lang.String str19 = this.f377751m;
            if (str19 != null) {
                e17 += b36.f.j(7, str19);
            }
            int e18 = e17 + b36.f.e(8, this.f377752n);
            java.lang.String str20 = this.f377753o;
            if (str20 != null) {
                e18 += b36.f.j(9, str20);
            }
            r45.tn0 tn0Var2 = this.f377754p;
            if (tn0Var2 != null) {
                e18 += b36.f.i(10, tn0Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(11, this.f377755q) + b36.f.e(12, this.f377756r);
            java.lang.String str21 = this.f377757s;
            if (str21 != null) {
                e19 += b36.f.j(13, str21);
            }
            r45.cb6 cb6Var2 = this.f377758t;
            if (cb6Var2 != null) {
                e19 += b36.f.i(14, cb6Var2.computeSize());
            }
            java.lang.String str22 = this.f377759u;
            if (str22 != null) {
                e19 += b36.f.j(15, str22);
            }
            java.lang.String str23 = this.f377760v;
            if (str23 != null) {
                e19 += b36.f.j(16, str23);
            }
            r45.va0 va0Var2 = this.f377761w;
            if (va0Var2 != null) {
                e19 += b36.f.i(17, va0Var2.computeSize());
            }
            java.lang.String str24 = this.f377762x;
            if (str24 != null) {
                e19 += b36.f.j(20, str24);
            }
            java.lang.String str25 = this.f377763y;
            if (str25 != null) {
                e19 += b36.f.j(21, str25);
            }
            java.lang.String str26 = this.f377764z;
            return str26 != null ? e19 + b36.f.j(22, str26) : e19;
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
        r45.je4 je4Var = (r45.je4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                je4Var.f377745d = aVar2.k(intValue);
                return 0;
            case 2:
                je4Var.f377746e = aVar2.k(intValue);
                return 0;
            case 3:
                je4Var.f377747f = aVar2.k(intValue);
                return 0;
            case 4:
                je4Var.f377748g = aVar2.g(intValue);
                return 0;
            case 5:
                je4Var.f377749h = aVar2.k(intValue);
                return 0;
            case 6:
                je4Var.f377750i = aVar2.k(intValue);
                return 0;
            case 7:
                je4Var.f377751m = aVar2.k(intValue);
                return 0;
            case 8:
                je4Var.f377752n = aVar2.g(intValue);
                return 0;
            case 9:
                je4Var.f377753o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tn0 tn0Var3 = new r45.tn0();
                    if (bArr != null && bArr.length > 0) {
                        tn0Var3.parseFrom(bArr);
                    }
                    je4Var.f377754p = tn0Var3;
                }
                return 0;
            case 11:
                je4Var.f377755q = aVar2.g(intValue);
                return 0;
            case 12:
                je4Var.f377756r = aVar2.g(intValue);
                return 0;
            case 13:
                je4Var.f377757s = aVar2.k(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.cb6 cb6Var3 = new r45.cb6();
                    if (bArr2 != null && bArr2.length > 0) {
                        cb6Var3.parseFrom(bArr2);
                    }
                    je4Var.f377758t = cb6Var3;
                }
                return 0;
            case 15:
                je4Var.f377759u = aVar2.k(intValue);
                return 0;
            case 16:
                je4Var.f377760v = aVar2.k(intValue);
                return 0;
            case 17:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.va0 va0Var3 = new r45.va0();
                    if (bArr3 != null && bArr3.length > 0) {
                        va0Var3.parseFrom(bArr3);
                    }
                    je4Var.f377761w = va0Var3;
                }
                return 0;
            case 18:
            case 19:
            default:
                return -1;
            case 20:
                je4Var.f377762x = aVar2.k(intValue);
                return 0;
            case 21:
                je4Var.f377763y = aVar2.k(intValue);
                return 0;
            case 22:
                je4Var.f377764z = aVar2.k(intValue);
                return 0;
        }
    }
}
