package p53;

/* loaded from: classes8.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI f352062a;

    public i(com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI gameTabHomeUI) {
        this.f352062a = gameTabHomeUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.game.ui.tab.GameTabHomeUI gameTabHomeUI;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (gameTabHomeUI = this.f352062a) == null || gameTabHomeUI.isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabHomeUI", "GameTabHomeUI exit!");
        gameTabHomeUI.finish();
    }
}
