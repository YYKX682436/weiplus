package zx;

/* loaded from: classes14.dex */
public final class c implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView f476942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.u f476943e;

    public c(com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView cBTBrandLiveQueryListView, zx.u uVar) {
        this.f476942d = cBTBrandLiveQueryListView;
        this.f476943e = uVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView cBTBrandLiveQueryListView = this.f476942d;
        java.lang.Object systemService = cBTBrandLiveQueryListView.getContext().getSystemService("clipboard");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
        zx.u uVar = this.f476943e;
        com.tencent.wechat.aff.chatbot.l lVar = uVar.f476972d;
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("Copied Text", lVar.f216349o[4] ? lVar.f216344g : ""));
        xx.y brandDataReporter = cBTBrandLiveQueryListView.getBrandDataReporter();
        if (brandDataReporter != null) {
            com.tencent.wechat.aff.chatbot.l lVar2 = uVar.f476972d;
            java.lang.String b17 = lVar2.b();
            kotlin.jvm.internal.o.f(b17, "getTraceId(...)");
            long j17 = lVar2.f216341d;
            xx.b bVar = lVar2.f216347m ? xx.b.f457771f : xx.b.f457770e;
            com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportCopyCommentClk");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_copy_comment_clk", brandDataReporter.a(brandDataReporter.f457837j, new xx.p(b17, j17, bVar)), 36708);
        }
    }
}
