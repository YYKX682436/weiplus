package ve2;

/* loaded from: classes3.dex */
public final class d implements ve2.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f436092d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView f436093e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f436094f;

    public d(android.view.View root, com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView finderLiveLogoGroupView, com.tencent.mm.ui.MMActivity activity, ve2.a aVar) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f436092d = root;
        this.f436093e = finderLiveLogoGroupView;
        this.f436094f = activity;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f436094f;
    }
}
