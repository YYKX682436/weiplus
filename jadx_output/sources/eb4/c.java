package eb4;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f250882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f250883e;

    public c(com.tencent.mm.ui.widget.dialog.z2 z2Var, yz5.p pVar) {
        this.f250882d = z2Var;
        this.f250883e = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f250882d.B();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", "0");
        hashMap.put("err_msg", "fail not bind phone");
        this.f250883e.invoke(java.lang.Boolean.FALSE, hashMap);
        com.tencent.mars.xlog.Log.i("AdHfRequestNumberDialogHelper", "handleBindPhoneNumber, not bind phone");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$3");
    }
}
