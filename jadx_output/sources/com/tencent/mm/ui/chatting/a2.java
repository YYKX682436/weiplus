package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.a2 f198358a = new com.tencent.mm.ui.chatting.a2();

    public final void a(yb5.d dVar, boolean z17, com.tencent.mm.ui.chatting.viewitems.a4 a4Var, java.lang.String str, java.lang.String str2, ot0.q qVar, com.tencent.mm.autogen.events.WalletQueryHbStatusEvent walletQueryHbStatusEvent, kotlinx.coroutines.y0 y0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[doSetExclusiveHongBaoStyle] start");
        if (y0Var != null) {
            if ((a4Var != null ? a4Var.f203259c : null) != null) {
                if ((a4Var != null ? a4Var.f203260d : null) != null && dVar != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.ui.chatting.z1(a4Var, y0Var, str, qVar, dVar, walletQueryHbStatusEvent, z17, null), 3, null);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.C2CAppMsgUtilNew", "[doSetExclusiveHongBaoStyle] downloadScope == null || c2cMsgHolder?.c2cTitleTv == null || c2cMsgHolder?.c2cDescTv == null|| ui == null");
    }

    public final boolean b(int i17, int i18, ot0.q qVar) {
        ot0.c cVar = qVar != null ? (ot0.c) qVar.y(ot0.c.class) : null;
        if (cVar == null) {
            return false;
        }
        if (i17 == 3 && !com.tencent.mm.sdk.platformtools.t8.K0(cVar.f348421n)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[isExclusiveHongBaoMsg] true: 1+n times");
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f348421n)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[isExclusiveHongBaoMsg] false");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CAppMsgUtilNew", "[isExclusiveHongBaoMsg] true: 1 times");
        return true;
    }

    public final void c(com.tencent.mm.ui.chatting.viewitems.a4 a4Var) {
        if (com.tencent.mm.ui.bk.C()) {
            e(a4Var, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        } else {
            e(a4Var, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public final void d(com.tencent.mm.ui.chatting.viewitems.a4 a4Var) {
        if (com.tencent.mm.ui.bk.C()) {
            e(a4Var, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        } else {
            e(a4Var, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    public final void e(com.tencent.mm.ui.chatting.viewitems.a4 a4Var, float f17, float f18, float f19, float f27, float f28, float f29) {
        android.widget.TextView textView;
        android.widget.ImageView imageView = a4Var != null ? a4Var.f203258b : null;
        if (imageView != null) {
            imageView.setAlpha(f17);
        }
        android.widget.TextView textView2 = a4Var != null ? a4Var.f203260d : null;
        if (textView2 != null) {
            textView2.setAlpha(f18);
        }
        android.widget.TextView textView3 = a4Var != null ? a4Var.f203259c : null;
        if (textView3 != null) {
            textView3.setAlpha(f19);
        }
        android.widget.TextView textView4 = a4Var != null ? a4Var.f203261e : null;
        if (textView4 != null) {
            textView4.setAlpha(f27);
        }
        android.widget.TextView textView5 = a4Var != null ? a4Var.f203264h : null;
        if (textView5 != null) {
            textView5.setAlpha(f28);
        }
        android.widget.TextView textView6 = a4Var != null ? a4Var.f203262f : null;
        if (textView6 != null) {
            textView6.setAlpha(f29);
        }
        if (com.tencent.mm.ui.bk.C()) {
            android.widget.TextView textView7 = a4Var != null ? a4Var.f203261e : null;
            if (textView7 != null) {
                int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
                textView7.setTextColor(color);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            }
            android.widget.TextView textView8 = a4Var != null ? a4Var.f203264h : null;
            if (textView8 != null) {
                int color2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
                textView8.setTextColor(color2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            }
            textView = a4Var != null ? a4Var.f203262f : null;
            if (textView == null) {
                return;
            }
            int color3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView.setTextColor(color3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            return;
        }
        android.widget.TextView textView9 = a4Var != null ? a4Var.f203261e : null;
        if (textView9 != null) {
            int color4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView9.setTextColor(color4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        }
        android.widget.TextView textView10 = a4Var != null ? a4Var.f203264h : null;
        if (textView10 != null) {
            int color5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
            textView10.setTextColor(color5);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        }
        textView = a4Var != null ? a4Var.f203262f : null;
        if (textView == null) {
            return;
        }
        int color6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.adh);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        textView.setTextColor(color6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
    }

    public final void f(com.tencent.mm.ui.chatting.viewitems.a4 a4Var) {
        if (com.tencent.mm.ui.bk.C()) {
            e(a4Var, 0.8f, 0.8f, 0.8f, 0.5f, 0.5f, 0.5f);
        } else {
            e(a4Var, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
}
