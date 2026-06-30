package l01;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final bm5.x0 f314738g = new bm5.x0(new l01.b$$a());

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f314739a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f314740b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f314741c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final l01.v f314743e = new l01.n();

    /* renamed from: f, reason: collision with root package name */
    public final l01.s f314744f = new l01.k(null);

    /* renamed from: d, reason: collision with root package name */
    public final l01.p f314742d = new l01.p(new com.tencent.mm.sdk.platformtools.n3("AppBrandSimpleImageLoaderDiskIOHandlerThread"), null);

    public b(l01.c cVar) {
    }

    public static java.lang.String h(java.lang.String str, l01.r rVar, l01.q qVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        if (rVar != null) {
            sb6.append("|transformation:");
            sb6.append(rVar.key());
        }
        if (qVar != null) {
            sb6.append("|decoder:");
            sb6.append(qVar.key());
        }
        return sb6.toString();
    }

    public static java.lang.String j(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return kk.k.g(str.getBytes());
    }

    public java.lang.String a(android.widget.ImageView imageView, java.lang.String str, int i17, l01.r rVar) {
        if (imageView == null) {
            return null;
        }
        return b(imageView, str, imageView.getContext().getResources().getDrawable(i17), rVar);
    }

    public java.lang.String b(android.widget.ImageView imageView, java.lang.String str, android.graphics.drawable.Drawable drawable, l01.r rVar) {
        return d(imageView, str, drawable, rVar, null, null, null);
    }

    public java.lang.String c(android.widget.ImageView imageView, java.lang.String str, android.graphics.drawable.Drawable drawable, l01.r rVar, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        return d(imageView, str, drawable, rVar, null, null, n3Var);
    }

    public java.lang.String d(android.widget.ImageView imageView, java.lang.String str, android.graphics.drawable.Drawable drawable, l01.r rVar, l01.q qVar, l01.e0 e0Var, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        if (imageView == null) {
            return null;
        }
        java.util.Map map = this.f314741c;
        java.lang.String str2 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) map).remove(java.lang.Integer.valueOf(imageView.hashCode()));
        if (str2 != null) {
            e((l01.u) ((java.util.concurrent.ConcurrentHashMap) this.f314740b).get(str2));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
            return null;
        }
        l01.g gVar = new l01.g(this, imageView, this, str, e0Var, drawable);
        java.lang.String l17 = l(gVar, str, null, rVar, qVar, n3Var);
        if (!gVar.f314791g) {
            ((java.util.concurrent.ConcurrentHashMap) map).put(java.lang.Integer.valueOf(imageView.hashCode()), i(gVar) + l17);
        }
        return l17;
    }

    public void e(l01.u uVar) {
        if (uVar == null) {
            return;
        }
        java.lang.String str = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) this.f314739a).remove(uVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f314740b).remove(str);
    }

    public android.graphics.Bitmap f(java.lang.String str, l01.q qVar) {
        java.io.InputStream inputStream;
        java.io.InputStream E;
        java.io.InputStream inputStream2 = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String h17 = h(str, null, qVar);
        l01.v vVar = this.f314743e;
        android.graphics.Bitmap a17 = ((l01.n) vVar).a(h17);
        if (a17 != null) {
            return a17;
        }
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            j(str);
            if (str.startsWith("file://") || str.startsWith("wcf://")) {
                try {
                    E = com.tencent.mm.vfs.w6.E(str);
                } catch (java.io.FileNotFoundException unused) {
                    com.tencent.mars.xlog.Log.e("Luggage.AppBrandSimpleImageLoader", "findCachedLocal: load from local file, file not found ");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    return null;
                }
            } else {
                E = ((l01.k) this.f314744f).b(j(str));
            }
            if (E == null) {
                com.tencent.mm.sdk.platformtools.t8.v1(E);
                return null;
            }
            try {
                android.graphics.Bitmap a18 = qVar != null ? qVar.a(E) : com.tencent.mm.plugin.appbrand.jsapi.media.y1.a().Lh(E);
                if (a18 != null) {
                    ((l01.n) vVar).b(h17, a18);
                }
                com.tencent.mm.sdk.platformtools.t8.v1(E);
                return a18;
            } catch (java.lang.Exception e17) {
                inputStream = E;
                e = e17;
                try {
                    com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AppBrandSimpleImageLoader", e, "findCachedLocal", new java.lang.Object[0]);
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream);
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    inputStream2 = inputStream;
                    com.tencent.mm.sdk.platformtools.t8.v1(inputStream2);
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                inputStream2 = E;
                th = th7;
                com.tencent.mm.sdk.platformtools.t8.v1(inputStream2);
                throw th;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = null;
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
    }

    public final byte[] g(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        try {
            l01.s sVar = this.f314744f;
            if (android.text.TextUtils.isEmpty(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            java.io.InputStream b17 = ((l01.k) sVar).b(j(str));
            if (b17 == null) {
                if (b17 != null) {
                    b17.close();
                }
                return null;
            }
            try {
                byte[] c17 = s46.d.c(b17);
                if (b17 != null) {
                    b17.close();
                }
                return c17;
            } finally {
            }
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandSimpleImageLoader", "findCachedLocal: load from local file, file not found, url=%s", str);
            return null;
        }
    }

    public final java.lang.String i(l01.u uVar) {
        return uVar.key() + "@" + uVar.hashCode();
    }

    public java.lang.String k(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return n(new l01.l(), str, null, null);
    }

    public java.lang.String l(l01.u uVar, java.lang.String str, java.util.Map map, l01.r rVar, l01.q qVar, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        if (uVar == null) {
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            uVar.b();
            return null;
        }
        try {
            if ("null".equals(android.net.Uri.parse(str).getHost())) {
                uVar.b();
                return null;
            }
        } catch (java.lang.Exception unused) {
        }
        l01.c0 c0Var = new l01.c0(str, map, rVar, this, this.f314743e, this.f314744f, qVar, i(uVar), n3Var);
        java.lang.String e17 = c0Var.e();
        l01.c cVar = new l01.c(this, e17, uVar, str, c0Var);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            cVar.run();
        } else if (n3Var != null) {
            n3Var.post(cVar);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(cVar);
        }
        return e17;
    }

    public java.lang.String m(l01.u uVar, java.lang.String str, l01.r rVar) {
        return n(uVar, str, rVar, null);
    }

    public java.lang.String n(l01.u uVar, java.lang.String str, l01.r rVar, l01.q qVar) {
        return l(uVar, str, null, rVar, qVar, null);
    }

    public void o(java.lang.String str, l01.t tVar) {
        byte[] g17 = g(str);
        if (g17 == null || g17.length == 0) {
            l(new l01.i(this, str, tVar), str, null, null, null, null);
        } else if (tVar != null) {
            tVar.a(g17);
        }
    }

    public java.lang.String p(java.lang.String str, java.util.Map map, r.a aVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            if (aVar != null) {
                aVar.apply(null);
            }
            return null;
        }
        l01.h0 h0Var = new l01.h0(str, null);
        this.f314742d.f314784a.post(new l01.f(this, this, h0Var, aVar, str, map));
        return h0Var.f314773b;
    }
}
