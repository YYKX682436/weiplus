package df2;

/* loaded from: classes3.dex */
public final class kd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew f230570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.od f230571e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.pb2 f230572f;

    public kd(com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew, df2.od odVar, r45.pb2 pb2Var) {
        this.f230570d = finderLiveTaskBannerViewNew;
        this.f230571e = odVar;
        this.f230572f = pb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String a76 = df2.od.a7(this.f230571e, (r45.ug1) this.f230572f.getCustom(0));
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew = this.f230570d;
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
