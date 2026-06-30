package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderLbsTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLbsTabFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {
    public FinderLbsTabFragment() {
        super(com.tencent.mm.R.string.f6g, 2);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.j80.class, com.tencent.mm.plugin.finder.viewmodel.component.d1.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 16;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void s0() {
        com.tencent.mm.plugin.finder.viewmodel.component.j80 j80Var = (com.tencent.mm.plugin.finder.viewmodel.component.j80) j0(com.tencent.mm.plugin.finder.viewmodel.component.j80.class);
        com.tencent.mm.plugin.finder.feed.zu zuVar = j80Var.f134830d;
        if (zuVar != null) {
            zuVar.h(true);
        }
        com.tencent.mm.plugin.finder.feed.yt ytVar = j80Var.f134831e;
        if (ytVar != null) {
            ytVar.i(true);
        }
    }
}
