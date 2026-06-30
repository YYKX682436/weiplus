package ot0;

/* loaded from: classes11.dex */
public class q0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f348738d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f348739e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348740f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348741g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348742h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f348743i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f348744m;

    /* renamed from: n, reason: collision with root package name */
    public int f348745n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f348746o;

    /* renamed from: p, reason: collision with root package name */
    public int f348747p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f348748q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f348749r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f348750s;

    /* renamed from: t, reason: collision with root package name */
    public int f348751t;

    /* renamed from: u, reason: collision with root package name */
    public int f348752u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.q0)) {
            return false;
        }
        ot0.q0 q0Var = (ot0.q0) fVar;
        return n51.f.a(this.f348738d, q0Var.f348738d) && n51.f.a(this.f348739e, q0Var.f348739e) && n51.f.a(this.f348740f, q0Var.f348740f) && n51.f.a(this.f348741g, q0Var.f348741g) && n51.f.a(this.f348742h, q0Var.f348742h) && n51.f.a(this.f348743i, q0Var.f348743i) && n51.f.a(this.f348744m, q0Var.f348744m) && n51.f.a(java.lang.Integer.valueOf(this.f348745n), java.lang.Integer.valueOf(q0Var.f348745n)) && n51.f.a(this.f348746o, q0Var.f348746o) && n51.f.a(java.lang.Integer.valueOf(this.f348747p), java.lang.Integer.valueOf(q0Var.f348747p)) && n51.f.a(this.f348748q, q0Var.f348748q) && n51.f.a(this.f348749r, q0Var.f348749r) && n51.f.a(this.f348750s, q0Var.f348750s) && n51.f.a(java.lang.Integer.valueOf(this.f348751t), java.lang.Integer.valueOf(q0Var.f348751t)) && n51.f.a(java.lang.Integer.valueOf(this.f348752u), java.lang.Integer.valueOf(q0Var.f348752u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f348738d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f348739e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f348740f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f348741g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f348742h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f348743i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f348744m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            fVar.e(8, this.f348745n);
            java.lang.String str8 = this.f348746o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            fVar.e(10, this.f348747p);
            java.lang.String str9 = this.f348748q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f348749r;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            java.lang.String str11 = this.f348750s;
            if (str11 != null) {
                fVar.j(13, str11);
            }
            fVar.e(14, this.f348751t);
            fVar.e(15, this.f348752u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str12 = this.f348738d;
            int j17 = str12 != null ? b36.f.j(1, str12) + 0 : 0;
            java.lang.String str13 = this.f348739e;
            if (str13 != null) {
                j17 += b36.f.j(2, str13);
            }
            java.lang.String str14 = this.f348740f;
            if (str14 != null) {
                j17 += b36.f.j(3, str14);
            }
            java.lang.String str15 = this.f348741g;
            if (str15 != null) {
                j17 += b36.f.j(4, str15);
            }
            java.lang.String str16 = this.f348742h;
            if (str16 != null) {
                j17 += b36.f.j(5, str16);
            }
            java.lang.String str17 = this.f348743i;
            if (str17 != null) {
                j17 += b36.f.j(6, str17);
            }
            java.lang.String str18 = this.f348744m;
            if (str18 != null) {
                j17 += b36.f.j(7, str18);
            }
            int e17 = j17 + b36.f.e(8, this.f348745n);
            java.lang.String str19 = this.f348746o;
            if (str19 != null) {
                e17 += b36.f.j(9, str19);
            }
            int e18 = e17 + b36.f.e(10, this.f348747p);
            java.lang.String str20 = this.f348748q;
            if (str20 != null) {
                e18 += b36.f.j(11, str20);
            }
            java.lang.String str21 = this.f348749r;
            if (str21 != null) {
                e18 += b36.f.j(12, str21);
            }
            java.lang.String str22 = this.f348750s;
            if (str22 != null) {
                e18 += b36.f.j(13, str22);
            }
            return e18 + b36.f.e(14, this.f348751t) + b36.f.e(15, this.f348752u);
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
        ot0.q0 q0Var = (ot0.q0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q0Var.f348738d = aVar2.k(intValue);
                return 0;
            case 2:
                q0Var.f348739e = aVar2.k(intValue);
                return 0;
            case 3:
                q0Var.f348740f = aVar2.k(intValue);
                return 0;
            case 4:
                q0Var.f348741g = aVar2.k(intValue);
                return 0;
            case 5:
                q0Var.f348742h = aVar2.k(intValue);
                return 0;
            case 6:
                q0Var.f348743i = aVar2.k(intValue);
                return 0;
            case 7:
                q0Var.f348744m = aVar2.k(intValue);
                return 0;
            case 8:
                q0Var.f348745n = aVar2.g(intValue);
                return 0;
            case 9:
                q0Var.f348746o = aVar2.k(intValue);
                return 0;
            case 10:
                q0Var.f348747p = aVar2.g(intValue);
                return 0;
            case 11:
                q0Var.f348748q = aVar2.k(intValue);
                return 0;
            case 12:
                q0Var.f348749r = aVar2.k(intValue);
                return 0;
            case 13:
                q0Var.f348750s = aVar2.k(intValue);
                return 0;
            case 14:
                q0Var.f348751t = aVar2.g(intValue);
                return 0;
            case 15:
                q0Var.f348752u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
