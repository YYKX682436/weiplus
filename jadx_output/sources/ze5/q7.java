package ze5;

/* loaded from: classes9.dex */
public final class q7 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472166a;

    public q7(yb5.d dVar) {
        this.f472166a = dVar;
    }

    @Override // j45.g
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2002) {
            if (intent == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemLocationCardMvvm", "[onActivityResult] null == data, requestCode:%s resultCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                return;
            }
            if (intent.getBooleanExtra("kfavorite", false)) {
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                com.tencent.mm.pluginsdk.model.a2.l(doFavoriteEvent, intent);
                com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f472166a.f460717l;
                am.c4 c4Var = doFavoriteEvent.f54090g;
                c4Var.f6324j = baseChattingUIFragment;
                c4Var.f6327m = 42;
                doFavoriteEvent.e();
            }
        }
    }
}
