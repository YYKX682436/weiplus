package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f169484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f169486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI f169487g;

    public j8(com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI settingSnsBackgroundUI, int i17, int i18, android.content.Intent intent) {
        this.f169487g = settingSnsBackgroundUI;
        this.f169484d = i17;
        this.f169485e = i18;
        this.f169486f = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$3");
        int i17 = com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI.f166622h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        this.f169487g.W6(this.f169484d, this.f169485e, this.f169486f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$3");
    }
}
