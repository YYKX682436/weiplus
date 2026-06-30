package p53;

/* loaded from: classes8.dex */
public class k extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.tab.GameTabWebUI f352064a;

    public k(com.tencent.mm.plugin.game.ui.tab.GameTabWebUI gameTabWebUI) {
        this.f352064a = gameTabWebUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.game.ui.tab.GameTabWebUI gameTabWebUI;
        android.app.Activity activity;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (activity = (gameTabWebUI = this.f352064a).T3) == null || activity.isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWebUI", "%s exit!", gameTabWebUI.T3.getClass().getSimpleName());
        gameTabWebUI.T3.finish();
    }
}
