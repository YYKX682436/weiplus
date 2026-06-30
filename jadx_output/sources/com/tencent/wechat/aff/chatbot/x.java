package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.y f216527d;

    /* renamed from: e, reason: collision with root package name */
    public int f216528e;

    /* renamed from: f, reason: collision with root package name */
    public int f216529f;

    /* renamed from: g, reason: collision with root package name */
    public long f216530g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216531h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216532i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216533m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216534n;

    /* renamed from: o, reason: collision with root package name */
    public int f216535o;

    /* renamed from: p, reason: collision with root package name */
    public int f216536p;

    /* renamed from: q, reason: collision with root package name */
    public int f216537q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f216538r = new boolean[12];

    static {
        new com.tencent.wechat.aff.chatbot.x();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.x parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.x) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.x)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.x xVar = (com.tencent.wechat.aff.chatbot.x) fVar;
        return n51.f.a(this.f216527d, xVar.f216527d) && n51.f.a(java.lang.Integer.valueOf(this.f216528e), java.lang.Integer.valueOf(xVar.f216528e)) && n51.f.a(java.lang.Integer.valueOf(this.f216529f), java.lang.Integer.valueOf(xVar.f216529f)) && n51.f.a(java.lang.Long.valueOf(this.f216530g), java.lang.Long.valueOf(xVar.f216530g)) && n51.f.a(this.f216531h, xVar.f216531h) && n51.f.a(this.f216532i, xVar.f216532i) && n51.f.a(this.f216533m, xVar.f216533m) && n51.f.a(this.f216534n, xVar.f216534n) && n51.f.a(java.lang.Integer.valueOf(this.f216535o), java.lang.Integer.valueOf(xVar.f216535o)) && n51.f.a(java.lang.Integer.valueOf(this.f216536p), java.lang.Integer.valueOf(xVar.f216536p)) && n51.f.a(java.lang.Integer.valueOf(this.f216537q), java.lang.Integer.valueOf(xVar.f216537q));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.x();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216538r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.chatbot.y yVar = this.f216527d;
            if (yVar != null && zArr[1]) {
                fVar.e(1, yVar.f216553d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f216528e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216529f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f216530g);
            }
            java.lang.String str = this.f216531h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f216532i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f216533m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f216534n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f216535o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f216536p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f216537q);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.chatbot.y yVar2 = this.f216527d;
            if (yVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, yVar2.f216553d);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f216528e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f216529f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f216530g);
            }
            java.lang.String str5 = this.f216531h;
            if (str5 != null && zArr[5]) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f216532i;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f216533m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f216534n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f216535o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f216536p);
            }
            return zArr[11] ? i18 + b36.f.e(11, this.f216537q) : i18;
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
                int g17 = aVar2.g(intValue);
                this.f216527d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.tencent.wechat.aff.chatbot.y.ChatBotPrologueMsgType_CHAT_HISTORY_THINK : com.tencent.wechat.aff.chatbot.y.ChatBotPrologueMsgType_FRIEND_CHAT : com.tencent.wechat.aff.chatbot.y.ChatBotPrologueMsgType_ALERT : com.tencent.wechat.aff.chatbot.y.ChatBotPrologueMsgType_UNSPECIFIED;
                zArr[1] = true;
                return 0;
            case 2:
                this.f216528e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216529f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216530g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216531h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216532i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216533m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216534n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f216535o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f216536p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f216537q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
