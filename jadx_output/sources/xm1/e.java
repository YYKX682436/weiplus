package xm1;

/* loaded from: classes14.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm1.h f455161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f455162e;

    public e(xm1.h hVar, boolean z17) {
        this.f455161d = hVar;
        this.f455162e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xm1.h hVar = this.f455161d;
        boolean z17 = this.f455162e;
        hVar.f455173e = z17;
        hVar.c().setSpeakerphoneOn(z17);
    }
}
