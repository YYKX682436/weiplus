package xd;

/* loaded from: classes7.dex */
public class b extends xd.h {

    /* renamed from: a, reason: collision with root package name */
    public int f453608a;

    /* renamed from: b, reason: collision with root package name */
    public int f453609b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453610c;

    /* renamed from: d, reason: collision with root package name */
    public final xd.f f453611d;

    public b(xd.f fVar) {
        super(fVar);
        uh1.a aVar;
        uh1.a aVar2;
        uh1.a aVar3;
        this.f453608a = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        this.f453609b = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        this.f453611d = fVar;
        wd.e eVar = (wd.e) fVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) eVar.f444683a.get();
        int i17 = 0;
        int i18 = (appBrandRuntime == null || (aVar = (uh1.a) appBrandRuntime.b(uh1.a.class)) == null) ? 0 : aVar.f427744h;
        java.lang.ref.WeakReference weakReference = eVar.f444683a;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) weakReference.get();
        if (appBrandRuntime2 != null && (aVar3 = (uh1.a) appBrandRuntime2.b(uh1.a.class)) != null) {
            i17 = aVar3.f427744h;
        }
        if (i18 > 0 && i17 > 0) {
            this.f453608a = i18;
            this.f453609b = i17;
            com.tencent.mars.xlog.Log.i("AppBrandImageHttpFetcher", "Http Timeout Set: connection[%d] read[%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) weakReference.get();
        this.f453610c = (appBrandRuntime3 == null || (aVar2 = (uh1.a) appBrandRuntime3.b(uh1.a.class)) == null) ? "" : aVar2.B;
    }

    @Override // h8.c
    public java.lang.String a() {
        return "http";
    }

    @Override // h8.c
    public boolean accept(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return false;
        }
        java.lang.String str = (java.lang.String) obj;
        return str.startsWith("http://") || str.startsWith("https://");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|(3:7|(2:10|(1:12)(2:13|(1:15)))|9)|(3:17|(2:19|(1:21)(2:22|(1:24)))|25)|26|(6:28|29|30|(2:34|35)|37|38))(1:44))|45|29|30|(3:32|34|35)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        com.tencent.mars.xlog.Log.e("AppBrandImageHttpFetcher", "ImageFetch Timeout! path[%s] connectionTimeout[%d] readTimeout[%d] error[%s]", r9, java.lang.Integer.valueOf(r8.f453608a), java.lang.Integer.valueOf(r8.f453609b), r10.toString());
        r1.f279512b = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a1a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:
    
        com.tencent.mars.xlog.Log.e("AppBrandImageHttpFetcher", "fetch error. path = [%s], error = [%s]", r9, r10.toString());
        r1.f279512b = java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a19), r10.toString());
     */
    @Override // h8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h8.b b(java.lang.Object r9, com.github.henryye.nativeiv.ImageDecodeConfig r10) {
        /*
            r8 = this;
            java.lang.String r0 = "AppBrandImageHttpFetcher"
            h8.b r1 = new h8.b
            r1.<init>()
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r2 = r10.mReferrerPolicy
            xd.f r3 = r8.f453611d
            wd.e r3 = (wd.e) r3
            java.lang.ref.WeakReference r3 = r3.f444683a
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = (com.tencent.mm.plugin.appbrand.AppBrandRuntime) r3
            r4 = 0
            if (r3 == 0) goto L6d
            java.lang.Class<sd1.a> r5 = sd1.a.class
            nd.b r5 = nd.f.a(r5)
            sd1.a r5 = (sd1.a) r5
            if (r5 == 0) goto L66
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r6 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.NOT_SET
            if (r2 != r6) goto L42
            com.tencent.mm.plugin.appbrand.e9 r2 = r3.C0()
            r7 = r5
            com.tencent.mm.plugin.appbrand.utils.p5 r7 = (com.tencent.mm.plugin.appbrand.utils.p5) r7
            sd1.c r2 = r7.b(r2)
            if (r2 != 0) goto L35
        L33:
            r2 = r6
            goto L42
        L35:
            sd1.c r7 = sd1.c.f406677e
            if (r2 != r7) goto L3c
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r2 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.NO_REFERRER
            goto L42
        L3c:
            sd1.c r7 = sd1.c.f406676d
            if (r2 != r7) goto L33
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r2 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.ORIGIN
        L42:
            if (r2 != r6) goto L57
            sd1.c r2 = com.tencent.mm.plugin.appbrand.utils.p5.f90530e
            if (r2 != 0) goto L49
            goto L56
        L49:
            sd1.c r7 = sd1.c.f406677e
            if (r2 != r7) goto L50
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r6 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.NO_REFERRER
            goto L56
        L50:
            sd1.c r7 = sd1.c.f406676d
            if (r2 != r7) goto L56
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r6 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.ORIGIN
        L56:
            r2 = r6
        L57:
            com.github.henryye.nativeiv.ImageDecodeConfig$ReferrerPolicy r6 = com.github.henryye.nativeiv.ImageDecodeConfig.ReferrerPolicy.ORIGIN
            if (r2 != r6) goto L6d
            com.tencent.mm.plugin.appbrand.e9 r2 = r3.C0()
            com.tencent.mm.plugin.appbrand.utils.p5 r5 = (com.tencent.mm.plugin.appbrand.utils.p5) r5
            java.lang.String r2 = r5.e(r2)
            goto L6e
        L66:
            java.lang.String r2 = "MicroMsg.ImageFetcherConfigImp"
            java.lang.String r3 = "referrer helper is null"
            com.tencent.mars.xlog.Log.w(r2, r3)
        L6d:
            r2 = r4
        L6e:
            r3 = r9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            java.net.HttpURLConnection r10 = r8.c(r3, r2, r10, r1)     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            if (r10 == 0) goto Ld5
            java.lang.String r2 = r1.f279512b     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            if (r2 == 0) goto Ld5
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            java.io.InputStream r10 = r10.getInputStream()     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            r2.<init>(r10)     // Catch: java.lang.Exception -> L8a java.net.SocketTimeoutException -> Lb0
            r4 = r2
            goto Ld5
        L8a:
            r10 = move-exception
            java.lang.String r2 = r10.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r2}
            java.lang.String r2 = "fetch error. path = [%s], error = [%s]"
            com.tencent.mars.xlog.Log.e(r0, r2, r9)
            android.content.Context r9 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 2131756424(0x7f100588, float:1.9143755E38)
            java.lang.String r9 = r9.getString(r0)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r9 = java.lang.String.format(r9, r10)
            r1.f279512b = r9
            goto Ld5
        Lb0:
            r10 = move-exception
            int r2 = r8.f453608a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r8.f453609b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r2, r3, r10}
            java.lang.String r10 = "ImageFetch Timeout! path[%s] connectionTimeout[%d] readTimeout[%d] error[%s]"
            com.tencent.mars.xlog.Log.e(r0, r10, r9)
            android.content.Context r9 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r10 = 2131756426(0x7f10058a, float:1.914376E38)
            java.lang.String r9 = r9.getString(r10)
            r1.f279512b = r9
        Ld5:
            r1.f279511a = r4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.b.b(java.lang.Object, com.github.henryye.nativeiv.ImageDecodeConfig):h8.b");
    }

    public final java.net.HttpURLConnection c(java.lang.String str, java.lang.String str2, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig, h8.b bVar) {
        int i17 = 0;
        while (true) {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
            if (imageDecodeConfig != null && !android.text.TextUtils.isEmpty(str2)) {
                httpURLConnection.addRequestProperty("Referer", str2);
            }
            httpURLConnection.setRequestProperty("User-Agent", this.f453610c);
            httpURLConnection.setReadTimeout(this.f453609b);
            httpURLConnection.setConnectTimeout(this.f453608a);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 301 && responseCode != 302) {
                if (responseCode < 200 || responseCode >= 300) {
                    bVar.f279512b = java.lang.String.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a18), java.lang.Integer.valueOf(responseCode));
                }
                return httpURLConnection;
            }
            java.lang.String headerField = httpURLConnection.getHeaderField(ya.b.LOCATION);
            com.tencent.mars.xlog.Log.i("AppBrandImageHttpFetcher", "redirect from[%s] to[%s]", str, headerField);
            httpURLConnection.disconnect();
            if (headerField == null) {
                return null;
            }
            int i18 = i17 + 1;
            if (i17 >= 3) {
                com.tencent.mars.xlog.Log.e("AppBrandImageHttpFetcher", "too much redirection!");
                bVar.f279512b = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.a1_);
                return null;
            }
            i17 = i18;
            str = headerField;
        }
    }
}
