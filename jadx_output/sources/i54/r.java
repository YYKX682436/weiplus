package i54;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h54.d f288817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(h54.d dVar) {
        super(2);
        this.f288817d = dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber$doAction$1");
        ((java.lang.Boolean) obj).booleanValue();
        java.util.Map v17 = (java.util.Map) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber$doAction$1");
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object obj3 = v17.get("err_msg");
        if (obj3 == null || (str = obj3.toString()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toMapWithoutNullValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (v17.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toMapWithoutNullValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        } else {
            for (java.util.Map.Entry entry : v17.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.Object value = entry.getValue();
                if ((str2.length() > 0) && value != null) {
                    linkedHashMap.put(str2, value);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toMapWithoutNullValue", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.MapUtil");
        }
        this.f288817d.a(str, linkedHashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber$doAction$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiRequestPhoneNumber$doAction$1");
        return f0Var;
    }
}
