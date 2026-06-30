package pt2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment f358249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
        super(0);
        this.f358249d = finderMixSearchFeedFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f358249d.getView();
        kotlin.jvm.internal.o.d(view);
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) view.findViewById(com.tencent.mm.R.id.m6e);
    }
}
