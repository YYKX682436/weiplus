package jp3;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f301017d;

    public m(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f301017d = checkResUpdateCacheFileEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = this.f301017d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(checkResUpdateCacheFileEvent.f54053g.f7761c)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintResUpdateListener", "[callback] resource file update result success？： " + jp3.n.f301018d.a(checkResUpdateCacheFileEvent.f54053g.f7761c));
    }
}
