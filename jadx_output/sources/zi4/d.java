package zi4;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f473198a = new java.util.LinkedHashMap();

    public final void a(java.lang.String cmdId, yz5.q factory, boolean z17) {
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(factory, "factory");
        java.util.Map map = this.f473198a;
        if (!map.containsKey(cmdId)) {
            map.put(cmdId, new zi4.c(factory, z17 ? new zi4.b(true) : zi4.b.f473188b));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FLTStatusActionHandlerListConfig", "duplicate register cmdId=" + cmdId + ", keep first-registered, ignore this one");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }
}
