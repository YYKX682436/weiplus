package x92;

/* loaded from: classes2.dex */
public abstract class m extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC implements x92.q {

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f452710v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f452711w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f452712x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f452712x = true;
    }

    public boolean A7(int i17) {
        return false;
    }

    public com.tencent.mm.protobuf.f B7() {
        return null;
    }

    public void C7(int i17, java.lang.String str) {
        if (A7(i17)) {
            java.util.Set<com.tencent.mm.ui.component.UIComponent> x76 = x7();
            if (x76 != null) {
                for (com.tencent.mm.ui.component.UIComponent uIComponent : x76) {
                    x92.r rVar = uIComponent instanceof x92.r ? (x92.r) uIComponent : null;
                    if (rVar != null) {
                        rVar.O6(i17, str);
                    }
                }
                return;
            }
            return;
        }
        java.util.Set<com.tencent.mm.ui.component.UIComponent> x77 = x7();
        if (x77 != null) {
            for (com.tencent.mm.ui.component.UIComponent uIComponent2 : x77) {
                x92.r rVar2 = uIComponent2 instanceof x92.r ? (x92.r) uIComponent2 : null;
                if (rVar2 != null) {
                    rVar2.P6(i17, str);
                }
            }
        }
    }

    public void D7() {
    }

    public void E7(com.tencent.mm.protobuf.f fVar) {
        java.util.Set<com.tencent.mm.ui.component.UIComponent> x76 = x7();
        if (x76 != null) {
            for (com.tencent.mm.ui.component.UIComponent uIComponent : x76) {
                x92.r rVar = uIComponent instanceof x92.r ? (x92.r) uIComponent : null;
                if (rVar != null) {
                    rVar.S6(fVar);
                }
            }
        }
    }

    public void F7(java.lang.String tabName, int i17, int i18) {
        kotlin.jvm.internal.o.g(tabName, "tabName");
    }

    public void G7() {
    }

    public final void H7(boolean z17) {
        int X6 = X6();
        int i17 = 0;
        for (zx2.i iVar : f7()) {
            int i18 = i17 + 1;
            if (iVar instanceof w92.a) {
                if (z17) {
                    w92.a aVar = (w92.a) iVar;
                    boolean z18 = i17 == X6;
                    aVar.f444072k = true;
                    aVar.k(z18);
                } else {
                    w92.a aVar2 = (w92.a) iVar;
                    boolean z19 = i17 == X6;
                    aVar2.f444072k = false;
                    aVar2.k(z19);
                }
            }
            i17 = i18;
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new w92.c(w7());
    }

    @Override // x92.q
    public void b2() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(getResources().getColor(com.tencent.mm.R.color.f478982ml));
        }
        H7(true);
    }

    public java.lang.String d2() {
        x92.f f101740t;
        java.lang.String a17;
        android.view.LayoutInflater.Factory activity = getActivity();
        t92.a aVar = activity instanceof t92.a ? (t92.a) activity : null;
        return (aVar == null || (f101740t = aVar.getF101740t()) == null || (a17 = f101740t.a()) == null) ? "" : a17;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void l7(int i17) {
        if (this.f452712x) {
            this.f452712x = false;
            return;
        }
        if (i17 < 0 || i17 >= f7().size()) {
            return;
        }
        zx2.i iVar = (zx2.i) f7().get(i17);
        if (iVar instanceof w92.a) {
            w92.a aVar = (w92.a) iVar;
            F7(aVar.i(getContext()).toString(), aVar.f444073l, 1);
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
        z7();
        z5();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        this.f452710v = B7();
        if (y7()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "[onCreateAfter] hit cache");
            D7();
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "[onCreateAfter] request");
            G7();
        }
    }

    @Override // x92.q
    public void setNormalStyle() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f133658g;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        H7(false);
    }

    public abstract int w7();

    public final java.util.Set x7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null) {
            return mMFinderUI.getUiComponents();
        }
        return null;
    }

    public boolean y7() {
        return this.f452710v != null;
    }

    public void z7() {
    }
}
