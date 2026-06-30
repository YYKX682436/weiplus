package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class i4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219511d;

    /* renamed from: e, reason: collision with root package name */
    public long f219512e;

    /* renamed from: f, reason: collision with root package name */
    public int f219513f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219514g;

    /* renamed from: h, reason: collision with root package name */
    public int f219515h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219516i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219517m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f219518n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219519o;

    /* renamed from: p, reason: collision with root package name */
    public long f219520p;

    /* renamed from: q, reason: collision with root package name */
    public int f219521q;

    /* renamed from: r, reason: collision with root package name */
    public int f219522r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.b3 f219523s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.m3 f219524t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.l2 f219525u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.c3 f219526v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f219527w = new boolean[92];

    static {
        new com.tencent.wechat.mm.finder_box.i4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.i4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.i4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.i4)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.i4 i4Var = (com.tencent.wechat.mm.finder_box.i4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219511d), java.lang.Integer.valueOf(i4Var.f219511d)) && n51.f.a(java.lang.Long.valueOf(this.f219512e), java.lang.Long.valueOf(i4Var.f219512e)) && n51.f.a(java.lang.Integer.valueOf(this.f219513f), java.lang.Integer.valueOf(i4Var.f219513f)) && n51.f.a(this.f219514g, i4Var.f219514g) && n51.f.a(java.lang.Integer.valueOf(this.f219515h), java.lang.Integer.valueOf(i4Var.f219515h)) && n51.f.a(this.f219516i, i4Var.f219516i) && n51.f.a(this.f219517m, i4Var.f219517m) && n51.f.a(java.lang.Boolean.valueOf(this.f219518n), java.lang.Boolean.valueOf(i4Var.f219518n)) && n51.f.a(this.f219519o, i4Var.f219519o) && n51.f.a(java.lang.Long.valueOf(this.f219520p), java.lang.Long.valueOf(i4Var.f219520p)) && n51.f.a(java.lang.Integer.valueOf(this.f219521q), java.lang.Integer.valueOf(i4Var.f219521q)) && n51.f.a(java.lang.Integer.valueOf(this.f219522r), java.lang.Integer.valueOf(i4Var.f219522r)) && n51.f.a(this.f219523s, i4Var.f219523s) && n51.f.a(this.f219524t, i4Var.f219524t) && n51.f.a(this.f219525u, i4Var.f219525u) && n51.f.a(this.f219526v, i4Var.f219526v);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.i4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219527w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219511d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f219512e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219513f);
            }
            java.lang.String str = this.f219514g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219515h);
            }
            java.lang.String str2 = this.f219516i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f219517m;
            if (gVar != null && zArr[7]) {
                fVar.b(7, gVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f219518n);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f219519o;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.h(10, this.f219520p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f219521q);
            }
            if (zArr[31]) {
                fVar.e(31, this.f219522r);
            }
            com.tencent.wechat.mm.finder_box.b3 b3Var = this.f219523s;
            if (b3Var != null && zArr[32]) {
                fVar.i(32, b3Var.computeSize());
                this.f219523s.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.m3 m3Var = this.f219524t;
            if (m3Var != null && zArr[61]) {
                fVar.i(61, m3Var.computeSize());
                this.f219524t.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.l2 l2Var = this.f219525u;
            if (l2Var != null && zArr[62]) {
                fVar.i(62, l2Var.computeSize());
                this.f219525u.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.c3 c3Var = this.f219526v;
            if (c3Var != null && zArr[91]) {
                fVar.i(91, c3Var.computeSize());
                this.f219526v.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f219511d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f219512e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f219513f);
            }
            java.lang.String str3 = this.f219514g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f219515h);
            }
            java.lang.String str4 = this.f219516i;
            if (str4 != null && zArr[6]) {
                e17 += b36.f.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f219517m;
            if (gVar3 != null && zArr[7]) {
                e17 += b36.f.b(7, gVar3);
            }
            if (zArr[8]) {
                e17 += b36.f.a(8, this.f219518n);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f219519o;
            if (gVar4 != null && zArr[9]) {
                e17 += b36.f.b(9, gVar4);
            }
            if (zArr[10]) {
                e17 += b36.f.h(10, this.f219520p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f219521q);
            }
            if (zArr[31]) {
                e17 += b36.f.e(31, this.f219522r);
            }
            com.tencent.wechat.mm.finder_box.b3 b3Var2 = this.f219523s;
            if (b3Var2 != null && zArr[32]) {
                e17 += b36.f.i(32, b3Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.m3 m3Var2 = this.f219524t;
            if (m3Var2 != null && zArr[61]) {
                e17 += b36.f.i(61, m3Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.l2 l2Var2 = this.f219525u;
            if (l2Var2 != null && zArr[62]) {
                e17 += b36.f.i(62, l2Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.c3 c3Var2 = this.f219526v;
            return (c3Var2 == null || !zArr[91]) ? e17 : e17 + b36.f.i(91, c3Var2.computeSize());
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
            this.f219522r = aVar2.g(intValue);
            zArr[31] = true;
            return 0;
        }
        if (intValue == 32) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.finder_box.b3 b3Var3 = new com.tencent.wechat.mm.finder_box.b3();
                if (bArr != null && bArr.length > 0) {
                    b3Var3.parseFrom(bArr);
                }
                this.f219523s = b3Var3;
            }
            zArr[32] = true;
            return 0;
        }
        if (intValue == 61) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.tencent.wechat.mm.finder_box.m3 m3Var3 = new com.tencent.wechat.mm.finder_box.m3();
                if (bArr2 != null && bArr2.length > 0) {
                    m3Var3.parseFrom(bArr2);
                }
                this.f219524t = m3Var3;
            }
            zArr[61] = true;
            return 0;
        }
        if (intValue == 62) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                com.tencent.wechat.mm.finder_box.l2 l2Var3 = new com.tencent.wechat.mm.finder_box.l2();
                if (bArr3 != null && bArr3.length > 0) {
                    l2Var3.parseFrom(bArr3);
                }
                this.f219525u = l2Var3;
            }
            zArr[62] = true;
            return 0;
        }
        if (intValue == 91) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                com.tencent.wechat.mm.finder_box.c3 c3Var3 = new com.tencent.wechat.mm.finder_box.c3();
                if (bArr4 != null && bArr4.length > 0) {
                    c3Var3.parseFrom(bArr4);
                }
                this.f219526v = c3Var3;
            }
            zArr[91] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f219511d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219512e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219513f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219514g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219515h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219516i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219517m = aVar2.d(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f219518n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f219519o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f219520p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f219521q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
