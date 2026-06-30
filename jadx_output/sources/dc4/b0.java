package dc4;

/* loaded from: classes4.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s34.r0 f228718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f228720f;

    public b0(dc4.d0 d0Var, s34.r0 r0Var, java.lang.String str) {
        this.f228720f = d0Var;
        this.f228718d = r0Var;
        this.f228719e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dc4.d0 d0Var = this.f228720f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$6");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            android.content.Context context = d0Var.f228726p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            int b17 = i65.a.b(context, 60);
            int height = d0Var.f228833f.getHeight() - d0Var.B.getHeight();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            android.content.Context context2 = d0Var.f228726p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            int b18 = height + i65.a.b(context2, 8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = d0Var.Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            finderLivingAnimWrapper.d(this.f228718d, this.f228719e, b17, b18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper2 = d0Var.Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            finderLivingAnimWrapper2.setVisibility(0);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$6");
    }
}
