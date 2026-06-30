package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f170715d;

    public vu(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f170715d = snsUserUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$14");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUserUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f170715d;
        snsUserUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSnsDatePicker", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "showSnsDatePicker: ");
        ca4.r0 r0Var = snsUserUI.H;
        if (r0Var == null || com.tencent.mm.sdk.platformtools.t8.L0(r0Var.f40009a) || com.tencent.mm.sdk.platformtools.t8.L0(snsUserUI.H.f40010b)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnsUserUI", "mDateInfo == null or displayYears == null or displayMonths == null, don't do anything");
        } else {
            snsUserUI.f167597f.j();
            ca4.r0 r0Var2 = snsUserUI.H;
            com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(snsUserUI, r0Var2.f40009a, r0Var2.f40010b);
            c0Var.g(android.view.View.inflate(snsUserUI.getContext(), com.tencent.mm.R.layout.f489532cv2, null));
            int indexOf = snsUserUI.H.f40009a.indexOf(java.lang.String.valueOf(snsUserUI.C));
            int indexOf2 = (indexOf < 0 || indexOf >= snsUserUI.H.f40010b.size() || snsUserUI.H.f40010b.get(indexOf) == null) ? -1 : ((java.util.List) snsUserUI.H.f40010b.get(indexOf)).indexOf(java.lang.String.valueOf(snsUserUI.D));
            if (indexOf != -1 && indexOf2 != -1) {
                c0Var.j(indexOf, indexOf2);
            } else if (indexOf != -1) {
                c0Var.i(indexOf);
            } else if (indexOf2 != -1) {
                c0Var.j(0, indexOf2);
            }
            c0Var.f212259t = new com.tencent.mm.plugin.sns.ui.wu(snsUserUI, c0Var);
            c0Var.l();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSnsDatePicker", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI) != null) {
            com.tencent.mm.plugin.sns.ui.SnsUIAction e76 = com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI);
            e76.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onIsLoading", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.plugin.sns.ui.LoadingMoreView loadingMoreView = e76.f167491o;
            loadingMoreView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
            loadingMoreView.f166326f.setVisibility(0);
            loadingMoreView.f166327g.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoading", "com.tencent.mm.plugin.sns.ui.LoadingMoreView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onIsLoading", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsUserUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$14");
    }
}
