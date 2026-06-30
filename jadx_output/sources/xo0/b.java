package xo0;

/* loaded from: classes10.dex */
public final class b extends xo0.d {
    @Override // xo0.d
    public boolean b(ip0.a url, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(a(url, opts, reaper));
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        return m17.a() && m17.f213266a.d(m17.f213267b);
    }

    @Override // xo0.d
    public jp0.f c(ip0.a url, yo0.i opts, vo0.h reaper) {
        ip0.b bVar;
        ip0.b bVar2;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        try {
            bVar = url.f293574b;
            bVar2 = ip0.b.ASSET_DATA;
            obj = url.f293573a;
        } catch (java.lang.Exception unused) {
        }
        if (bVar == bVar2) {
            java.lang.String obj2 = obj.toString();
            return new jp0.f(new jp0.e(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open(obj2)), new jp0.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open(obj2)), null);
        }
        if (bVar == ip0.b.LOCAL_PATH) {
            return jp0.f.c(obj.toString(), nm5.j.b(obj.toString()));
        }
        try {
            java.lang.String a17 = a(url, opts, reaper);
            if (a17.length() == 0) {
                return null;
            }
            return new jp0.f(new jp0.e(new com.tencent.mm.vfs.u6(a17)), new jp0.c(new com.tencent.mm.vfs.u6(a17)), null);
        } catch (java.io.FileNotFoundException unused2) {
            return null;
        }
    }

    @Override // xo0.d
    public boolean d(ip0.a url, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        return true;
    }

    @Override // xo0.d
    public boolean e(ip0.a url, hp0.i httpResponse, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(httpResponse, "httpResponse");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        return true;
    }

    @Override // xo0.d
    public boolean f(ip0.a url, hp0.i httpResponse, hp0.g source, hp0.g gVar, yo0.i opts, vo0.h reaper) {
        boolean z17;
        hp0.g gVar2 = gVar;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(httpResponse, "httpResponse");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(opts, "opts");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        e(url, httpResponse, gVar, opts, reaper);
        java.lang.String a17 = a(url, opts, reaper);
        com.tencent.mars.xlog.Log.i("MicroMsg.Loader.imageloader.DefaultImageDiskCache", "save " + url + " filePath " + a17);
        xo0.c cVar = xo0.c.f455743a;
        java.io.OutputStream b17 = cVar.b(a17);
        if (b17 != null) {
            if (gVar2 != null) {
                try {
                    java.lang.Object obj = gVar2.f282913a;
                    kotlin.jvm.internal.o.f(obj, "value(...)");
                    xo0.c.a(cVar, (android.graphics.Bitmap) obj, null, 0, b17, 6, null);
                    z17 = true;
                } finally {
                }
            } else {
                z17 = false;
                gVar2 = source;
            }
            if (!z17) {
                httpResponse.b(b17);
                z17 = true;
            }
            if (z17) {
                d(url, gVar2, opts, reaper);
            }
            vz5.b.a(b17, null);
        }
        return true;
    }
}
