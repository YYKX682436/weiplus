package z84;

/* loaded from: classes4.dex */
public class b extends androidx.recyclerview.widget.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f470764a;

    public b(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager) {
        this.f470764a = cardLayoutManager;
    }

    @Override // androidx.recyclerview.widget.u2
    public boolean a(int i17, int i18) {
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f470764a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$FlingListener");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            cardLayoutManager.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            if (i17 > 0) {
                cardLayoutManager.f163790q = 2;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                if (i17 < 0) {
                    cardLayoutManager.f163790q = 1;
                }
            }
            if (cardLayoutManager.f163790q != 0) {
                cardLayoutManager.f163788o = true;
            }
            int r17 = cardLayoutManager.r();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            int n17 = cardLayoutManager.n(r17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            z84.c cVar = cardLayoutManager.f163794u;
            if (cVar != null) {
                cVar.d(n17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyActionUp", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollToTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            cardLayoutManager.f163793t.smoothScrollBy(cardLayoutManager.t(n17) - cardLayoutManager.f163780d, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollToTarget", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$FlingListener");
        return true;
    }
}
