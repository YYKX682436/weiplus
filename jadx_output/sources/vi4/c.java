package vi4;

/* loaded from: classes10.dex */
public final class c extends zo0.g {
    @Override // zo0.g
    public void b(ip0.a url, ep0.h fileNameCreator, zo0.b callback) {
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.Object obj = url.f293573a;
        kotlin.jvm.internal.o.g(fileNameCreator, "fileNameCreator");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            byte[] u07 = com.tencent.mm.sdk.platformtools.t8.u0(((vi4.b) obj).f437607d);
            if (u07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusLoader", "loadDataImp() data == null url = " + obj);
                callback.a();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusLoader", "loadDataImp() finished with: url = " + obj);
            callback.b(new hp0.d(u07, "", new hp0.c(u07)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusLoader", th6, "loadDataImp err", new java.lang.Object[0]);
            callback.a();
        }
    }
}
