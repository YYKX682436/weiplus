package u85;

/* loaded from: classes10.dex */
public final class c extends zo0.g {
    @Override // zo0.g
    public void b(ip0.a url, ep0.h fileNameCreator, zo0.b callback) {
        java.io.InputStream inputStream;
        com.tencent.mm.network.h2 d17;
        int f17;
        java.lang.String e17;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(fileNameCreator, "fileNameCreator");
        kotlin.jvm.internal.o.g(callback, "callback");
        r45.o64 o64Var = ((u85.a) url.f293573a).f425696d.f382793e;
        java.io.InputStream inputStream2 = null;
        inputStream2 = null;
        java.lang.String str = o64Var != null ? o64Var.f381983d : null;
        java.lang.String str2 = o64Var != null ? o64Var.f381984e : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            callback.a();
            return;
        }
        try {
            try {
                d17 = com.tencent.mm.network.n.d(str, new com.tencent.mm.network.m(str));
                f17 = d17.f();
                inputStream = d17.getInputStream();
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            inputStream = inputStream2;
        }
        try {
            e17 = d17.e();
            com.tencent.mars.xlog.Log.i("MicroMsg.LensIconDownloader", "http response: " + f17 + ", " + e17);
        } catch (java.lang.Exception e19) {
            e = e19;
            inputStream2 = inputStream;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LensIconDownloader", e, "", new java.lang.Object[0]);
            if (inputStream2 != null) {
                inputStream2.close();
            }
            callback.a();
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
        if (f17 != 200) {
            d17.disconnect();
            callback.a();
            if (inputStream != null) {
                inputStream.close();
                return;
            }
            return;
        }
        byte[] c17 = inputStream != null ? vz5.a.c(inputStream) : null;
        d17.disconnect();
        if (c17 == null) {
            callback.a();
            if (inputStream != null) {
                inputStream.close();
                return;
            }
            return;
        }
        byte[] a17 = kk.b.a(c17, android.util.Base64.encodeToString(com.tencent.mm.sdk.platformtools.t8.h(str2), 0));
        callback.b(new hp0.d(a17, e17, new hp0.c(a17)));
        if (inputStream != null) {
            inputStream.close();
        }
        callback.a();
    }
}
