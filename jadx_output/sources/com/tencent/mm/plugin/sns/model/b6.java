package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164099f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164100g;

    public b6(com.tencent.mm.plugin.sns.model.d6 d6Var, java.lang.String str, boolean z17, int i17, int i18) {
        this.f164097d = str;
        this.f164098e = z17;
        this.f164099f = i17;
        this.f164100g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$5");
        if (!com.tencent.mm.plugin.sns.model.q3.H(this.f164097d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$5");
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q3(this.f164097d, 0L, this.f164098e, this.f164099f, -1, 1, 64, this.f164100g));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$5");
    }
}
