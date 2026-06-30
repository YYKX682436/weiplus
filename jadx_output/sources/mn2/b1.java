package mn2;

/* loaded from: classes10.dex */
public final class b1 extends zo0.g {
    @Override // zo0.g
    public void b(ip0.a item, ep0.h fileNameCreator, zo0.b callback) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(fileNameCreator, "fileNameCreator");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            mn2.h3 h3Var = (mn2.h3) item.f293573a;
            java.lang.String url = h3Var.getMediaType() == com.tencent.mm.plugin.finder.storage.y90.f128355e ? h3Var.getUrl() : h3Var.l();
            com.tencent.mars.xlog.Log.i("Finder.ImageDownloader", "loadDataImp http " + h3Var.getMediaType() + " thumbUrl " + h3Var.l() + " url " + h3Var.getUrl());
            hp0.d a17 = mn2.a1.f329907a.a(url);
            if (a17 != null) {
                callback.b(a17);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                callback.a();
            }
        } catch (java.net.SocketTimeoutException e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            callback.a();
        } catch (java.io.IOException e18) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
            callback.a();
        } catch (java.lang.InterruptedException e19) {
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
            callback.a();
        } catch (java.net.SocketException e27) {
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
            callback.a();
        } catch (java.net.UnknownHostException e28) {
            boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e28));
            callback.a();
        } catch (javax.net.ssl.SSLHandshakeException e29) {
            boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e29));
            callback.a();
        } catch (java.lang.Exception e37) {
            boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("Finder.ImageDownloader", "[cpan] getOption image data failed.:%s", com.tencent.mm.sdk.platformtools.z3.c(e37));
            callback.a();
        }
    }
}
