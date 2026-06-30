package e64;

@j95.b(dependencies = {com.tencent.mm.plugin.magicbrush.s4.class})
/* loaded from: classes7.dex */
public final class j extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureService");
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        ((com.tencent.mm.plugin.magicbrush.s7) ((com.tencent.mm.plugin.magicbrush.s4) i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class))).bj("MagicAdLandPage", e64.i.f249829a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdFeatureService");
    }
}
