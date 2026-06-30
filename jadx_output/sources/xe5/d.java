package xe5;

/* loaded from: classes3.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.f f454006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f454008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f454009g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f454010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454011i;

    public d(xe5.f fVar, java.lang.String str, long j17, yb5.d dVar, long j18, xe5.i iVar) {
        this.f454006d = fVar;
        this.f454007e = str;
        this.f454008f = j17;
        this.f454009g = dVar;
        this.f454010h = j18;
        this.f454011i = iVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        xe5.f fVar = this.f454006d;
        fVar.getClass();
        xe5.i iVar = this.f454011i;
        java.lang.String str = this.f454007e;
        if (itemId == 2) {
            if (str != null) {
                long j17 = this.f454008f;
                long j18 = this.f454010h;
                s40.o0 o0Var = (s40.o0) i95.n0.c(s40.o0.class);
                s40.o0 o0Var2 = (s40.o0) i95.n0.c(s40.o0.class);
                kotlin.jvm.internal.o.d(str);
                pq5.g l17 = ((com.tencent.mm.feature.finder.live.a) o0Var).wi(j17, j18, 3, ((com.tencent.mm.feature.finder.live.a) o0Var2).Ai(str, false)).l();
                kotlin.jvm.internal.o.f(l17, "run(...)");
                pm0.v.T(l17, new xe5.b(fVar, str, iVar));
                return;
            }
            return;
        }
        fVar.getClass();
        if (itemId == 3) {
            if (str != null) {
                long j19 = this.f454008f;
                long j27 = this.f454010h;
                s40.o0 o0Var3 = (s40.o0) i95.n0.c(s40.o0.class);
                s40.o0 o0Var4 = (s40.o0) i95.n0.c(s40.o0.class);
                kotlin.jvm.internal.o.d(str);
                pq5.g l18 = ((com.tencent.mm.feature.finder.live.a) o0Var3).wi(j19, j27, 3, ((com.tencent.mm.feature.finder.live.a) o0Var4).Ai(str, true)).l();
                kotlin.jvm.internal.o.f(l18, "run(...)");
                pm0.v.T(l18, new xe5.c(fVar, str, iVar));
                return;
            }
            return;
        }
        fVar.getClass();
        if (itemId == 1) {
            fVar.getClass();
            java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=62&liveid=%s&liveidentityid=%s&wechat_real_lang=%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(this.f454008f), str, com.tencent.mm.sdk.platformtools.m2.d()}, 3));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mars.xlog.Log.i(fVar.f454022h, "go to complain page");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            com.tencent.mm.ui.chatting.viewitems.a0.h(intent, this.f454009g.x());
            j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
