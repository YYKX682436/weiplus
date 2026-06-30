package u23;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final u23.e0 f424104a;

    /* renamed from: b, reason: collision with root package name */
    public final u23.k f424105b;

    /* renamed from: c, reason: collision with root package name */
    public final u23.b f424106c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f424107d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f424108e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f424109f;

    public s(u23.e0 e0Var, u23.k kVar, u23.b bVar, int i17, kotlin.jvm.internal.i iVar) {
        u23.e0 queryConfig;
        if ((i17 & 1) != 0) {
            jz5.g gVar = u23.e0.f424054n;
            java.util.Comparator comparator = (java.util.Comparator) ((jz5.n) u23.e0.f424054n).getValue();
            java.lang.String str = (java.lang.String) ((jz5.n) u23.e0.f424055o).getValue();
            kotlin.jvm.internal.o.f(str, "access$getDEFAULT_ALL_MEDIA_FOLDER_NAME(...)");
            java.lang.String str2 = (java.lang.String) ((jz5.n) u23.e0.f424056p).getValue();
            kotlin.jvm.internal.o.f(str2, "access$getDEFAULT_ALL_IMAGE_FOLDER_NAME(...)");
            java.lang.String str3 = (java.lang.String) ((jz5.n) u23.e0.f424057q).getValue();
            kotlin.jvm.internal.o.f(str3, "access$getDEFAULT_ALL_VIDEO_FOLDER_NAME(...)");
            java.lang.String str4 = (java.lang.String) ((jz5.n) u23.e0.f424058r).getValue();
            kotlin.jvm.internal.o.f(str4, "access$getDEFAULT_FAVORITE_FOLDER_NAME(...)");
            queryConfig = new u23.e0(3, 2, true, false, false, 10240L, comparator, str, str2, str3, str4, (u23.w) ((jz5.n) u23.e0.f424059s).getValue(), new u23.c0(), false, false, true, false, null);
        } else {
            queryConfig = e0Var;
        }
        u23.k queryConst = (i17 & 2) != 0 ? new u23.k() : kVar;
        u23.b mediaFilter = (i17 & 4) != 0 ? new u23.a(queryConfig.f424060a) : bVar;
        kotlin.jvm.internal.o.g(queryConfig, "queryConfig");
        kotlin.jvm.internal.o.g(queryConst, "queryConst");
        kotlin.jvm.internal.o.g(mediaFilter, "mediaFilter");
        this.f424104a = queryConfig;
        this.f424105b = queryConst;
        this.f424106c = mediaFilter;
        java.lang.String str5 = "MicroMsg.MediaLoaderRequest[" + hashCode() + ']';
        this.f424107d = str5;
        this.f424109f = jz5.h.b(u23.r.f424103d);
        com.tencent.mars.xlog.Log.i(str5, "init: ");
    }

    public final void a(u23.n nVar) {
        if (nVar == null) {
            com.tencent.mars.xlog.Log.i(this.f424107d, "started: failed");
            return;
        }
        if (this.f424108e) {
            com.tencent.mars.xlog.Log.i(this.f424107d, "started: skip");
            return;
        }
        this.f424108e = true;
        com.tencent.mars.xlog.Log.i(this.f424107d, "start: controller[" + nVar.hashCode() + "] ");
        u23.e eVar = (u23.e) ((jz5.n) this.f424109f).getValue();
        eVar.getClass();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        nVar.f424102f = eVar;
        u23.d dVar = new u23.d(nVar, eVar, uptimeMillis, this);
        com.tencent.mars.xlog.Log.i(eVar.f424044a, "【start】ready, controller[" + nVar.hashCode() + "] isCancelled=" + nVar.f424101e + ", runnable=" + dVar);
        ((ku5.t0) ku5.t0.f312615d).g(dVar);
    }
}
