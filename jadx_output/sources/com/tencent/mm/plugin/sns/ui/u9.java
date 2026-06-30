package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class u9 extends com.tencent.mm.plugin.sns.ui.widget.l {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa f170569o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(com.tencent.mm.plugin.sns.ui.pa paVar, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view) {
        super(str, yVar, view);
        this.f170569o = paVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        if (snsInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + snsInfo + "]");
            com.tencent.mm.plugin.sns.ui.pa paVar = this.f170569o;
            android.view.View g17 = com.tencent.mm.plugin.sns.ui.pa.g(paVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$3", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(g17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$3", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View h17 = com.tencent.mm.plugin.sns.ui.pa.h(paVar);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(h17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$3", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$3", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.pa.j(paVar, (android.widget.Button) com.tencent.mm.plugin.sns.ui.pa.h(paVar).findViewById(com.tencent.mm.R.id.f482445es));
            if (com.tencent.mm.plugin.sns.ui.pa.k(paVar) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                paVar.f170204v.n(com.tencent.mm.plugin.sns.ui.pa.k(paVar).clickActionInfo, com.tencent.mm.plugin.sns.ui.pa.l(paVar));
                java.lang.System.currentTimeMillis();
                java.lang.String str = snsInfo.getAdXml().adCardTitle;
                java.lang.String str2 = snsInfo.getAdXml().adCardDesc;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                paVar.t(str, str2, paVar.f170194i, paVar.f170195m);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                com.tencent.mm.plugin.sns.ui.pa.j(paVar, (android.widget.Button) com.tencent.mm.plugin.sns.ui.pa.h(paVar).findViewById(com.tencent.mm.R.id.f482445es));
                com.tencent.mm.plugin.sns.ui.pa.c(paVar, snsInfo);
                boolean isEmpty = android.text.TextUtils.isEmpty(com.tencent.mm.plugin.sns.ui.pa.k(paVar).iconUrl);
                com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = paVar.f170192g;
                if (isEmpty || ca4.m0.Z(com.tencent.mm.plugin.sns.ui.pa.d(paVar))) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    roundedCornerFrameLayout.setVisibility(8);
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    roundedCornerFrameLayout.setVisibility(0);
                    java.lang.String str3 = com.tencent.mm.plugin.sns.ui.pa.k(paVar).iconUrl;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    a84.z.c(str3, paVar.f170193h);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        boolean z17 = com.tencent.mm.plugin.sns.ui.pa.k(this.f170569o) != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        if (snsInfo == null || snsInfo2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
            z17 = false;
        } else {
            z17 = com.tencent.mm.sdk.platformtools.t8.m(snsInfo.getSnsId(), snsInfo2.getSnsId());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void s(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "onResume called with: snsInfo = [" + snsInfo + "]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        this.f170569o.y(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "resetComponentState() called");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f170569o.f170192g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        roundedCornerFrameLayout.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$3");
    }
}
