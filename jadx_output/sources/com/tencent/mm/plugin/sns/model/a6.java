package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164079g;

    public a6(com.tencent.mm.plugin.sns.model.d6 d6Var, java.lang.String str, boolean z17, int i17, int i18) {
        this.f164076d = str;
        this.f164077e = z17;
        this.f164078f = i17;
        this.f164079g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$4");
        if (!com.tencent.mm.plugin.sns.model.n3.H(this.f164076d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$4");
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n3(this.f164076d, 0L, this.f164077e, this.f164078f, -1, 1, 64, this.f164079g));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$4");
    }
}
