package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class g9 {
    public static void a(android.widget.ImageView imageView, java.lang.String str) {
        if (imageView == null) {
            return;
        }
        r53.v vVar = new r53.v();
        vVar.f392703a = true;
        vVar.f392704b = true;
        vVar.f392709g = 0.1f;
        r53.y.a().e(imageView, str, vVar.a(), null);
    }

    public static void b(yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.tencent.mars.xlog.Log.i("ChattingItemAppMsgGameNameCard", "onChattingItemClicked");
        if (v17 != null) {
            c53.a aVar = (c53.a) v17.y(c53.a.class);
            if (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f38649g)) {
                if (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f38648f)) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", aVar.f38648f);
                j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
            q80.d0 d0Var = new q80.d0();
            d0Var.f360649a = aVar.f38649g;
            d0Var.f360650b = aVar.f38650h;
            d0Var.f360651c = aVar.f38651i;
            d0Var.f360654f = aVar.f38652j;
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(dVar.g(), d0Var, new com.tencent.mm.ui.chatting.viewitems.c9(d0Var, aVar, dVar));
        }
    }
}
