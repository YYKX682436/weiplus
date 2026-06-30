package com.tencent.mm.plugin.vqm;

/* loaded from: classes2.dex */
public class a0 extends com.tencent.mm.protobuf.f {
    public static final com.tencent.mm.plugin.vqm.a0 R = new com.tencent.mm.plugin.vqm.a0();
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f177295J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long P;
    public final boolean[] Q = new boolean[36];

    /* renamed from: d, reason: collision with root package name */
    public long f177296d;

    /* renamed from: e, reason: collision with root package name */
    public long f177297e;

    /* renamed from: f, reason: collision with root package name */
    public long f177298f;

    /* renamed from: g, reason: collision with root package name */
    public long f177299g;

    /* renamed from: h, reason: collision with root package name */
    public long f177300h;

    /* renamed from: i, reason: collision with root package name */
    public long f177301i;

    /* renamed from: m, reason: collision with root package name */
    public long f177302m;

    /* renamed from: n, reason: collision with root package name */
    public long f177303n;

    /* renamed from: o, reason: collision with root package name */
    public long f177304o;

    /* renamed from: p, reason: collision with root package name */
    public long f177305p;

    /* renamed from: q, reason: collision with root package name */
    public long f177306q;

    /* renamed from: r, reason: collision with root package name */
    public long f177307r;

    /* renamed from: s, reason: collision with root package name */
    public long f177308s;

    /* renamed from: t, reason: collision with root package name */
    public long f177309t;

    /* renamed from: u, reason: collision with root package name */
    public long f177310u;

    /* renamed from: v, reason: collision with root package name */
    public long f177311v;

    /* renamed from: w, reason: collision with root package name */
    public long f177312w;

    /* renamed from: x, reason: collision with root package name */
    public long f177313x;

    /* renamed from: y, reason: collision with root package name */
    public long f177314y;

