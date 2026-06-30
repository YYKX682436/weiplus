package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class y1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI f141341a;

    public y1(com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI mMGameWebTabUI) {
        this.f141341a = mMGameWebTabUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI mMGameWebTabUI;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (mMGameWebTabUI = this.f141341a) == null || mMGameWebTabUI.isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMGameWebTabUI", "MMGameWebTabUI exit!");
        mMGameWebTabUI.finish();
    }
}
