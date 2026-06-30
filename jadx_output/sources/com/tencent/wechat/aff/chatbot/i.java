package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216248d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216249e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216250f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216251g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f216252h;

    /* renamed from: i, reason: collision with root package name */
    public long f216253i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216254m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216255n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f216256o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f216258q;

    /* renamed from: r, reason: collision with root package name */
    public int f216259r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f216260s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.w f216261t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f216262u;

    /* renamed from: v, reason: collision with root package name */
    public int f216263v;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f216257p = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f216264w = new boolean[19];

    static {
        new com.tencent.wechat.aff.chatbot.i();
    }

    public java.lang.String b() {
        return this.f216264w[7] ? this.f216254m : "";
    }

    public java.lang.String c() {
        return this.f216264w[8] ? this.f216255n : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.i)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.i iVar = (com.tencent.wechat.aff.chatbot.i) fVar;
        return n51.f.a(this.f216248d, iVar.f216248d) && n51.f.a(this.f216249e, iVar.f216249e) && n51.f.a(this.f216250f, iVar.f216250f) && n51.f.a(this.f216251g, iVar.f216251g) && n51.f.a(java.lang.Boolean.valueOf(this.f216252h), java.lang.Boolean.valueOf(iVar.f216252h)) && n51.f.a(java.lang.Long.valueOf(this.f216253i), java.lang.Long.valueOf(iVar.f216253i)) && n51.f.a(this.f216254m, iVar.f216254m) && n51.f.a(this.f216255n, iVar.f216255n) && n51.f.a(this.f216256o, iVar.f216256o) && n51.f.a(this.f216257p, iVar.f216257p) && n51.f.a(this.f216258q, iVar.f216258q) && n51.f.a(java.lang.Integer.valueOf(this.f216259r), java.lang.Integer.valueOf(iVar.f216259r)) && n51.f.a(this.f216260s, iVar.f216260s) && n51.f.a(this.f216261t, iVar.f216261t) && n51.f.a(this.f216262u, iVar.f216262u) && n51.f.a(java.lang.Integer.valueOf(this.f216263v), java.lang.Integer.valueOf(iVar.f216263v));
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.i parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.i) super.parseFrom(bArr);
    }

    public java.lang.String getSessionId() {
        return this.f216264w[14] ? this.f216260s : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.i();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216257p;
        int i18 = 0;
        boolean[] zArr = this.f216264w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216248d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216249e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f216250f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f216251g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.a(5, this.f216252h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f216253i);
            }
            java.lang.String str5 = this.f216254m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f216255n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f216256o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            fVar.g(10, 1, linkedList);
            java.lang.String str8 = this.f216258q;
            if (str8 != null && zArr[11]) {
                fVar.j(11, str8);
            }
            if (zArr[12]) {
                fVar.e(12, this.f216259r);
            }
            java.lang.String str9 = this.f216260s;
            if (str9 != null && zArr[14]) {
                fVar.j(14, str9);
            }
            com.tencent.wechat.aff.chatbot.w wVar = this.f216261t;
            if (wVar != null && zArr[16]) {
                fVar.e(16, wVar.f216517d);
            }
            java.lang.String str10 = this.f216262u;
            if (str10 != null && zArr[17]) {
                fVar.j(17, str10);
            }
            if (zArr[18]) {
                fVar.e(18, this.f216263v);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str11 = this.f216248d;
            if (str11 != null && zArr[1]) {
                i18 = b36.f.j(1, str11) + 0;
            }
            java.lang.String str12 = this.f216249e;
            if (str12 != null && zArr[2]) {
                i18 += b36.f.j(2, str12);
            }
            java.lang.String str13 = this.f216250f;
            if (str13 != null && zArr[3]) {
                i18 += b36.f.j(3, str13);
            }
            java.lang.String str14 = this.f216251g;
            if (str14 != null && zArr[4]) {
                i18 += b36.f.j(4, str14);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f216252h);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f216253i);
            }
            java.lang.String str15 = this.f216254m;
            if (str15 != null && zArr[7]) {
                i18 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f216255n;
            if (str16 != null && zArr[8]) {
                i18 += b36.f.j(8, str16);
            }
            java.lang.String str17 = this.f216256o;
            if (str17 != null && zArr[9]) {
                i18 += b36.f.j(9, str17);
            }
            int g17 = i18 + b36.f.g(10, 1, linkedList);
            java.lang.String str18 = this.f216258q;
            if (str18 != null && zArr[11]) {
                g17 += b36.f.j(11, str18);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f216259r);
            }
            java.lang.String str19 = this.f216260s;
            if (str19 != null && zArr[14]) {
                g17 += b36.f.j(14, str19);
            }
            com.tencent.wechat.aff.chatbot.w wVar2 = this.f216261t;
            if (wVar2 != null && zArr[16]) {
                g17 += b36.f.e(16, wVar2.f216517d);
            }
            java.lang.String str20 = this.f216262u;
            if (str20 != null && zArr[17]) {
                g17 += b36.f.j(17, str20);
            }
            return zArr[18] ? g17 + b36.f.e(18, this.f216263v) : g17;
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
                this.f216248d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216249e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216250f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216251g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216252h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216253i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216254m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216255n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f216256o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                linkedList.add(aVar2.k(intValue));
                zArr[10] = true;
                return 0;
            case 11:
                this.f216258q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f216259r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
            case 15:
            default:
                return -1;
            case 14:
                this.f216260s = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 16:
                this.f216261t = com.tencent.wechat.aff.chatbot.w.a(aVar2.g(intValue));
                zArr[16] = true;
                return 0;
            case 17:
                this.f216262u = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f216263v = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
        }
    }
}
