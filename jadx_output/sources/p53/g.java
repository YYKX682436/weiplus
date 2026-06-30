package p53;

/* loaded from: classes8.dex */
public class g extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI f352060a;

    public g(com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI gameTabBridgeUI) {
        this.f352060a = gameTabBridgeUI;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI gameTabBridgeUI;
        if (intent == null || !"com.tencent.mm.game.ACTION_EXIT".equals(intent.getAction()) || (gameTabBridgeUI = this.f352060a) == null || gameTabBridgeUI.isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabBridgeUI", "GameTabBridgeUI exit!");
        gameTabBridgeUI.finish();
    }
}
