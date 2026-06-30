package y;

/* loaded from: classes16.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.h f458364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout f458365e;

    public h2(mi2.h hVar, com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout) {
        this.f458364d = hVar;
        this.f458365e = finderLiveInterceptRelativeLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mi2.h hVar = this.f458364d;
        hVar.X(false);
        this.f458365e.setVisibility(8);
        hVar.L();
    }
}
