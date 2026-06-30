package r45;

/* loaded from: classes12.dex */
public class b06 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370397d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370398e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370399f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370400g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370401h;

    /* renamed from: i, reason: collision with root package name */
    public int f370402i;

    /* renamed from: m, reason: collision with root package name */
    public int f370403m;

    /* renamed from: n, reason: collision with root package name */
    public int f370404n;

    /* renamed from: o, reason: collision with root package name */
    public int f370405o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f370406p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f370407q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f370408r;

    /* renamed from: s, reason: collision with root package name */
    public int f370409s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f370410t;

    /* renamed from: u, reason: collision with root package name */
    public int f370411u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f370412v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f370413w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f370414x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f370415y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f370416z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b06)) {
            return false;
        }
        r45.b06 b06Var = (r45.b06) fVar;
        return n51.f.a(this.BaseRequest, b06Var.BaseRequest) && n51.f.a(this.f370397d, b06Var.f370397d) && n51.f.a(this.f370398e, b06Var.f370398e) && n51.f.a(this.f370399f, b06Var.f370399f) && n51.f.a(this.f370400g, b06Var.f370400g) && n51.f.a(this.f370401h, b06Var.f370401h) && n51.f.a(java.lang.Integer.valueOf(this.f370402i), java.lang.Integer.valueOf(b06Var.f370402i)) && n51.f.a(java.lang.Integer.valueOf(this.f370403m), java.lang.Integer.valueOf(b06Var.f370403m)) && n51.f.a(java.lang.Integer.valueOf(this.f370404n), java.lang.Integer.valueOf(b06Var.f370404n)) && n51.f.a(java.lang.Integer.valueOf(this.f370405o), java.lang.Integer.valueOf(b06Var.f370405o)) && n51.f.a(this.f370406p, b06Var.f370406p) && n51.f.a(this.f370407q, b06Var.f370407q) && n51.f.a(this.f370408r, b06Var.f370408r) && n51.f.a(java.lang.Integer.valueOf(this.f370409s), java.lang.Integer.valueOf(b06Var.f370409s)) && n51.f.a(this.f370410t, b06Var.f370410t) && n51.f.a(java.lang.Integer.valueOf(this.f370411u), java.lang.Integer.valueOf(b06Var.f370411u)) && n51.f.a(this.f370412v, b06Var.f370412v) && n51.f.a(this.f370413w, b06Var.f370413w) && n51.f.a(this.f370414x, b06Var.f370414x) && n51.f.a(this.f370415y, b06Var.f370415y) && n51.f.a(this.f370416z, b06Var.f370416z);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f370397d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370398e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f370399f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f370400g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f370401h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f370402i);
            fVar.e(8, this.f370403m);
            fVar.e(9, this.f370404n);
            fVar.e(10, this.f370405o);
            java.lang.String str6 = this.f370406p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f370407q;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            java.lang.String str8 = this.f370408r;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            fVar.e(14, this.f370409s);
            java.lang.String str9 = this.f370410t;
            if (str9 != null) {
                fVar.j(15, str9);
            }
            fVar.e(16, this.f370411u);
            java.lang.String str10 = this.f370412v;
            if (str10 != null) {
                fVar.j(17, str10);
            }
            java.lang.String str11 = this.f370413w;
            if (str11 != null) {
                fVar.j(18, str11);
            }
            java.lang.String str12 = this.f370414x;
            if (str12 != null) {
                fVar.j(19, str12);
            }
            java.lang.String str13 = this.f370415y;
            if (str13 != null) {
                fVar.j(20, str13);
            }
            java.lang.String str14 = this.f370416z;
            if (str14 != null) {
                fVar.j(21, str14);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            java.lang.String str15 = this.f370397d;
            if (str15 != null) {
                i18 += b36.f.j(2, str15);
            }
            java.lang.String str16 = this.f370398e;
            if (str16 != null) {
                i18 += b36.f.j(3, str16);
            }
            java.lang.String str17 = this.f370399f;
            if (str17 != null) {
                i18 += b36.f.j(4, str17);
            }
            java.lang.String str18 = this.f370400g;
            if (str18 != null) {
                i18 += b36.f.j(5, str18);
            }
            java.lang.String str19 = this.f370401h;
            if (str19 != null) {
                i18 += b36.f.j(6, str19);
            }
            int e17 = i18 + b36.f.e(7, this.f370402i) + b36.f.e(8, this.f370403m) + b36.f.e(9, this.f370404n) + b36.f.e(10, this.f370405o);
            java.lang.String str20 = this.f370406p;
            if (str20 != null) {
                e17 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f370407q;
            if (str21 != null) {
                e17 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f370408r;
            if (str22 != null) {
                e17 += b36.f.j(13, str22);
            }
            int e18 = e17 + b36.f.e(14, this.f370409s);
            java.lang.String str23 = this.f370410t;
            if (str23 != null) {
                e18 += b36.f.j(15, str23);
            }
            int e19 = e18 + b36.f.e(16, this.f370411u);
            java.lang.String str24 = this.f370412v;
            if (str24 != null) {
                e19 += b36.f.j(17, str24);
            }
            java.lang.String str25 = this.f370413w;
            if (str25 != null) {
                e19 += b36.f.j(18, str25);
            }
            java.lang.String str26 = this.f370414x;
            if (str26 != null) {
                e19 += b36.f.j(19, str26);
            }
            java.lang.String str27 = this.f370415y;
            if (str27 != null) {
                e19 += b36.f.j(20, str27);
            }
            java.lang.String str28 = this.f370416z;
            return str28 != null ? e19 + b36.f.j(21, str28) : e19;
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
        r45.b06 b06Var = (r45.b06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    b06Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                b06Var.f370397d = aVar2.k(intValue);
                return 0;
            case 3:
                b06Var.f370398e = aVar2.k(intValue);
                return 0;
            case 4:
                b06Var.f370399f = aVar2.k(intValue);
                return 0;
            case 5:
                b06Var.f370400g = aVar2.k(intValue);
                return 0;
            case 6:
                b06Var.f370401h = aVar2.k(intValue);
                return 0;
            case 7:
                b06Var.f370402i = aVar2.g(intValue);
                return 0;
            case 8:
                b06Var.f370403m = aVar2.g(intValue);
                return 0;
            case 9:
                b06Var.f370404n = aVar2.g(intValue);
                return 0;
            case 10:
                b06Var.f370405o = aVar2.g(intValue);
                return 0;
            case 11:
                b06Var.f370406p = aVar2.k(intValue);
                return 0;
            case 12:
                b06Var.f370407q = aVar2.k(intValue);
                return 0;
            case 13:
                b06Var.f370408r = aVar2.k(intValue);
                return 0;
            case 14:
                b06Var.f370409s = aVar2.g(intValue);
                return 0;
            case 15:
                b06Var.f370410t = aVar2.k(intValue);
                return 0;
            case 16:
                b06Var.f370411u = aVar2.g(intValue);
                return 0;
            case 17:
                b06Var.f370412v = aVar2.k(intValue);
                return 0;
            case 18:
                b06Var.f370413w = aVar2.k(intValue);
                return 0;
            case 19:
                b06Var.f370414x = aVar2.k(intValue);
                return 0;
            case 20:
                b06Var.f370415y = aVar2.k(intValue);
                return 0;
            case 21:
                b06Var.f370416z = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
