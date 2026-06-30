package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class il implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f168620d;

    public il(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f168620d = snsMsgUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$11");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f168620d;
        if (i17 < snsMsgUI.f167267d.getHeaderViewsCount()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsMsgUI", "on header view long click, ignore");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$11");
            return true;
        }
        rl5.r rVar = new rl5.r(snsMsgUI);
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI2 = this.f168620d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        db5.t4 t4Var = snsMsgUI2.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        rVar.g(view, i17, j17, snsMsgUI2, t4Var, com.tencent.mm.plugin.sns.ui.SnsMsgUI.U6(snsMsgUI)[0], com.tencent.mm.plugin.sns.ui.SnsMsgUI.U6(snsMsgUI)[1]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$11");
        return true;
    }
}
