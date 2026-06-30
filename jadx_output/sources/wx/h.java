package wx;

@j95.b
/* loaded from: classes7.dex */
public final class h extends i95.w implements wx.j1 {
    public h() {
        new java.util.LinkedHashMap();
        new java.util.LinkedHashMap();
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        wx.o.f450424a.a();
        com.tencent.mars.xlog.Log.i("ChatBotWeAppLoadingCheckModelManager", "check start");
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_51db20b7");
        qVar.f217548e = new java.util.LinkedList(kz5.b0.c("chatbot_weapp_loading_check_model"));
        qVar.f217550g[2] = true;
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Bi(qVar);
    }
}
