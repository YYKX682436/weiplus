package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class m extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.o f141291a;

    public m(com.tencent.mm.plugin.game.ui.chat_tab.o oVar) {
        this.f141291a = oVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.game.ui.chat_tab.o oVar;
        com.tencent.mm.ui.MMActivity mMActivity;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (mMActivity = (oVar = this.f141291a).f141295a) == null || mMActivity.isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatTabPresenter", "gamecenter exit!");
        oVar.f141295a.finish();
    }
}
