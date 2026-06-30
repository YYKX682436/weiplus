package rd4;

/* loaded from: classes4.dex */
public final class b implements n55.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rd4.d f394248b;

    public b(java.lang.String str, rd4.d dVar) {
        this.f394247a = str;
        this.f394248b = dVar;
    }

    @Override // n55.e
    public void a(o55.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1$1");
        rd4.d dVar = this.f394248b;
        java.lang.String workTagId = this.f394247a;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "result is null, workTagId: " + workTagId);
            com.tencent.mm.plugin.sns.ui.o9 f17 = rd4.d.f(dVar);
            if (f17 != null) {
                kotlin.jvm.internal.o.f(workTagId, "$workTagId");
                f17.d(3, null, workTagId);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "result is find " + workTagId);
            com.tencent.mm.plugin.sns.ui.o9 f18 = rd4.d.f(dVar);
            if (f18 != null) {
                kotlin.jvm.internal.o.f(workTagId, "$workTagId");
                f18.d(1, aVar, workTagId);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1$1");
    }
}
