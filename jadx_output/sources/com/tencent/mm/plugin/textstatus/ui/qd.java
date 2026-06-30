package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes4.dex */
public final class qd extends zd4.m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd(java.lang.ref.WeakReference uiWeakRef) {
        super(uiWeakRef);
        kotlin.jvm.internal.o.g(uiWeakRef, "uiWeakRef");
    }

    public final void a(android.content.Context context, java.lang.String str, boolean z17) {
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.b(z17 ? com.tencent.mm.R.raw.check_mark_regular : com.tencent.mm.R.raw.icons_filled_info);
        e4Var.f211776c = str;
        e4Var.f211779f = true;
        e4Var.f211778e = false;
        e4Var.f211782i = new ca4.o(context, com.tencent.mm.plugin.textstatus.ui.pd.f174177d);
        e4Var.c();
    }

    @Override // zd4.m, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        java.lang.Object obj = this.f471638d.get();
        com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI textStatusNewLabelUI = obj instanceof com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI ? (com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI) obj : null;
        if (textStatusNewLabelUI == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "[onSceneEnd] activity null");
            return;
        }
        if (m1Var != null && m1Var.getType() == 5293) {
            int i19 = com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI.f173655J;
            if (((java.lang.Boolean) ((jz5.n) textStatusNewLabelUI.F).getValue()).booleanValue()) {
                textStatusNewLabelUI.l7();
                java.lang.String stringExtra = textStatusNewLabelUI.getIntent().getStringExtra("KEY_EDIT_VISIBILITY_FEED_ID");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                long longExtra = textStatusNewLabelUI.getIntent().getLongExtra("KEY_EDIT_VISIBILITY_FROM_SCENE", 0L);
                if (i17 == 0 && i18 == 0) {
                    java.lang.String string = textStatusNewLabelUI.getString(com.tencent.mm.R.string.f490586z7);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    a(textStatusNewLabelUI, string, true);
                    ((we0.w1) ((bi4.a1) i95.n0.c(bi4.a1.class))).wi(stringExtra, 1, longExtra);
                } else {
                    java.lang.String string2 = textStatusNewLabelUI.getString(com.tencent.mm.R.string.j_d);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    a(textStatusNewLabelUI, string2, false);
                    ((we0.w1) ((bi4.a1) i95.n0.c(bi4.a1.class))).wi(stringExtra, 0, longExtra);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            textStatusNewLabelUI.f170687u = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateInTransform", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        }
    }
}
