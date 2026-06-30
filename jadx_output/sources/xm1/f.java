package xm1;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm1.h f455163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f455164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f455165f;

    public f(xm1.h hVar, int i17, yz5.a aVar) {
        this.f455163d = hVar;
        this.f455164e = i17;
        this.f455165f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xm1.h hVar = this.f455163d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hVar.f());
        int i17 = this.f455164e;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAudioManager", "set mode from %d to %d", valueOf, java.lang.Integer.valueOf(i17));
        hVar.c().setMode(i17);
        yz5.a aVar = this.f455165f;
        if (aVar != null) {
        }
    }
}
