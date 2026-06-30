package g05;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g05.r f267482d;

    public p(g05.r rVar) {
        this.f267482d = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g05.j jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "onMainSessionExposed, try preload bizHandle:" + this.f267482d.f267490m);
        java.lang.ref.WeakReference weakReference = this.f267482d.f267488h;
        boolean z17 = false;
        if (weakReference != null && (jVar = (g05.j) weakReference.get()) != null && ((com.tencent.mm.ui.chatting.component.k) jVar).f199324g) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new g05.o(this.f267482d));
    }
}
