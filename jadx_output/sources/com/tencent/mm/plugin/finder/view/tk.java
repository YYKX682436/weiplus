package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class tk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f133131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f133132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f133133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f133134g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView, int i17, int i18, java.lang.Object obj) {
        super(0);
        this.f133131d = finderSnsHeaderView;
        this.f133132e = i17;
        this.f133133f = i18;
        this.f133134g = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter = this.f133131d.getRecyclerView().getAdapter();
        if (adapter != null) {
            adapter.notifyItemRangeChanged(this.f133132e, this.f133133f, this.f133134g);
        }
        return jz5.f0.f302826a;
    }
}
