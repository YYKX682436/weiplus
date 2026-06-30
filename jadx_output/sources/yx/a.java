package yx;

/* loaded from: classes5.dex */
public final class a implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity f467002d;

    public a(com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity) {
        this.f467002d = cBTBrandLiveActivity;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity = this.f467002d;
        com.tencent.mars.xlog.Log.i(cBTBrandLiveActivity.f65278d, "height: " + i17 + ", isResized: " + z17);
        android.view.View findViewById = cBTBrandLiveActivity.findViewById(com.tencent.mm.R.id.j8c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ly.g.c((android.view.ViewGroup) findViewById, 200L, null, null, null, null, kz5.c0.j(cBTBrandLiveActivity.f65282h), new yx.k(cBTBrandLiveActivity, i17), 30, null);
        if (i17 > 0) {
            xx.y yVar = cBTBrandLiveActivity.f65283i;
            yVar.getClass();
            com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportUserClickField");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_click_chat_clk", xx.y.b(yVar, yVar.f457837j, null, 2, null), 36708);
        }
    }
}
