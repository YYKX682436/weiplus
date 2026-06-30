package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class h5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145312d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f145313e;

    /* renamed from: f, reason: collision with root package name */
    public long f145314f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145315g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145316h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f145317i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145318m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145319n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f145320o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f145321p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f145322q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.h5)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.h5 h5Var = (com.tencent.mm.plugin.luckymoney.model.h5) fVar;
        return n51.f.a(this.f145312d, h5Var.f145312d) && n51.f.a(this.f145313e, h5Var.f145313e) && n51.f.a(java.lang.Long.valueOf(this.f145314f), java.lang.Long.valueOf(h5Var.f145314f)) && n51.f.a(this.f145315g, h5Var.f145315g) && n51.f.a(this.f145316h, h5Var.f145316h) && n51.f.a(this.f145317i, h5Var.f145317i) && n51.f.a(this.f145318m, h5Var.f145318m) && n51.f.a(this.f145319n, h5Var.f145319n) && n51.f.a(this.f145320o, h5Var.f145320o) && n51.f.a(this.f145321p, h5Var.f145321p) && n51.f.a(java.lang.Boolean.valueOf(this.f145322q), java.lang.Boolean.valueOf(h5Var.f145322q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145312d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f145313e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f145314f);
            java.lang.String str3 = this.f145315g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f145316h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f145317i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f145318m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f145319n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            java.lang.String str8 = this.f145320o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f145321p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            fVar.a(11, this.f145322q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f145312d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f145313e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            int h17 = j17 + b36.f.h(3, this.f145314f);
            java.lang.String str12 = this.f145315g;
            if (str12 != null) {
                h17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f145316h;
            if (str13 != null) {
                h17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f145317i;
            if (str14 != null) {
                h17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f145318m;
            if (str15 != null) {
                h17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f145319n;
            if (str16 != null) {
                h17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f145320o;
            if (str17 != null) {
                h17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f145321p;
            if (str18 != null) {
                h17 += b36.f.j(10, str18);
            }
            return h17 + b36.f.a(11, this.f145322q);
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
        com.tencent.mm.plugin.luckymoney.model.h5 h5Var = (com.tencent.mm.plugin.luckymoney.model.h5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h5Var.f145312d = aVar2.k(intValue);
                return 0;
            case 2:
                h5Var.f145313e = aVar2.k(intValue);
                return 0;
            case 3:
                h5Var.f145314f = aVar2.i(intValue);
                return 0;
            case 4:
                h5Var.f145315g = aVar2.k(intValue);
                return 0;
            case 5:
                h5Var.f145316h = aVar2.k(intValue);
                return 0;
            case 6:
                h5Var.f145317i = aVar2.k(intValue);
                return 0;
            case 7:
                h5Var.f145318m = aVar2.k(intValue);
                return 0;
            case 8:
                h5Var.f145319n = aVar2.k(intValue);
                return 0;
            case 9:
                h5Var.f145320o = aVar2.k(intValue);
                return 0;
            case 10:
                h5Var.f145321p = aVar2.k(intValue);
                return 0;
            case 11:
                h5Var.f145322q = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
