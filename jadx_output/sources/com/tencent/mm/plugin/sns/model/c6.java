package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f164125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164127g;

    public c6(com.tencent.mm.plugin.sns.model.d6 d6Var, java.lang.String str, boolean z17, int i17, int i18) {
        this.f164124d = str;
        this.f164125e = z17;
        this.f164126f = i17;
        this.f164127g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$6");
        if (!com.tencent.mm.plugin.sns.model.n3.H(this.f164124d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$6");
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n3(this.f164124d, 0L, this.f164125e, this.f164126f, -1, 2, 64, this.f164127g));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer$6");
    }
}
