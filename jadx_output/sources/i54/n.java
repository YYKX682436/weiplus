package i54;

/* loaded from: classes4.dex */
public final class n implements eb4.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h54.d f288815d;

    public n(h54.d dVar) {
        this.f288815d = dVar;
    }

    @Override // eb4.k
    public final void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiQueryFinderFollowState$doAction$1");
        java.util.Map a17 = h54.i.f279096a.a(map);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("the ret is ");
        sb6.append(str2 == null ? "" : str2);
        sb6.append(", value is ");
        sb6.append(a17);
        com.tencent.mars.xlog.Log.i("SnsAdForm.QueryFinder", sb6.toString());
        if (str2 == null) {
            str2 = "";
        }
        this.f288815d.a(str2, a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiQueryFinderFollowState$doAction$1");
    }
}