    /* renamed from: z, reason: collision with root package name */
    public long f177315z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.vqm.a0)) {
            return false;
        }
        com.tencent.mm.plugin.vqm.a0 a0Var = (com.tencent.mm.plugin.vqm.a0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f177296d), java.lang.Long.valueOf(a0Var.f177296d)) && n51.f.a(java.lang.Long.valueOf(this.f177297e), java.lang.Long.valueOf(a0Var.f177297e)) && n51.f.a(java.lang.Long.valueOf(this.f177298f), java.lang.Long.valueOf(a0Var.f177298f)) && n51.f.a(java.lang.Long.valueOf(this.f177299g), java.lang.Long.valueOf(a0Var.f177299g)) && n51.f.a(java.lang.Long.valueOf(this.f177300h), java.lang.Long.valueOf(a0Var.f177300h)) && n51.f.a(java.lang.Long.valueOf(this.f177301i), java.lang.Long.valueOf(a0Var.f177301i)) && n51.f.a(java.lang.Long.valueOf(this.f177302m), java.lang.Long.valueOf(a0Var.f177302m)) && n51.f.a(java.lang.Long.valueOf(this.f177303n), java.lang.Long.valueOf(a0Var.f177303n)) && n51.f.a(java.lang.Long.valueOf(this.f177304o), java.lang.Long.valueOf(a0Var.f177304o)) && n51.f.a(java.lang.Long.valueOf(this.f177305p), java.lang.Long.valueOf(a0Var.f177305p)) && n51.f.a(java.lang.Long.valueOf(this.f177306q), java.lang.Long.valueOf(a0Var.f177306q)) && n51.f.a(java.lang.Long.valueOf(this.f177307r), java.lang.Long.valueOf(a0Var.f177307r)) && n51.f.a(java.lang.Long.valueOf(this.f177308s), java.lang.Long.valueOf(a0Var.f177308s)) && n51.f.a(java.lang.Long.valueOf(this.f177309t), java.lang.Long.valueOf(a0Var.f177309t)) && n51.f.a(java.lang.Long.valueOf(this.f177310u), java.lang.Long.valueOf(a0Var.f177310u)) && n51.f.a(java.lang.Long.valueOf(this.f177311v), java.lang.Long.valueOf(a0Var.f177311v)) && n51.f.a(java.lang.Long.valueOf(this.f177312w), java.lang.Long.valueOf(a0Var.f177312w)) && n51.f.a(java.lang.Long.valueOf(this.f177313x), java.lang.Long.valueOf(a0Var.f177313x)) && n51.f.a(java.lang.Long.valueOf(this.f177314y), java.lang.Long.valueOf(a0Var.f177314y)) && n51.f.a(java.lang.Long.valueOf(this.f177315z), java.lang.Long.valueOf(a0Var.f177315z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(a0Var.A)) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(a0Var.B)) && n51.f.a(java.lang.Long.valueOf(this.C), java.lang.Long.valueOf(a0Var.C)) && n51.f.a(java.lang.Long.valueOf(this.D), java.lang.Long.valueOf(a0Var.D)) && n51.f.a(java.lang.Long.valueOf(this.E), java.lang.Long.valueOf(a0Var.E)) && n51.f.a(java.lang.Long.valueOf(this.F), java.lang.Long.valueOf(a0Var.F)) && n51.f.a(java.lang.Long.valueOf(this.G), java.lang.Long.valueOf(a0Var.G)) && n51.f.a(java.lang.Long.valueOf(this.H), java.lang.Long.valueOf(a0Var.H)) && n51.f.a(java.lang.Long.valueOf(this.I), java.lang.Long.valueOf(a0Var.I)) && n51.f.a(java.lang.Long.valueOf(this.f177295J), java.lang.Long.valueOf(a0Var.f177295J)) && n51.f.a(java.lang.Long.valueOf(this.K), java.lang.Long.valueOf(a0Var.K)) && n51.f.a(java.lang.Long.valueOf(this.L), java.lang.Long.valueOf(a0Var.L)) && n51.f.a(java.lang.Long.valueOf(this.M), java.lang.Long.valueOf(a0Var.M)) && n51.f.a(java.lang.Long.valueOf(this.N), java.lang.Long.valueOf(a0Var.N)) && n51.f.a(java.lang.Long.valueOf(this.P), java.lang.Long.valueOf(a0Var.P));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.vqm.a0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.Q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f177296d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f177297e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f177298f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f177299g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f177300h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f177301i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f177302m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f177303n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f177304o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f177305p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f177306q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f177307r);
            }
            if (zArr[13]) {
                fVar.h(13, this.f177308s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f177309t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f177310u);
            }
            if (zArr[16]) {
                fVar.h(16, this.f177311v);
            }
            if (zArr[17]) {
                fVar.h(17, this.f177312w);
            }
            if (zArr[18]) {
                fVar.h(18, this.f177313x);
            }
            if (zArr[19]) {
                fVar.h(19, this.f177314y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f177315z);
            }
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.h(23, this.C);
            }
            if (zArr[24]) {
                fVar.h(24, this.D);
            }
            if (zArr[25]) {
                fVar.h(25, this.E);
            }
            if (zArr[26]) {
                fVar.h(26, this.F);
            }
            if (zArr[27]) {
                fVar.h(27, this.G);
            }
            if (zArr[28]) {
                fVar.h(28, this.H);
            }
            if (zArr[29]) {
                fVar.h(29, this.I);
            }
            if (zArr[30]) {
                fVar.h(30, this.f177295J);
            }
            if (zArr[31]) {
                fVar.h(31, this.K);
            }
            if (zArr[32]) {
                fVar.h(32, this.L);
            }
            if (zArr[33]) {
                fVar.h(33, this.M);
            }
            if (zArr[34]) {
                fVar.h(34, this.N);
            }
            if (zArr[35]) {
                fVar.h(35, this.P);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f177296d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f177297e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f177298f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f177299g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f177300h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f177301i);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f177302m);
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f177303n);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f177304o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f177305p);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f177306q);
            }
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f177307r);
            }
            if (zArr[13]) {
                h17 += b36.f.h(13, this.f177308s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f177309t);
            }
            if (zArr[15]) {
                h17 += b36.f.h(15, this.f177310u);
            }
            if (zArr[16]) {
                h17 += b36.f.h(16, this.f177311v);
            }
            if (zArr[17]) {
                h17 += b36.f.h(17, this.f177312w);
            }
            if (zArr[18]) {
                h17 += b36.f.h(18, this.f177313x);
            }
            if (zArr[19]) {
                h17 += b36.f.h(19, this.f177314y);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f177315z);
            }
            if (zArr[21]) {
                h17 += b36.f.h(21, this.A);
            }
            if (zArr[22]) {
                h17 += b36.f.h(22, this.B);
            }
            if (zArr[23]) {
                h17 += b36.f.h(23, this.C);
            }
            if (zArr[24]) {
                h17 += b36.f.h(24, this.D);
            }
            if (zArr[25]) {
                h17 += b36.f.h(25, this.E);
            }
            if (zArr[26]) {
                h17 += b36.f.h(26, this.F);
            }
            if (zArr[27]) {
                h17 += b36.f.h(27, this.G);
            }
            if (zArr[28]) {
                h17 += b36.f.h(28, this.H);
            }
            if (zArr[29]) {
                h17 += b36.f.h(29, this.I);
            }
            if (zArr[30]) {
                h17 += b36.f.h(30, this.f177295J);
            }
            if (zArr[31]) {
                h17 += b36.f.h(31, this.K);
            }
            if (zArr[32]) {
                h17 += b36.f.h(32, this.L);
            }
            if (zArr[33]) {
                h17 += b36.f.h(33, this.M);
            }
            if (zArr[34]) {
                h17 += b36.f.h(34, this.N);
            }
            return zArr[35] ? h17 + b36.f.h(35, this.P) : h17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f177296d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f177297e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f177298f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f177299g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f177300h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f177301i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f177302m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f177303n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f177304o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f177305p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f177306q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f177307r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f177308s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f177309t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f177310u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f177311v = aVar2.i(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f177312w = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f177313x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f177314y = aVar2.i(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f177315z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.i(intValue);
                zArr[23] = true;
                return 0;
            case 24:
                this.D = aVar2.i(intValue);
                zArr[24] = true;
                return 0;
            case 25:
                this.E = aVar2.i(intValue);
                zArr[25] = true;
                return 0;
            case 26:
                this.F = aVar2.i(intValue);
                zArr[26] = true;
                return 0;
            case 27:
                this.G = aVar2.i(intValue);
                zArr[27] = true;
                return 0;
            case 28:
                this.H = aVar2.i(intValue);
                zArr[28] = true;
                return 0;
            case 29:
                this.I = aVar2.i(intValue);
                zArr[29] = true;
                return 0;
            case 30:
                this.f177295J = aVar2.i(intValue);
                zArr[30] = true;
                return 0;
            case 31:
                this.K = aVar2.i(intValue);
                zArr[31] = true;
                return 0;
            case 32:
                this.L = aVar2.i(intValue);
                zArr[32] = true;
                return 0;
            case 33:
                this.M = aVar2.i(intValue);
                zArr[33] = true;
                return 0;
            case 34:
                this.N = aVar2.i(intValue);
                zArr[34] = true;
                return 0;
            case 35:
                this.P = aVar2.i(intValue);
                zArr[35] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.vqm.a0) super.parseFrom(bArr);
    }
}
