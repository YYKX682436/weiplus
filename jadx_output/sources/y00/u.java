package y00;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f458549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f458550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y00.t f458551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f458552g;

    public u(android.widget.LinearLayout linearLayout, long j17, y00.t tVar, java.util.Map map) {
        this.f458549d = linearLayout;
        this.f458550e = j17;
        this.f458551f = tVar;
        this.f458552g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object tag = this.f458549d.getTag();
        boolean z17 = tag instanceof java.lang.Long;
        long j17 = this.f458550e;
        if (!z17 || !kotlin.jvm.internal.o.b(tag, java.lang.Long.valueOf(j17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "postToMainAndRefresh: container reused, skip, msgSvrId=" + j17 + ", tag=" + tag);
            return;
        }
        try {
            ((com.tencent.mm.ui.chatting.viewitems.js) this.f458551f).a(this.f458552g);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsKfProductCardUIRefresher", th6, "postToMainAndRefresh onLatestXml fail, msgSvrId=" + j17, new java.lang.Object[0]);
        }
    }
}
