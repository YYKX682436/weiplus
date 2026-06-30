package m54;

/* loaded from: classes4.dex */
public final class g implements za4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f324267a;

    public g(yz5.p pVar) {
        this.f324267a = pVar;
    }

    @Override // za4.r1
    public final int a(boolean z17, java.lang.String str, java.util.Map map) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$request$1");
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        m54.j jVar = m54.j.f324282a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$optDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("optDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        if (map != null && (obj = map.get("dynamicCanvas")) != null && (obj instanceof java.lang.String)) {
            str2 = (java.lang.String) obj;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("optDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$optDynamicCanvas", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader");
        this.f324267a.invoke(java.lang.Boolean.valueOf(z17), m54.k.a(str2, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLoader$request$1");
        return 0;
    }
}
