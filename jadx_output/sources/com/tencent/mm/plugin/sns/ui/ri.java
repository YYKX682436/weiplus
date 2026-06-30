package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ri implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f170422d;

    public ri(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        this.f170422d = snsHeader;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsHeader$11");
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f170422d;
        if (com.tencent.mm.plugin.sns.ui.SnsHeader.b(snsHeader).k()) {
            com.tencent.mm.plugin.sns.ui.SnsHeader.b(snsHeader).h();
            snsHeader.f167165d.f168192i.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsHeader$11");
    }
}
