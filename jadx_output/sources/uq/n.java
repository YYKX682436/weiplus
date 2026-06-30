package uq;

/* loaded from: classes4.dex */
public class n extends com.tencent.mm.protobuf.f {
    public java.lang.String A = "fa5151";
    public java.lang.String B = "ffffff";
    public java.lang.String C = "f2f2f2";
    public java.lang.String D = "fa5151";
    public java.lang.String E = "C84040";

    /* renamed from: d, reason: collision with root package name */
    public int f430159d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f430160e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f430161f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f430162g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f430163h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f430164i;

    /* renamed from: m, reason: collision with root package name */
    public int f430165m;

    /* renamed from: n, reason: collision with root package name */
    public uq.p f430166n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f430167o;

    /* renamed from: p, reason: collision with root package name */
    public int f430168p;

    /* renamed from: q, reason: collision with root package name */
    public uq.p f430169q;

    /* renamed from: r, reason: collision with root package name */
    public int f430170r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f430171s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f430172t;

    /* renamed from: u, reason: collision with root package name */
    public long f430173u;

    /* renamed from: v, reason: collision with root package name */
    public uq.o f430174v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f430175w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f430176x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f430177y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f430178z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof uq.n)) {
            return false;
        }
        uq.n nVar = (uq.n) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f430159d), java.lang.Integer.valueOf(nVar.f430159d)) && n51.f.a(this.f430160e, nVar.f430160e) && n51.f.a(this.f430161f, nVar.f430161f) && n51.f.a(this.f430162g, nVar.f430162g) && n51.f.a(this.f430163h, nVar.f430163h) && n51.f.a(this.f430164i, nVar.f430164i) && n51.f.a(java.lang.Integer.valueOf(this.f430165m), java.lang.Integer.valueOf(nVar.f430165m)) && n51.f.a(this.f430166n, nVar.f430166n) && n51.f.a(this.f430167o, nVar.f430167o) && n51.f.a(java.lang.Integer.valueOf(this.f430168p), java.lang.Integer.valueOf(nVar.f430168p)) && n51.f.a(this.f430169q, nVar.f430169q) && n51.f.a(java.lang.Integer.valueOf(this.f430170r), java.lang.Integer.valueOf(nVar.f430170r)) && n51.f.a(this.f430171s, nVar.f430171s) && n51.f.a(this.f430172t, nVar.f430172t) && n51.f.a(java.lang.Long.valueOf(this.f430173u), java.lang.Long.valueOf(nVar.f430173u)) && n51.f.a(this.f430174v, nVar.f430174v) && n51.f.a(this.f430175w, nVar.f430175w) && n51.f.a(this.f430176x, nVar.f430176x) && n51.f.a(this.f430177y, nVar.f430177y) && n51.f.a(this.f430178z, nVar.f430178z) && n51.f.a(this.A, nVar.A) && n51.f.a(this.B, nVar.B) && n51.f.a(this.C, nVar.C) && n51.f.a(this.D, nVar.D) && n51.f.a(this.E, nVar.E);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f430159d);
            java.lang.String str = this.f430160e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f430161f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f430162g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f430163h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f430164i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f430165m);
            uq.p pVar = this.f430166n;
            if (pVar != null) {
                fVar.i(9, pVar.computeSize());
                this.f430166n.writeFields(fVar);
            }
            java.lang.String str6 = this.f430167o;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            fVar.e(11, this.f430168p);
            uq.p pVar2 = this.f430169q;
            if (pVar2 != null) {
                fVar.i(12, pVar2.computeSize());
                this.f430169q.writeFields(fVar);
            }
            fVar.e(14, this.f430170r);
            java.lang.String str7 = this.f430171s;
            if (str7 != null) {
                fVar.j(15, str7);
            }
            java.lang.String str8 = this.f430172t;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            fVar.h(19, this.f430173u);
            uq.o oVar = this.f430174v;
            if (oVar != null) {
                fVar.i(25, oVar.computeSize());
                this.f430174v.writeFields(fVar);
            }
            java.lang.String str9 = this.f430175w;
            if (str9 != null) {
                fVar.j(6, str9);
            }
            java.lang.String str10 = this.f430176x;
            if (str10 != null) {
                fVar.j(13, str10);
            }
            java.lang.String str11 = this.f430177y;
            if (str11 != null) {
                fVar.j(17, str11);
            }
            java.lang.String str12 = this.f430178z;
            if (str12 != null) {
                fVar.j(18, str12);
            }
            java.lang.String str13 = this.A;
            if (str13 != null) {
                fVar.j(20, str13);
            }
            java.lang.String str14 = this.B;
            if (str14 != null) {
                fVar.j(21, str14);
            }
            java.lang.String str15 = this.C;
            if (str15 != null) {
                fVar.j(22, str15);
            }
            java.lang.String str16 = this.D;
            if (str16 != null) {
                fVar.j(23, str16);
            }
            java.lang.String str17 = this.E;
            if (str17 != null) {
                fVar.j(24, str17);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f430159d) + 0;
            java.lang.String str18 = this.f430160e;
            if (str18 != null) {
                e17 += b36.f.j(2, str18);
            }
            java.lang.String str19 = this.f430161f;
            if (str19 != null) {
                e17 += b36.f.j(3, str19);
            }
            java.lang.String str20 = this.f430162g;
            if (str20 != null) {
                e17 += b36.f.j(4, str20);
            }
            java.lang.String str21 = this.f430163h;
            if (str21 != null) {
                e17 += b36.f.j(5, str21);
            }
            java.lang.String str22 = this.f430164i;
            if (str22 != null) {
                e17 += b36.f.j(7, str22);
            }
            int e18 = e17 + b36.f.e(8, this.f430165m);
            uq.p pVar3 = this.f430166n;
            if (pVar3 != null) {
                e18 += b36.f.i(9, pVar3.computeSize());
            }
            java.lang.String str23 = this.f430167o;
            if (str23 != null) {
                e18 += b36.f.j(10, str23);
            }
            int e19 = e18 + b36.f.e(11, this.f430168p);
            uq.p pVar4 = this.f430169q;
            if (pVar4 != null) {
                e19 += b36.f.i(12, pVar4.computeSize());
            }
            int e27 = e19 + b36.f.e(14, this.f430170r);
            java.lang.String str24 = this.f430171s;
            if (str24 != null) {
                e27 += b36.f.j(15, str24);
            }
            java.lang.String str25 = this.f430172t;
            if (str25 != null) {
                e27 += b36.f.j(16, str25);
            }
            int h17 = e27 + b36.f.h(19, this.f430173u);
            uq.o oVar2 = this.f430174v;
            if (oVar2 != null) {
                h17 += b36.f.i(25, oVar2.computeSize());
            }
            java.lang.String str26 = this.f430175w;
            if (str26 != null) {
                h17 += b36.f.j(6, str26);
            }
            java.lang.String str27 = this.f430176x;
            if (str27 != null) {
                h17 += b36.f.j(13, str27);
            }
            java.lang.String str28 = this.f430177y;
            if (str28 != null) {
                h17 += b36.f.j(17, str28);
            }
            java.lang.String str29 = this.f430178z;
            if (str29 != null) {
                h17 += b36.f.j(18, str29);
            }
            java.lang.String str30 = this.A;
            if (str30 != null) {
                h17 += b36.f.j(20, str30);
            }
            java.lang.String str31 = this.B;
            if (str31 != null) {
                h17 += b36.f.j(21, str31);
            }
            java.lang.String str32 = this.C;
            if (str32 != null) {
                h17 += b36.f.j(22, str32);
            }
            java.lang.String str33 = this.D;
            if (str33 != null) {
                h17 += b36.f.j(23, str33);
            }
            java.lang.String str34 = this.E;
            return str34 != null ? h17 + b36.f.j(24, str34) : h17;
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
        uq.n nVar = (uq.n) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                nVar.f430159d = aVar2.g(intValue);
                return 0;
            case 2:
                nVar.f430160e = aVar2.k(intValue);
                return 0;
            case 3:
                nVar.f430161f = aVar2.k(intValue);
                return 0;
            case 4:
                nVar.f430162g = aVar2.k(intValue);
                return 0;
            case 5:
                nVar.f430163h = aVar2.k(intValue);
                return 0;
            case 6:
                nVar.f430175w = aVar2.k(intValue);
                return 0;
            case 7:
                nVar.f430164i = aVar2.k(intValue);
                return 0;
            case 8:
                nVar.f430165m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    uq.p pVar5 = new uq.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar5.parseFrom(bArr);
                    }
                    nVar.f430166n = pVar5;
                }
                return 0;
            case 10:
                nVar.f430167o = aVar2.k(intValue);
                return 0;
            case 11:
                nVar.f430168p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    uq.p pVar6 = new uq.p();
                    if (bArr2 != null && bArr2.length > 0) {
                        pVar6.parseFrom(bArr2);
                    }
                    nVar.f430169q = pVar6;
                }
                return 0;
            case 13:
                nVar.f430176x = aVar2.k(intValue);
                return 0;
            case 14:
                nVar.f430170r = aVar2.g(intValue);
                return 0;
            case 15:
                nVar.f430171s = aVar2.k(intValue);
                return 0;
            case 16:
                nVar.f430172t = aVar2.k(intValue);
                return 0;
            case 17:
                nVar.f430177y = aVar2.k(intValue);
                return 0;
            case 18:
                nVar.f430178z = aVar2.k(intValue);
                return 0;
            case 19:
                nVar.f430173u = aVar2.i(intValue);
                return 0;
            case 20:
                nVar.A = aVar2.k(intValue);
                return 0;
            case 21:
                nVar.B = aVar2.k(intValue);
                return 0;
            case 22:
                nVar.C = aVar2.k(intValue);
                return 0;
            case 23:
                nVar.D = aVar2.k(intValue);
                return 0;
            case 24:
                nVar.E = aVar2.k(intValue);
                return 0;
            case 25:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    uq.o oVar3 = new uq.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar3.parseFrom(bArr3);
                    }
                    nVar.f430174v = oVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
