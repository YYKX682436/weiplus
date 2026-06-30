package e64;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e64.h f249824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e64.h hVar) {
        super(0);
        this.f249824d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$destroy$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$destroy$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVConsoleInspectorContainer$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        e64.h hVar = this.f249824d;
        android.widget.FrameLayout frameLayout = hVar.f249827y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVConsoleInspectorContainer$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        if (frameLayout != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVConsoleInspector$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            bf3.p pVar = hVar.f249826x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVConsoleInspector$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            if (pVar != null) {
                pVar.c(frameLayout);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setVConsoleInspectorContainer$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
            hVar.f249827y = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setVConsoleInspectorContainer$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVConsoleInspector$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        bf3.p pVar2 = hVar.f249826x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVConsoleInspector$p", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz");
        if (pVar2 != null) {
            pVar2.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$destroy$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSclSnsAdBiz$destroy$1");
        return f0Var;
    }
}
