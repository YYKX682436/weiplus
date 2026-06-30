package com.tencent.wechat.mm.biz;

/* loaded from: classes4.dex */
public class t5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218648d;

    /* renamed from: e, reason: collision with root package name */
    public long f218649e;

    /* renamed from: f, reason: collision with root package name */
    public int f218650f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218651g;

    /* renamed from: h, reason: collision with root package name */
    public int f218652h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218653i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f218654m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f218655n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f218656o;

    /* renamed from: p, reason: collision with root package name */
    public long f218657p;

    /* renamed from: q, reason: collision with root package name */
    public int f218658q;

    /* renamed from: r, reason: collision with root package name */
    public int f218659r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.i4 f218660s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.u4 f218661t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.j3 f218662u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.j4 f218663v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f218664w = new boolean[92];

    static {
        new com.tencent.wechat.mm.biz.t5();
    }

    public com.tencent.wechat.mm.biz.u4 b() {
        return this.f218664w[61] ? this.f218661t : new com.tencent.wechat.mm.biz.u4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.t5 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.t5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.t5)) {
            return false;
        }
        com.tencent.wechat.mm.biz.t5 t5Var = (com.tencent.wechat.mm.biz.t5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218648d), java.lang.Integer.valueOf(t5Var.f218648d)) && n51.f.a(java.lang.Long.valueOf(this.f218649e), java.lang.Long.valueOf(t5Var.f218649e)) && n51.f.a(java.lang.Integer.valueOf(this.f218650f), java.lang.Integer.valueOf(t5Var.f218650f)) && n51.f.a(this.f218651g, t5Var.f218651g) && n51.f.a(java.lang.Integer.valueOf(this.f218652h), java.lang.Integer.valueOf(t5Var.f218652h)) && n51.f.a(this.f218653i, t5Var.f218653i) && n51.f.a(this.f218654m, t5Var.f218654m) && n51.f.a(java.lang.Boolean.valueOf(this.f218655n), java.lang.Boolean.valueOf(t5Var.f218655n)) && n51.f.a(this.f218656o, t5Var.f218656o) && n51.f.a(java.lang.Long.valueOf(this.f218657p), java.lang.Long.valueOf(t5Var.f218657p)) && n51.f.a(java.lang.Integer.valueOf(this.f218658q), java.lang.Integer.valueOf(t5Var.f218658q)) && n51.f.a(java.lang.Integer.valueOf(this.f218659r), java.lang.Integer.valueOf(t5Var.f218659r)) && n51.f.a(this.f218660s, t5Var.f218660s) && n51.f.a(this.f218661t, t5Var.f218661t) && n51.f.a(this.f218662u, t5Var.f218662u) && n51.f.a(this.f218663v, t5Var.f218663v);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.t5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f218664w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218648d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f218649e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f218650f);
            }
            java.lang.String str = this.f218651g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f218652h);
            }
            java.lang.String str2 = this.f218653i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f218654m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f218655n);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f218656o;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.h(10, this.f218657p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f218658q);
            }
            if (zArr[31]) {
                fVar.e(31, this.f218659r);
            }
            com.tencent.wechat.mm.biz.i4 i4Var = this.f218660s;
            if (i4Var != null && zArr[32]) {
                fVar.i(32, i4Var.computeSize());
                this.f218660s.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.u4 u4Var = this.f218661t;
            if (u4Var != null && zArr[61]) {
                fVar.i(61, u4Var.computeSize());
                this.f218661t.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.j3 j3Var = this.f218662u;
            if (j3Var != null && zArr[62]) {
                fVar.i(62, j3Var.computeSize());
                this.f218662u.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.j4 j4Var = this.f218663v;
            if (j4Var != null && zArr[91]) {
                fVar.i(91, j4Var.computeSize());
                this.f218663v.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f218648d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f218649e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f218650f);
            }
            java.lang.String str3 = this.f218651g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f218652h);
            }
            java.lang.String str4 = this.f218653i;
            if (str4 != null && zArr[6]) {
                e17 += b36.f.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f218654m;
            if (gVar3 != null && zArr[7]) {
                e17 += b36.f.b(7, gVar3);
            }
            if (zArr[8]) {
                e17 += b36.f.a(8, this.f218655n);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f218656o;
            if (gVar4 != null && zArr[9]) {
                e17 += b36.f.b(9, gVar4);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f218657p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f218658q);
            }
            if (zArr[31]) {
                e17 += b36.f.e(31, this.f218659r);
            }
            com.tencent.wechat.mm.biz.i4 i4Var2 = this.f218660s;
            if (i4Var2 != null && zArr[32]) {
                e17 += b36.f.i(32, i4Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.u4 u4Var2 = this.f218661t;
            if (u4Var2 != null && zArr[61]) {
                e17 += b36.f.i(61, u4Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.j3 j3Var2 = this.f218662u;
            if (j3Var2 != null && zArr[62]) {
                e17 += b36.f.i(62, j3Var2.computeSize());
            }
            com.tencent.wechat.mm.biz.j4 j4Var2 = this.f218663v;
            return (j4Var2 == null || !zArr[91]) ? e17 : e17 + b36.f.i(91, j4Var2.computeSize());
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
        if (intValue == 31) {
            this.f218659r = aVar2.g(intValue);
            zArr[31] = true;
            return 0;
        }
        if (intValue == 32) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.biz.i4 i4Var3 = new com.tencent.wechat.mm.biz.i4();
                if (bArr != null && bArr.length > 0) {
                    i4Var3.parseFrom(bArr);
                }
                this.f218660s = i4Var3;
            }
            zArr[32] = true;
            return 0;
        }
        if (intValue == 61) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.mm.biz.u4 u4Var3 = new com.tencent.wechat.mm.biz.u4();
                if (bArr2 != null && bArr2.length > 0) {
                    u4Var3.parseFrom(bArr2);
                }
                this.f218661t = u4Var3;
            }
            zArr[61] = true;
            return 0;
        }
        if (intValue == 62) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                com.tencent.wechat.mm.biz.j3 j3Var3 = new com.tencent.wechat.mm.biz.j3();
                if (bArr3 != null && bArr3.length > 0) {
                    j3Var3.parseFrom(bArr3);
                }
                this.f218662u = j3Var3;
            }
            zArr[62] = true;
            return 0;
        }
        if (intValue == 91) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                com.tencent.wechat.mm.biz.j4 j4Var3 = new com.tencent.wechat.mm.biz.j4();
                if (bArr4 != null && bArr4.length > 0) {
                    j4Var3.parseFrom(bArr4);
                }
                this.f218663v = j4Var3;
            }
            zArr[91] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f218648d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218649e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218650f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218651g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218652h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218653i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218654m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218655n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218656o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f218657p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f218658q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
