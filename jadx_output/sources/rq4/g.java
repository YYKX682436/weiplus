package rq4;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq4.i f398965d;

    public g(rq4.i iVar) {
        this.f398965d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rq4.i iVar = this.f398965d;
        long j17 = iVar.f398984r;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - j17 > 300000 && !iVar.f398983q) {
            iVar.f398986t = new qj0.a();
        }
        qj0.a aVar = iVar.f398986t;
        if (aVar != null) {
            iVar.f398983q = true;
            iVar.f398980n = aVar.b() > 0 ? aVar.b() - iVar.f398980n : 0L;
            iVar.f398981o = aVar.a() > 0 ? aVar.a() - iVar.f398981o : 0L;
            iVar.f398982p = aVar.c() > 0 ? aVar.c() - iVar.f398982p : 0L;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPProfileReport", "current profile latest gpu info  is gl:" + iVar.f398980n + " egl:" + iVar.f398981o + " gfx:" + iVar.f398982p);
        }
        iVar.f398986t = null;
    }
}
