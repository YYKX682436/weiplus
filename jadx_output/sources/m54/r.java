package m54;

/* loaded from: classes.dex */
public final class r implements za4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f324304a;

    public r(yz5.p pVar) {
        this.f324304a = pVar;
    }

    @Override // za4.r1
    public final int a(boolean z17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$4");
        yz5.p pVar = this.f324304a;
        if (pVar != null) {
            pVar.invoke(1, java.lang.Boolean.valueOf(z17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageResPreloader$preloadVangogh$4");
        return 0;
    }
}
