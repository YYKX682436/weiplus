package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f165115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 f165118g;

    public c1(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0 v0Var, com.tencent.mm.ui.widget.dialog.z2 z2Var, java.lang.String str, java.lang.String str2) {
        this.f165118g = v0Var;
        this.f165115d = z2Var;
        this.f165116e = str;
        this.f165117f = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$17");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f165115d.B();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", "0");
        hashMap.put("err_msg", "ok");
        hashMap.put("phoneNumber", this.f165116e);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v0.U(this.f165118g, this.f165117f, "ok", hashMap);
        com.tencent.mars.xlog.Log.i("AdLandingNewH5Comp", "handleBindPhoneNumber, ok");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingNewH5Comp$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$17");
    }
}
