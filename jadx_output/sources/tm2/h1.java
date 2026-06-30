package tm2;

/* loaded from: classes3.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView f420519e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(fm2.b bVar, com.tencent.mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView) {
        super(0);
        this.f420518d = bVar;
        this.f420519e = finderLiveGameWelfareTaskProgressView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.b bVar = this.f420518d;
        return new com.tencent.mm.plugin.finder.live.plugin.fj(new android.widget.FrameLayout(bVar.getContext()), this.f420519e, bVar);
    }
}
