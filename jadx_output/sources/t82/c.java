package t82;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f416381d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f416382e;

    public c(int i17, java.lang.Runnable runnable) {
        this.f416381d = i17;
        this.f416382e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.h3 a17 = com.tencent.mm.plugin.fav.ui.h3.f101128c.a();
        int i17 = this.f416381d;
        if (a17.a(i17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[remove] use pos remove item in favIdList & favItemList, currentThread = " + java.lang.Thread.currentThread().getName());
            a17.f101131b.remove(i17);
            a17.f101130a.remove(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavFinderStorage", "[remove] remove success, position = " + i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavFinderStorage", "[remove] position invalid return");
        }
        this.f416382e.run();
    }
}
