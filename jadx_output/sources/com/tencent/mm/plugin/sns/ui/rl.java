package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class rl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f170425d;

    public rl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f170425d = snsMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = view.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj;
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f170425d;
        if (z17) {
            long j17 = ((com.tencent.mm.plugin.sns.ui.oj) view.getTag()).f170108g.field_snsID;
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
            if (W0 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] info == null, id = " + j17);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] info id = " + j17 + ", info isAd() = " + W0.isAd());
            }
            if (W0 == null || W0.isAd()) {
                str = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2";
                str2 = "onClick";
                int i17 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                com.tencent.mm.plugin.sns.ui.kj kjVar = snsMsgUI.f167271h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                kjVar.d(view, -1, 1);
            } else {
                com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) view.getTag();
                com.tencent.mm.plugin.sns.storage.v1 v1Var = ojVar.f170108g;
                int i18 = com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                java.lang.Boolean f76 = snsMsgUI.f7(v1Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                if (!f76.booleanValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: check access now");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    snsMsgUI.A = view;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    snsMsgUI.q7(v1Var, true, true);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                } else if (com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).w(java.lang.String.valueOf(v1Var.field_snsID))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: forbid access");
                    ojVar.a();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    snsMsgUI.l7(v1Var);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                } else {
                    if (com.tencent.mm.plugin.sns.ui.SnsMsgUI.T6(snsMsgUI).v(java.lang.String.valueOf(v1Var.field_snsID))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: have access");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                        ojVar.f170106e = 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markEnableAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "[imageClickListener] onClick: check access later on browse");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markNeedRequestCheckAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                    ojVar.f170107f = j17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markNeedRequestCheckAccess", "com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    com.tencent.mm.plugin.sns.ui.kj kjVar2 = snsMsgUI.f167271h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
                    str = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2";
                    str2 = "onClick";
                    kjVar2.e(view, -1, 1, null, 0L, true, 2);
                }
                str = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2";
                str2 = "onClick";
            }
        } else {
            str = "com.tencent.mm.plugin.sns.ui.SnsMsgUI$2";
            str2 = "onClick";
            if (view.getTag() instanceof com.tencent.mm.plugin.sns.storage.v1) {
                com.tencent.mm.plugin.sns.ui.SnsMsgUI.b7(snsMsgUI, (com.tencent.mm.plugin.sns.storage.v1) view.getTag());
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.SnsMsgUI", "v.getTag():" + view.getTag());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$2", "android/view/View$OnClickListener", str2, "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str);
    }
}
