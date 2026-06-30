package com.tencent.wechat.mm.biz;

/* loaded from: classes9.dex */
public class l1 extends com.tencent.mm.protobuf.f {

    /* renamed from: w, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.l1 f218261w = new com.tencent.wechat.mm.biz.l1();

    /* renamed from: d, reason: collision with root package name */
    public long f218262d;

    /* renamed from: e, reason: collision with root package name */
    public int f218263e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218264f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218265g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218266h;

    /* renamed from: i, reason: collision with root package name */
    public int f218267i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218268m;

    /* renamed from: n, reason: collision with root package name */
    public int f218269n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218270o;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.k1 f218273r;

    /* renamed from: s, reason: collision with root package name */
    public int f218274s;

    /* renamed from: t, reason: collision with root package name */
    public int f218275t;

    /* renamed from: u, reason: collision with root package name */
    public int f218276u;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f218271p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f218272q = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f218277v = new boolean[16];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.l1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.l1 l1Var = (com.tencent.wechat.mm.biz.l1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f218262d), java.lang.Long.valueOf(l1Var.f218262d)) && n51.f.a(java.lang.Integer.valueOf(this.f218263e), java.lang.Integer.valueOf(l1Var.f218263e)) && n51.f.a(this.f218264f, l1Var.f218264f) && n51.f.a(this.f218265g, l1Var.f218265g) && n51.f.a(java.lang.Boolean.valueOf(this.f218266h), java.lang.Boolean.valueOf(l1Var.f218266h)) && n51.f.a(java.lang.Integer.valueOf(this.f218267i), java.lang.Integer.valueOf(l1Var.f218267i)) && n51.f.a(this.f218268m, l1Var.f218268m) && n51.f.a(java.lang.Integer.valueOf(this.f218269n), java.lang.Integer.valueOf(l1Var.f218269n)) && n51.f.a(this.f218270o, l1Var.f218270o) && n51.f.a(this.f218271p, l1Var.f218271p) && n51.f.a(this.f218272q, l1Var.f218272q) && n51.f.a(this.f218273r, l1Var.f218273r) && n51.f.a(java.lang.Integer.valueOf(this.f218274s), java.lang.Integer.valueOf(l1Var.f218274s)) && n51.f.a(java.lang.Integer.valueOf(this.f218275t), java.lang.Integer.valueOf(l1Var.f218275t)) && n51.f.a(java.lang.Integer.valueOf(this.f218276u), java.lang.Integer.valueOf(l1Var.f218276u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.l1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218272q;
        java.util.LinkedList linkedList2 = this.f218271p;
        boolean[] zArr = this.f218277v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f218262d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f218263e);
            }
            java.lang.String str = this.f218264f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f218265g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.a(5, this.f218266h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f218267i);
            }
            java.lang.String str3 = this.f218268m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f218269n);
            }
            java.lang.String str4 = this.f218270o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            com.tencent.wechat.mm.biz.k1 k1Var = this.f218273r;
            if (k1Var != null && zArr[12]) {
                fVar.i(12, k1Var.computeSize());
                this.f218273r.writeFields(fVar);
            }
            if (zArr[13]) {
                fVar.e(13, this.f218274s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f218275t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f218276u);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f218262d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f218263e);
            }
            java.lang.String str5 = this.f218264f;
            if (str5 != null && zArr[3]) {
                h17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f218265g;
            if (str6 != null && zArr[4]) {
                h17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                h17 += b36.f.a(5, this.f218266h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f218267i);
            }
            java.lang.String str7 = this.f218268m;
            if (str7 != null && zArr[7]) {
                h17 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f218269n);
            }
            java.lang.String str8 = this.f218270o;
            if (str8 != null && zArr[9]) {
                h17 += b36.f.j(9, str8);
            }
            int g17 = h17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList);
            com.tencent.wechat.mm.biz.k1 k1Var2 = this.f218273r;
            if (k1Var2 != null && zArr[12]) {
                g17 += b36.f.i(12, k1Var2.computeSize());
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f218274s);
            }
            if (zArr[14]) {
                g17 += b36.f.e(14, this.f218275t);
            }
            return zArr[15] ? g17 + b36.f.e(15, this.f218276u) : g17;
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
                this.f218262d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218263e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218264f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218265g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f218266h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f218267i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218268m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218269n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218270o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.biz.m1 m1Var = new com.tencent.wechat.mm.biz.m1();
                    if (bArr != null && bArr.length > 0) {
                        m1Var.parseFrom(bArr);
                    }
                    linkedList2.add(m1Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.mm.biz.m1 m1Var2 = new com.tencent.wechat.mm.biz.m1();
                    if (bArr2 != null && bArr2.length > 0) {
                        m1Var2.parseFrom(bArr2);
                    }
                    linkedList.add(m1Var2);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.mm.biz.k1 k1Var3 = new com.tencent.wechat.mm.biz.k1();
                    if (bArr3 != null && bArr3.length > 0) {
                        k1Var3.parseFrom(bArr3);
                    }
                    this.f218273r = k1Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f218274s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f218275t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f218276u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.l1) super.parseFrom(bArr);
    }
}
