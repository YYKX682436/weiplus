package cw2;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.o f223776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f223777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f223778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f223779g;

    public j(cw2.o oVar, double d17, boolean z17, int i17) {
        this.f223776d = oVar;
        this.f223777e = d17;
        this.f223778f = z17;
        this.f223779g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy*/.r(this.f223777e, this.f223778f, this.f223779g);
    }
}
