package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f165312a;

    /* renamed from: b, reason: collision with root package name */
    public final y9.i f165313b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f165314c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j2 f165315d;

    public k2(android.content.Context context, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 a2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        this.f165312a = context;
        if (a2Var == null || a2Var.x() == null) {
            return;
        }
        y9.i iVar = new y9.i(context, 0);
        this.f165313b = iVar;
        iVar.setCanceledOnTouchOutside(true);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.cpa, null);
        this.f165314c = inflate;
        if (inflate == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLandingPageBottomSheet", "mRootView init fail!");
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.c8x);
        android.view.View x17 = a2Var.x();
        if (x17.getParent() != null) {
            ((android.view.ViewGroup) x17.getParent()).removeView(x17);
        }
        int i17 = (int) a2Var.p().f2823m;
        int i18 = (int) a2Var.p().f2824n;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSpecifiedLayoutSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        boolean z19 = (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSpecifiedLayoutSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        if (z19) {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        linearLayout.addView(x17, layoutParams);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.avh)).setText(str2);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.bz9);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e2(this));
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f483442av4);
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.f2(this));
        if (!z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.oaf);
        imageView.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return;
        }
        android.graphics.Bitmap h17 = za4.t0.h(str3);
        if (h17 == null) {
            za4.t0.c(str3, false, 0, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.g2(this, imageView));
        } else {
            imageView.setImageBitmap(h17);
            imageView.setVisibility(0);
        }
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        y9.i iVar = this.f165313b;
        if (iVar != null) {
            iVar.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
    }
}
