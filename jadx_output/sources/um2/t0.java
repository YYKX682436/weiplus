package um2;

/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f428962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.finder.live.view.k0 k0Var, um2.x5 x5Var) {
        super(0);
        this.f428962d = k0Var;
        this.f428963e = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f428962d;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(k0Var.getContext());
        com.tencent.mm.plugin.finder.live.plugin.ha haVar = this.f428963e.W;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView = (haVar == null || (viewGroup = haVar.f365323d) == null) ? null : (com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView) viewGroup.findViewById(com.tencent.mm.R.id.ezi);
        return new com.tencent.mm.plugin.finder.live.plugin.fj(frameLayout, finderLiveGameWelfareTaskProgressView instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView ? finderLiveGameWelfareTaskProgressView : null, k0Var);
    }
}
