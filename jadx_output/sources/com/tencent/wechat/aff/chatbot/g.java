package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.g f216208s = new com.tencent.wechat.aff.chatbot.g();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216209d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.h f216210e;

    /* renamed from: f, reason: collision with root package name */
    public long f216211f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216212g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216213h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216214i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216215m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216216n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f216217o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f216218p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f216219q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f216220r = new boolean[12];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.g)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.g gVar = (com.tencent.wechat.aff.chatbot.g) fVar;
        return n51.f.a(this.f216209d, gVar.f216209d) && n51.f.a(this.f216210e, gVar.f216210e) && n51.f.a(java.lang.Long.valueOf(this.f216211f), java.lang.Long.valueOf(gVar.f216211f)) && n51.f.a(this.f216212g, gVar.f216212g) && n51.f.a(this.f216213h, gVar.f216213h) && n51.f.a(this.f216214i, gVar.f216214i) && n51.f.a(this.f216215m, gVar.f216215m) && n51.f.a(this.f216216n, gVar.f216216n) && n51.f.a(this.f216217o, gVar.f216217o) && n51.f.a(this.f216218p, gVar.f216218p) && n51.f.a(java.lang.Boolean.valueOf(this.f216219q), java.lang.Boolean.valueOf(gVar.f216219q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216220r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216209d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.wechat.aff.chatbot.h hVar = this.f216210e;
            if (hVar != null && zArr[2]) {
                fVar.e(2, hVar.f216242d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f216211f);
            }
            java.lang.String str2 = this.f216212g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f216213h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f216214i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f216215m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f216216n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f216217o;
            if (str7 != null && zArr[9]) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f216218p;
            if (str8 != null && zArr[10]) {
                fVar.j(10, str8);
            }
            if (!zArr[11]) {
                return 0;
            }
            fVar.a(11, this.f216219q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f216209d;
            int j17 = (str9 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str9);
            com.tencent.wechat.aff.chatbot.h hVar2 = this.f216210e;
            if (hVar2 != null && zArr[2]) {
                j17 += b36.f.e(2, hVar2.f216242d);
            }
            if (zArr[3]) {
                j17 += b36.f.h(3, this.f216211f);
            }
            java.lang.String str10 = this.f216212g;
            if (str10 != null && zArr[4]) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f216213h;
            if (str11 != null && zArr[5]) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f216214i;
            if (str12 != null && zArr[6]) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f216215m;
            if (str13 != null && zArr[7]) {
                j17 += b36.f.j(7, str13);
            }
            java.lang.String str14 = this.f216216n;
            if (str14 != null && zArr[8]) {
                j17 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f216217o;
            if (str15 != null && zArr[9]) {
                j17 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f216218p;
            if (str16 != null && zArr[10]) {
                j17 += b36.f.j(10, str16);
            }
            return zArr[11] ? j17 + b36.f.a(11, this.f216219q) : j17;
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
                this.f216209d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g17 = aVar2.g(intValue);
                this.f216210e = g17 != 0 ? g17 != 1 ? null : com.tencent.wechat.aff.chatbot.h.AIWeAppProcessDataType_SubTitle : com.tencent.wechat.aff.chatbot.h.AIWeAppProcessDataType_Title;
                zArr[2] = true;
                return 0;
            case 3:
                this.f216211f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216212g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216213h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216214i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216215m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216216n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f216217o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f216218p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f216219q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.g) super.parseFrom(bArr);
    }
}
