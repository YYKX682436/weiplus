package o54;

/* loaded from: classes4.dex */
public final class i implements p64.a {

    /* renamed from: d, reason: collision with root package name */
    public static final o54.i f343152d = new o54.i();

    @Override // p64.a
    public final void onCallbackFromServer(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
        if (bundle != null) {
            try {
                parcelable = bundle.getParcelable("obj");
            } catch (java.lang.Throwable th6) {
                o54.k.f343153a.a();
                com.tencent.mars.xlog.Log.printErrStackTrace("AdToolsIPCProxy", th6, "call with error", new java.lang.Object[0]);
            }
            if (parcelable != null) {
                java.lang.String name = parcelable.getClass().getName();
                o54.j jVar = o54.k.f343153a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
                java.util.Map map = o54.k.f343154b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
                yz5.l lVar = (yz5.l) ((java.util.LinkedHashMap) map).get(name);
                if (lVar == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
                    return;
                }
                lVar.invoke(parcelable);
                o54.k.f343153a.a();
                com.tencent.mars.xlog.Log.i("AdToolsIPCProxy", "clientCall() call success~");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
    }
}
