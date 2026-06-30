package lr1;

/* loaded from: classes12.dex */
public class n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f320686d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f320687e;

    /* renamed from: f, reason: collision with root package name */
    public final long f320688f;

    /* renamed from: g, reason: collision with root package name */
    public final int f320689g;

    /* renamed from: h, reason: collision with root package name */
    public final int f320690h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f320691i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f320692m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.autogen.events.BizPreSearchEvent f320693n;

    public n(android.content.Context context, java.lang.String str, long j17, int i17, int i18, java.lang.String str2, boolean z17, com.tencent.mm.autogen.events.BizPreSearchEvent bizPreSearchEvent) {
        this.f320686d = context;
        this.f320687e = str;
        this.f320688f = j17;
        this.f320689g = i17;
        this.f320690h = i18;
        this.f320691i = str2;
        this.f320692m = z17;
        this.f320693n = bizPreSearchEvent;
    }

    public final void a(boolean z17) {
        java.lang.Runnable runnable;
        gm0.j1.d().q(1071, this);
        com.tencent.mm.autogen.events.BizPreSearchEvent bizPreSearchEvent = this.f320693n;
        if (bizPreSearchEvent == null || (runnable = bizPreSearchEvent.f54005g.f8157g) == null) {
            return;
        }
        bizPreSearchEvent.f54006h.f8244a = z17;
        ((com.tencent.mm.plugin.fts.ui.l) runnable).run();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceLogic", "errType (%d) , errCode (%d) , errMsg (errMsg)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            a(false);
            return;
        }
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BrandServiceLogic", "scene is null.");
            a(false);
            return;
        }
        if (m1Var.getType() != 1071) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceLogic", "The NetScene is not a instanceof BizSearchDetailPage.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceLogic", "BizSearchDetailPage.");
        r45.kw5 kw5Var = ((lr1.g0) m1Var).f320665f;
        r45.qp qpVar = kw5Var == null ? null : kw5Var.f379004d;
        if (qpVar == null || qpVar.f384158h == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BrandServiceLogic", "response or BusinessContent or itemList is null.");
            a(false);
            return;
        }
        android.content.Context context = this.f320686d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI.class);
        intent.putExtra("addContactScene", 35);
        intent.putExtra("fromScene", this.f320690h);
        intent.putExtra("keyword", this.f320687e);
        intent.putExtra("businessType", this.f320688f);
        intent.putExtra("offset", this.f320689g);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f320691i);
        intent.putExtra("showEditText", this.f320692m);
        try {
            intent.putExtra("result", qpVar.toByteArray());
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            a(true);
        } catch (java.lang.Exception e17) {
            a(false);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BrandService.BrandServiceLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
