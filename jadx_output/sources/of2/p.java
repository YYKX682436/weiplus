package of2;

/* loaded from: classes10.dex */
public final class p implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of2.n f345093d;

    public p(of2.n nVar) {
        this.f345093d = nVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        nf2.w wVar;
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsStyleOptionPanel", "menu selected: " + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        of2.n nVar = this.f345093d;
        if (itemId == 0) {
            nf2.w wVar2 = ((nf2.h) nVar).f336747a;
            java.lang.Object obj = wVar2.f291099e;
            android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
            java.lang.Object context = view != null ? view.getContext() : null;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null) {
                return;
            }
            of2.m mVar = new of2.m(activity, wVar2.f336818w, new nf2.g(activity.getResources().getDisplayMetrics().heightPixels, wVar2));
            com.tencent.mm.plugin.finder.live.widget.e0.W(mVar, null, false, 0, 7, null);
            mVar.H().post(new of2.l(mVar));
            return;
        }
        if (itemId != 1) {
            return;
        }
        nf2.h hVar = (nf2.h) nVar;
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsController", "onCloseLyricsClick: stopping lyrics and music");
        nf2.w wVar3 = hVar.f336747a;
        sf2.e1 e1Var = (sf2.e1) wVar3.controller(sf2.e1.class);
        if (e1Var != null && (wVar = (nf2.w) e1Var.controller(nf2.w.class)) != null) {
            nf2.d1 d1Var = wVar.f336808m;
            if (d1Var != null) {
                com.tencent.mm.plugin.finder.live.controller.lyrics.FinderLiveNormalRoomLyricsRenderView finderLiveNormalRoomLyricsRenderView = d1Var.f336698s;
                if (finderLiveNormalRoomLyricsRenderView != null) {
                    finderLiveNormalRoomLyricsRenderView.i();
                }
                com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "stopRender");
            }
            wVar.f336813r = false;
            wVar.b7();
        }
        sf2.e1 e1Var2 = (sf2.e1) wVar3.controller(sf2.e1.class);
        if (e1Var2 != null) {
            sf2.e1.m7(e1Var2, null, true, false, false, null, 28, null);
        }
        wVar3.f7(1, 1);
    }
}
