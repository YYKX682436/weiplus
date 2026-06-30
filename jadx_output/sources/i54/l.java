package i54;

/* loaded from: classes4.dex */
public final class l implements eb4.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h54.d f288814d;

    public l(h54.d dVar) {
        this.f288814d = dVar;
    }

    @Override // eb4.k
    public final void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenWheelPicker$doAction$1");
        java.util.Map a17 = h54.i.f279096a.a(map);
        if (str2 == null) {
            str2 = "";
        }
        this.f288814d.a(str2, a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenWheelPicker$doAction$1");
    }
}
