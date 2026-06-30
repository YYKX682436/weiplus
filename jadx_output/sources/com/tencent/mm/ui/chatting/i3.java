package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public abstract class i3 {
    public static void a(android.content.Context context, java.util.Set set, ot0.f3 f3Var) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, context is null");
            return;
        }
        if (set == null || set.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, select ids is empty");
            return;
        }
        com.tencent.mm.ui.chatting.component.b5.f198693t.a(new com.tencent.mm.ui.chatting.h3(set, db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.bot), true, false, null), f3Var));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10811, 4, java.lang.Integer.valueOf(set.size()));
    }
}
