package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class p0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f145524d;

    /* renamed from: e, reason: collision with root package name */
    public int f145525e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145526f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.o0 f145527g;

    /* renamed from: h, reason: collision with root package name */
    public int f145528h;

    /* renamed from: i, reason: collision with root package name */
    public int f145529i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f145530m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f145531n;

    /* renamed from: o, reason: collision with root package name */
    public int f145532o;

    /* renamed from: p, reason: collision with root package name */
    public long f145533p;

    /* renamed from: q, reason: collision with root package name */
    public int f145534q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f145535r;

    /* renamed from: s, reason: collision with root package name */
    public int f145536s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.p0)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.p0 p0Var = (com.tencent.mm.plugin.luckymoney.model.p0) fVar;
        return n51.f.a(this.f145524d, p0Var.f145524d) && n51.f.a(java.lang.Integer.valueOf(this.f145525e), java.lang.Integer.valueOf(p0Var.f145525e)) && n51.f.a(this.f145526f, p0Var.f145526f) && n51.f.a(this.f145527g, p0Var.f145527g) && n51.f.a(java.lang.Integer.valueOf(this.f145528h), java.lang.Integer.valueOf(p0Var.f145528h)) && n51.f.a(java.lang.Integer.valueOf(this.f145529i), java.lang.Integer.valueOf(p0Var.f145529i)) && n51.f.a(this.f145530m, p0Var.f145530m) && n51.f.a(this.f145531n, p0Var.f145531n) && n51.f.a(java.lang.Integer.valueOf(this.f145532o), java.lang.Integer.valueOf(p0Var.f145532o)) && n51.f.a(java.lang.Long.valueOf(this.f145533p), java.lang.Long.valueOf(p0Var.f145533p)) && n51.f.a(java.lang.Integer.valueOf(this.f145534q), java.lang.Integer.valueOf(p0Var.f145534q)) && n51.f.a(this.f145535r, p0Var.f145535r) && n51.f.a(java.lang.Integer.valueOf(this.f145536s), java.lang.Integer.valueOf(p0Var.f145536s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f145524d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f145525e);
            java.lang.String str2 = this.f145526f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            com.tencent.mm.plugin.luckymoney.model.o0 o0Var = this.f145527g;
            if (o0Var != null) {
                fVar.i(4, o0Var.computeSize());
                this.f145527g.writeFields(fVar);
            }
            fVar.e(5, this.f145528h);
            fVar.e(6, this.f145529i);
            java.lang.String str3 = this.f145530m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f145531n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f145532o);
            fVar.h(10, this.f145533p);
            fVar.e(11, this.f145534q);
            java.lang.String str5 = this.f145535r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            fVar.e(13, this.f145536s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f145524d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f145525e);
            java.lang.String str7 = this.f145526f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            com.tencent.mm.plugin.luckymoney.model.o0 o0Var2 = this.f145527g;
            if (o0Var2 != null) {
                j17 += b36.f.i(4, o0Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(5, this.f145528h) + b36.f.e(6, this.f145529i);
            java.lang.String str8 = this.f145530m;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f145531n;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            int e18 = e17 + b36.f.e(9, this.f145532o) + b36.f.h(10, this.f145533p) + b36.f.e(11, this.f145534q);
            java.lang.String str10 = this.f145535r;
            if (str10 != null) {
                e18 += b36.f.j(12, str10);
            }
            return e18 + b36.f.e(13, this.f145536s);
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
        com.tencent.mm.plugin.luckymoney.model.p0 p0Var = (com.tencent.mm.plugin.luckymoney.model.p0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p0Var.f145524d = aVar2.k(intValue);
                return 0;
            case 2:
                p0Var.f145525e = aVar2.g(intValue);
                return 0;
            case 3:
                p0Var.f145526f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.mm.plugin.luckymoney.model.o0 o0Var3 = new com.tencent.mm.plugin.luckymoney.model.o0();
                    if (bArr != null && bArr.length > 0) {
                        o0Var3.parseFrom(bArr);
                    }
                    p0Var.f145527g = o0Var3;
                }
                return 0;
            case 5:
                p0Var.f145528h = aVar2.g(intValue);
                return 0;
            case 6:
                p0Var.f145529i = aVar2.g(intValue);
                return 0;
            case 7:
                p0Var.f145530m = aVar2.k(intValue);
                return 0;
            case 8:
                p0Var.f145531n = aVar2.k(intValue);
                return 0;
            case 9:
                p0Var.f145532o = aVar2.g(intValue);
                return 0;
            case 10:
                p0Var.f145533p = aVar2.i(intValue);
                return 0;
            case 11:
                p0Var.f145534q = aVar2.g(intValue);
                return 0;
            case 12:
                p0Var.f145535r = aVar2.k(intValue);
                return 0;
            case 13:
                p0Var.f145536s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
