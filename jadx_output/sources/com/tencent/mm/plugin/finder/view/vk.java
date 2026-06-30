package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class vk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f133252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133253e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f133254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView, int i17, int i18) {
        super(0);
        this.f133252d = finderSnsHeaderView;
        this.f133253e = i17;
        this.f133254f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView = this.f133252d;
        androidx.recyclerview.widget.f2 adapter = finderSnsHeaderView.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyItemRangeRemoved(this.f133253e, this.f133254f);
        }
        finderSnsHeaderView.a();
        return jz5.f0.f302826a;
    }
}
