package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public class d0 extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.d0 f216136o = new com.tencent.wechat.aff.chatbot.d0();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.c0 f216137d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216138e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216140g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216141h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.g0 f216142i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.b0 f216143m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f216139f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f216144n = new boolean[8];

    public java.lang.String b() {
        return this.f216144n[2] ? this.f216138e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.d0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.d0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.d0)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.d0 d0Var = (com.tencent.wechat.aff.chatbot.d0) fVar;
        return n51.f.a(this.f216137d, d0Var.f216137d) && n51.f.a(this.f216138e, d0Var.f216138e) && n51.f.a(this.f216139f, d0Var.f216139f) && n51.f.a(this.f216140g, d0Var.f216140g) && n51.f.a(this.f216141h, d0Var.f216141h) && n51.f.a(this.f216142i, d0Var.f216142i) && n51.f.a(this.f216143m, d0Var.f216143m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.d0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216139f;
        int i18 = 0;
        boolean[] zArr = this.f216144n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.chatbot.c0 c0Var = this.f216137d;
            if (c0Var != null && zArr[1]) {
                fVar.e(1, c0Var.f216107d);
            }
            java.lang.String str = this.f216138e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f216140g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f216141h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            com.tencent.wechat.aff.chatbot.g0 g0Var = this.f216142i;
            if (g0Var != null && zArr[6]) {
                fVar.e(6, g0Var.f216231d);
            }
            com.tencent.wechat.aff.chatbot.b0 b0Var = this.f216143m;
            if (b0Var != null && zArr[7]) {
                fVar.i(7, b0Var.computeSize());
                this.f216143m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.chatbot.c0 c0Var2 = this.f216137d;
            if (c0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, c0Var2.f216107d);
            }
            java.lang.String str4 = this.f216138e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            java.lang.String str5 = this.f216140g;
            if (str5 != null && zArr[4]) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f216141h;
            if (str6 != null && zArr[5]) {
                g17 += b36.f.j(5, str6);
            }
            com.tencent.wechat.aff.chatbot.g0 g0Var2 = this.f216142i;
            if (g0Var2 != null && zArr[6]) {
                g17 += b36.f.e(6, g0Var2.f216231d);
            }
            com.tencent.wechat.aff.chatbot.b0 b0Var2 = this.f216143m;
            return (b0Var2 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, b0Var2.computeSize());
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
        com.tencent.wechat.aff.chatbot.c0 c0Var3 = null;
        com.tencent.wechat.aff.chatbot.g0 g0Var3 = null;
        switch (intValue) {
            case 1:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    c0Var3 = com.tencent.wechat.aff.chatbot.c0.UNKnown;
                } else if (g18 == 1) {
                    c0Var3 = com.tencent.wechat.aff.chatbot.c0.Audio;
                } else if (g18 == 2) {
                    c0Var3 = com.tencent.wechat.aff.chatbot.c0.Multi;
                } else if (g18 == 3) {
                    c0Var3 = com.tencent.wechat.aff.chatbot.c0.MultiChatBot;
                }
                this.f216137d = c0Var3;
                zArr[1] = true;
                return 0;
            case 2:
                this.f216138e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.aff.chatbot.a0 a0Var = new com.tencent.wechat.aff.chatbot.a0();
                    if (bArr != null && bArr.length > 0) {
                        a0Var.parseFrom(bArr);
                    }
                    linkedList.add(a0Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f216140g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f216141h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                switch (aVar2.g(intValue)) {
                    case 0:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_Unknown;
                        break;
                    case 1:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_AIAssist;
                        break;
                    case 2:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_AISocial;
                        break;
                    case 3:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_AIWeapp;
                        break;
                    case 4:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_AIPodcast;
                        break;
                    case 5:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_MPChat;
                        break;
                    case 6:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_AIBlueMicro;
                        break;
                    case 7:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_AIVoIPDemo;
                        break;
                    case 8:
                        g0Var3 = com.tencent.wechat.aff.chatbot.g0.ChatbotBizType_ESCStore;
                        break;
                }
                this.f216142i = g0Var3;
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.aff.chatbot.b0 b0Var3 = new com.tencent.wechat.aff.chatbot.b0();
                    if (bArr2 != null && bArr2.length > 0) {
                        b0Var3.parseFrom(bArr2);
                    }
                    this.f216143m = b0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
