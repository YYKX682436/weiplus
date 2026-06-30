package pt2;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment f358248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment finderMixSearchFeedFragment) {
        super(0);
        this.f358248d = finderMixSearchFeedFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment.A;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f358248d.z0().getRecyclerView();
        kotlin.jvm.internal.o.d(recyclerView);
        return recyclerView;
    }
}
