package nu4;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final nu4.h f340252d = new nu4.h();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = nu4.b0.V;
        synchronized (hashMap) {
            java.util.Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.appbrand.appcache.u3 u3Var = (com.tencent.mm.plugin.appbrand.appcache.u3) ((java.util.Map.Entry) it.next()).getValue();
                if (u3Var instanceof java.io.Closeable) {
                    com.tencent.mapsdk.rastercore.tools.IO.safeClose((java.io.Closeable) u3Var);
                }
            }
            nu4.b0.V.clear();
        }
    }
}
