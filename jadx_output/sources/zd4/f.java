package zd4;

/* loaded from: classes11.dex */
public class f implements android.widget.ExpandableListView.OnChildClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI f471630a;

    public f(com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        this.f471630a = baseSelectVisibleRangeUI;
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, int i18, long j17) {
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$3");
        com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = this.f471630a;
        int n17 = baseSelectVisibleRangeUI.f170684r.n(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "ExpandableListView click groupPosition:%d, childPosition:%d, visibleState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(n17));
        if (baseSelectVisibleRangeUI.f170684r.a(n17, i18, com.tencent.mm.plugin.sns.ui.xk.f171530x)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI.f170688v = n17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI.g7();
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct = s0Var.f164959l;
            if (timelineGroupUserBehaviorStruct != null) {
                int i27 = timelineGroupUserBehaviorStruct.f61252s;
                if (i27 <= 0) {
                    timelineGroupUserBehaviorStruct.f61252s = 1;
                } else {
                    timelineGroupUserBehaviorStruct.f61252s = i27 + 1;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("increaseFromContactClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else if (baseSelectVisibleRangeUI.f170684r.a(n17, i18, com.tencent.mm.plugin.sns.ui.xk.f171529w)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI.f170688v = n17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            baseSelectVisibleRangeUI.h7();
            com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            com.tencent.mm.autogen.mmdata.rpt.TimelineGroupUserBehaviorStruct timelineGroupUserBehaviorStruct2 = s0Var2.f164959l;
            if (timelineGroupUserBehaviorStruct2 != null) {
                int i28 = timelineGroupUserBehaviorStruct2.f61248o;
                if (i28 <= 0) {
                    timelineGroupUserBehaviorStruct2.f61248o = 1;
                } else {
                    timelineGroupUserBehaviorStruct2.f61248o = i28 + 1;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("increaseFromChatroomClick", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else if (baseSelectVisibleRangeUI.f170681o && baseSelectVisibleRangeUI.f170684r.a(n17, i18, com.tencent.mm.plugin.sns.ui.xk.f171531y)) {
            com.tencent.mm.plugin.sns.ui.xk xkVar = baseSelectVisibleRangeUI.f170683q;
            boolean z17 = !xkVar.f171534e;
            xkVar.f171534e = z17;
            if (z17) {
                xkVar.d();
                baseSelectVisibleRangeUI.f170683q.f171544o.clear();
            }
            baseSelectVisibleRangeUI.enableOptionMenu(baseSelectVisibleRangeUI.j7());
            baseSelectVisibleRangeUI.f170683q.notifyDataSetChanged();
        } else {
            com.tencent.mm.plugin.sns.ui.xk xkVar2 = baseSelectVisibleRangeUI.f170683q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            if (baseSelectVisibleRangeUI.f170681o) {
                i19 = com.tencent.mm.plugin.sns.ui.xk.f171531y + 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            } else {
                i19 = com.tencent.mm.plugin.sns.ui.xk.f171530x + 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getChildExtraIndexCount", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
            }
            java.lang.String str = (java.lang.String) xkVar2.getChild(i17, i18 - i19);
            com.tencent.mm.plugin.sns.ui.xk xkVar3 = baseSelectVisibleRangeUI.f170683q;
            xkVar3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            if (xkVar3.g() != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(xkVar3.g());
                if (!xkVar3.i(arrayList, str)) {
                    if (arrayList.size() == 5) {
                        arrayList.remove(4);
                        arrayList.add(0, str);
                    } else {
                        arrayList.add(0, str);
                    }
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
                    gm0.j1.i();
                    gm0.j1.u().c().w(335875, c17);
                }
            } else {
                gm0.j1.i();
                gm0.j1.u().c().w(335875, str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addNewTopFive", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
            if (baseSelectVisibleRangeUI.f170684r.b(i17, 2)) {
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.V6(baseSelectVisibleRangeUI, 1, baseSelectVisibleRangeUI.f170683q.f171543n, str, view);
            } else if (baseSelectVisibleRangeUI.f170684r.b(i17, 3)) {
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.V6(baseSelectVisibleRangeUI, 2, baseSelectVisibleRangeUI.f170683q.f171544o, str, view);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChildClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$3");
        return true;
    }
}
