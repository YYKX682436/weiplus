package rk1;

/* loaded from: classes7.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk1.m f396420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396421e;

    public j(rk1.m mVar, java.lang.String str) {
        this.f396420d = mVar;
        this.f396421e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rk1.c cVar = rk1.m.f396430e;
        this.f396420d.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = rk1.m.f396433h;
        java.lang.String str = this.f396421e;
        rk1.d dVar = (rk1.d) concurrentHashMap.get(str);
        if (dVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.WasmCacheService", "timeout stop task for appId: %s", str);
            rk1.c.a(rk1.m.f396430e).stop(dVar.f396401b);
            com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct = dVar.f396403d;
            if (weAppQualityWasmCachePrecompileStruct == null) {
                return;
            }
            rk1.f[] fVarArr = rk1.f.f396411d;
            weAppQualityWasmCachePrecompileStruct.f62825j = 3;
        }
    }
}
