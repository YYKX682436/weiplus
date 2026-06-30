package r45;

/* loaded from: classes11.dex */
public class o36 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f381867d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381868e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381869f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381870g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381871h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381872i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f381873m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f381874n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f381875o;

    /* renamed from: p, reason: collision with root package name */
    public int f381876p;

    /* renamed from: q, reason: collision with root package name */
    public int f381877q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f381878r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f381879s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f381880t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f381881u;

    /* renamed from: v, reason: collision with root package name */
    public int f381882v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f381883w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f381884x;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o36)) {
            return false;
        }
        r45.o36 o36Var = (r45.o36) fVar;
        return n51.f.a(this.BaseResponse, o36Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f381867d), java.lang.Integer.valueOf(o36Var.f381867d)) && n51.f.a(this.f381868e, o36Var.f381868e) && n51.f.a(this.f381869f, o36Var.f381869f) && n51.f.a(this.f381870g, o36Var.f381870g) && n51.f.a(this.f381871h, o36Var.f381871h) && n51.f.a(this.f381872i, o36Var.f381872i) && n51.f.a(this.f381873m, o36Var.f381873m) && n51.f.a(this.f381874n, o36Var.f381874n) && n51.f.a(this.f381875o, o36Var.f381875o) && n51.f.a(java.lang.Integer.valueOf(this.f381876p), java.lang.Integer.valueOf(o36Var.f381876p)) && n51.f.a(java.lang.Integer.valueOf(this.f381877q), java.lang.Integer.valueOf(o36Var.f381877q)) && n51.f.a(this.f381878r, o36Var.f381878r) && n51.f.a(this.f381879s, o36Var.f381879s) && n51.f.a(this.f381880t, o36Var.f381880t) && n51.f.a(this.f381881u, o36Var.f381881u) && n51.f.a(java.lang.Integer.valueOf(this.f381882v), java.lang.Integer.valueOf(o36Var.f381882v)) && n51.f.a(this.f381883w, o36Var.f381883w) && n51.f.a(java.lang.Boolean.valueOf(this.f381884x), java.lang.Boolean.valueOf(o36Var.f381884x));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f381867d);
            java.lang.String str = this.f381868e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381869f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381870g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f381871h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f381872i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f381873m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f381874n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f381875o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f381876p);
            fVar.e(12, this.f381877q);
            java.lang.String str9 = this.f381878r;
            if (str9 != null) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f381879s;
            if (str10 != null) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f381880t;
            if (str11 != null) {
                fVar.j(19, str11);
            }
            java.lang.String str12 = this.f381881u;
            if (str12 != null) {
                fVar.j(21, str12);
            }
            fVar.e(22, this.f381882v);
            java.lang.String str13 = this.f381883w;
            if (str13 != null) {
                fVar.j(23, str13);
            }
            fVar.a(24, this.f381884x);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f381867d);
            java.lang.String str14 = this.f381868e;
            if (str14 != null) {
                i18 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f381869f;
            if (str15 != null) {
                i18 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f381870g;
            if (str16 != null) {
                i18 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f381871h;
            if (str17 != null) {
                i18 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f381872i;
            if (str18 != null) {
                i18 += b36.f.j(7, str18);
            }
            java.lang.String str19 = this.f381873m;
            if (str19 != null) {
                i18 += b36.f.j(8, str19);
            }
            java.lang.String str20 = this.f381874n;
            if (str20 != null) {
                i18 += b36.f.j(9, str20);
            }
            java.lang.String str21 = this.f381875o;
            if (str21 != null) {
                i18 += b36.f.j(10, str21);
            }
            int e17 = i18 + b36.f.e(11, this.f381876p) + b36.f.e(12, this.f381877q);
            java.lang.String str22 = this.f381878r;
            if (str22 != null) {
                e17 += b36.f.j(13, str22);
            }
            java.lang.String str23 = this.f381879s;
            if (str23 != null) {
                e17 += b36.f.j(14, str23);
            }
            java.lang.String str24 = this.f381880t;
            if (str24 != null) {
                e17 += b36.f.j(19, str24);
            }
            java.lang.String str25 = this.f381881u;
            if (str25 != null) {
                e17 += b36.f.j(21, str25);
            }
            int e18 = e17 + b36.f.e(22, this.f381882v);
            java.lang.String str26 = this.f381883w;
            if (str26 != null) {
                e18 += b36.f.j(23, str26);
            }
            return e18 + b36.f.a(24, this.f381884x);
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
        r45.o36 o36Var = (r45.o36) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    o36Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                o36Var.f381867d = aVar2.g(intValue);
                return 0;
            case 3:
                o36Var.f381868e = aVar2.k(intValue);
                return 0;
            case 4:
                o36Var.f381869f = aVar2.k(intValue);
                return 0;
            case 5:
                o36Var.f381870g = aVar2.k(intValue);
                return 0;
            case 6:
                o36Var.f381871h = aVar2.k(intValue);
                return 0;
            case 7:
                o36Var.f381872i = aVar2.k(intValue);
                return 0;
            case 8:
                o36Var.f381873m = aVar2.k(intValue);
                return 0;
            case 9:
                o36Var.f381874n = aVar2.k(intValue);
                return 0;
            case 10:
                o36Var.f381875o = aVar2.k(intValue);
                return 0;
            case 11:
                o36Var.f381876p = aVar2.g(intValue);
                return 0;
            case 12:
                o36Var.f381877q = aVar2.g(intValue);
                return 0;
            case 13:
                o36Var.f381878r = aVar2.k(intValue);
                return 0;
            case 14:
                o36Var.f381879s = aVar2.k(intValue);
                return 0;
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            default:
                return -1;
            case 19:
                o36Var.f381880t = aVar2.k(intValue);
                return 0;
            case 21:
                o36Var.f381881u = aVar2.k(intValue);
                return 0;
            case 22:
                o36Var.f381882v = aVar2.g(intValue);
                return 0;
            case 23:
                o36Var.f381883w = aVar2.k(intValue);
                return 0;
            case 24:
                o36Var.f381884x = aVar2.c(intValue);
                return 0;
        }
    }
}
