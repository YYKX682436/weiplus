package na4;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final na4.g f335989a = new na4.g();

    /* renamed from: b, reason: collision with root package name */
    public static na4.a f335990b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f335991c = -1;

    public final na4.a a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(null);
        int i18 = a17.f197135a;
        int i19 = (i18 * 16) / 9;
        if (i17 == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNavigationBarHeightValue", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            f335991c = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNavigationBarHeightValue", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            int i27 = f335991c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            i17 = i27;
        }
        f335991c = i17;
        int h17 = com.tencent.mm.ui.bl.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int e17 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.f479623ay);
        int i28 = i17 + h17 + e17 + i19;
        int i29 = a17.f197136b;
        na4.a cVar = i29 >= i28 ? new na4.c() : i29 > i19 + i17 ? new na4.d(true) : i29 > i19 ? new na4.e(true, true) : i29 == i19 ? new na4.b(true, true) : i29 < i19 ? new na4.f(true, true) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateResolutionRadioConfig: config:");
        sb6.append(cVar != null ? cVar.getClass().getCanonicalName() : null);
        sb6.append(", shortSide:");
        sb6.append(i18);
        sb6.append(", longSide:");
        sb6.append(i29);
        sb6.append(", bottomHeight:");
        sb6.append(i17);
        sb6.append(", statusBarHeight:");
        sb6.append(h17);
        sb6.append(", actionbarHeight:");
        sb6.append(e17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsResolutionRadioConfigManager", sb6.toString());
        kotlin.jvm.internal.o.d(cVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
        return cVar;
    }
}
