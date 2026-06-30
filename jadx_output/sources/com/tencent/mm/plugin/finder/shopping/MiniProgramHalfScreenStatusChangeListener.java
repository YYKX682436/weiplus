package com.tencent.mm.plugin.finder.shopping;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/MiniProgramHalfScreenStatusChangeListener;", "Lcom/tencent/mm/plugin/appbrand/config/WeAppHalfScreenStatusChangeListener;", "Lzy2/ec;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class MiniProgramHalfScreenStatusChangeListener extends com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener implements zy2.ec {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f126277f;

    /* renamed from: g, reason: collision with root package name */
    public int f126278g;

    public MiniProgramHalfScreenStatusChangeListener(com.tencent.mm.plugin.finder.live.view.k0 k0Var, boolean z17) {
        super(z17);
        this.f126277f = new java.lang.ref.WeakReference(k0Var);
    }

    @Override // zy2.ec
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exitMiniPro style:");
        sb6.append(this.f126278g);
        sb6.append("! monitorHeightChanged: ");
        boolean z17 = this.f77396d;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MiniProgramHalfScreenStatusChangeListener", sb6.toString());
        if (this.f126278g == 1 || z17) {
            m();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void c() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        dt2.a0 a0Var;
        this.f126278g = 1;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) this.f126277f.get();
        if (k0Var instanceof fm2.c) {
            fm2.c cVar = (fm2.c) k0Var;
            androidx.fragment.app.Fragment uicFragment = cVar.getUicFragment();
            if (uicFragment != null) {
                androidx.fragment.app.Fragment fragment = uicFragment.isAdded() ? uicFragment : null;
                if (fragment != null) {
                    ((com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC) pf5.z.f353948a.b(fragment).a(com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.class)).U6();
                    um2.x5 startUIC = cVar.getStartUIC();
                    if (startUIC != null) {
                        startUIC.d0();
                    }
                }
            }
        } else if (k0Var instanceof fm2.a) {
            fm2.a aVar = (fm2.a) k0Var;
            androidx.fragment.app.Fragment uicFragment2 = aVar.getUicFragment();
            if (uicFragment2 != null) {
                androidx.fragment.app.Fragment fragment2 = uicFragment2.isAdded() ? uicFragment2 : null;
                if (fragment2 != null) {
                    ((com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC) pf5.z.f353948a.b(fragment2).a(com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC.class)).S6();
                    sm2.o4 startUIC2 = aVar.getStartUIC();
                    if (startUIC2 != null) {
                        startUIC2.Q();
                    }
                }
            }
        } else if (k0Var instanceof fm2.b) {
            fm2.b bVar = (fm2.b) k0Var;
            androidx.fragment.app.Fragment uicFragment3 = bVar.getUicFragment();
            if (uicFragment3 != null) {
                androidx.fragment.app.Fragment fragment3 = uicFragment3.isAdded() ? uicFragment3 : null;
                if (fragment3 != null) {
                    ((te2.v1) pf5.z.f353948a.b(fragment3).a(te2.v1.class)).S6();
                    tm2.s2 startUIC3 = bVar.getStartUIC();
                    if (startUIC3 != null) {
                        startUIC3.o();
                    }
                }
            }
        } else if (k0Var instanceof com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout) {
            ws2.o shoppingReplayBaseUIC = ((com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout) k0Var).getShoppingReplayBaseUIC();
            shoppingReplayBaseUIC.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveReplayBaseUIC", "pause");
            at2.u1 u1Var = shoppingReplayBaseUIC.f449109e;
            if (u1Var != null && (a0Var = u1Var.f13762q) != null) {
                a0Var.d();
            }
            at2.y1 y1Var = shoppingReplayBaseUIC.f449111g;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = shoppingReplayBaseUIC.f449092b;
            if (y1Var != null && (weImageView = y1Var.f13782r) != null) {
                android.graphics.drawable.Drawable drawable = appCompatActivity.getDrawable(com.tencent.mm.R.raw.icons_filled_play);
                com.tencent.mm.ui.uk.f(drawable, -1);
                weImageView.setImageDrawable(drawable);
            }
            at2.y1 y1Var2 = shoppingReplayBaseUIC.f449111g;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = y1Var2 != null ? y1Var2.f13782r : null;
            if (weImageView2 != null) {
                weImageView2.setContentDescription(appCompatActivity.getString(com.tencent.mm.R.string.eau));
            }
            shoppingReplayBaseUIC.f449112h = true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEnterFullScreen baseLivePluginLayout:");
        sb6.append(k0Var != null ? k0Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MiniProgramHalfScreenStatusChangeListener", sb6.toString());
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void d() {
        this.f126278g = 0;
        com.tencent.mars.xlog.Log.i("MiniProgramHalfScreenStatusChangeListener", "onEnterHalfScreen!");
        m();
    }

    @Override // com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener
    public void i(com.tencent.mm.plugin.appbrand.config.HeightInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MiniProgramHalfScreenStatusChangeListener", "onHeightChanged info:" + info + '!');
    }

    public final void m() {
        androidx.fragment.app.Fragment uicFragment;
        androidx.fragment.app.Fragment fragment;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = (com.tencent.mm.plugin.finder.live.view.k0) this.f126277f.get();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exitMiniWindow baseLivePluginLayout:");
        sb6.append(k0Var != null ? k0Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MiniProgramHalfScreenStatusChangeListener", sb6.toString());
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
