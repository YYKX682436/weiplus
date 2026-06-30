package wh1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {
    public final long A;
    public java.lang.String B;
    public final java.lang.String C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final com.tencent.mars.cdn.CronetLogic.HostIPHint H;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f445926e;

    /* renamed from: f, reason: collision with root package name */
    public final wh1.f f445927f;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f445930i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f445931m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f445932n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f445933o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f445934p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.Map f445935q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f445936r;

    /* renamed from: t, reason: collision with root package name */
    public javax.net.ssl.SSLContext f445938t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.ArrayList f445939u;

    /* renamed from: v, reason: collision with root package name */
    public long f445940v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f445941w;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f445944z;

    /* renamed from: d, reason: collision with root package name */
    public int f445925d = 15;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f445928g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f445929h = false;

    /* renamed from: s, reason: collision with root package name */
    public int f445937s = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: x, reason: collision with root package name */
    public java.net.HttpURLConnection f445942x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f445943y = null;

    public e(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, com.tencent.mars.cdn.CronetLogic.HostIPHint hostIPHint, wh1.f fVar) {
        this.f445944z = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = null;
        this.f445926e = lVar;
        this.f445931m = str;
        this.f445930i = str2;
        this.f445932n = str3;
        this.f445933o = str4;
        this.f445934p = com.tencent.mm.sdk.platformtools.t8.K0(str5) ? "application/octet-stream" : str5;
        this.f445927f = fVar;
        this.A = java.lang.System.currentTimeMillis();
        this.C = str6;
        this.f445944z = z17;
        this.D = z18;
        this.E = z19;
        this.F = z27;
        this.G = z28;
        this.H = hostIPHint;
    }

    public void a() {
        this.f445928g = false;
        java.net.HttpURLConnection httpURLConnection = this.f445942x;
        if (httpURLConnection != null) {
            try {
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUploadWorker", e17, "abortTask IOException", new java.lang.Object[0]);
                }
                this.f445942x.disconnect();
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkUploadWorker", e18, "abortTask Exception", new java.lang.Object[0]);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f445943y)) {
            return;
        }
        com.tencent.mars.cdn.CronetLogic.cancelCronetTask(this.f445943y);
    }

    public int b() {
        return (int) (java.lang.System.currentTimeMillis() - this.A);
    }

    public java.lang.String c() {
        return this.B;
    }

    public java.lang.String d() {
        return this.f445941w;
    }

    public java.lang.String e() {
        return this.f445931m;
    }

    public final void f(long j17, long j18) {
        if (j17 <= 0 || j18 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkUploadWorker", "reportSpeed len:%d, time:%d return", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        } else {
            ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(436L, com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 30 : com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 31 : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 32 : com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? 33 : 34, (long) ((j17 / j18) * 0.9765625d), false);
        }
    }

    public final void g(int i17) {
        ((ch1.c) ((com.tencent.mm.plugin.appbrand.profile.a) nd.f.d(com.tencent.mm.plugin.appbrand.profile.a.class, true))).c(436L, (i17 < 100 || i17 >= 200) ? 200 == i17 ? 21 : (i17 <= 200 || i17 >= 300) ? 302 == i17 ? 23 : (i17 < 300 || i17 >= 400) ? 404 == i17 ? 25 : (i17 < 400 || i17 >= 500) ? i17 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20, 1L, false);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    public final void h() {
        /*
            Method dump skipped, instructions count: 8418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh1.e.h():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fb A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0233 A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TRY_ENTER, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x024e A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0347 A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034e A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ea A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x042a A[Catch: Exception -> 0x0461, UnsupportedEncodingException -> 0x0463, TryCatch #7 {UnsupportedEncodingException -> 0x0463, Exception -> 0x0461, blocks: (B:71:0x0415, B:75:0x042a, B:77:0x044a), top: B:64:0x03e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023c A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0207 A[Catch: Exception -> 0x0465, UnsupportedEncodingException -> 0x0469, TryCatch #5 {UnsupportedEncodingException -> 0x0469, Exception -> 0x0465, blocks: (B:42:0x01c2, B:44:0x01fb, B:45:0x021d, B:48:0x0233, B:49:0x024a, B:51:0x024e, B:52:0x0269, B:55:0x0273, B:57:0x02c5, B:58:0x0335, B:60:0x0347, B:62:0x034e, B:63:0x0350, B:66:0x03ea, B:68:0x03ee, B:85:0x023c, B:87:0x0242, B:88:0x0207), top: B:41:0x01c2 }] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh1.e.run():void");
    }
}
