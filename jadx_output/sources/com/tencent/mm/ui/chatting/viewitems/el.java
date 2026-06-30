package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public abstract class el {
    public static void a(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.ao aoVar, java.util.Map map, com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.content");
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.tip");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("msgId", f9Var.getMsgId());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int textSize = (int) aoVar.f203379b.getTextSize();
        java.util.LinkedList linkedList = com.tencent.mm.pluginsdk.ui.span.c0.f191191a;
        com.tencent.mm.pluginsdk.ui.span.j1 j1Var = new com.tencent.mm.pluginsdk.ui.span.j1(context);
        j1Var.f191230i = true;
        j1Var.f191226e = true;
        j1Var.f191227f = true;
        j1Var.f191229h = com.tencent.mm.pluginsdk.ui.span.c0.d();
        j1Var.f191239r = true;
        j1Var.f191246y = 4;
        j1Var.f191231j = true;
        j1Var.f191234m = false;
        j1Var.B = true;
        j1Var.D = 7;
        j1Var.H = bundle;
        j1Var.f191245x = true;
        android.text.SpannableString e17 = j1Var.e(str, textSize, false);
        aoVar.f203393p.setText(str2);
        aoVar.f203379b.c(e17, android.widget.TextView.BufferType.SPANNABLE, null);
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String u17 = pm0.v.u(f9Var.getMsgId());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        g0Var.d(20849, 7, 1, u17, com.tencent.mm.plugin.finder.service.m4.f126148a.h(f9Var.y0()));
    }
}
