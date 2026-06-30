package px2;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapeSeekBarLayout f358871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapeSeekBarLayout finderLandscapeSeekBarLayout) {
        super(0);
        this.f358871d = finderLandscapeSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int layoutId;
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapeSeekBarLayout finderLandscapeSeekBarLayout = this.f358871d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(finderLandscapeSeekBarLayout.getContext());
        layoutId = finderLandscapeSeekBarLayout.getLayoutId();
        return from.inflate(layoutId, (android.view.ViewGroup) null);
    }
}
