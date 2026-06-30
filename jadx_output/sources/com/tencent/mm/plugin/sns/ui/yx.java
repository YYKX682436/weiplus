package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.zx f171652d;

    public yx(com.tencent.mm.plugin.sns.ui.zx zxVar) {
        this.f171652d = zxVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$3");
        com.tencent.mm.plugin.sns.ui.zx zxVar = this.f171652d;
        int i17 = zxVar.f171722c;
        int i18 = zxVar.f171720a;
        com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getBottom();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$3");
    }
}
