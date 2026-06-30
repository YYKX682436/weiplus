package com.tencent.mm.plugin.finder.profile.uic;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/uic/FinderProfileReplayFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/je;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileReplayFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements com.tencent.mm.plugin.finder.profile.uic.je {
    public FinderProfileReplayFragment() {
        super(113);
    }

    @Override // com.tencent.mm.plugin.finder.profile.uic.je
    public void k(boolean z17) {
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC finderProfileReplayLiveUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC) pf5.z.f353948a.b(this).e(com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC.class);
        if (finderProfileReplayLiveUIC != null) {
            jz5.g gVar = finderProfileReplayLiveUIC.f123449m;
            if (z17) {
                ((vb2.z) ((jz5.n) gVar).getValue()).f434783d.setBackgroundResource(com.tencent.mm.R.color.a9e);
            } else {
                ((vb2.z) ((jz5.n) gVar).getValue()).f434783d.setBackgroundResource(com.tencent.mm.R.color.f478494f);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.profile.uic.FinderProfileReplayLiveUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.ny.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        getActivity();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        return ((com.tencent.mm.plugin.finder.ui.MMFinderUI) activity).getD();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 3;
    }
}
