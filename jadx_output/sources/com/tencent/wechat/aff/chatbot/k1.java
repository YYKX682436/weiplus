package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class k1 extends com.tencent.mm.protobuf.f {
    public static final com.tencent.wechat.aff.chatbot.k1 B = new com.tencent.wechat.aff.chatbot.k1();
    public final boolean[] A = new boolean[29];

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.t1 f216319d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.j1 f216320e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.i1 f216321f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.f f216322g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216323h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216324i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.g1 f216325m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.e0 f216326n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.h1 f216327o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.c3 f216328p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.z f216329q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.e1 f216330r;

    /* renamed from: s, reason: collision with root package name */
    public int f216331s;

    /* renamed from: t, reason: collision with root package name */
    public int f216332t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f216333u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f216334v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f216335w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f216336x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f216337y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.f1 f216338z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.k1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.k1 k1Var = (com.tencent.wechat.aff.chatbot.k1) fVar;
        return n51.f.a(this.f216319d, k1Var.f216319d) && n51.f.a(this.f216320e, k1Var.f216320e) && n51.f.a(this.f216321f, k1Var.f216321f) && n51.f.a(this.f216322g, k1Var.f216322g) && n51.f.a(this.f216323h, k1Var.f216323h) && n51.f.a(this.f216324i, k1Var.f216324i) && n51.f.a(this.f216325m, k1Var.f216325m) && n51.f.a(this.f216326n, k1Var.f216326n) && n51.f.a(this.f216327o, k1Var.f216327o) && n51.f.a(this.f216328p, k1Var.f216328p) && n51.f.a(this.f216329q, k1Var.f216329q) && n51.f.a(this.f216330r, k1Var.f216330r) && n51.f.a(java.lang.Integer.valueOf(this.f216331s), java.lang.Integer.valueOf(k1Var.f216331s)) && n51.f.a(java.lang.Integer.valueOf(this.f216332t), java.lang.Integer.valueOf(k1Var.f216332t)) && n51.f.a(this.f216333u, k1Var.f216333u) && n51.f.a(this.f216334v, k1Var.f216334v) && n51.f.a(this.f216335w, k1Var.f216335w) && n51.f.a(this.f216336x, k1Var.f216336x) && n51.f.a(this.f216337y, k1Var.f216337y) && n51.f.a(this.f216338z, k1Var.f216338z);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.k1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.wechat.aff.chatbot.j1 j1Var;
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.chatbot.t1 t1Var = this.f216319d;
            if (t1Var != null && zArr[1]) {
                fVar.i(1, t1Var.computeSize());
                this.f216319d.writeFields(fVar);
            }
            com.tencent.wechat.aff.chatbot.j1 j1Var2 = this.f216320e;
            if (j1Var2 != null && zArr[2]) {
                fVar.e(2, j1Var2.f216308d);
            }
            com.tencent.wechat.aff.chatbot.i1 i1Var = this.f216321f;
            if (i1Var != null && zArr[3]) {
                fVar.i(3, i1Var.computeSize());
                this.f216321f.writeFields(fVar);
            }
            com.tencent.wechat.aff.chatbot.f fVar2 = this.f216322g;
            if (fVar2 != null && zArr[4]) {
                fVar.i(4, fVar2.computeSize());
                this.f216322g.writeFields(fVar);
            }
            java.lang.String str = this.f216323h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f216324i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            com.tencent.wechat.aff.chatbot.g1 g1Var = this.f216325m;
            if (g1Var != null && zArr[7]) {
                fVar.i(7, g1Var.computeSize());
                this.f216325m.writeFields(fVar);
            }
            com.tencent.wechat.aff.chatbot.e0 e0Var = this.f216326n;
            if (e0Var != null && zArr[8]) {
                fVar.i(8, e0Var.computeSize());
                this.f216326n.writeFields(fVar);
            }
            com.tencent.wechat.aff.chatbot.h1 h1Var = this.f216327o;
            if (h1Var != null && zArr[12]) {
                fVar.i(12, h1Var.computeSize());
                this.f216327o.writeFields(fVar);
            }
            com.tencent.wechat.aff.chatbot.c3 c3Var = this.f216328p;
            if (c3Var != null && zArr[13]) {
                fVar.i(13, c3Var.computeSize());
                this.f216328p.writeFields(fVar);
            }
            com.tencent.wechat.aff.chatbot.z zVar = this.f216329q;
            if (zVar != null && zArr[14]) {
                fVar.i(14, zVar.computeSize());
                this.f216329q.writeFields(fVar);
            }
            com.tencent.wechat.aff.chatbot.e1 e1Var = this.f216330r;
            if (e1Var != null && zArr[15]) {
                fVar.i(15, e1Var.computeSize());
                this.f216330r.writeFields(fVar);
            }
            if (zArr[17]) {
                fVar.e(17, this.f216331s);
            }
            if (zArr[18]) {
                fVar.e(18, this.f216332t);
            }
            com.tencent.mm.protobuf.g gVar = this.f216333u;
            if (gVar != null && zArr[19]) {
                fVar.b(19, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f216334v;
            if (gVar2 != null && zArr[20]) {
                fVar.b(20, gVar2);
            }
            java.lang.String str3 = this.f216335w;
            if (str3 != null && zArr[21]) {
                fVar.j(21, str3);
            }
            java.lang.String str4 = this.f216336x;
            if (str4 != null && zArr[22]) {
                fVar.j(22, str4);
            }
            java.lang.String str5 = this.f216337y;
            if (str5 != null && zArr[24]) {
                fVar.j(24, str5);
            }
            com.tencent.wechat.aff.chatbot.f1 f1Var = this.f216338z;
            if (f1Var != null && zArr[28]) {
                fVar.i(28, f1Var.computeSize());
                this.f216338z.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.chatbot.t1 t1Var2 = this.f216319d;
            if (t1Var2 != null && zArr[1]) {
                i18 = b36.f.i(1, t1Var2.computeSize()) + 0;
            }
            com.tencent.wechat.aff.chatbot.j1 j1Var3 = this.f216320e;
            if (j1Var3 != null && zArr[2]) {
                i18 += b36.f.e(2, j1Var3.f216308d);
            }
            com.tencent.wechat.aff.chatbot.i1 i1Var2 = this.f216321f;
            if (i1Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, i1Var2.computeSize());
            }
            com.tencent.wechat.aff.chatbot.f fVar3 = this.f216322g;
            if (fVar3 != null && zArr[4]) {
                i18 += b36.f.i(4, fVar3.computeSize());
            }
            java.lang.String str6 = this.f216323h;
            if (str6 != null && zArr[5]) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f216324i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            com.tencent.wechat.aff.chatbot.g1 g1Var2 = this.f216325m;
            if (g1Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, g1Var2.computeSize());
            }
            com.tencent.wechat.aff.chatbot.e0 e0Var2 = this.f216326n;
            if (e0Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, e0Var2.computeSize());
            }
            com.tencent.wechat.aff.chatbot.h1 h1Var2 = this.f216327o;
            if (h1Var2 != null && zArr[12]) {
                i18 += b36.f.i(12, h1Var2.computeSize());
            }
            com.tencent.wechat.aff.chatbot.c3 c3Var2 = this.f216328p;
            if (c3Var2 != null && zArr[13]) {
                i18 += b36.f.i(13, c3Var2.computeSize());
            }
            com.tencent.wechat.aff.chatbot.z zVar2 = this.f216329q;
            if (zVar2 != null && zArr[14]) {
                i18 += b36.f.i(14, zVar2.computeSize());
            }
            com.tencent.wechat.aff.chatbot.e1 e1Var2 = this.f216330r;
            if (e1Var2 != null && zArr[15]) {
                i18 += b36.f.i(15, e1Var2.computeSize());
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f216331s);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f216332t);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f216333u;
            if (gVar3 != null && zArr[19]) {
                i18 += b36.f.b(19, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f216334v;
            if (gVar4 != null && zArr[20]) {
                i18 += b36.f.b(20, gVar4);
            }
            java.lang.String str8 = this.f216335w;
            if (str8 != null && zArr[21]) {
                i18 += b36.f.j(21, str8);
            }
            java.lang.String str9 = this.f216336x;
            if (str9 != null && zArr[22]) {
                i18 += b36.f.j(22, str9);
            }
            java.lang.String str10 = this.f216337y;
            if (str10 != null && zArr[24]) {
                i18 += b36.f.j(24, str10);
            }
            com.tencent.wechat.aff.chatbot.f1 f1Var2 = this.f216338z;
            return (f1Var2 == null || !zArr[28]) ? i18 : i18 + b36.f.i(28, f1Var2.computeSize());
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.aff.chatbot.t1 t1Var3 = new com.tencent.wechat.aff.chatbot.t1();
                    if (bArr != null && bArr.length > 0) {
                        t1Var3.parseFrom(bArr);
                    }
                    this.f216319d = t1Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                switch (aVar2.g(intValue)) {
                    case 0:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_Unknown;
                        break;
                    case 1:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_CreateNote;
                        break;
                    case 2:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_Msg;
                        break;
                    case 3:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_TEXT_OUTPUT;
                        break;
                    case 4:
                    case 10:
                    case 11:
                    case 12:
                    case 19:
                    case 20:
                    default:
                        j1Var = null;
                        break;
                    case 5:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_WeAppNotifyClientMsg;
                        break;
                    case 6:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_SpeakingAIInfo;
                        break;
                    case 7:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_QuestionInfo;
                        break;
                    case 8:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_Meta;
                        break;
                    case 9:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.Type_SocialHistoryUpdateNotify;
                        break;
                    case 13:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.TYPE_RECOMM_CONTENT;
                        break;
                    case 14:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.TYPE_VADResp;
                        break;
                    case 15:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.TYPE_PrologueMsgWrap;
                        break;
                    case 16:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.TYPE_BLUE_MICROPHONE;
                        break;
                    case 17:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.TYPE_TTS_EXTRA_INFO;
                        break;
                    case 18:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.TYPE_Asst_Card;
                        break;
                    case 21:
                        j1Var = com.tencent.wechat.aff.chatbot.j1.TYPE_ERROR;
                        break;
                }
                this.f216320e = j1Var;
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.aff.chatbot.i1 i1Var3 = new com.tencent.wechat.aff.chatbot.i1();
                    if (bArr2 != null && bArr2.length > 0) {
                        i1Var3.parseFrom(bArr2);
                    }
                    this.f216321f = i1Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.aff.chatbot.f fVar4 = new com.tencent.wechat.aff.chatbot.f();
                    if (bArr3 != null && bArr3.length > 0) {
                        fVar4.parseFrom(bArr3);
                    }
                    this.f216322g = fVar4;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f216323h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216324i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.aff.chatbot.g1 g1Var3 = new com.tencent.wechat.aff.chatbot.g1();
                    if (bArr4 != null && bArr4.length > 0) {
                        g1Var3.parseFrom(bArr4);
                    }
                    this.f216325m = g1Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.wechat.aff.chatbot.e0 e0Var3 = new com.tencent.wechat.aff.chatbot.e0();
                    if (bArr5 != null && bArr5.length > 0) {
                        e0Var3.parseFrom(bArr5);
                    }
                    this.f216326n = e0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
            case 10:
            case 11:
            case 16:
            case 23:
            case 25:
            case 26:
            case 27:
            default:
                return -1;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.wechat.aff.chatbot.h1 h1Var3 = new com.tencent.wechat.aff.chatbot.h1();
                    if (bArr6 != null && bArr6.length > 0) {
                        h1Var3.parseFrom(bArr6);
                    }
                    this.f216327o = h1Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.wechat.aff.chatbot.c3 c3Var3 = new com.tencent.wechat.aff.chatbot.c3();
                    if (bArr7 != null && bArr7.length > 0) {
                        c3Var3.parseFrom(bArr7);
                    }
                    this.f216328p = c3Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.wechat.aff.chatbot.z zVar3 = new com.tencent.wechat.aff.chatbot.z();
                    if (bArr8 != null && bArr8.length > 0) {
                        zVar3.parseFrom(bArr8);
                    }
                    this.f216329q = zVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.tencent.wechat.aff.chatbot.e1 e1Var3 = new com.tencent.wechat.aff.chatbot.e1();
                    if (bArr9 != null && bArr9.length > 0) {
                        e1Var3.parseFrom(bArr9);
                    }
                    this.f216330r = e1Var3;
                }
                zArr[15] = true;
                return 0;
            case 17:
                this.f216331s = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f216332t = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f216333u = aVar2.d(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f216334v = aVar2.d(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.f216335w = aVar2.k(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.f216336x = aVar2.k(intValue);
                zArr[22] = true;
                return 0;
            case 24:
                this.f216337y = aVar2.k(intValue);
                zArr[24] = true;
                return 0;
            case 28:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.tencent.wechat.aff.chatbot.f1 f1Var3 = new com.tencent.wechat.aff.chatbot.f1();
                    if (bArr10 != null && bArr10.length > 0) {
                        f1Var3.parseFrom(bArr10);
                    }
                    this.f216338z = f1Var3;
                }
                zArr[28] = true;
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.k1) super.parseFrom(bArr);
    }
}
