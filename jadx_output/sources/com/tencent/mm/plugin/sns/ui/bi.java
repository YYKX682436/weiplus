package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class bi {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ui.ai f167914c = new com.tencent.mm.plugin.sns.ui.ai(null);

    /* renamed from: a, reason: collision with root package name */
    public r45.lh0 f167915a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView f167916b;

    public static android.view.View d(com.tencent.mm.plugin.sns.ui.bi biVar, android.content.Context context, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requireEcsView$default", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        biVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requireEcsView", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        if (biVar.f167916b == null) {
            biVar.f167916b = new com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView(context);
        }
        com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView snsEcsShareTailView = biVar.f167916b;
        kotlin.jvm.internal.o.d(snsEcsShareTailView);
        r45.lh0 lh0Var = biVar.f167915a;
        kotlin.jvm.internal.o.d(lh0Var);
        int i18 = com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView.f167147f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindEcsShareInfo$default", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        snsEcsShareTailView.b(lh0Var, false, null, 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindEcsShareInfo$default", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        if (z17 && snsEcsShareTailView.getParent() != null) {
            android.view.ViewParent parent = snsEcsShareTailView.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(snsEcsShareTailView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requireEcsView", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requireEcsView$default", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        return snsEcsShareTailView;
    }

    public final void a(android.widget.RelativeLayout parent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addEcsViewToDynamicGridBottom", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        kotlin.jvm.internal.o.g(parent, "parent");
        if (!c()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEcsViewToDynamicGridBottom", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(3, com.tencent.mm.R.id.naf);
        layoutParams.setMargins(i17, i65.a.b(parent.getContext(), 4), i17, 0);
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View d17 = d(this, context, false, 2, null);
        f167914c.f(d17, 1, this.f167915a);
        parent.addView(d17, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addEcsViewToDynamicGridBottom", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDraftKey", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        r45.lh0 lh0Var = this.f167915a;
        java.lang.String str = lh0Var != null ? lh0Var.f379475f : null;
        if (str == null) {
            str = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDraftKey", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        return str;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        boolean z17 = this.f167915a != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ui.SnsEcsUploadHelper");
        return z17;
    }
}
