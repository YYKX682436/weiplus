package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class pk implements android.widget.ExpandableListView.OnGroupClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLabelUI f170246a;

    public pk(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        this.f170246a = snsLabelUI;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public boolean onGroupClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
        boolean a17 = com.tencent.mm.plugin.sns.model.j4.a();
        com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI = this.f170246a;
        if (a17 && snsLabelUI.getIntent().getBooleanExtra("Kis_with_together", false) && i17 == 1) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(snsLabelUI);
            u1Var.g(snsLabelUI.getString(com.tencent.mm.R.string.jhr));
            u1Var.m(com.tencent.mm.R.string.f490454vi);
            u1Var.q(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
            return false;
        }
        int i18 = com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4360h;
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.U(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "user click [previousGroup: %d    onGroupClick:%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (i17 <= 1) {
            if (i18 > 1) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).c(i18);
            }
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4360h = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
            return false;
        }
        if (com.tencent.mm.plugin.sns.ui.SnsLabelUI.X6(snsLabelUI) != null && com.tencent.mm.plugin.sns.ui.SnsLabelUI.X6(snsLabelUI).size() != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            int d76 = snsLabelUI.d7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            if (d76 == 0) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.Z6(snsLabelUI, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                db5.e1.y(snsLabelUI, snsLabelUI.getString(com.tencent.mm.R.string.f493220jc5), null, snsLabelUI.getString(com.tencent.mm.R.string.f493219jc4), new com.tencent.mm.plugin.sns.ui.tk(snsLabelUI));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        boolean z17 = snsLabelUI.f167230r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI.f167228p = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.Z6(snsLabelUI, i17);
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(snsLabelUI, null, snsLabelUI.getString(com.tencent.mm.R.string.jbl), false, false, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            snsLabelUI.f167232t = Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
            return true;
        }
        if (i18 != i17) {
            if (i18 == 2) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).collapseGroup(2);
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4363k.clear();
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4365m.clear();
            } else if (i18 == 3) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).collapseGroup(3);
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4364l.clear();
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4366n.clear();
            }
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).post(new com.tencent.mm.plugin.sns.ui.ok(this, i17));
        } else if (com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).isGroupExpanded(i17)) {
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).c(i17);
        } else {
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.a7(snsLabelUI).d(i17);
        }
        com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4360h = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$2");
        return true;
    }
}
