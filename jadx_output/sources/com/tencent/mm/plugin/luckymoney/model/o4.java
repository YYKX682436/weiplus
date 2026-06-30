package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class o4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145496d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145497e;

    /* renamed from: f, reason: collision with root package name */
    public long f145498f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145499g;

    /* renamed from: h, reason: collision with root package name */
    public int f145500h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145501i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145502m;

    /* renamed from: n, reason: collision with root package name */
    public long f145503n;

    /* renamed from: o, reason: collision with root package name */
    public long f145504o;

    /* renamed from: p, reason: collision with root package name */
    public long f145505p;

    /* renamed from: q, reason: collision with root package name */
    public int f145506q;

    /* renamed from: r, reason: collision with root package name */
    public int f145507r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145508s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f145509t;

    /* renamed from: u, reason: collision with root package name */
    public int f145510u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f145511v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f145512w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.o4)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.o4 o4Var = (com.tencent.mm.plugin.luckymoney.model.o4) fVar;
        return n51.f.a(this.f145496d, o4Var.f145496d) && n51.f.a(this.f145497e, o4Var.f145497e) && n51.f.a(java.lang.Long.valueOf(this.f145498f), java.lang.Long.valueOf(o4Var.f145498f)) && n51.f.a(this.f145499g, o4Var.f145499g) && n51.f.a(java.lang.Integer.valueOf(this.f145500h), java.lang.Integer.valueOf(o4Var.f145500h)) && n51.f.a(this.f145501i, o4Var.f145501i) && n51.f.a(this.f145502m, o4Var.f145502m) && n51.f.a(java.lang.Long.valueOf(this.f145503n), java.lang.Long.valueOf(o4Var.f145503n)) && n51.f.a(java.lang.Long.valueOf(this.f145504o), java.lang.Long.valueOf(o4Var.f145504o)) && n51.f.a(java.lang.Long.valueOf(this.f145505p), java.lang.Long.valueOf(o4Var.f145505p)) && n51.f.a(java.lang.Integer.valueOf(this.f145506q), java.lang.Integer.valueOf(o4Var.f145506q)) && n51.f.a(java.lang.Integer.valueOf(this.f145507r), java.lang.Integer.valueOf(o4Var.f145507r)) && n51.f.a(this.f145508s, o4Var.f145508s) && n51.f.a(this.f145509t, o4Var.f145509t) && n51.f.a(java.lang.Integer.valueOf(this.f145510u), java.lang.Integer.valueOf(o4Var.f145510u)) && n51.f.a(this.f145511v, o4Var.f145511v) && n51.f.a(this.f145512w, o4Var.f145512w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145496d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f145497e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f145498f);
            java.lang.String str3 = this.f145499g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f145500h);
            java.lang.String str4 = this.f145501i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f145502m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f145503n);
            fVar.h(9, this.f145504o);
            fVar.h(10, this.f145505p);
            fVar.e(11, this.f145506q);
            fVar.e(12, this.f145507r);
            java.lang.String str6 = this.f145508s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f145509t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.e(15, this.f145510u);
            java.lang.String str8 = this.f145511v;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            java.lang.String str9 = this.f145512w;
            if (str9 != null) {
                fVar.j(17, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f145496d;
            int j17 = str10 != null ? b36.f.j(1, str10) + 0 : 0;
            java.lang.String str11 = this.f145497e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            int h17 = j17 + b36.f.h(3, this.f145498f);
            java.lang.String str12 = this.f145499g;
            if (str12 != null) {
                h17 += b36.f.j(4, str12);
            }
            int e17 = h17 + b36.f.e(5, this.f145500h);
            java.lang.String str13 = this.f145501i;
            if (str13 != null) {
                e17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f145502m;
            if (str14 != null) {
                e17 += b36.f.j(7, str14);
            }
            int h18 = e17 + b36.f.h(8, this.f145503n) + b36.f.h(9, this.f145504o) + b36.f.h(10, this.f145505p) + b36.f.e(11, this.f145506q) + b36.f.e(12, this.f145507r);
            java.lang.String str15 = this.f145508s;
            if (str15 != null) {
                h18 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f145509t;
            if (str16 != null) {
                h18 += b36.f.j(14, str16);
            }
            int e18 = h18 + b36.f.e(15, this.f145510u);
            java.lang.String str17 = this.f145511v;
            if (str17 != null) {
                e18 += b36.f.j(16, str17);
            }
            java.lang.String str18 = this.f145512w;
            return str18 != null ? e18 + b36.f.j(17, str18) : e18;
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
        com.tencent.mm.plugin.luckymoney.model.o4 o4Var = (com.tencent.mm.plugin.luckymoney.model.o4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o4Var.f145496d = aVar2.k(intValue);
                return 0;
            case 2:
                o4Var.f145497e = aVar2.k(intValue);
                return 0;
            case 3:
                o4Var.f145498f = aVar2.i(intValue);
                return 0;
            case 4:
                o4Var.f145499g = aVar2.k(intValue);
                return 0;
            case 5:
                o4Var.f145500h = aVar2.g(intValue);
                return 0;
            case 6:
                o4Var.f145501i = aVar2.k(intValue);
                return 0;
            case 7:
                o4Var.f145502m = aVar2.k(intValue);
                return 0;
            case 8:
                o4Var.f145503n = aVar2.i(intValue);
                return 0;
            case 9:
                o4Var.f145504o = aVar2.i(intValue);
                return 0;
            case 10:
                o4Var.f145505p = aVar2.i(intValue);
                return 0;
            case 11:
                o4Var.f145506q = aVar2.g(intValue);
                return 0;
            case 12:
                o4Var.f145507r = aVar2.g(intValue);
                return 0;
            case 13:
                o4Var.f145508s = aVar2.k(intValue);
                return 0;
            case 14:
                o4Var.f145509t = aVar2.k(intValue);
                return 0;
            case 15:
                o4Var.f145510u = aVar2.g(intValue);
                return 0;
            case 16:
                o4Var.f145511v = aVar2.k(intValue);
                return 0;
            case 17:
                o4Var.f145512w = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
