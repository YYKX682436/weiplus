package i54;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h54.d f288829d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(h54.d dVar) {
        super(3);
        this.f288829d = dVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiSetCanAutoFillData$doAction$1");
        java.lang.String str = (java.lang.String) obj2;
        java.util.Map map = (java.util.Map) obj3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiSetCanAutoFillData$doAction$1");
        java.util.Map a17 = h54.i.f279096a.a(map);
        com.tencent.mars.xlog.Log.i("SnsAdForm.SetAutoFill", "the s2 is " + str + ", the v is " + map);
        if (str == null) {
            str = "";
        }
        this.f288829d.a(str, a17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiSetCanAutoFillData$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiSetCanAutoFillData$doAction$1");
        return f0Var;
    }
}
