package lf5;

/* loaded from: classes5.dex */
public abstract class g {
    public static final void a(android.view.View quoteViewInstance, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(quoteViewInstance, "quoteViewInstance");
        android.view.View findViewById = quoteViewInstance.findViewById(com.tencent.mm.R.id.uw8);
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            if (z17) {
                marginLayoutParams.leftMargin = z18 ? i65.a.b(findViewById.getContext(), 5) : 0;
                marginLayoutParams.rightMargin = z18 ? 0 : i65.a.b(findViewById.getContext(), 5);
            } else {
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }

    public static final com.tencent.mm.plugin.msgquote.model.MsgQuoteItem b(com.tencent.mm.storage.ca caVar) {
        kotlin.jvm.internal.o.g(caVar, "<this>");
        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem = new com.tencent.mm.plugin.msgquote.model.MsgQuoteItem();
        com.tencent.mm.storage.f9 f9Var = caVar.f193822a;
        msgQuoteItem.f149483e = f9Var.I0();
        java.lang.String t17 = c01.ia.t(f9Var.G);
        if (t17 == null) {
            t17 = "";
        }
        msgQuoteItem.f149491p = t17;
        java.lang.String Q0 = f9Var.Q0();
        if (Q0 == null) {
            Q0 = "";
        }
        msgQuoteItem.f149484f = Q0;
        msgQuoteItem.f149492q = f9Var.getCreateTime() / 1000;
        msgQuoteItem.f149493r = caVar.f193823b;
        if (msgQuoteItem.f149483e != 0) {
            pt0.e0 e0Var = pt0.f0.f358209b1;
            java.lang.String Q02 = f9Var.Q0();
            if (Q02 == null) {
                Q02 = "";
            }
            com.tencent.mm.storage.f9 l17 = e0Var.l(Q02, f9Var.I0());
            if (l17 != null) {
                msgQuoteItem.f149482d = l17.getType();
                java.lang.String c17 = bm5.d1.c(l17);
                msgQuoteItem.f149485g = c17 != null ? c17 : "";
                msgQuoteItem.f149486h = ti3.i.c(l17);
                if (msgQuoteItem.f149482d == 34) {
                    msgQuoteItem.f149488m = l17.S1();
                } else {
                    msgQuoteItem.f149488m = l17.U1();
                }
            }
        }
        return msgQuoteItem;
    }

    public static final com.tencent.mm.plugin.msgquote.model.MsgQuoteItem c(wd5.b bVar, java.lang.String talker) {
        com.tencent.mm.storage.f9 l17;
        kotlin.jvm.internal.o.g(bVar, "<this>");
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem = new com.tencent.mm.plugin.msgquote.model.MsgQuoteItem();
        r15.i j17 = bVar.j();
        if (j17 != null) {
            msgQuoteItem.f149483e = j17.l();
            msgQuoteItem.f149491p = j17.k();
            msgQuoteItem.f149492q = j17.getCreateTime();
            msgQuoteItem.f149487i = j17.getSignature();
            msgQuoteItem.f149484f = talker;
            if (j17.l() != 0 && (l17 = pt0.f0.f358209b1.l(talker, j17.l())) != null) {
                msgQuoteItem.f149482d = l17.getType();
                java.lang.String c17 = bm5.d1.c(l17);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (c17 == null) {
                    c17 = "";
                }
                msgQuoteItem.f149485g = c17;
                msgQuoteItem.f149486h = ti3.i.c(l17);
                if (msgQuoteItem.f149482d == 34) {
                    msgQuoteItem.f149488m = l17.S1();
                } else {
                    msgQuoteItem.f149488m = l17.U1();
                }
            }
            msgQuoteItem.f149493r = j17.j();
        }
        return msgQuoteItem;
    }
}
