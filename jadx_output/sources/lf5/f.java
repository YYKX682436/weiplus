package lf5;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final lf5.f f318534a = new lf5.f();

    public final void a(yb5.d ui6, com.tencent.mm.storage.f9 msg, com.tencent.mm.ui.chatting.viewitems.g0 holder, com.tencent.mm.ui.chatting.viewitems.a0 chattingItem, wd5.b bVar, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        int color;
        int i17;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(chattingItem, "chattingItem");
        if (bVar == null || msgQuoteItem == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillingReferMsgWithHolder failed because ");
            sb6.append(bVar == null ? "viewmodel is null" : "");
            sb6.append(',');
            sb6.append(msgQuoteItem == null ? "quoteItem is null" : "");
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemQuoteHelper", sb6.toString());
            return;
        }
        if (bVar.j() != null) {
            com.tencent.mm.storage.f9 a17 = com.tencent.mm.ui.chatting.viewitems.dc.a(com.tencent.mm.ui.chatting.viewitems.dc.b(ui6.D(), ui6.x(), msg.getMsgId(), msg.Q0(), msgQuoteItem, bVar.f445094r.f445083d), msgQuoteItem);
            ti3.l c17 = com.tencent.mm.ui.chatting.viewitems.hc.c(ui6, i65.a.h(ui6.g(), com.tencent.mm.R.dimen.f479628b3), msg, a17, msgQuoteItem);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = ui6.g();
            ((ke0.e) xVar).getClass();
            java.lang.CharSequence charSequence = c17.f419627b;
            android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(g17, charSequence);
            r15.f b17 = com.tencent.mm.ui.chatting.viewitems.hc.b(msgQuoteItem.f149493r, a17, ui6.g());
            if (b17 != null) {
                bVar.f445085f = pl5.c.a(new android.text.SpannableStringBuilder(i18), c17.f419628c, b17.f368644a, b17.f368645b, new lf5.d(i18));
            } else {
                bVar.f445085f = i18;
            }
            bVar.f445084e = a17;
            bVar.f445086g = msgQuoteItem;
            if (com.tencent.mars.xlog.Log.isDebug()) {
                i18.length();
                java.util.Objects.toString(charSequence);
            }
            f21.a m07 = f21.r0.wi().m0(ui6.x());
            java.lang.Object l17 = c01.d9.b().p().l(12311, -2);
            kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) l17).intValue();
            ((sb5.z) ui6.f460708c.a(sb5.z.class)).getClass();
            if ((m07 == null || m07.f258833b == -2) && (m07 != null || intValue == -2)) {
                color = ui6.g().getResources().getColor(com.tencent.mm.R.color.f478872ji);
                i17 = com.tencent.mm.R.drawable.apt;
            } else {
                i17 = !com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.drawable.czh : com.tencent.mm.R.drawable.czg;
                color = ui6.g().getResources().getColor(com.tencent.mm.R.color.adg);
            }
            bVar.f445087h = java.lang.Integer.valueOf(color);
            bVar.f445088i = java.lang.Integer.valueOf(i17);
            bVar.f445089m = c17.f419626a;
            bVar.f445090n = charSequence;
            bVar.f445093q = ti3.i.m(a17);
            bVar.f445091o = new lf5.b(msg, ui6, chattingItem, msgQuoteItem);
            bVar.f445092p = new lf5.c(msg, msgQuoteItem, ui6, holder, chattingItem);
        }
        holder.getQuoteView().b(bVar);
    }
}
