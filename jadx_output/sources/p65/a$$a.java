package p65;

/* loaded from: classes12.dex */
public final /* synthetic */ class a$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        jz5.g gVar = fp.t.f265239a;
        try {
            if (((java.lang.Boolean) ((jz5.n) fp.t.f265239a).getValue()).booleanValue()) {
                java.lang.String cacheDirectory = io.flutter.util.PathUtils.getCacheDirectory(com.tencent.mm.sdk.platformtools.x2.f193071a);
                kotlin.jvm.internal.o.f(cacheDirectory, "getCacheDirectory(...)");
                java.io.File file = new java.io.File(cacheDirectory, fp.t.f265241c);
                if (file.exists()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterCacheUtil", "removeExpiredFlutterCache");
                    vz5.q.d(file);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterCacheUtil", th6, "removeExpiredFlutterCache error", new java.lang.Object[0]);
        }
    }
}
