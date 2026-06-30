package kd2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd2.q f306755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kd2.q qVar) {
        super(0);
        this.f306755d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kd2.q qVar = this.f306755d;
        qVar.f306791o = true;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView finderMegaVideoMiniView = new com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView(context);
        fo0.p pVar = new fo0.p(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8));
        finderMegaVideoMiniView.setClipToOutline(true);
        finderMegaVideoMiniView.setOutlineProvider(pVar);
        finderMegaVideoMiniView.setOnVideoCompletion(new kd2.e(qVar));
        finderMegaVideoMiniView.setOnPlayProgressUpdated(new kd2.f(qVar));
        finderMegaVideoMiniView.setOnVideoPause(new kd2.g(qVar));
        finderMegaVideoMiniView.setOnVideoPlay(new kd2.h(qVar));
        return finderMegaVideoMiniView;
    }
}
