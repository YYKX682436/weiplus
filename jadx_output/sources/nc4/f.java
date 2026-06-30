package nc4;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final nc4.f f336144d = new nc4.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_clip_page_finder_promotion_entrance, "", true);
        nc4.i iVar = new nc4.i(0, 0, 0, 0, 15, null);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                int i17 = jSONObject.getInt("enable");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                iVar.f336154a = i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                int i18 = jSONObject.getInt("max_count_no_user");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderEntranceMaxCountNoUser", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                iVar.f336155b = i18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderEntranceMaxCountNoUser", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                int i19 = jSONObject.getInt("max_count_no_feed");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderEntranceMaxCountNoFeed", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                iVar.f336156c = i19;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderEntranceMaxCountNoFeed", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                int i27 = jSONObject.getInt("max_count_normal");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderEntranceMaxCountNormal", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                iVar.f336157d = i27;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderEntranceMaxCountNormal", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Improve.ToolBarUIC", "parse SnsFinderEntranceConfig fail. %s", e17.getMessage());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
        return iVar;
    }
}
