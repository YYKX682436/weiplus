package dt2;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.t f243193d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(dt2.t tVar) {
        super(0);
        this.f243193d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = new com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView(context, null, 0, 6, null);
        finderLiveMiniView.setupClickListener(this.f243193d.f243198g);
        return finderLiveMiniView;
    }
}
