package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class w1 extends com.tencent.mm.protobuf.f {
    public com.tencent.wechat.mm.finder_box.u3 A;
    public final boolean[] B = new boolean[22];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219903d;

    /* renamed from: e, reason: collision with root package name */
    public int f219904e;

    /* renamed from: f, reason: collision with root package name */
    public int f219905f;

    /* renamed from: g, reason: collision with root package name */
    public long f219906g;

    /* renamed from: h, reason: collision with root package name */
    public int f219907h;

    /* renamed from: i, reason: collision with root package name */
    public int f219908i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f219909m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f219910n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f219911o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219912p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f219913q;

    /* renamed from: r, reason: collision with root package name */
    public int f219914r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f219915s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f219916t;

    /* renamed from: u, reason: collision with root package name */
    public int f219917u;

    /* renamed from: v, reason: collision with root package name */
    public int f219918v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.u1 f219919w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f219920x;

    /* renamed from: y, reason: collision with root package name */
    public int f219921y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f219922z;

    static {
        new com.tencent.wechat.mm.finder_box.w1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.w1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.w1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.w1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.w1 w1Var = (com.tencent.wechat.mm.finder_box.w1) fVar;
        return n51.f.a(this.f219903d, w1Var.f219903d) && n51.f.a(java.lang.Integer.valueOf(this.f219904e), java.lang.Integer.valueOf(w1Var.f219904e)) && n51.f.a(java.lang.Integer.valueOf(this.f219905f), java.lang.Integer.valueOf(w1Var.f219905f)) && n51.f.a(java.lang.Long.valueOf(this.f219906g), java.lang.Long.valueOf(w1Var.f219906g)) && n51.f.a(java.lang.Integer.valueOf(this.f219907h), java.lang.Integer.valueOf(w1Var.f219907h)) && n51.f.a(java.lang.Integer.valueOf(this.f219908i), java.lang.Integer.valueOf(w1Var.f219908i)) && n51.f.a(this.f219909m, w1Var.f219909m) && n51.f.a(this.f219910n, w1Var.f219910n) && n51.f.a(this.f219911o, w1Var.f219911o) && n51.f.a(this.f219912p, w1Var.f219912p) && n51.f.a(this.f219913q, w1Var.f219913q) && n51.f.a(java.lang.Integer.valueOf(this.f219914r), java.lang.Integer.valueOf(w1Var.f219914r)) && n51.f.a(this.f219915s, w1Var.f219915s) && n51.f.a(this.f219916t, w1Var.f219916t) && n51.f.a(java.lang.Integer.valueOf(this.f219917u), java.lang.Integer.valueOf(w1Var.f219917u)) && n51.f.a(java.lang.Integer.valueOf(this.f219918v), java.lang.Integer.valueOf(w1Var.f219918v)) && n51.f.a(this.f219919w, w1Var.f219919w) && n51.f.a(this.f219920x, w1Var.f219920x) && n51.f.a(java.lang.Integer.valueOf(this.f219921y), java.lang.Integer.valueOf(w1Var.f219921y)) && n51.f.a(java.lang.Boolean.valueOf(this.f219922z), java.lang.Boolean.valueOf(w1Var.f219922z)) && n51.f.a(this.A, w1Var.A);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.w1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219903d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219904e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219905f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f219906g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219907h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f219908i);
            }
            java.lang.String str2 = this.f219909m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f219910n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f219911o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f219912p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f219913q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            if (zArr[12]) {
                fVar.e(12, this.f219914r);
            }
            java.lang.String str7 = this.f219915s;
            if (str7 != null && zArr[13]) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f219916t;
            if (str8 != null && zArr[14]) {
                fVar.j(14, str8);
            }
            if (zArr[15]) {
                fVar.e(15, this.f219917u);
            }
            if (zArr[16]) {
                fVar.e(16, this.f219918v);
            }
            com.tencent.wechat.mm.finder_box.u1 u1Var = this.f219919w;
            if (u1Var != null && zArr[17]) {
                fVar.i(17, u1Var.computeSize());
                this.f219919w.writeFields(fVar);
            }
            java.lang.String str9 = this.f219920x;
            if (str9 != null && zArr[18]) {
                fVar.j(18, str9);
            }
            if (zArr[19]) {
                fVar.e(19, this.f219921y);
            }
            if (zArr[20]) {
                fVar.a(20, this.f219922z);
            }
            com.tencent.wechat.mm.finder_box.u3 u3Var = this.A;
            if (u3Var != null && zArr[21]) {
                fVar.i(21, u3Var.computeSize());
                this.A.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f219903d;
            if (str10 != null && zArr[1]) {
                i18 = b36.f.j(1, str10) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f219904e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f219905f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f219906g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f219907h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f219908i);
            }
            java.lang.String str11 = this.f219909m;
            if (str11 != null && zArr[7]) {
                i18 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f219910n;
            if (str12 != null && zArr[8]) {
                i18 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f219911o;
            if (str13 != null && zArr[9]) {
                i18 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f219912p;
            if (str14 != null && zArr[10]) {
                i18 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f219913q;
            if (str15 != null && zArr[11]) {
                i18 += b36.f.j(11, str15);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f219914r);
            }
            java.lang.String str16 = this.f219915s;
            if (str16 != null && zArr[13]) {
                i18 += b36.f.j(13, str16);
            }
            java.lang.String str17 = this.f219916t;
            if (str17 != null && zArr[14]) {
                i18 += b36.f.j(14, str17);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f219917u);
            }
            if (zArr[16]) {
                i18 += b36.f.e(16, this.f219918v);
            }
            com.tencent.wechat.mm.finder_box.u1 u1Var2 = this.f219919w;
            if (u1Var2 != null && zArr[17]) {
                i18 += b36.f.i(17, u1Var2.computeSize());
            }
            java.lang.String str18 = this.f219920x;
            if (str18 != null && zArr[18]) {
                i18 += b36.f.j(18, str18);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f219921y);
            }
            if (zArr[20]) {
                i18 += b36.f.a(20, this.f219922z);
            }
            com.tencent.wechat.mm.finder_box.u3 u3Var2 = this.A;
            return (u3Var2 == null || !zArr[21]) ? i18 : i18 + b36.f.i(21, u3Var2.computeSize());
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
                this.f219903d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219904e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219905f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219906g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219907h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219908i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219909m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219910n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219911o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f219912p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f219913q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f219914r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f219915s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f219916t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f219917u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f219918v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.finder_box.u1 u1Var3 = new com.tencent.wechat.mm.finder_box.u1();
                    if (bArr != null && bArr.length > 0) {
                        u1Var3.parseFrom(bArr);
                    }
                    this.f219919w = u1Var3;
                }
                zArr[17] = true;
                return 0;
            case 18:
                this.f219920x = aVar2.k(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f219921y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f219922z = aVar2.c(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.finder_box.u3 u3Var3 = new com.tencent.wechat.mm.finder_box.u3();
                    if (bArr2 != null && bArr2.length > 0) {
                        u3Var3.parseFrom(bArr2);
                    }
                    this.A = u3Var3;
                }
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }
}
