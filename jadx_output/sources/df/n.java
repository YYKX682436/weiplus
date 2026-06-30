package df;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: d, reason: collision with root package name */
    public static int f229520d;

    /* renamed from: a, reason: collision with root package name */
    public static final df.n f229517a = new df.n();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f229518b = new java.util.concurrent.atomic.AtomicInteger(com.tencent.ilink.auth.FaceExtVerifyType.kFaceExtVerifyType_WxPay_End_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f229519c = k91.d3.a(com.tencent.mm.sdk.platformtools.x2.f193071a, k91.n0.a());

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f229521e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashSet f229522f = new java.util.HashSet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f229523g = new java.lang.Object();

    public final void a(int i17, java.lang.String url, java.util.HashMap requestHeader) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(requestHeader, "requestHeader");
        synchronized (f229523g) {
            int i18 = f229520d;
            if (i18 > 10) {
                f229521e.addLast(new df.k(i17, url, requestHeader));
                return;
            }
            f229520d = i18 + 1;
            com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
            cronetRequestParams.url = url;
            java.lang.String valueOf = java.lang.String.valueOf(f229518b.incrementAndGet());
            cronetRequestParams.taskId = valueOf;
            f229522f.add(valueOf);
            cronetRequestParams.followRedirect = true;
            cronetRequestParams.method = "GET";
            cronetRequestParams.useHttp2 = true;
            cronetRequestParams.useQuic = true;
            cronetRequestParams.useMemoryCache = false;
            requestHeader.put("Accept-Encoding", "gzip,compress,br,deflate");
            requestHeader.put("User-Agent", f229519c);
            cronetRequestParams.makeRequestHeader(requestHeader);
            cronetRequestParams.taskType = 1;
            df.l lVar = new df.l(cronetRequestParams);
            java.lang.String taskId = com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams, new df.m(lVar, i17, cronetRequestParams)).taskId;
            kotlin.jvm.internal.o.f(taskId, "taskId");
            lVar.f229506e = taskId;
            ((ku5.t0) ku5.t0.f312615d).k(lVar, 30000L);
        }
    }
}
