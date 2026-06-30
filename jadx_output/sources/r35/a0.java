package r35;

/* loaded from: classes15.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public java.net.HttpURLConnection f369031a;

    /* renamed from: b, reason: collision with root package name */
    public final r35.b0 f369032b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f369033c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f369034d;

    /* renamed from: e, reason: collision with root package name */
    public int f369035e = -1;

    public a0(java.lang.String str, boolean z17, r35.b0 b0Var) {
        this.f369033c = str;
        this.f369034d = z17;
        this.f369032b = b0Var;
    }

    public q11.b a(java.io.InputStream inputStream) {
        java.net.HttpURLConnection httpURLConnection = this.f369031a;
        if (httpURLConnection != null) {
            httpURLConnection.getContentType();
        }
        java.net.HttpURLConnection httpURLConnection2 = this.f369031a;
        if (httpURLConnection2 != null) {
            httpURLConnection2.getContentLength();
        }
        r35.b0 b0Var = this.f369032b;
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        if (inputStream == null) {
            java.net.HttpURLConnection httpURLConnection3 = this.f369031a;
            inputStream = httpURLConnection3 != null ? httpURLConnection3.getInputStream() : null;
        }
        byte[] d17 = com.tencent.mm.modelimage.loader.impr.f.d(inputStream, 0L, false);
        java.net.HttpURLConnection httpURLConnection4 = this.f369031a;
        q11.b bVar = new q11.b(d17, 2, httpURLConnection4 != null ? httpURLConnection4.getContentType() : null);
        java.net.HttpURLConnection httpURLConnection5 = this.f369031a;
        bVar.f359536f = httpURLConnection5 != null ? httpURLConnection5.getContentLength() : 0;
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        return bVar;
    }

    public int b() {
        r35.b0 b0Var = this.f369032b;
        if (b0Var != null) {
            int i17 = this.f369035e;
            r35.c0 c0Var = (r35.c0) b0Var;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            boolean z17 = this.f369034d;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "BizImage download onRequest id: %s, imageType: %d, forceNormal: %b, url: %s", c0Var.f369056c, valueOf, java.lang.Boolean.valueOf(z17), c0Var.f369054a);
            c0Var.f369057d = i17;
            c0Var.f369058e = z17;
            c0Var.f369062i = java.lang.System.currentTimeMillis();
            if (c0Var.f369059f) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.C(1111L, 0L, 1L);
                int i18 = c0Var.f369057d;
                if (i18 == 0) {
                    g0Var.C(1111L, 1L, 1L);
                } else if (i18 == 1) {
                    g0Var.C(1111L, 2L, 1L);
                } else if (i18 == 2) {
                    g0Var.C(1111L, 31L, 1L);
                }
                if (c0Var.f369058e) {
                    int i19 = c0Var.f369057d;
                    if (i19 == 0) {
                        g0Var.C(1111L, 14L, 1L);
                    } else if (i19 == 2) {
                        g0Var.C(1111L, 40L, 1L);
                    }
                }
            }
        }
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        java.net.HttpURLConnection httpURLConnection = this.f369031a;
        int responseCode = httpURLConnection != null ? httpURLConnection.getResponseCode() : -1;
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        return responseCode;
    }

    public java.net.HttpURLConnection c() {
        java.lang.String str = this.f369033c;
        java.lang.String str2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        java.lang.String str3 = this.f369033c;
        boolean z17 = this.f369034d;
        if (z17) {
            if (str3 != null) {
                r35.y yVar = r35.y.f369326a;
                android.net.Uri parse = android.net.Uri.parse(str3);
                kotlin.jvm.internal.o.f(parse, "parse(...)");
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                for (java.lang.String str4 : queryParameterNames) {
                    if (!kotlin.jvm.internal.o.b(str4, "tp")) {
                        clearQuery.appendQueryParameter(str4, parse.getQueryParameter(str4));
                    }
                }
                java.lang.String decode = java.net.URLDecoder.decode(clearQuery.build().toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                kotlin.jvm.internal.o.f(decode, "decode(...)");
                str2 = qk.c.c(decode, false);
            }
            this.f369033c = str2;
        }
        r35.b0 b0Var = this.f369032b;
        if (b0Var != null) {
            java.lang.String str5 = this.f369033c;
            r35.c0 c0Var = (r35.c0) b0Var;
            c0Var.f369055b = str3;
            c0Var.f369054a = str5;
            c0Var.f369061h = java.lang.System.currentTimeMillis();
            r35.y yVar2 = r35.y.f369326a;
            if (c0Var.f369060g == 1) {
                com.tencent.mm.pluginsdk.model.i0.c(com.tencent.mm.pluginsdk.model.i0.f189340a, 3, c0Var.f369055b, 0L, 4, null);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "BizImage download onStart id: %s", c0Var.f369056c);
        }
        if (z17 && b0Var != null) {
            r35.c0 c0Var2 = (r35.c0) b0Var;
            r35.y yVar3 = r35.y.f369326a;
            if (c0Var2.f369060g == 1) {
                com.tencent.mm.pluginsdk.model.i0 i0Var = com.tencent.mm.pluginsdk.model.i0.f189340a;
                java.lang.String str6 = c0Var2.f369055b;
                if (!(str6 == null || str6.length() == 0)) {
                    i0Var.b(str6);
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.g0(str6, java.lang.System.currentTimeMillis()));
                }
            }
        }
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        java.net.URLConnection openConnection = new java.net.URL(this.f369033c).openConnection();
        kotlin.jvm.internal.o.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
        this.f369031a = httpURLConnection;
        httpURLConnection.setConnectTimeout(15000);
        java.net.HttpURLConnection httpURLConnection2 = this.f369031a;
        if (httpURLConnection2 != null) {
            httpURLConnection2.setReadTimeout(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        }
        if (!z17 && qk.c.g(this.f369033c)) {
            this.f369035e = 1;
            java.net.HttpURLConnection httpURLConnection3 = this.f369031a;
            if (httpURLConnection3 != null) {
                httpURLConnection3.addRequestProperty("Accept", "image/wxpic");
            }
        } else if (qk.c.h(this.f369033c)) {
            this.f369035e = 2;
            java.net.HttpURLConnection httpURLConnection4 = this.f369031a;
            if (httpURLConnection4 != null) {
                httpURLConnection4.setRequestProperty("Referer", m11.n1.a(o45.wf.f343029g));
            }
        } else {
            this.f369035e = 0;
        }
        if (b0Var != null) {
            java.lang.System.currentTimeMillis();
        }
        return this.f369031a;
    }

    public void d(int i17) {
        r35.b0 b0Var = this.f369032b;
        if (b0Var != null) {
            r35.c0 c0Var = (r35.c0) b0Var;
            com.tencent.mars.xlog.Log.e("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "BizImage download onResultError id: %s, requestImageType: %d, responseCode: %d", c0Var.f369056c, java.lang.Integer.valueOf(c0Var.f369057d), java.lang.Integer.valueOf(i17));
            c0Var.f369063j = java.lang.System.currentTimeMillis();
            if (c0Var.f369059f) {
                r35.x xVar = r35.x.f369320a;
                xVar.a(c0Var.f369057d, false);
                if (c0Var.f369058e) {
                    xVar.e(c0Var.f369057d, false);
                }
            }
            if (r35.y.f369326a.b(c0Var.f369060g)) {
                com.tencent.mm.pluginsdk.model.i0.a(com.tencent.mm.pluginsdk.model.i0.f189340a, 3, c0Var.f369055b, 0L, 4, null);
            }
        }
    }

    public void e(q11.b response) {
        kotlin.jvm.internal.o.g(response, "response");
        r35.b0 b0Var = this.f369032b;
        if (b0Var != null) {
            r35.c0 c0Var = (r35.c0) b0Var;
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c0Var.f369061h);
            java.lang.String str = c0Var.f369056c;
            java.lang.String str2 = response.f359535e;
            com.tencent.mars.xlog.Log.i("MicroMsg.BizImageHttpUrlConnectionListenerImpl", "BizImage download onResultSuccess id: %s, contentType: %s, cost: %d", str, str2, valueOf);
            c0Var.f369063j = java.lang.System.currentTimeMillis();
            if (c0Var.f369059f) {
                r35.x xVar = r35.x.f369320a;
                xVar.a(c0Var.f369057d, true);
                if (c0Var.f369057d == 1) {
                    int c17 = r35.y.f369326a.c(str2);
                    if (c17 == 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 7L, 1L);
                    } else if (c17 == 1) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 8L, 1L);
                    }
                }
                r35.y yVar = r35.y.f369326a;
                int c18 = yVar.c(str2);
                if (c18 == 0) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 17L, 1L);
                } else if (c18 == 1) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 19L, 1L);
                } else if (c18 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 36L, 1L);
                }
                long j17 = c0Var.f369063j - c0Var.f369062i;
                if (j17 >= 0) {
                    int c19 = yVar.c(str2);
                    if (c19 == 0) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 18L, j17);
                    } else if (c19 == 1) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 20L, j17);
                    } else if (c19 == 2) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1111L, 37L, j17);
                    }
                }
                if (c0Var.f369058e && response.f359533c != null) {
                    xVar.e(c0Var.f369057d, true);
                }
            }
            if (r35.y.f369326a.b(c0Var.f369060g)) {
                com.tencent.mm.pluginsdk.model.i0.a(com.tencent.mm.pluginsdk.model.i0.f189340a, 3, c0Var.f369055b, 0L, 4, null);
            }
        }
    }
}
