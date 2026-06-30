package d11;

@j95.b
/* loaded from: classes11.dex */
public class p extends i95.w {
    public static synchronized d11.p Ai() {
        d11.p pVar;
        synchronized (d11.p.class) {
            pVar = (d11.p) i95.n0.c(d11.p.class);
        }
        return pVar;
    }

    public final boolean wi(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreAutoDownload", "this message is null.");
            return false;
        }
        c01.ea w17 = c01.w9.w(f9Var.G);
        if (w17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "this message had no msg source.");
            return true;
        }
        java.lang.String str = w17.f37159r;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "this message had no not auto download time range config.");
            return true;
        }
        if (d11.b.a(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download. timeRange : " + str);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAutoDownload", "this message need control, but it is not the time. timeRange: " + str);
        return true;
    }
}
