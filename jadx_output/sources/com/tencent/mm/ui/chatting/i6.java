package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class i6 extends com.tencent.mm.ui.chatting.b6 {
    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        android.app.Activity g17 = dVar.g();
        java.lang.String x17 = dVar.x();
        java.util.Map map = com.tencent.mm.ui.chatting.w5.f206212a;
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        java.lang.String str = erVar.f203913i;
        if (android.text.TextUtils.isEmpty(str)) {
            str = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).P(erVar.f203926v);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("geta8key_username", x17);
            intent.putExtra("rawUrl", erVar.f203926v);
            j45.l.j(g17, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        qk.c0 c0Var = new qk.c0(str == null ? "" : str);
        if (erVar.f203914j) {
            c0Var.f364155a = 20;
            c0Var.f364198g = 3;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12953, 1, str);
        } else if (erVar.f203915k) {
            c0Var.f364155a = 25;
            c0Var.f364198g = 9;
        } else {
            c0Var.f364155a = 22;
            c0Var.f364198g = 122;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10993, 2, str);
        }
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemHelper", "emoticon liteapp service not found");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(g17, c0Var);
        }
    }
}
