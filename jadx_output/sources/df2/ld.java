package df2;

/* loaded from: classes3.dex */
public final class ld implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew f230656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.od f230657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.pb2 f230658f;

    public ld(com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew, df2.od odVar, r45.pb2 pb2Var) {
        this.f230656d = finderLiveTaskBannerViewNew;
        this.f230657e = odVar;
        this.f230658f = pb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a76 = df2.od.a7(this.f230657e, (r45.ug1) this.f230658f.getCustom(0));
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew = this.f230656d;
        finderLiveTaskBannerViewNew.setMarqueeText(a76);
        com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView = finderLiveTaskBannerViewNew.f117687e;
        if (finderLiveMarqueeTextView == null) {
            kotlin.jvm.internal.o.o("txtView");
            throw null;
        }
        finderLiveMarqueeTextView.f116025f = 0;
        finderLiveMarqueeTextView.f116026g = true;
        finderLiveMarqueeTextView.f116027h = true;
        if (finderLiveMarqueeTextView.f116032p > 0) {
            finderLiveMarqueeTextView.c();
        } else {
            finderLiveMarqueeTextView.b();
        }
    }
}
