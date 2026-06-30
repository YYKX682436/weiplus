package im2;

/* loaded from: classes10.dex */
public final class f4 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.g4 f292316d;

    public f4(im2.g4 g4Var) {
        this.f292316d = g4Var;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        im2.g4 g4Var = this.f292316d;
        if (!g4Var.O6()) {
            return false;
        }
        int size = g4Var.f292341d.size();
        if (!g4Var.f292342e || size >= 2) {
            com.tencent.mars.xlog.Log.i("FinderLivePlayerFactory", "preloadIdleHandler: completed! preloadCount=" + g4Var.f292341d.size() + ", isInFinder=" + g4Var.f292342e);
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderLivePlayerFactory", "preloadIdleHandler: start preload, currentSize=" + size + ", MAX_PRELOAD_COUNT=2");
        g4Var.f292341d.add(new nn0.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 0, true));
        return true;
    }
}
