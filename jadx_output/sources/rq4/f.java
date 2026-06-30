package rq4;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq4.i f398964d;

    public f(rq4.i iVar) {
        this.f398964d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj0.a aVar = new qj0.a();
        rq4.i iVar = this.f398964d;
        iVar.f398986t = aVar;
        iVar.f398980n = aVar.b();
        iVar.f398981o = aVar.a();
        iVar.f398982p = aVar.c();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        iVar.f398984r = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", "current profile gpu init info is gl:" + iVar.f398980n + " egl:" + iVar.f398981o + " gfx:" + iVar.f398982p);
        iVar.f398986t = null;
        ((vq4.i) iVar.f398985s.getValue()).c();
    }
}
