package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public abstract class r5 {

    /* renamed from: a, reason: collision with root package name */
    public static int f202640a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.q5 f202641b = new com.tencent.mm.ui.chatting.q5();

    public static void a(android.content.Context context, java.lang.String str, int i17, int i18) {
        com.tencent.mm.autogen.events.VoipEvent voipEvent = new com.tencent.mm.autogen.events.VoipEvent();
        am.y00 y00Var = voipEvent.f54945g;
        y00Var.f8415b = 5;
        y00Var.f8418e = str;
        y00Var.f8417d = context;
        y00Var.f8419f = i17;
        voipEvent.e();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11033, 4, 1, 0);
    }

    public static boolean b() {
        if (f202640a == -1) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_chatting_hover_enable, 0);
            f202640a = Ni;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAvatarOnHoverHelper", "isEnable:%s", java.lang.Integer.valueOf(Ni));
        }
        return f202640a == 1;
    }
}
