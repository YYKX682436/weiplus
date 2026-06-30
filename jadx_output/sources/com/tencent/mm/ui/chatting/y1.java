package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f206247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot0.q f206249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a4 f206251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WalletQueryHbStatusEvent f206252i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f206253m;

    public y1(kotlinx.coroutines.y0 y0Var, java.lang.String str, ot0.q qVar, yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a4 a4Var, com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent, boolean z17) {
        this.f206247d = y0Var;
        this.f206248e = str;
        this.f206249f = qVar;
        this.f206250g = dVar;
        this.f206251h = a4Var;
        this.f206252i = walletQueryHbStatusEvent;
        this.f206253m = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        am.x10 x10Var;
        kotlinx.coroutines.y0 y0Var = this.f206247d;
        if (y0Var == null || !kotlinx.coroutines.z0.h(y0Var)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.C2CAppMsgUtilNew", "[doSetExclusiveHongBaoStyle] downloadScope == null || !downloadScope.isActive");
            return;
        }
        yb5.d dVar = this.f206250g;
        java.lang.String x17 = dVar.x();
        com.tencent.mm.ui.chatting.viewitems.a4 a4Var = this.f206251h;
        android.widget.TextView textView = a4Var.f203259c;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ot0.q qVar = this.f206249f;
        ot0.c cVar = qVar != null ? (ot0.c) qVar.y(ot0.c.class) : null;
        java.lang.String str3 = this.f206248e;
        if (cVar == null) {
            str = str3;
        } else {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str4 = cVar.f348421n;
            ((sg3.a) v0Var).getClass();
            java.lang.String string = context.getString(com.tencent.mm.R.string.gjf, c01.a2.f(str4, x17));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (textView == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[getExclusiveHongBaoTitle] titleTv == null");
                str = string + context.getString(com.tencent.mm.R.string.gjg);
            } else {
                int width = textView.getWidth();
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[getExclusiveHongBaoTitle] viewWidth: %s", java.lang.Integer.valueOf(width));
                if (width <= 0) {
                    width = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479667c4);
                }
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.gjg);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                android.text.TextPaint paint = textView.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append((java.lang.Object) string);
                sb6.append((java.lang.Object) string2);
                java.lang.String sb7 = sb6.toString();
                float measureText = paint.measureText(sb7) + i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479644bj);
                com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[adaptiveConcatString] originalText：%s, viewWidth：%s, originalTextWidth: %s", sb7, java.lang.Integer.valueOf(width), java.lang.Float.valueOf(measureText));
                if (width > 0) {
                    float f17 = width;
                    if (measureText >= f17) {
                        java.lang.String str5 = "..." + ((java.lang.Object) string2);
                        float measureText2 = paint.measureText(str5);
                        com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[adaptiveConcatString] suffixTextWidth: %s", java.lang.Float.valueOf(measureText2));
                        if (measureText2 > f17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.C2CAppMsgUtilNew", "[adaptiveConcatString] suffixTextWidth > viewWidth");
                        } else {
                            sb7 = ((java.lang.Object) string) + str5;
                            float measureText3 = paint.measureText(sb7);
                            for (int i17 = 1; measureText3 > f17 && i17 < 100 && i17 < string.length(); i17++) {
                                sb7 = ((java.lang.Object) string.subSequence(0, string.length() - i17)) + str5;
                                measureText3 = paint.measureText(sb7);
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[adaptiveConcatString] finalText: %s", sb7);
                        }
                    }
                }
                str = sb7;
            }
        }
        com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent = this.f206252i;
        int i18 = (walletQueryHbStatusEvent == null || (x10Var = walletQueryHbStatusEvent.f54970h) == null) ? 0 : x10Var.f8336b;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (i18 == 5) {
            str2 = context2.getString(com.tencent.mm.R.string.gji);
        } else {
            if (i18 == 4) {
                ot0.c cVar2 = qVar != null ? (ot0.c) qVar.y(ot0.c.class) : null;
                if (this.f206253m || cVar2 == null || com.tencent.mm.sdk.platformtools.t8.K0(cVar2.f348421n) || !kotlin.jvm.internal.o.b(cVar2.f348421n, c01.z1.r())) {
                    str3 = context2.getString(com.tencent.mm.R.string.o7u);
                } else {
                    str2 = context2.getString(com.tencent.mm.R.string.gjj);
                }
            }
            str2 = str3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[doSetExclusiveHongBaoStyle] post, title:" + str + ", desc: " + str2);
        android.widget.TextView textView2 = a4Var.f203259c;
        if (textView2 != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = dVar.g();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            float textSize = a4Var.f203259c.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g17, str, textSize));
        }
        android.widget.TextView textView3 = a4Var.f203260d;
        if (textView3 != null) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g18 = dVar.g();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            float textSize2 = a4Var.f203260d.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(g18, str2, textSize2));
        }
        android.widget.TextView textView4 = a4Var.f203260d;
        if (textView4 == null) {
            return;
        }
        textView4.setVisibility(0);
    }
}
