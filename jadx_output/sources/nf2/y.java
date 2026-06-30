package nf2;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d0 f336824d;

    public y(nf2.d0 d0Var) {
        this.f336824d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf2.d0 d0Var = this.f336824d;
        if (d0Var.f336673h) {
            return;
        }
        d0Var.f336673h = true;
        com.tencent.mars.xlog.Log.i("LiveLyricsGestureHelper", "enterDragMode");
        android.view.View view = ((nf2.d1) d0Var.f336666a).f336685f;
        if (view != null) {
            view.performHapticFeedback(0);
        }
        nf2.x xVar = d0Var.f336677l;
        if (xVar != null) {
            nf2.w wVar = ((nf2.b) xVar).f336656a;
            wVar.getClass();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LYRICS_GESTURE_EDU_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            if (wVar.f336821z) {
                wVar.c7(false);
            }
            com.tencent.mm.plugin.finder.live.view.ub ubVar = wVar.f291099e;
            if (ubVar != null) {
                ubVar.onPluginAlphaModify(1.0f, 0.3f);
            }
        }
    }
}
