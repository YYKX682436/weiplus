package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public abstract class r0 {
    public static p53.u a(android.app.Activity activity, android.view.View view) {
        if (activity == null || !(view instanceof android.widget.FrameLayout)) {
            return null;
        }
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2) activity.getIntent().getParcelableExtra("game_tab_data");
        java.lang.String stringExtra = activity.getIntent().getStringExtra("game_tab_key");
        if (gameTabData2 == null || gameTabData2.f141151d.size() <= 1) {
            return null;
        }
        p53.u uVar = new p53.u(activity, gameTabData2, stringExtra);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        ((android.widget.FrameLayout) view).addView(uVar, layoutParams);
        return uVar;
    }

    public static void b(android.content.Context context) {
        int identityHashCode = java.lang.System.identityHashCode(context);
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.game.ACTION_EXIT");
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        intent.putExtra("game_finish_activity_id", identityHashCode);
        context.sendBroadcast(intent, com.tencent.mm.plugin.game.g0.f139448a);
        com.tencent.mm.autogen.events.GameLifecycleNotifyEvent gameLifecycleNotifyEvent = new com.tencent.mm.autogen.events.GameLifecycleNotifyEvent();
        am.se seVar = gameLifecycleNotifyEvent.f54365g;
        seVar.f7894a = "com.tencent.mm.game.ACTION_EXIT";
        seVar.f7895b = identityHashCode;
        gameLifecycleNotifyEvent.e();
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            if (com.tencent.mm.sdk.platformtools.x2.m()) {
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(identityHashCode), com.tencent.mm.plugin.game.ui.chat_tab.q0.class, null);
            }
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193055c;
            if (com.tencent.mm.sdk.platformtools.x2.o(str)) {
                com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.type.IPCInteger(identityHashCode), com.tencent.mm.plugin.game.ui.chat_tab.q0.class, null);
            }
        }
    }
}
