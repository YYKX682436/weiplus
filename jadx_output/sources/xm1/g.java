package xm1;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm1.h f455166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f455167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f455168f;

    public g(xm1.h hVar, int i17, yz5.a aVar) {
        this.f455166d = hVar;
        this.f455167e = i17;
        this.f455168f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xm1.h hVar = this.f455166d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hVar.f());
        int i17 = this.f455167e;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseAudioManager", "set mode from %d to %d", valueOf, java.lang.Integer.valueOf(i17));
        hVar.c().setMode(i17);
        yz5.a aVar = this.f455168f;
        if (aVar != null) {
        }
    }
}
