package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class a6 implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.b6 f167725a;

    public a6(com.tencent.mm.plugin.sns.ui.b6 b6Var) {
        this.f167725a = b6Var;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget$initThumbData$1");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.b6.o(this.f167725a, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.MusicTingCategoryWidget$initThumbData$1");
    }
}
