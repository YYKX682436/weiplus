package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vl implements db5.b6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f170695a;

    public vl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f170695a = snsMsgUI;
    }

    @Override // db5.b6
    public int a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewPosition", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$5");
        int positionForView = this.f170695a.f167267d.getPositionForView(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewPosition", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$5");
        return positionForView;
    }
}
