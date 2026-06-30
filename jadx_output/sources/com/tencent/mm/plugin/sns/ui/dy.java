package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class dy implements ff0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.fy f168215a;

    public dy(com.tencent.mm.plugin.sns.ui.fy fyVar) {
        this.f168215a = fyVar;
    }

    @Override // ff0.u
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.tencent.mm.plugin.sns.ui.fy fyVar = this.f168215a;
        boolean z18 = fyVar.f168390y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget$2");
            return;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.fy.o(fyVar, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetThumbResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget$2");
    }
}
