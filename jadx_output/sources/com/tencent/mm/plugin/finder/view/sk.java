package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class sk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f133058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f133060f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView, int i17, int i18) {
        super(0);
        this.f133058d = finderSnsHeaderView;
        this.f133059e = i17;
        this.f133060f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter = this.f133058d.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyItemRangeChanged(this.f133059e, this.f133060f);
        }
        return jz5.f0.f302826a;
    }
}
