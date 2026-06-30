package zy3;

/* loaded from: classes.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent f477668d;

    public n(com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent) {
        this.f477668d = checkResUpdateCacheFileEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = this.f477668d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(checkResUpdateCacheFileEvent.f54053g.f7761c) || !checkResUpdateCacheFileEvent.f54053g.f7763e) {
            return;
        }
        rh0.u uVar = (rh0.u) i95.n0.c(rh0.u.class);
        java.lang.String filePath = checkResUpdateCacheFileEvent.f54053g.f7761c;
        kotlin.jvm.internal.o.f(filePath, "filePath");
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanPassportResUpdateListener", "[callback] resource file update result success？： " + ((qh0.m) uVar).Bi(filePath));
    }
}
