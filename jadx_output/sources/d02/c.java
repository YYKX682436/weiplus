package d02;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.protobuf.f {
    public java.lang.String A;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f225276d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225277e;

    /* renamed from: f, reason: collision with root package name */
    public long f225278f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225279g;

    /* renamed from: h, reason: collision with root package name */
    public int f225280h;

    /* renamed from: i, reason: collision with root package name */
    public int f225281i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f225282m;

    /* renamed from: n, reason: collision with root package name */
    public d02.o f225283n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f225284o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f225285p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f225286q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f225287r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f225288s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f225289t;

    /* renamed from: u, reason: collision with root package name */
    public long f225290u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f225291v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f225292w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f225293x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f225294y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f225295z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.c)) {
            return false;
        }
        d02.c cVar = (d02.c) fVar;
        return n51.f.a(this.f225276d, cVar.f225276d) && n51.f.a(this.f225277e, cVar.f225277e) && n51.f.a(java.lang.Long.valueOf(this.f225278f), java.lang.Long.valueOf(cVar.f225278f)) && n51.f.a(this.f225279g, cVar.f225279g) && n51.f.a(java.lang.Integer.valueOf(this.f225280h), java.lang.Integer.valueOf(cVar.f225280h)) && n51.f.a(java.lang.Integer.valueOf(this.f225281i), java.lang.Integer.valueOf(cVar.f225281i)) && n51.f.a(this.f225282m, cVar.f225282m) && n51.f.a(this.f225283n, cVar.f225283n) && n51.f.a(this.f225284o, cVar.f225284o) && n51.f.a(this.f225285p, cVar.f225285p) && n51.f.a(java.lang.Boolean.valueOf(this.f225286q), java.lang.Boolean.valueOf(cVar.f225286q)) && n51.f.a(this.f225287r, cVar.f225287r) && n51.f.a(this.f225288s, cVar.f225288s) && n51.f.a(this.f225289t, cVar.f225289t) && n51.f.a(java.lang.Long.valueOf(this.f225290u), java.lang.Long.valueOf(cVar.f225290u)) && n51.f.a(this.f225291v, cVar.f225291v) && n51.f.a(this.f225292w, cVar.f225292w) && n51.f.a(this.f225293x, cVar.f225293x) && n51.f.a(this.f225294y, cVar.f225294y) && n51.f.a(this.f225295z, cVar.f225295z) && n51.f.a(this.A, cVar.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f225287r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f225276d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f225277e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f225278f);
            java.lang.String str3 = this.f225279g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(6, this.f225280h);
            fVar.e(7, this.f225281i);
            java.lang.String str4 = this.f225282m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            d02.o oVar = this.f225283n;
            if (oVar != null) {
                fVar.i(9, oVar.computeSize());
                this.f225283n.writeFields(fVar);
            }
            java.lang.String str5 = this.f225284o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f225285p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.a(12, this.f225286q);
            fVar.g(13, 8, linkedList);
            java.lang.String str7 = this.f225288s;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            java.lang.String str8 = this.f225289t;
            if (str8 != null) {
                fVar.j(15, str8);
            }
            fVar.h(16, this.f225290u);
            java.lang.String str9 = this.f225291v;
            if (str9 != null) {
                fVar.j(17, str9);
            }
            java.lang.String str10 = this.f225292w;
            if (str10 != null) {
                fVar.j(19, str10);
            }
            java.lang.String str11 = this.f225293x;
            if (str11 != null) {
                fVar.j(20, str11);
            }
            java.lang.String str12 = this.f225294y;
            if (str12 != null) {
                fVar.j(21, str12);
            }
            java.lang.String str13 = this.f225295z;
            if (str13 != null) {
                fVar.j(22, str13);
            }
            java.lang.String str14 = this.A;
            if (str14 != null) {
                fVar.j(23, str14);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str15 = this.f225276d;
            int j17 = str15 != null ? b36.f.j(1, str15) + 0 : 0;
            java.lang.String str16 = this.f225277e;
            if (str16 != null) {
                j17 += b36.f.j(2, str16);
            }
            int h17 = j17 + b36.f.h(3, this.f225278f);
            java.lang.String str17 = this.f225279g;
            if (str17 != null) {
                h17 += b36.f.j(4, str17);
            }
            int e17 = h17 + b36.f.e(6, this.f225280h) + b36.f.e(7, this.f225281i);
            java.lang.String str18 = this.f225282m;
            if (str18 != null) {
                e17 += b36.f.j(8, str18);
            }
            d02.o oVar2 = this.f225283n;
            if (oVar2 != null) {
                e17 += b36.f.i(9, oVar2.computeSize());
            }
            java.lang.String str19 = this.f225284o;
            if (str19 != null) {
                e17 += b36.f.j(10, str19);
            }
            java.lang.String str20 = this.f225285p;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            int a17 = e17 + b36.f.a(12, this.f225286q) + b36.f.g(13, 8, linkedList);
            java.lang.String str21 = this.f225288s;
            if (str21 != null) {
                a17 += b36.f.j(14, str21);
            }
            java.lang.String str22 = this.f225289t;
            if (str22 != null) {
                a17 += b36.f.j(15, str22);
            }
            int h18 = a17 + b36.f.h(16, this.f225290u);
            java.lang.String str23 = this.f225291v;
            if (str23 != null) {
                h18 += b36.f.j(17, str23);
            }
            java.lang.String str24 = this.f225292w;
            if (str24 != null) {
                h18 += b36.f.j(19, str24);
            }
            java.lang.String str25 = this.f225293x;
            if (str25 != null) {
                h18 += b36.f.j(20, str25);
            }
            java.lang.String str26 = this.f225294y;
            if (str26 != null) {
                h18 += b36.f.j(21, str26);
            }
            java.lang.String str27 = this.f225295z;
            if (str27 != null) {
                h18 += b36.f.j(22, str27);
            }
            java.lang.String str28 = this.A;
            return str28 != null ? h18 + b36.f.j(23, str28) : h18;
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
        d02.c cVar = (d02.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f225276d = aVar2.k(intValue);
                return 0;
            case 2:
                cVar.f225277e = aVar2.k(intValue);
                return 0;
            case 3:
                cVar.f225278f = aVar2.i(intValue);
                return 0;
            case 4:
                cVar.f225279g = aVar2.k(intValue);
                return 0;
            case 5:
            case 18:
            default:
                return -1;
            case 6:
                cVar.f225280h = aVar2.g(intValue);
                return 0;
            case 7:
                cVar.f225281i = aVar2.g(intValue);
                return 0;
            case 8:
                cVar.f225282m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    d02.o oVar3 = new d02.o();
                    if (bArr2 != null && bArr2.length > 0) {
                        oVar3.parseFrom(bArr2);
                    }
                    cVar.f225283n = oVar3;
                }
                return 0;
            case 10:
                cVar.f225284o = aVar2.k(intValue);
                return 0;
            case 11:
                cVar.f225285p = aVar2.k(intValue);
                return 0;
            case 12:
                cVar.f225286q = aVar2.c(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    d02.a aVar3 = new d02.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar3.parseFrom(bArr3);
                    }
                    cVar.f225287r.add(aVar3);
                }
                return 0;
            case 14:
                cVar.f225288s = aVar2.k(intValue);
                return 0;
            case 15:
                cVar.f225289t = aVar2.k(intValue);
                return 0;
            case 16:
                cVar.f225290u = aVar2.i(intValue);
                return 0;
            case 17:
                cVar.f225291v = aVar2.k(intValue);
                return 0;
            case 19:
                cVar.f225292w = aVar2.k(intValue);
                return 0;
            case 20:
                cVar.f225293x = aVar2.k(intValue);
                return 0;
            case 21:
                cVar.f225294y = aVar2.k(intValue);
                return 0;
            case 22:
                cVar.f225295z = aVar2.k(intValue);
                return 0;
            case 23:
                cVar.A = aVar2.k(intValue);
                return 0;
        }
    }
}
