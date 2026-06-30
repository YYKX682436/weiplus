package im2;

/* loaded from: classes10.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.g4 f292291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(java.lang.String str, im2.g4 g4Var) {
        super(0);
        this.f292290d = str;
        this.f292291e = g4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPreload: source=");
        sb6.append(this.f292290d);
        sb6.append(", isInFinder=");
        im2.g4 g4Var = this.f292291e;
        sb6.append(g4Var.f292342e);
        sb6.append(", preloadPlayer.size=");
        java.util.List list = g4Var.f292341d;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("FinderLivePlayerFactory", sb6.toString());
        if (g4Var.f292342e && list.size() < 2) {
            android.os.MessageQueue queue = android.os.Looper.getMainLooper().getQueue();
            android.os.MessageQueue.IdleHandler idleHandler = g4Var.f292344g;
            queue.removeIdleHandler(idleHandler);
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(idleHandler);
        }
        return jz5.f0.f302826a;
    }
}
