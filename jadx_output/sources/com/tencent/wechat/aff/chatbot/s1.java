package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class s1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.y f216449d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216450e;

    /* renamed from: f, reason: collision with root package name */
    public int f216451f;

    /* renamed from: g, reason: collision with root package name */
    public int f216452g;

    /* renamed from: h, reason: collision with root package name */
    public int f216453h;

    /* renamed from: i, reason: collision with root package name */
    public int f216454i;

    /* renamed from: m, reason: collision with root package name */
    public int f216455m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f216456n = new boolean[8];

    static {
        new com.tencent.wechat.aff.chatbot.s1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.s1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.s1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.s1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.s1 s1Var = (com.tencent.wechat.aff.chatbot.s1) fVar;
        return n51.f.a(this.f216449d, s1Var.f216449d) && n51.f.a(this.f216450e, s1Var.f216450e) && n51.f.a(java.lang.Integer.valueOf(this.f216451f), java.lang.Integer.valueOf(s1Var.f216451f)) && n51.f.a(java.lang.Integer.valueOf(this.f216452g), java.lang.Integer.valueOf(s1Var.f216452g)) && n51.f.a(java.lang.Integer.valueOf(this.f216453h), java.lang.Integer.valueOf(s1Var.f216453h)) && n51.f.a(java.lang.Integer.valueOf(this.f216454i), java.lang.Integer.valueOf(s1Var.f216454i)) && n51.f.a(java.lang.Integer.valueOf(this.f216455m), java.lang.Integer.valueOf(s1Var.f216455m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.s1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f216456n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.chatbot.y yVar = this.f216449d;
            if (yVar != null && zArr[1]) {
                fVar.e(1, yVar.f216553d);
            }
            java.lang.String str = this.f216450e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216451f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f216452g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f216453h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f216454i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f216455m);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.chatbot.y yVar2 = this.f216449d;
            if (yVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, yVar2.f216553d);
            }
            java.lang.String str2 = this.f216450e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f216451f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f216452g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f216453h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f216454i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f216455m) : i18;
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
                this.f216449d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.tencent.wechat.aff.chatbot.y.ChatBotPrologueMsgType_CHAT_HISTORY_THINK : com.tencent.wechat.aff.chatbot.y.ChatBotPrologueMsgType_FRIEND_CHAT : com.tencent.wechat.aff.chatbot.y.ChatBotPrologueMsgType_ALERT : com.tencent.wechat.aff.chatbot.y.ChatBotPrologueMsgType_UNSPECIFIED;
                zArr[1] = true;
                return 0;
            case 2:
                this.f216450e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216451f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f216452g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216453h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216454i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216455m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
