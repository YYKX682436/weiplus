package wd4;

/* loaded from: classes4.dex */
public final class p0 implements kd0.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f444998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f445000c;

    public p0(wd4.l1 l1Var, android.view.View view, java.util.ArrayList arrayList) {
        this.f444998a = l1Var;
        this.f444999b = view;
        this.f445000c = arrayList;
    }

    @Override // kd0.n2
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$fetchCodeInfo$1");
        wd4.l1 l1Var = this.f444998a;
        if (l1Var.d().i()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            l1Var.f444956e = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            wd4.r0.a(l1Var, this.f444999b, this.f445000c);
            l1Var.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$fetchCodeInfo$1");
    }
}
