package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class tv implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.uv f170546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ListView f170547e;

    public tv(com.tencent.mm.plugin.sns.ui.uv uvVar, android.widget.ListView listView) {
        this.f170546d = uvVar;
        this.f170547e = listView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$startAutoPlayWithDelay$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldAutoPlayManager", "startAutoPlayWithDelay");
        this.f170546d.a(this.f170547e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsWsFoldAutoPlayManager$startAutoPlayWithDelay$1");
    }
}
