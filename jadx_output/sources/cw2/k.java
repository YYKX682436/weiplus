package cw2;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.o f223795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f223796e;

    public k(cw2.o oVar, boolean z17) {
        this.f223795d = oVar;
        this.f223796e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy*/.setLoop(this.f223796e);
    }
}
