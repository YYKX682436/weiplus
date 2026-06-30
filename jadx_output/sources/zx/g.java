package zx;

/* loaded from: classes14.dex */
public final class g implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView f476951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.t f476952e;

    public g(com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView cBTBrandLiveQueryListView, zx.t tVar) {
        this.f476951d = cBTBrandLiveQueryListView;
        this.f476952e = tVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView cBTBrandLiveQueryListView = this.f476951d;
        androidx.recyclerview.widget.RecyclerView recyclerView = cBTBrandLiveQueryListView.f65288f;
        kotlin.jvm.internal.o.d(recyclerView);
        int adapterPosition = recyclerView.w0(view).getAdapterPosition();
        if (adapterPosition >= 0) {
            zx.u uVar = (zx.u) this.f476952e.f476965d.get(adapterPosition);
            if (uVar.f476971c) {
                return;
            }
            xx.y brandDataReporter = cBTBrandLiveQueryListView.getBrandDataReporter();
            if (brandDataReporter != null) {
                com.tencent.wechat.aff.chatbot.l lVar = uVar.f476972d;
                java.lang.String b17 = lVar.b();
                kotlin.jvm.internal.o.f(b17, "getTraceId(...)");
                long j17 = lVar.f216341d;
                xx.b bVar = lVar.f216347m ? xx.b.f457771f : xx.b.f457770e;
                com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportCommentExp");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_room_comment_exp", brandDataReporter.a(brandDataReporter.f457837j, new xx.o(b17, j17, bVar)), 36708);
            }
            uVar.f476971c = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
