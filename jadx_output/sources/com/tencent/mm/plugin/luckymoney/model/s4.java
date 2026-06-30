package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class s4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145604d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145605e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145606f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145607g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145608h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145609i;

    /* renamed from: m, reason: collision with root package name */
    public int f145610m;

    /* renamed from: n, reason: collision with root package name */
    public int f145611n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145612o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f145613p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f145614q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f145615r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.s4)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.s4 s4Var = (com.tencent.mm.plugin.luckymoney.model.s4) fVar;
        return n51.f.a(this.f145604d, s4Var.f145604d) && n51.f.a(this.f145605e, s4Var.f145605e) && n51.f.a(this.f145606f, s4Var.f145606f) && n51.f.a(this.f145607g, s4Var.f145607g) && n51.f.a(this.f145608h, s4Var.f145608h) && n51.f.a(this.f145609i, s4Var.f145609i) && n51.f.a(java.lang.Integer.valueOf(this.f145610m), java.lang.Integer.valueOf(s4Var.f145610m)) && n51.f.a(java.lang.Integer.valueOf(this.f145611n), java.lang.Integer.valueOf(s4Var.f145611n)) && n51.f.a(this.f145612o, s4Var.f145612o) && n51.f.a(this.f145613p, s4Var.f145613p) && n51.f.a(this.f145614q, s4Var.f145614q) && n51.f.a(this.f145615r, s4Var.f145615r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145604d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f145605e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f145606f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f145607g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f145608h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f145609i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f145610m);
            fVar.e(8, this.f145611n);
            java.lang.String str7 = this.f145612o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f145613p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            java.lang.String str9 = this.f145614q;
            if (str9 != null) {
                fVar.j(11, str9);
            }
            java.lang.String str10 = this.f145615r;
            if (str10 != null) {
                fVar.j(12, str10);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f145604d;
            int j17 = str11 != null ? 0 + b36.f.j(1, str11) : 0;
            java.lang.String str12 = this.f145605e;
            if (str12 != null) {
                j17 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f145606f;
            if (str13 != null) {
                j17 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f145607g;
            if (str14 != null) {
                j17 += b36.f.j(4, str14);
            }
            java.lang.String str15 = this.f145608h;
            if (str15 != null) {
                j17 += b36.f.j(5, str15);
            }
            java.lang.String str16 = this.f145609i;
            if (str16 != null) {
                j17 += b36.f.j(6, str16);
            }
            int e17 = j17 + b36.f.e(7, this.f145610m) + b36.f.e(8, this.f145611n);
            java.lang.String str17 = this.f145612o;
            if (str17 != null) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f145613p;
            if (str18 != null) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f145614q;
            if (str19 != null) {
                e17 += b36.f.j(11, str19);
            }
            java.lang.String str20 = this.f145615r;
            return str20 != null ? e17 + b36.f.j(12, str20) : e17;
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
        com.tencent.mm.plugin.luckymoney.model.s4 s4Var = (com.tencent.mm.plugin.luckymoney.model.s4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s4Var.f145604d = aVar2.k(intValue);
                return 0;
            case 2:
                s4Var.f145605e = aVar2.k(intValue);
                return 0;
            case 3:
                s4Var.f145606f = aVar2.k(intValue);
                return 0;
            case 4:
                s4Var.f145607g = aVar2.k(intValue);
                return 0;
            case 5:
                s4Var.f145608h = aVar2.k(intValue);
                return 0;
            case 6:
                s4Var.f145609i = aVar2.k(intValue);
                return 0;
            case 7:
                s4Var.f145610m = aVar2.g(intValue);
                return 0;
            case 8:
                s4Var.f145611n = aVar2.g(intValue);
                return 0;
            case 9:
                s4Var.f145612o = aVar2.k(intValue);
                return 0;
            case 10:
                s4Var.f145613p = aVar2.k(intValue);
                return 0;
            case 11:
                s4Var.f145614q = aVar2.k(intValue);
                return 0;
            case 12:
                s4Var.f145615r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
