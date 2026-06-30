package com.tencent.mm.plugin.finder.member.preview;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/member/preview/FinderPreviewFeedListFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderReportFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPreviewFeedListFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment {
    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        java.util.HashSet Q0 = kz5.n0.Q0(super.l0());
        Q0.add(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
        Q0.add(com.tencent.mm.plugin.finder.member.preview.z0.class);
        return Q0;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        android.os.Bundle arguments = getArguments();
        return (arguments != null ? arguments.getInt("key_finder_member_feed_type") : 0) == 1 ? 208 : 207;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment
    public int s0() {
        return getB();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderReportFragment
    public int t0() {
        return 3;
    }
}
