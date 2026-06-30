package qd4;

/* loaded from: classes15.dex */
public class f implements android.widget.ExpandableListView.OnGroupClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI f361865a;

    public f(com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI) {
        this.f361865a = jsapiSnsLabelUI;
    }

    @Override // android.widget.ExpandableListView.OnGroupClickListener
    public boolean onGroupClick(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI jsapiSnsLabelUI = this.f361865a;
        int i18 = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361895p;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: %d    onGroupClick:%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        if (!com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Z6(jsapiSnsLabelUI, i17).equals("visible") && !com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Z6(jsapiSnsLabelUI, i17).equals("invisible")) {
            if (i18 >= 0 && (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Z6(jsapiSnsLabelUI, i18).equals("visible") || com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Z6(jsapiSnsLabelUI, i18).equals("invisible"))) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).c(i18);
            }
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361895p = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
            return false;
        }
        if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.a7(jsapiSnsLabelUI) != null && com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.a7(jsapiSnsLabelUI).size() != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            int h76 = jsapiSnsLabelUI.h7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            if (h76 == 0) {
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.c7(jsapiSnsLabelUI, i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                db5.e1.y(jsapiSnsLabelUI, jsapiSnsLabelUI.getString(com.tencent.mm.R.string.f493220jc5), null, jsapiSnsLabelUI.getString(com.tencent.mm.R.string.f493219jc4), new qd4.j(jsapiSnsLabelUI));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTransformDialog", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: need transform]");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        boolean z17 = jsapiSnsLabelUI.f169553t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI.f169551r = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.c7(jsapiSnsLabelUI, i17);
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(jsapiSnsLabelUI, null, jsapiSnsLabelUI.getString(com.tencent.mm.R.string.jbl), false, false, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            jsapiSnsLabelUI.f169555v = Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: isGettingTagInfo]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
            return true;
        }
        qd4.r T6 = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI);
        T6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        java.util.ArrayList arrayList = T6.f361891l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
        if (arrayList != null) {
            qd4.r T62 = com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI);
            T62.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            java.util.ArrayList arrayList2 = T62.f361891l;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getmLabelNames", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUIAdapter");
            if (arrayList2.size() != 0) {
                if (i18 != i17) {
                    if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Z6(jsapiSnsLabelUI, i18).equals("visible")) {
                        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).collapseGroup(i18);
                        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361897r.clear();
                        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361899t.clear();
                    } else if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.Z6(jsapiSnsLabelUI, i18).equals("invisible")) {
                        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).collapseGroup(i18);
                        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361898s.clear();
                        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361900u.clear();
                    }
                    com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).post(new qd4.e(this, i17));
                } else if (com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).isGroupExpanded(i17)) {
                    com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).c(i17);
                } else {
                    com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.V6(jsapiSnsLabelUI).d(i17);
                }
                com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.T6(jsapiSnsLabelUI).f361895p = i17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.c7(jsapiSnsLabelUI, i17);
        com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI.U6(jsapiSnsLabelUI);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLabelUI", "dz[previousGroup: gotoSelectContact]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGroupClick", "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$2");
        return true;
    }
}
