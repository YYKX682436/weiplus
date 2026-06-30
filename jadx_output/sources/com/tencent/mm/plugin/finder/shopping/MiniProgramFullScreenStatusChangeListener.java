package com.tencent.mm.plugin.finder.shopping;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/MiniProgramFullScreenStatusChangeListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "Lzy2/ec;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MiniProgramFullScreenStatusChangeListener extends com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener implements zy2.ec {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f126276f;

    public MiniProgramFullScreenStatusChangeListener(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(false, 1, null);
        this.f126276f = new java.lang.ref.WeakReference(k0Var);
    }

    @Override // zy2.ec
    public void a() {
        androidx.fragment.app.Fragment uicFragment;
        androidx.fragment.app.Fragment fragment;
        com.tencent.mars.xlog.Log.i("MiniProgramFullScreenStatusChangeListener", "exitMiniPro");
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) this.f126276f.get();
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.i("MiniProgramFullScreenStatusChangeListener", "exitMiniWindow baseLivePluginLayout:0, router is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MiniProgramFullScreenStatusChangeListener", "exitMiniWindow baseLivePluginLayout:" + k0Var.hashCode());
        if (k0Var instanceof fm2.c) {
            fm2.c cVar = (fm2.c) k0Var;
            androidx.fragment.app.Fragment uicFragment2 = cVar.getUicFragment();
            if (uicFragment2 != null) {
                fragment = uicFragment2.isAdded() ? uicFragment2 : null;
                if (fragment != null) {
                    ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).T6();
                    dk2.ef.f233372a.o();
                    um2.x5 startUIC = cVar.getStartUIC();
                    if (startUIC != null) {
                        startUIC.b0();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!(k0Var instanceof fm2.a)) {
            if (!(k0Var instanceof fm2.b) || (uicFragment = ((fm2.b) k0Var).getUicFragment()) == null) {
                return;
            }
            fragment = uicFragment.isAdded() ? uicFragment : null;
            if (fragment != null) {
                ((te2.v1) pf5.z.f353948a.b(fragment).a(te2.v1.class)).R6();
                dk2.ef.f233372a.o();
                return;
            }
            return;
        }
        fm2.a aVar = (fm2.a) k0Var;
        androidx.fragment.app.Fragment uicFragment3 = aVar.getUicFragment();
        if (uicFragment3 != null) {
            fragment = uicFragment3.isAdded() ? uicFragment3 : null;
            if (fragment != null) {
                ((com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC.class)).R6();
                sm2.o4 startUIC2 = aVar.getStartUIC();
                if (startUIC2 != null) {
                    startUIC2.O(true);
                }
            }
        }
    }
}
