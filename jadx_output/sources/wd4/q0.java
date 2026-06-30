package wd4;

/* loaded from: classes4.dex */
public final class q0 implements kd0.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f445004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f445005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f445006c;

    public q0(wd4.l1 l1Var, android.view.View view, java.util.ArrayList arrayList) {
        this.f445004a = l1Var;
        this.f445005b = view;
        this.f445006c = arrayList;
    }

    @Override // kd0.n2
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$fetchCodeInfo$2$1");
        wd4.l1 l1Var = this.f445004a;
        if (l1Var.d().i()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            l1Var.f444956e = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            wd4.r0.a(l1Var, this.f445005b, this.f445006c);
            l1Var.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$fetchCodeInfo$2$1");
    }
}
