package yx;

/* loaded from: classes5.dex */
public final class c implements fl5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity f467007a;

    public c(com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity) {
        this.f467007a = cBTBrandLiveActivity;
    }

    @Override // fl5.c
    public final boolean a(android.content.Context context) {
        xx.y yVar = this.f467007a.f65283i;
        yVar.getClass();
        com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportUserPasteCommon");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_paste_in_chat", xx.y.b(yVar, yVar.f457837j, null, 2, null), 36708);
        return false;
    }
}
