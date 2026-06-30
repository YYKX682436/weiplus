package rk1;

@j95.b
/* loaded from: classes7.dex */
public final class m extends i95.w implements ft.e4 {

    /* renamed from: e, reason: collision with root package name */
    public static final rk1.c f396430e = new rk1.c(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f396431f = com.tencent.mm.vfs.w6.i(com.tencent.mm.plugin.appbrand.jsruntime.d2.a(), true);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f396432g = jz5.h.b(rk1.b.f396399d);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f396433h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f396434i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f396435m = jz5.h.b(rk1.a.f396398d);

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f396436n = com.tencent.mm.plugin.appbrand.jsruntime.u1.a();

    /* renamed from: d, reason: collision with root package name */
    public final yz5.r f396437d = new rk1.l(this);

    public final void wi(rk1.e eVar) {
        java.lang.String str = f396431f;
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Appbrand.WasmCacheService", "cache path is nil, abort");
            return;
        }
        java.util.List list = eVar.f396410g;
        java.nio.ByteBuffer allocateDirect = list != null ? java.nio.ByteBuffer.allocateDirect(list.size() * 4) : null;
        if (allocateDirect != null) {
            allocateDirect.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        }
        java.util.List list2 = eVar.f396410g;
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (allocateDirect != null) {
                    allocateDirect.putInt(intValue);
                }
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct();
        weAppQualityWasmCachePrecompileStruct.f62819d = weAppQualityWasmCachePrecompileStruct.b("AppId", eVar.f396404a, true);
        weAppQualityWasmCachePrecompileStruct.f62820e = eVar.f396405b;
        weAppQualityWasmCachePrecompileStruct.f62821f = eVar.f396407d.capacity();
        weAppQualityWasmCachePrecompileStruct.f62824i = list2 != null ? list2.size() : 0L;
        rk1.f[] fVarArr = rk1.f.f396411d;
        weAppQualityWasmCachePrecompileStruct.f62825j = 1;
        com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config = new com.tencent.mm.appbrand.v8.IJSRuntime$Config();
        iJSRuntime$Config.f53943a = f396436n;
        iJSRuntime$Config.f53946d = null;
        iJSRuntime$Config.f53948f = "0";
        iJSRuntime$Config.f53949g = true;
        iJSRuntime$Config.f53951i = true;
        iJSRuntime$Config.f53952j = false;
        iJSRuntime$Config.f53953k = "RuntimeTWasmCacheService";
        com.tencent.mm.plugin.appbrand.jsruntime.g gVar = new com.tencent.mm.plugin.appbrand.jsruntime.g(iJSRuntime$Config);
        gVar.s0(new rk1.h(gVar, eVar, str, allocateDirect, weAppQualityWasmCachePrecompileStruct));
    }
}
