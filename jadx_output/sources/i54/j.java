package i54;

/* loaded from: classes4.dex */
public final class j implements eb4.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h54.d f288813d;

    public j(h54.d dVar) {
        this.f288813d = dVar;
    }

    @Override // eb4.k
    public final void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenFinderProfile$doAction$2");
        java.util.Map a17 = h54.i.f279096a.a(map);
        com.tencent.mars.xlog.Log.i("SnsAdForm.OpenFinderProfile", "the open finder profile callback, " + a17 + "!!");
        if (str2 == null) {
            str2 = "";
        }
        this.f288813d.a(str2, a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiOpenFinderProfile$doAction$2");
    }
}
