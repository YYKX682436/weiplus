package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class uk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f133202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f133204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView, int i17, int i18) {
        super(0);
        this.f133202d = finderSnsHeaderView;
        this.f133203e = i17;
        this.f133204f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView = this.f133202d;
        androidx.recyclerview.widget.f2 adapter2 = finderSnsHeaderView.getRecyclerView().getAdapter();
        int i17 = this.f133203e;
        if (adapter2 != null) {
            adapter2.notifyItemRangeInserted(i17, this.f133204f);
        }
        if (i17 > 0 && (adapter = finderSnsHeaderView.getRecyclerView().getAdapter()) != null) {
            adapter.notifyItemChanged(i17 - 1);
        }
        return jz5.f0.f302826a;
    }
}
