package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.n0 f121256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.finder.member.preview.n0 n0Var) {
        super(0);
        this.f121256d = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.member.preview.FinderPreviewFeedListFragment finderPreviewFeedListFragment = this.f121256d.f121262e;
        boolean z17 = true;
        if (finderPreviewFeedListFragment != null && (view = finderPreviewFeedListFragment.f206301h) != null && (refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e)) != null && (recyclerView = refreshLoadMoreLayout.getRecyclerView()) != null) {
            z17 = true ^ recyclerView.canScrollVertically(-1);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
