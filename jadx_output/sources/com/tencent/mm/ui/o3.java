package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public abstract class o3 {
    public static void a(android.content.Context context, java.lang.Runnable runnable) {
        db5.e1.B(context, context.getString(com.tencent.mm.R.string.gq7), "", context.getString(com.tencent.mm.R.string.gq8), context.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.ui.n3(runnable, context), null, com.tencent.mm.R.color.f478622ch);
    }

    public static void b(android.content.Context context, java.lang.Runnable runnable) {
        if (!gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, true)) {
            a(context, runnable);
            return;
        }
        db5.h3 h3Var = new db5.h3(context);
        h3Var.L.setText(context.getString(com.tencent.mm.R.string.gq_));
        h3Var.M.setText(context.getString(com.tencent.mm.R.string.gq9));
        h3Var.N.setOnClickListener(new com.tencent.mm.ui.m3(h3Var, context, runnable));
        h3Var.C();
    }
}
