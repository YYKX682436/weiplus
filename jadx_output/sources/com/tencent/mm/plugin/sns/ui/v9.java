package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class v9 extends com.tencent.mm.plugin.sns.ui.widget.l {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.pa f170624o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(com.tencent.mm.plugin.sns.ui.pa paVar, java.lang.String str, androidx.lifecycle.y yVar, android.view.View view) {
        super(str, yVar, view);
        this.f170624o = paVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        java.lang.String str = "bindComponentModel";
        java.lang.String str2 = "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "bindComponentDataOnExposeFirst() called with: snsInfo = [" + snsInfo + "]");
        if (snsInfo != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.tencent.mm.plugin.sns.ui.pa paVar = this.f170624o;
            paVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindSellingPointData", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.tencent.mm.plugin.sns.storage.y0 y0Var = snsInfo.getAdXml().adSellingPointInfo;
            android.view.View view = paVar.f170198p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = paVar.f170199q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = paVar.f170199q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "bindSellingPointData", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view4 = paVar.f170199q;
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view4.findViewById(com.tencent.mm.R.id.f482470fe);
            roundedCornerFrameLayout.setRadius(i65.a.b(paVar.f170190e, 4));
            android.widget.ImageView imageView = (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.f482469fd);
            android.widget.TextView textView = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.f482503gb);
            android.widget.TextView textView2 = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.f482464f8);
            android.widget.Button button = (android.widget.Button) view4.findViewById(com.tencent.mm.R.id.f482445es);
            button.setVisibility(4);
            button.setEnabled(false);
            android.widget.Button button2 = paVar.f170196n;
            if (button2 != null && button2.getText() != null) {
                button.setText(paVar.f170196n.getText());
            }
            paVar.t(y0Var.f166175a, y0Var.f166176b, textView, textView2);
            if (android.text.TextUtils.isEmpty(y0Var.f166177c)) {
                roundedCornerFrameLayout.setVisibility(8);
            } else {
                roundedCornerFrameLayout.setVisibility(0);
                a84.z.c(y0Var.f166177c, imageView);
            }
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(paVar);
            java.lang.String snsId = snsInfo.getSnsId();
            if (paVar.f170205w == null) {
                com.tencent.mm.plugin.sns.ui.na naVar = new com.tencent.mm.plugin.sns.ui.na(weakReference, snsId);
                paVar.f170205w = naVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                naVar.f169985a.start();
            } else {
                com.tencent.mm.plugin.sns.ui.na naVar2 = new com.tencent.mm.plugin.sns.ui.na(weakReference, snsId);
                paVar.f170205w = naVar2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
                naVar2.f169985a.start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindSellingPointData", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
            str = "bindComponentModel";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean n(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        com.tencent.mm.plugin.sns.ui.pa paVar = this.f170624o;
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = paVar.f170208z;
        boolean z17 = false;
        boolean O = v0Var != null ? v0Var.O(snsInfo) : false;
        if (com.tencent.mm.plugin.sns.ui.pa.w(snsInfo, com.tencent.mm.plugin.sns.ui.pa.d(paVar)) && !O) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isComponentExist", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public boolean o(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        if (snsInfo == null || snsInfo2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
            z17 = false;
        } else {
            z17 = com.tencent.mm.sdk.platformtools.t8.m(snsInfo.getSnsId(), snsInfo2.getSnsId());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSameContent", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdCardActionBtnCtrl." + j(), "resetComponentState() called");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.ui.pa paVar = this.f170624o;
        paVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetSellingPointView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.ui.na naVar = paVar.f170205w;
        if (naVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$SellingPointAnim");
            naVar.f169985a.cancel();
            paVar.f170205w = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        paVar.f170207y = 0;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = paVar.f170201s;
        long j17 = snsInfo != null ? snsInfo.field_snsId : 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        int i17 = paVar.f170189d == 0 ? 1 : 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.ui.oa.b(i17, j17, paVar.f170207y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetChangeCount", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        paVar.r(1.0f);
        paVar.s(0.0f);
        android.view.View view = paVar.f170199q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "resetSellingPointView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdCardActionBtnCtrl", "resetSellingPointView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSellingPointView", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.SnsAdCardActionBtnCtrl$4");
    }
}
