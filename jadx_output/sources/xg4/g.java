package xg4;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xg4.g f454441d = new xg4.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.HashMap hashMap;
        xg4.p pVar = xg4.m.f454447b;
        java.lang.Integer valueOf = (pVar == null || (hashMap = pVar.f282999n) == null) ? null : java.lang.Integer.valueOf(hashMap.size());
        xg4.p pVar2 = xg4.m.f454447b;
        java.lang.Integer valueOf2 = (pVar2 == null || (concurrentHashMap = pVar2.f283001p) == null) ? null : java.lang.Integer.valueOf(concurrentHashMap.size());
        if (valueOf != null && valueOf.intValue() == 0 && valueOf2 != null && valueOf2.intValue() == 0) {
            xg4.m mVar = xg4.m.f454446a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanUpService");
            xg4.p pVar3 = xg4.m.f454447b;
            if (pVar3 != null) {
                pVar3.destroy();
            }
            xg4.m.f454447b = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup reset MagicLiveCardMgr");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup frameSet or root not empty frameSetSize:" + valueOf + " rootSize:" + valueOf2);
        }
        return jz5.f0.f302826a;
    }
}
