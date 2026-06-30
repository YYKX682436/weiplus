package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z70 extends com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC f136664d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z70(com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.util.List list) {
        super((com.tencent.mm.ui.MMActivity) appCompatActivity, list);
        this.f136664d = finderTabUIC;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("to :");
        sb6.append(i18);
        sb6.append(" lastIndex:");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC finderTabUIC = this.f136664d;
        sb6.append(finderTabUIC.f133655d);
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.TAG, sb6.toString());
        finderTabUIC.f133655d = i18;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.t7(finderTabUIC, i18, false, 2, null);
        java.util.Iterator it = finderTabUIC.f133663o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.view.ka) it.next()).l(i17, i18, i19, i27);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        java.util.Iterator it = this.f136664d.f133663o.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.view.ka) it.next()).z(z17, i17, fragment);
        }
    }
}
