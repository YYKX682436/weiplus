package zx4;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final zx4.k f477162a;

    /* renamed from: b, reason: collision with root package name */
    public final zx4.k f477163b;

    public l(zx4.e listener) {
        zx4.k kVar;
        kotlin.jvm.internal.o.g(listener, "listener");
        zx4.k kVar2 = null;
        try {
            zx4.j jVar = zx4.k.f477155e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str = java.io.File.separator;
            sb6.append(str);
            sb6.append(android.os.Environment.DIRECTORY_PICTURES);
            sb6.append(str);
            sb6.append("Screenshots");
            sb6.append(str);
            kVar = jVar.a(sb6.toString(), listener);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebView.WebViewScreenshotObserverCompact", e17, "<init>, create observer1 fail", new java.lang.Object[0]);
            kVar = null;
        }
        this.f477162a = kVar;
        try {
            zx4.j jVar2 = zx4.k.f477155e;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(android.os.Environment.getExternalStorageDirectory().getPath());
            java.lang.String str2 = java.io.File.separator;
            sb7.append(str2);
            sb7.append(android.os.Environment.DIRECTORY_DCIM);
            sb7.append(str2);
            sb7.append("Screenshots");
            sb7.append(str2);
            kVar2 = jVar2.a(sb7.toString(), listener);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebView.WebViewScreenshotObserverCompact", e18, "<init>, create observer2 fail", new java.lang.Object[0]);
        }
        this.f477163b = kVar2;
    }
}
