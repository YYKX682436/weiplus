package e64;

/* loaded from: classes7.dex */
public final class n extends lc3.p {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f249835i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f249836m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String instanceName) {
        super(instanceName);
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        g();
        this.f249835i = "mbpkgs/MagicAdLandPage.wspkg";
        g();
        this.f249836m = "sns/mb/MagicAdLandPage.wspkg";
    }

    @Override // jc3.x
    public java.lang.String g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("provideAppId", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("provideAppId", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return "MagicAdLandPage";
    }

    @Override // lc3.o
    public boolean i() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableCheckRemoteBoots", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        java.util.Map map = e64.p.f249838a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUseLocalWsPkg", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDebuggable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) e64.p.f249840c).getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDebuggable", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        if (booleanValue) {
            z17 = com.tencent.mm.vfs.w6.j(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi() + ".localwspkg");
        } else {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUseLocalWsPkg", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager");
        boolean z18 = !z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableCheckRemoteBoots", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return z18;
    }

    @Override // lc3.o
    public lc3.a k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseEmbedPkgConfig", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        lc3.a aVar = new lc3.a(this.f249836m, 1L, "5bfc9eac99e00cae6224d1a2f7910c33", 0L, 8, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseEmbedPkgConfig", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return aVar;
    }

    @Override // lc3.o
    public lc3.c n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDebugConfig", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        lc3.c cVar = new lc3.c(this.f249835i, lc3.b.f317882d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDebugConfig", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return cVar;
    }

    @Override // lc3.o
    public java.lang.String s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainScriptPath", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainScriptPath", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdPkgManager");
        return "/index.js";
    }
}
