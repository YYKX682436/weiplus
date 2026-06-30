package xg4;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final xg4.h f454442d = new xg4.h();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap;
        xg4.p pVar = xg4.m.f454447b;
        if (pVar != null && (hashMap = pVar.f282999n) != null) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = ((fq0.x) entry.getValue()).f265488l;
                if (magicSclViewContainer != null) {
                    magicSclViewContainer.removeAllViews();
                }
                java.lang.String str = ((fq0.x) entry.getValue()).f265478b;
            }
        }
        xg4.p pVar2 = xg4.m.f454447b;
        if (pVar2 != null) {
            pVar2.destroy();
        }
        xg4.m.f454447b = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "forceCleanUp reset MagicLiveCardMgr");
    }
}
