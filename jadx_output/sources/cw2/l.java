package cw2;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.o f223818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f223819e;

    public l(cw2.o oVar, boolean z17) {
        this.f223818d = oVar;
        this.f223819e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy*/.setMute(this.f223819e);
    }
}
