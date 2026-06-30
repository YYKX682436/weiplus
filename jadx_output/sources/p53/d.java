package p53;

/* loaded from: classes8.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p53.e f352055d;

    public d(p53.e eVar) {
        this.f352055d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        p53.e eVar = this.f352055d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabBridgeUI", "load tools process, web page load time:%d", java.lang.Long.valueOf(currentTimeMillis - eVar.f352056d));
        if (com.tencent.mm.plugin.game.ui.tab.GameTabWidget.f141771f == eVar.f352058f.hashCode()) {
            com.tencent.mm.plugin.game.ui.tab.GameTabWidget.d(eVar.f352058f, eVar.f352057e, false, true, true, false);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameTabBridgeUI", "GameTabWidget.mHashCode(%d) != hashCode(%d), dont need turn page!", java.lang.Integer.valueOf(com.tencent.mm.plugin.game.ui.tab.GameTabWidget.f141771f), java.lang.Integer.valueOf(eVar.f352058f.hashCode()));
        }
    }
}
