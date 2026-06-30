package kh5;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh5.h f308067d;

    public d(kh5.h hVar) {
        this.f308067d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MEChattingMgr", "destroyBizTask because of timeout");
        kh5.h hVar = this.f308067d;
        jc3.j0 j0Var = hVar.f448375f;
        if (j0Var != null) {
            ((rc3.w0) j0Var).destroy();
        }
        bf3.p pVar = hVar.f448376g;
        if (pVar != null) {
            pVar.b();
        }
        hVar.f448375f = null;
        hVar.f448376g = null;
        hVar.Y0();
        hVar.f308072i.removeAllViews();
        hVar.f308073m.removeAllViews();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove all views, with count ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = hVar.f317919d.f317917a;
        sb6.append(concurrentHashMap.size());
        com.tencent.mars.xlog.Log.i("MBDynamicBizContext", sb6.toString());
        concurrentHashMap.clear();
    }
}
