package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public class i0 extends com.tencent.mm.protobuf.f {

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.i0 f216265y = new com.tencent.wechat.aff.chatbot.i0();

    /* renamed from: d, reason: collision with root package name */
    public int f216266d;

    /* renamed from: e, reason: collision with root package name */
    public int f216267e;

    /* renamed from: f, reason: collision with root package name */
    public int f216268f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216269g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216270h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216271i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216272m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216273n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f216274o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f216275p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f216276q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f216278s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f216279t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f216280u;

    /* renamed from: v, reason: collision with root package name */
    public int f216281v;

    /* renamed from: w, reason: collision with root package name */
    public int f216282w;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f216277r = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f216283x = new boolean[18];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.i0)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.i0 i0Var = (com.tencent.wechat.aff.chatbot.i0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216266d), java.lang.Integer.valueOf(i0Var.f216266d)) && n51.f.a(java.lang.Integer.valueOf(this.f216267e), java.lang.Integer.valueOf(i0Var.f216267e)) && n51.f.a(java.lang.Integer.valueOf(this.f216268f), java.lang.Integer.valueOf(i0Var.f216268f)) && n51.f.a(this.f216269g, i0Var.f216269g) && n51.f.a(this.f216270h, i0Var.f216270h) && n51.f.a(this.f216271i, i0Var.f216271i) && n51.f.a(this.f216272m, i0Var.f216272m) && n51.f.a(this.f216273n, i0Var.f216273n) && n51.f.a(this.f216274o, i0Var.f216274o) && n51.f.a(this.f216275p, i0Var.f216275p) && n51.f.a(this.f216276q, i0Var.f216276q) && n51.f.a(this.f216277r, i0Var.f216277r) && n51.f.a(this.f216278s, i0Var.f216278s) && n51.f.a(this.f216279t, i0Var.f216279t) && n51.f.a(this.f216280u, i0Var.f216280u) && n51.f.a(java.lang.Integer.valueOf(this.f216281v), java.lang.Integer.valueOf(i0Var.f216281v)) && n51.f.a(java.lang.Integer.valueOf(this.f216282w), java.lang.Integer.valueOf(i0Var.f216282w));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.i0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216277r;
        boolean[] zArr = this.f216283x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216266d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f216267e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216268f);
            }
            java.lang.String str = this.f216269g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f216270h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f216271i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f216272m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f216273n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f216274o;
            if (str6 != null && zArr[9]) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f216275p;
            if (str7 != null && zArr[10]) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f216276q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            fVar.g(12, 2, linkedList);
            java.lang.String str9 = this.f216278s;
            if (str9 != null && zArr[13]) {
                fVar.j(13, str9);
            }
            java.lang.String str10 = this.f216279t;
            if (str10 != null && zArr[14]) {
                fVar.j(14, str10);
            }
            java.lang.String str11 = this.f216280u;
            if (str11 != null && zArr[15]) {
                fVar.j(15, str11);
            }
            if (zArr[16]) {
                fVar.e(16, this.f216281v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f216282w);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f216266d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f216267e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f216268f);
            }
            java.lang.String str12 = this.f216269g;
            if (str12 != null && zArr[4]) {
                e17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f216270h;
            if (str13 != null && zArr[5]) {
                e17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f216271i;
            if (str14 != null && zArr[6]) {
                e17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f216272m;
            if (str15 != null && zArr[7]) {
                e17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f216273n;
            if (str16 != null && zArr[8]) {
                e17 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f216274o;
            if (str17 != null && zArr[9]) {
                e17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f216275p;
            if (str18 != null && zArr[10]) {
                e17 += b36.f.j(10, str18);
            }
            java.lang.String str19 = this.f216276q;
            if (str19 != null && zArr[11]) {
                e17 += b36.f.j(11, str19);
            }
            int g17 = e17 + b36.f.g(12, 2, linkedList);
            java.lang.String str20 = this.f216278s;
            if (str20 != null && zArr[13]) {
                g17 += b36.f.j(13, str20);
            }
            java.lang.String str21 = this.f216279t;
            if (str21 != null && zArr[14]) {
                g17 += b36.f.j(14, str21);
            }
            java.lang.String str22 = this.f216280u;
            if (str22 != null && zArr[15]) {
                g17 += b36.f.j(15, str22);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f216281v);
            }
            return zArr[17] ? g17 + b36.f.e(17, this.f216282w) : g17;
        }
        if (i17 == 2) {
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
                this.f216266d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216267e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216268f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216269g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216270h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216271i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216272m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216273n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f216274o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f216275p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f216276q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[12] = true;
                return 0;
            case 13:
                this.f216278s = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f216279t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f216280u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f216281v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f216282w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.i0) super.parseFrom(bArr);
    }
}
