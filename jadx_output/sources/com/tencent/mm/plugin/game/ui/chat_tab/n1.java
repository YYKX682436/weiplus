package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class n1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI f141294a;

    public n1(com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI) {
        this.f141294a = gameWebTabUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI gameWebTabUI;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (gameWebTabUI = this.f141294a) == null || gameWebTabUI.isFinishing()) {
            return;
        }
        if (!intent.hasExtra("game_finish_activity_id")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "GameWebTabUI exit!");
            gameWebTabUI.finish();
        } else if (java.lang.System.identityHashCode(gameWebTabUI) == intent.getIntExtra("game_finish_activity_id", -1)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameWebTabUI", "GameWebTabUI exit from GameTabHelper.finish");
            gameWebTabUI.finish();
        }
    }
}
