package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w9 extends com.tencent.mm.plugin.sns.ui.widget.l {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa f170740o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(com.tencent.mm.plugin.sns.ui.pa paVar, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view) {
        super(str, yVar, view);
        this.f170740o = paVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + snsInfo + "]");
        if (snsInfo != null) {
            java.lang.String str = snsInfo.getAdXml().adCardTitle;
            java.lang.String str2 = snsInfo.getAdXml().adCardDesc;
            com.tencent.mm.plugin.sns.ui.pa paVar = this.f170740o;
            android.widget.TextView textView = (android.widget.TextView) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482503gb);
            android.widget.TextView textView2 = (android.widget.TextView) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482464f8);
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482470fe);
            roundedCornerFrameLayout.setRadius(i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 4));
            android.widget.ImageView imageView = (android.widget.ImageView) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482469fd);
            if (snsInfo.getAdXml().adCardActionBtnInfo == null || android.text.TextUtils.isEmpty(snsInfo.getAdXml().adCardActionBtnInfo.iconUrl)) {
                roundedCornerFrameLayout.setVisibility(8);
            } else {
                roundedCornerFrameLayout.setVisibility(0);
                a84.z.c(snsInfo.getAdXml().adCardActionBtnInfo.iconUrl, imageView);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            paVar.t(str, str2, textView, textView2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            if (!android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
                textView.setTextSize(0, a84.d0.b(17));
            } else {
                textView.setTextSize(0, a84.d0.b(15));
            }
            android.view.View g17 = com.tencent.mm.plugin.sns.ui.pa.g(paVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(g17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View h17 = com.tencent.mm.plugin.sns.ui.pa.h(paVar);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(h17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.pa.j(paVar, (android.widget.Button) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482445es));
            com.tencent.mm.plugin.sns.ui.pa.c(paVar, snsInfo);
            com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView snsCardAdTagListView = (com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482446et);
            snsCardAdTagListView.setVisibility(8);
            if (com.tencent.mm.plugin.sns.ui.pa.d(paVar) instanceof android.app.Activity) {
                android.app.Activity activity = (android.app.Activity) com.tencent.mm.plugin.sns.ui.pa.d(paVar);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTagListView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                try {
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsAdCardActionBtnCtrl", e17.toString());
                }
                if (ca4.m0.Z(activity)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTagListView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                } else {
                    snsCardAdTagListView.setActivityContext(activity);
                    if (!((java.util.ArrayList) snsInfo.getAdXml().adCardTagInfo.f166023a).equals(snsCardAdTagListView.getTag())) {
                        snsCardAdTagListView.removeAllViews();
                        if (((java.util.ArrayList) snsInfo.getAdXml().adCardTagInfo.f166023a).size() > 0) {
                            snsCardAdTagListView.setVisibility(0);
                            snsCardAdTagListView.setTagSpace(i65.a.b(activity, 8));
                            snsCardAdTagListView.a(snsInfo.getAdXml().adCardTagInfo.f166023a);
                        }
                        snsCardAdTagListView.setTag(snsInfo.getAdXml().adCardTagInfo.f166023a);
                    } else if (((java.util.ArrayList) snsInfo.getAdXml().adCardTagInfo.f166023a).size() > 0) {
                        snsCardAdTagListView.setVisibility(0);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTagListView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
                }
            }
            if (android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && (snsInfo.getAdXml().adCardActionBtnInfo == null || android.text.TextUtils.isEmpty(snsInfo.getAdXml().adCardActionBtnInfo.iconUrl))) {
                if (snsCardAdTagListView.getVisibility() == 0) {
                    if (snsCardAdTagListView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
                        ((android.view.ViewGroup.MarginLayoutParams) snsCardAdTagListView.getLayoutParams()).topMargin = i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 8);
                        snsCardAdTagListView.requestLayout();
                    }
                } else if (com.tencent.mm.plugin.sns.ui.pa.i(paVar) != null && (com.tencent.mm.plugin.sns.ui.pa.i(paVar).getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                    ((android.view.ViewGroup.MarginLayoutParams) com.tencent.mm.plugin.sns.ui.pa.i(paVar).getLayoutParams()).topMargin = i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 8);
                    com.tencent.mm.plugin.sns.ui.pa.i(paVar).requestLayout();
                }
            }
            android.view.View findViewById = com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.b7k);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "bindComponentModel", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.kmv);
            if (viewGroup != null) {
                viewGroup.setPadding(0, 0, 0, i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 16));
                if ((adInfo != null && adInfo.isWeapp()) || l44.s4.i(snsInfo.getAdXml(), adInfo)) {
                    viewGroup.setPadding(0, 0, 0, i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 12));
                }
                viewGroup.requestLayout();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.tencent.mm.plugin.sns.ui.pa paVar = this.f170740o;
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = paVar.f170208z;
        boolean z17 = false;
        boolean O = v0Var != null ? v0Var.O(snsInfo) : false;
        if (snsInfo == null || snsInfo.getAdXml().adCardActionBtnInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        } else {
            if (snsInfo.getAdXml().adCardActionBtnInfo.singleLineBtn == 1 && !com.tencent.mm.plugin.sns.ui.pa.w(snsInfo, com.tencent.mm.plugin.sns.ui.pa.d(paVar)) && !O) {
                z17 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        if (snsInfo == null || snsInfo2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
            z17 = false;
        } else {
            z17 = com.tencent.mm.sdk.platformtools.t8.m(snsInfo.getSnsId(), snsInfo2.getSnsId());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "resetComponentState() called");
        com.tencent.mm.plugin.sns.ui.pa paVar = this.f170740o;
        com.tencent.mm.plugin.sns.ui.pa.j(paVar, (android.widget.Button) com.tencent.mm.plugin.sns.ui.pa.h(paVar).findViewById(com.tencent.mm.R.id.f482445es));
        android.view.View g17 = com.tencent.mm.plugin.sns.ui.pa.g(paVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        g17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(g17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View h17 = com.tencent.mm.plugin.sns.ui.pa.h(paVar);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(h17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl$5", "resetComponentState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482503gb);
        if (textView != null) {
            textView.setTextSize(0, a84.d0.b(17));
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.pa.e(paVar).findViewById(com.tencent.mm.R.id.kmv);
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 16));
        }
        android.widget.Button button = (android.widget.Button) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482445es);
        com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView snsCardAdTagListView = (com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView) com.tencent.mm.plugin.sns.ui.pa.g(paVar).findViewById(com.tencent.mm.R.id.f482446et);
        if (snsCardAdTagListView != null && (snsCardAdTagListView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) snsCardAdTagListView.getLayoutParams()).topMargin = i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 12);
            snsCardAdTagListView.requestLayout();
        }
        if (button != null && (button.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            ((android.view.ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = i65.a.b(com.tencent.mm.plugin.sns.ui.pa.d(paVar), 12);
            button.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$5");
    }
}
