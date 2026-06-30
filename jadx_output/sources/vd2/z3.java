package vd2;

/* loaded from: classes3.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f436047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f436048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f436049f;

    public z3(com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, java.lang.Integer num, int i17) {
        this.f436047d = finderLiveViewCallback;
        this.f436048e = num;
        this.f436049f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f436047d.v(this.f436048e.intValue(), "bindCheckPrepareLive", this.f436049f);
    }
}
