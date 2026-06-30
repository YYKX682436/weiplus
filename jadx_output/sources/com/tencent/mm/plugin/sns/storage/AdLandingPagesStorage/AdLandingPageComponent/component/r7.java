package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class r7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 f165466d;

    public r7(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var) {
        this.f165466d = x7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x7 x7Var = this.f165466d;
        x7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        ab4.z m07 = x7Var.m0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(m07.G)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click without streamVideoUrl!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        } else {
            android.content.Context context = x7Var.A;
            if (context instanceof android.app.Activity) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(context, com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.class);
                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "use new stream video play UI");
                intent.putExtra("KFromTimeLine", true);
                intent.putExtra("KMediaId", com.tencent.mm.sdk.platformtools.w2.a(m07.G));
                intent.putExtra("KThumUrl", m07.sightThumbUrl);
                intent.putExtra("KStremVideoUrl", m07.G);
                intent.putExtra("ForceLandscape", true);
                intent.putExtra("ShareBtnHidden", 1);
                intent.putExtra("KComponentCid", x7Var.z());
                android.app.Activity activity = (android.app.Activity) context;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(2004);
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onStreamVideoAreaClick", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                x7Var.H++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click but context not activity!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$8");
    }
}
