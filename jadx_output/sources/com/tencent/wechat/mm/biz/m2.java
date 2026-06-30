package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class m2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218320d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218321e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218322f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218323g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218324h;

    /* renamed from: i, reason: collision with root package name */
    public int f218325i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218326m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f218327n;

    /* renamed from: q, reason: collision with root package name */
    public int f218330q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f218331r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.t4 f218332s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f218333t;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f218328o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f218329p = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f218334u = new boolean[16];

    static {
        new com.tencent.wechat.mm.biz.m2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.m2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.m2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.m2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.m2 m2Var = (com.tencent.wechat.mm.biz.m2) fVar;
        return n51.f.a(this.f218320d, m2Var.f218320d) && n51.f.a(this.f218321e, m2Var.f218321e) && n51.f.a(this.f218322f, m2Var.f218322f) && n51.f.a(this.f218323g, m2Var.f218323g) && n51.f.a(this.f218324h, m2Var.f218324h) && n51.f.a(java.lang.Integer.valueOf(this.f218325i), java.lang.Integer.valueOf(m2Var.f218325i)) && n51.f.a(this.f218326m, m2Var.f218326m) && n51.f.a(this.f218327n, m2Var.f218327n) && n51.f.a(this.f218328o, m2Var.f218328o) && n51.f.a(this.f218329p, m2Var.f218329p) && n51.f.a(java.lang.Integer.valueOf(this.f218330q), java.lang.Integer.valueOf(m2Var.f218330q)) && n51.f.a(this.f218331r, m2Var.f218331r) && n51.f.a(this.f218332s, m2Var.f218332s) && n51.f.a(java.lang.Boolean.valueOf(this.f218333t), java.lang.Boolean.valueOf(m2Var.f218333t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.m2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218329p;
        java.util.LinkedList linkedList2 = this.f218328o;
        int i18 = 0;
        boolean[] zArr = this.f218334u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218320d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218321e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218322f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f218323g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f218324h;
            if (str5 != null && zArr[6]) {
                fVar.j(6, str5);
            }
            if (zArr[7]) {
                fVar.e(7, this.f218325i);
            }
            java.lang.String str6 = this.f218326m;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f218327n;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 1, linkedList);
            if (zArr[12]) {
                fVar.e(12, this.f218330q);
            }
            java.lang.String str8 = this.f218331r;
            if (str8 != null && zArr[13]) {
                fVar.j(13, str8);
            }
            com.tencent.wechat.mm.biz.t4 t4Var = this.f218332s;
            if (t4Var != null && zArr[14]) {
                fVar.i(14, t4Var.computeSize());
                this.f218332s.writeFields(fVar);
            }
            if (zArr[15]) {
                fVar.a(15, this.f218333t);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f218320d;
            if (str9 != null && zArr[1]) {
                i18 = b36.f.j(1, str9) + 0;
            }
            java.lang.String str10 = this.f218321e;
            if (str10 != null && zArr[2]) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f218322f;
            if (str11 != null && zArr[3]) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f218323g;
            if (str12 != null && zArr[4]) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f218324h;
            if (str13 != null && zArr[6]) {
                i18 += b36.f.j(6, str13);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f218325i);
            }
            java.lang.String str14 = this.f218326m;
            if (str14 != null && zArr[8]) {
                i18 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f218327n;
            if (str15 != null && zArr[9]) {
                i18 += b36.f.j(9, str15);
            }
            int g17 = i18 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 1, linkedList);
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f218330q);
            }
            java.lang.String str16 = this.f218331r;
            if (str16 != null && zArr[13]) {
                g17 += b36.f.j(13, str16);
            }
            com.tencent.wechat.mm.biz.t4 t4Var2 = this.f218332s;
            if (t4Var2 != null && zArr[14]) {
                g17 += b36.f.i(14, t4Var2.computeSize());
            }
            return zArr[15] ? g17 + b36.f.a(15, this.f218333t) : g17;
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
                this.f218320d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f218321e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f218322f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f218323g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                this.f218324h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f218325i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f218326m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f218327n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.biz.p2 p2Var = new com.tencent.wechat.mm.biz.p2();
                    if (bArr != null && bArr.length > 0) {
                        p2Var.parseFrom(bArr);
                    }
                    linkedList2.add(p2Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                linkedList.add(aVar2.k(intValue));
                zArr[11] = true;
                return 0;
            case 12:
                this.f218330q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f218331r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.biz.t4 t4Var3 = new com.tencent.wechat.mm.biz.t4();
                    if (bArr2 != null && bArr2.length > 0) {
                        t4Var3.parseFrom(bArr2);
                    }
                    this.f218332s = t4Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f218333t = aVar2.c(intValue);
                zArr[15] = true;
                return 0;
        }
    }
}
