package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class qk implements android.widget.ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLabelUI f170346a;

    public qk(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        this.f170346a = snsLabelUI;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, int i18, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "ExpandableListView click groupPosition:%d ,childPosition:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = ae4.a.f4352u;
        com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI = this.f170346a;
        if (i18 == i19) {
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.Z6(snsLabelUI, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("titile", snsLabelUI.getString(com.tencent.mm.R.string.f489934fx));
            intent.putExtra("snsPostWhoCanSee", true);
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206781b));
            int i27 = snsLabelUI.f167231s;
            if (i27 == 2) {
                if (snsLabelUI.f167225m.f4365m.size() > 0) {
                    intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4365m, ","));
                }
            } else if (i27 == 3 && snsLabelUI.f167225m.f4366n.size() > 0) {
                intent.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4366n, ","));
            }
            intent.putExtra("KBlockOpenImFav", true);
            intent.putExtra("without_openim", true);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", snsLabelUI.f167236x);
            j45.l.v(snsLabelUI, ".ui.contact.SelectContactUI", intent, com.google.android.gms.wearable.WearableStatusCodes.DATA_ITEM_TOO_LARGE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoSelectContact", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        } else if (i18 == ae4.a.f4351t) {
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.Z6(snsLabelUI, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoSelectGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "goto select group");
            android.content.Intent intent2 = new android.content.Intent(snsLabelUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsSelectChatRoomUI.class);
            intent2.putExtra("titile", snsLabelUI.getString(com.tencent.mm.R.string.jbi));
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", snsLabelUI.f167236x);
            int i28 = snsLabelUI.f167231s;
            if (i28 == 2) {
                if (snsLabelUI.f167225m.f4367o.size() > 0) {
                    intent2.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4367o, ","));
                }
            } else if (i28 == 3 && snsLabelUI.f167225m.f4368p.size() > 0) {
                intent2.putExtra("already_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4368p, ","));
            }
            intent2.putExtra("KBlockOpenImFav", true);
            snsLabelUI.startActivityForResult(intent2, com.google.android.gms.wearable.WearableStatusCodes.INVALID_TARGET_NODE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoSelectGroup", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        } else {
            java.lang.String str = (java.lang.String) com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).getChild(i17, i18 - ae4.a.f4353v);
            com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).d(str);
            if (i17 == 2) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.U6(snsLabelUI, 1, com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4363k, str, view);
            } else if (i17 == 3) {
                com.tencent.mm.plugin.sns.ui.SnsLabelUI.U6(snsLabelUI, 2, com.tencent.mm.plugin.sns.ui.SnsLabelUI.T6(snsLabelUI).f4364l, str, view);
            }
        }
        if (i18 == ae4.a.f4352u) {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = s0Var.f164959l;
            if (timelineGroupUserBehaviorStruct != null) {
                int i29 = timelineGroupUserBehaviorStruct.f61252s;
                if (i29 <= 0) {
                    timelineGroupUserBehaviorStruct.f61252s = 1;
                } else {
                    timelineGroupUserBehaviorStruct.f61252s = i29 + 1;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else if (i18 == ae4.a.f4351t) {
            com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = s0Var2.f164959l;
            if (timelineGroupUserBehaviorStruct2 != null) {
                int i37 = timelineGroupUserBehaviorStruct2.f61248o;
                if (i37 <= 0) {
                    timelineGroupUserBehaviorStruct2.f61248o = 1;
                } else {
                    timelineGroupUserBehaviorStruct2.f61248o = i37 + 1;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$3");
        return true;
    }
}
