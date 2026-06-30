package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes3.dex */
public final class k implements com.tencent.mm.plugin.sns.ui.widget.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.l f171178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f171179b;

    public k(com.tencent.mm.plugin.sns.ui.widget.l lVar, kotlinx.coroutines.q qVar) {
        this.f171178a = lVar;
        this.f171179b = qVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.f
    public final void a(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$waitForPreDraw$2$1");
        try {
            com.tencent.mars.xlog.Log.i(this.f171178a.j(), "waitForPreDraw end!");
            kotlinx.coroutines.q qVar = this.f171179b;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        } catch (java.lang.IllegalStateException unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$waitForPreDraw$2$1");
    }
}
