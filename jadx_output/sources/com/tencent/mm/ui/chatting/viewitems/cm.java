package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class cm implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.dm f203739a;

    public cm(com.tencent.mm.ui.chatting.viewitems.dm dmVar) {
        this.f203739a = dmVar;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 2002) {
            return;
        }
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationClickListener", "[onActivityResult] null == data, requestCode:%s resultCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        if (intent.getBooleanExtra("kfavorite", false)) {
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            com.tencent.mm.pluginsdk.model.a2.l(doFavoriteEvent, intent);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f203739a.f198492d.f460717l;
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6324j = baseChattingUIFragment;
            c4Var.f6327m = 42;
            doFavoriteEvent.e();
        }
    }
}
