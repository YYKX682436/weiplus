package wx;

/* loaded from: classes14.dex */
public final class o implements com.tencent.wechat.aff.chatbot.q0, com.tencent.wechat.aff.chatbot.h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final wx.o f450424a = new wx.o();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f450425b;

    private o() {
    }

    public final synchronized void a() {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("ChatBotIamCoreCenter", "registerAff: account not ready, skip. stack:\n" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            return;
        }
        if (!f450425b) {
            com.tencent.wechat.aff.chatbot.l1.f216350a = wx.j.f450415a;
            com.tencent.wechat.aff.chatbot.a1.f216067a = new wx.k(this);
            com.tencent.wechat.aff.chatbot.w0 w0Var = com.tencent.wechat.aff.chatbot.w0.f216518b;
            w0Var.a(new com.tencent.wechat.aff.chatbot.p0(this), wx.l.f450418a);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatbot.RepairerConfigChatBotAsstPageEnable()) == 1) {
                com.tencent.mars.xlog.Log.i("ChatBotIamCoreCenter", "onceRegister fetchChatBotRoomInfoAsync");
                w0Var.c(wx.m.f450421a);
            }
            com.tencent.mars.xlog.Log.i("ChatBotIamCoreCenter", "onceRegister over");
            f450425b = true;
        }
        com.tencent.mars.xlog.Log.i("ChatBotIamCoreCenter", "registerAff result:" + f450425b);
    }

    public final synchronized void b() {
        if (f450425b) {
            com.tencent.mars.xlog.Log.i("ChatBotIamCoreCenter", "releaseAffAsync");
            com.tencent.wechat.aff.chatbot.w0.f216518b.f(wx.n.f450422a);
            hy.b0.f285728a.b();
        }
        f450425b = false;
    }
}
