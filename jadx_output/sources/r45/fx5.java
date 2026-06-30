package r45;

/* loaded from: classes8.dex */
public class fx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f374701d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f374702e;

    /* renamed from: f, reason: collision with root package name */
    public int f374703f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374704g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374705h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374706i;

    /* renamed from: m, reason: collision with root package name */
    public int f374707m;

    /* renamed from: n, reason: collision with root package name */
    public int f374708n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f374709o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f374710p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f374711q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f374712r;

    /* renamed from: s, reason: collision with root package name */
    public int f374713s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f374714t;

    /* renamed from: u, reason: collision with root package name */
    public r45.va0 f374715u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f374716v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f374717w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fx5)) {
            return false;
        }
        r45.fx5 fx5Var = (r45.fx5) fVar;
        return n51.f.a(this.f374701d, fx5Var.f374701d) && n51.f.a(this.f374702e, fx5Var.f374702e) && n51.f.a(java.lang.Integer.valueOf(this.f374703f), java.lang.Integer.valueOf(fx5Var.f374703f)) && n51.f.a(this.f374704g, fx5Var.f374704g) && n51.f.a(this.f374705h, fx5Var.f374705h) && n51.f.a(this.f374706i, fx5Var.f374706i) && n51.f.a(java.lang.Integer.valueOf(this.f374707m), java.lang.Integer.valueOf(fx5Var.f374707m)) && n51.f.a(java.lang.Integer.valueOf(this.f374708n), java.lang.Integer.valueOf(fx5Var.f374708n)) && n51.f.a(this.f374709o, fx5Var.f374709o) && n51.f.a(this.f374710p, fx5Var.f374710p) && n51.f.a(this.f374711q, fx5Var.f374711q) && n51.f.a(this.f374712r, fx5Var.f374712r) && n51.f.a(java.lang.Integer.valueOf(this.f374713s), java.lang.Integer.valueOf(fx5Var.f374713s)) && n51.f.a(this.f374714t, fx5Var.f374714t) && n51.f.a(this.f374715u, fx5Var.f374715u) && n51.f.a(this.f374716v, fx5Var.f374716v) && n51.f.a(this.f374717w, fx5Var.f374717w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f374701d;
            if (du5Var != null) {
                fVar.i(1, du5Var.computeSize());
                this.f374701d.writeFields(fVar);
            }
            r45.du5 du5Var2 = this.f374702e;
            if (du5Var2 != null) {
                fVar.i(2, du5Var2.computeSize());
                this.f374702e.writeFields(fVar);
            }
            fVar.e(3, this.f374703f);
            java.lang.String str = this.f374704g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f374705h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f374706i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f374707m);
            fVar.e(8, this.f374708n);
            java.lang.String str4 = this.f374709o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f374710p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f374711q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f374712r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.e(13, this.f374713s);
            java.lang.String str8 = this.f374714t;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            r45.va0 va0Var = this.f374715u;
            if (va0Var != null) {
                fVar.i(15, va0Var.computeSize());
                this.f374715u.writeFields(fVar);
            }
            java.lang.String str9 = this.f374716v;
            if (str9 != null) {
                fVar.j(16, str9);
            }
            java.lang.String str10 = this.f374717w;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var3 = this.f374701d;
            int i18 = du5Var3 != null ? b36.f.i(1, du5Var3.computeSize()) + 0 : 0;
            r45.du5 du5Var4 = this.f374702e;
            if (du5Var4 != null) {
                i18 += b36.f.i(2, du5Var4.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f374703f);
            java.lang.String str11 = this.f374704g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f374705h;
            if (str12 != null) {
                e17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f374706i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            int e18 = e17 + b36.f.e(7, this.f374707m) + b36.f.e(8, this.f374708n);
            java.lang.String str14 = this.f374709o;
            if (str14 != null) {
                e18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f374710p;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f374711q;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            java.lang.String str17 = this.f374712r;
            if (str17 != null) {
                e18 += b36.f.j(12, str17);
            }
            int e19 = e18 + b36.f.e(13, this.f374713s);
            java.lang.String str18 = this.f374714t;
            if (str18 != null) {
                e19 += b36.f.j(14, str18);
            }
            r45.va0 va0Var2 = this.f374715u;
            if (va0Var2 != null) {
                e19 += b36.f.i(15, va0Var2.computeSize());
            }
            java.lang.String str19 = this.f374716v;
            if (str19 != null) {
                e19 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f374717w;
            return str20 != null ? e19 + b36.f.j(17, str20) : e19;
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
        r45.fx5 fx5Var = (r45.fx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var5.b(bArr);
                    }
                    fx5Var.f374701d = du5Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var6.b(bArr2);
                    }
                    fx5Var.f374702e = du5Var6;
                }
                return 0;
            case 3:
                fx5Var.f374703f = aVar2.g(intValue);
                return 0;
            case 4:
                fx5Var.f374704g = aVar2.k(intValue);
                return 0;
            case 5:
                fx5Var.f374705h = aVar2.k(intValue);
                return 0;
            case 6:
                fx5Var.f374706i = aVar2.k(intValue);
                return 0;
            case 7:
                fx5Var.f374707m = aVar2.g(intValue);
                return 0;
            case 8:
                fx5Var.f374708n = aVar2.g(intValue);
                return 0;
            case 9:
                fx5Var.f374709o = aVar2.k(intValue);
                return 0;
            case 10:
                fx5Var.f374710p = aVar2.k(intValue);
                return 0;
            case 11:
                fx5Var.f374711q = aVar2.k(intValue);
                return 0;
            case 12:
                fx5Var.f374712r = aVar2.k(intValue);
                return 0;
            case 13:
                fx5Var.f374713s = aVar2.g(intValue);
                return 0;
            case 14:
                fx5Var.f374714t = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.va0 va0Var3 = new r45.va0();
                    if (bArr3 != null && bArr3.length > 0) {
                        va0Var3.parseFrom(bArr3);
                    }
                    fx5Var.f374715u = va0Var3;
                }
                return 0;
            case 16:
                fx5Var.f374716v = aVar2.k(intValue);
                return 0;
            case 17:
                fx5Var.f374717w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
