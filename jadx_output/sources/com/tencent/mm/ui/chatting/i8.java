package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class i8 implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f201837a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f201838b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f201839c;

    /* renamed from: d, reason: collision with root package name */
    public int f201840d;

    public i8(yb5.d dVar, com.tencent.mm.storage.z3 z3Var, java.lang.String str) {
        this.f201837a = dVar;
        this.f201838b = z3Var;
        this.f201839c = str;
        com.tencent.mm.storage.z3.H3(str);
        com.tencent.mm.storage.z3.s4(str);
        com.tencent.mm.storage.z3.G4(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
        yb5.d dVar = this.f201837a;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e;
        if (z17) {
            this.f201840d = chatFooter.getCurrentScrollHeight();
            chatFooter.i1(qk.w9.a(dVar.g()) + i17, true, 0, 0);
            chatFooter.f190054r2 = false;
            chatFooter.setIgnoreScroll(java.lang.Boolean.TRUE);
            return;
        }
        int i18 = this.f201840d;
        if (i18 > 0) {
            chatFooter.i1(i18, true, 0, 0);
        } else {
            chatFooter.i1(qk.w9.a(dVar.g()) + i17, true, 0, 0);
        }
        chatFooter.f190054r2 = true;
        chatFooter.setIgnoreScroll(java.lang.Boolean.FALSE);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        boolean E = c01.d9.b().E();
        yb5.d dVar = this.f201837a;
        if (!E) {
            db5.t7.k(dVar.g(), dVar.f460717l.getContentView());
            return;
        }
        if (iEmojiInfo == null) {
            return;
        }
        com.tencent.mm.storage.z3 z3Var = this.f201838b;
        if (!(z3Var.d1().equals("medianote") && (c01.z1.p() & 16384) == 0)) {
            ((kt.g) ((lt.n0) i95.n0.c(lt.n0.class))).getClass();
            com.tencent.mm.pluginsdk.ui.tools.p0.a();
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e;
            r15.b quoteSendExtCommonInfo = chatFooter != null ? chatFooter.getQuoteSendExtCommonInfo() : null;
            s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
            java.lang.String str = this.f201839c;
            ((y12.h) wi6).Y(com.tencent.mm.sdk.platformtools.t8.K0(str) ? z3Var.d1() : str, (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, null, quoteSendExtCommonInfo, iEmojiInfo.c0().ordinal());
            if (quoteSendExtCommonInfo != null) {
                ik1.h0.b(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.i8$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) com.tencent.mm.ui.chatting.i8.this.f201837a.f460708c.a(sb5.s0.class))).f199263e.v1(false, true);
                    }
                });
            }
            dVar.L(true);
            return;
        }
        iEmojiInfo.O0(0);
        iEmojiInfo.w1(3);
        ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Vi(iEmojiInfo);
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.setType(47);
        f9Var.u1("medianote");
        f9Var.j1(1);
        if (iEmojiInfo.k()) {
            f9Var.d1(com.tencent.mm.storage.y4.e(c01.z1.r(), 0L, false, iEmojiInfo.getMd5(), false, ""));
        }
        if (!pt0.f0.f358209b1.e()) {
            f9Var.i1(iEmojiInfo.getMd5());
        }
        f9Var.e1(c01.w9.o(f9Var.Q0()));
        f9Var.r1(2);
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).M9(f9Var);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
    }

    public void d(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (!c01.d9.b().E()) {
            yb5.d dVar = this.f201837a;
            db5.t7.k(dVar.g(), dVar.f460717l.getContentView());
            return;
        }
        if (iEmojiInfo == null) {
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        c01.d9.b().getClass();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb7.append(gm0.j1.u().d());
        sb7.append("emoji/");
        sb6.append(sb7.toString());
        sb6.append(iEmojiInfo.getMd5());
        java.lang.String sb8 = sb6.toString();
        if (com.tencent.mm.vfs.w6.j(sb8 + "_thumb")) {
            wXMediaMessage.thumbData = com.tencent.mm.vfs.w6.N(sb8 + "_thumb", 0, (int) com.tencent.mm.vfs.w6.k(sb8 + "_thumb"));
        } else {
            java.io.InputStream inputStream = null;
            try {
                try {
                    inputStream = com.tencent.mm.vfs.w6.E(sb8);
                    wXMediaMessage.setThumbImage(com.tencent.mm.sdk.platformtools.j.c(inputStream, 1.0f));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingSmileyPanelImpl", e17, "", new java.lang.Object[0]);
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingSmileyPanelImpl", "sendAppMsgEmoji Fail cause there is no thumb");
                }
            } finally {
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
            }
        }
        wXMediaMessage.mediaObject = new com.tencent.mm.opensdk.modelmsg.WXEmojiObject(sb8);
        com.tencent.mm.pluginsdk.model.app.k0.D(wXMediaMessage, iEmojiInfo.S(), null, this.f201839c, 1, iEmojiInfo.getMd5());
    }
}
