package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class c1 extends com.tencent.mm.protobuf.f {
    public double A;
    public com.tencent.mm.plugin.luckymoney.model.q0 B;
    public java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public int f145182d;

    /* renamed from: e, reason: collision with root package name */
    public double f145183e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f145184f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f145185g;

    /* renamed from: h, reason: collision with root package name */
    public double f145186h;

    /* renamed from: i, reason: collision with root package name */
    public double f145187i;

    /* renamed from: m, reason: collision with root package name */
    public double f145188m;

    /* renamed from: n, reason: collision with root package name */
    public int f145189n;

    /* renamed from: o, reason: collision with root package name */
    public int f145190o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f145191p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f145192q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f145193r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f145194s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f145195t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f145196u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f145197v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.model.q0 f145198w;

    /* renamed from: x, reason: collision with root package name */
    public int f145199x;

    /* renamed from: y, reason: collision with root package name */
    public double f145200y;

    /* renamed from: z, reason: collision with root package name */
    public double f145201z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.luckymoney.model.c1)) {
            return false;
        }
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = (com.tencent.mm.plugin.luckymoney.model.c1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f145182d), java.lang.Integer.valueOf(c1Var.f145182d)) && n51.f.a(java.lang.Double.valueOf(this.f145183e), java.lang.Double.valueOf(c1Var.f145183e)) && n51.f.a(this.f145184f, c1Var.f145184f) && n51.f.a(this.f145185g, c1Var.f145185g) && n51.f.a(java.lang.Double.valueOf(this.f145186h), java.lang.Double.valueOf(c1Var.f145186h)) && n51.f.a(java.lang.Double.valueOf(this.f145187i), java.lang.Double.valueOf(c1Var.f145187i)) && n51.f.a(java.lang.Double.valueOf(this.f145188m), java.lang.Double.valueOf(c1Var.f145188m)) && n51.f.a(java.lang.Integer.valueOf(this.f145189n), java.lang.Integer.valueOf(c1Var.f145189n)) && n51.f.a(java.lang.Integer.valueOf(this.f145190o), java.lang.Integer.valueOf(c1Var.f145190o)) && n51.f.a(this.f145191p, c1Var.f145191p) && n51.f.a(this.f145192q, c1Var.f145192q) && n51.f.a(this.f145193r, c1Var.f145193r) && n51.f.a(this.f145194s, c1Var.f145194s) && n51.f.a(this.f145195t, c1Var.f145195t) && n51.f.a(this.f145196u, c1Var.f145196u) && n51.f.a(java.lang.Boolean.valueOf(this.f145197v), java.lang.Boolean.valueOf(c1Var.f145197v)) && n51.f.a(this.f145198w, c1Var.f145198w) && n51.f.a(java.lang.Integer.valueOf(this.f145199x), java.lang.Integer.valueOf(c1Var.f145199x)) && n51.f.a(java.lang.Double.valueOf(this.f145200y), java.lang.Double.valueOf(c1Var.f145200y)) && n51.f.a(java.lang.Double.valueOf(this.f145201z), java.lang.Double.valueOf(c1Var.f145201z)) && n51.f.a(java.lang.Double.valueOf(this.A), java.lang.Double.valueOf(c1Var.A)) && n51.f.a(this.B, c1Var.B) && n51.f.a(this.C, c1Var.C);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f145182d);
            fVar.c(2, this.f145183e);
            java.lang.String str = this.f145184f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f145185g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.c(5, this.f145186h);
            fVar.c(6, this.f145187i);
            fVar.c(7, this.f145188m);
            fVar.e(8, this.f145189n);
            fVar.e(9, this.f145190o);
            java.lang.String str3 = this.f145191p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f145192q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f145193r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            java.lang.String str6 = this.f145194s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f145195t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            java.lang.String str8 = this.f145196u;
            if (str8 != null) {
                fVar.j(15, str8);
            }
            fVar.a(16, this.f145197v);
            com.tencent.mm.plugin.luckymoney.model.q0 q0Var = this.f145198w;
            if (q0Var != null) {
                fVar.i(17, q0Var.computeSize());
                this.f145198w.writeFields(fVar);
            }
            fVar.e(18, this.f145199x);
            fVar.c(19, this.f145200y);
            fVar.c(20, this.f145201z);
            fVar.c(21, this.A);
            com.tencent.mm.plugin.luckymoney.model.q0 q0Var2 = this.B;
            if (q0Var2 != null) {
                fVar.i(22, q0Var2.computeSize());
                this.B.writeFields(fVar);
            }
            java.lang.String str9 = this.C;
            if (str9 != null) {
                fVar.j(23, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f145182d) + 0 + b36.f.c(2, this.f145183e);
            java.lang.String str10 = this.f145184f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f145185g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            int c17 = e17 + b36.f.c(5, this.f145186h) + b36.f.c(6, this.f145187i) + b36.f.c(7, this.f145188m) + b36.f.e(8, this.f145189n) + b36.f.e(9, this.f145190o);
            java.lang.String str12 = this.f145191p;
            if (str12 != null) {
                c17 += b36.f.j(10, str12);
            }
            java.lang.String str13 = this.f145192q;
            if (str13 != null) {
                c17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f145193r;
            if (str14 != null) {
                c17 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f145194s;
            if (str15 != null) {
                c17 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f145195t;
            if (str16 != null) {
                c17 += b36.f.j(14, str16);
            }
            java.lang.String str17 = this.f145196u;
            if (str17 != null) {
                c17 += b36.f.j(15, str17);
            }
            int a17 = c17 + b36.f.a(16, this.f145197v);
            com.tencent.mm.plugin.luckymoney.model.q0 q0Var3 = this.f145198w;
            if (q0Var3 != null) {
                a17 += b36.f.i(17, q0Var3.computeSize());
            }
            int e18 = a17 + b36.f.e(18, this.f145199x) + b36.f.c(19, this.f145200y) + b36.f.c(20, this.f145201z) + b36.f.c(21, this.A);
            com.tencent.mm.plugin.luckymoney.model.q0 q0Var4 = this.B;
            if (q0Var4 != null) {
                e18 += b36.f.i(22, q0Var4.computeSize());
            }
            java.lang.String str18 = this.C;
            return str18 != null ? e18 + b36.f.j(23, str18) : e18;
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
        com.tencent.mm.plugin.luckymoney.model.c1 c1Var = (com.tencent.mm.plugin.luckymoney.model.c1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c1Var.f145182d = aVar2.g(intValue);
                return 0;
            case 2:
                c1Var.f145183e = aVar2.e(intValue);
                return 0;
            case 3:
                c1Var.f145184f = aVar2.k(intValue);
                return 0;
            case 4:
                c1Var.f145185g = aVar2.k(intValue);
                return 0;
            case 5:
                c1Var.f145186h = aVar2.e(intValue);
                return 0;
            case 6:
                c1Var.f145187i = aVar2.e(intValue);
                return 0;
            case 7:
                c1Var.f145188m = aVar2.e(intValue);
                return 0;
            case 8:
                c1Var.f145189n = aVar2.g(intValue);
                return 0;
            case 9:
                c1Var.f145190o = aVar2.g(intValue);
                return 0;
            case 10:
                c1Var.f145191p = aVar2.k(intValue);
                return 0;
            case 11:
                c1Var.f145192q = aVar2.k(intValue);
                return 0;
            case 12:
                c1Var.f145193r = aVar2.k(intValue);
                return 0;
            case 13:
                c1Var.f145194s = aVar2.k(intValue);
                return 0;
            case 14:
                c1Var.f145195t = aVar2.k(intValue);
                return 0;
            case 15:
                c1Var.f145196u = aVar2.k(intValue);
                return 0;
            case 16:
                c1Var.f145197v = aVar2.c(intValue);
                return 0;
            case 17:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.mm.plugin.luckymoney.model.q0 q0Var5 = new com.tencent.mm.plugin.luckymoney.model.q0();
                    if (bArr != null && bArr.length > 0) {
                        q0Var5.parseFrom(bArr);
                    }
                    c1Var.f145198w = q0Var5;
                }
                return 0;
            case 18:
                c1Var.f145199x = aVar2.g(intValue);
                return 0;
            case 19:
                c1Var.f145200y = aVar2.e(intValue);
                return 0;
            case 20:
                c1Var.f145201z = aVar2.e(intValue);
                return 0;
            case 21:
                c1Var.A = aVar2.e(intValue);
                return 0;
            case 22:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.mm.plugin.luckymoney.model.q0 q0Var6 = new com.tencent.mm.plugin.luckymoney.model.q0();
                    if (bArr2 != null && bArr2.length > 0) {
                        q0Var6.parseFrom(bArr2);
                    }
                    c1Var.B = q0Var6;
                }
                return 0;
            case 23:
                c1Var.C = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
