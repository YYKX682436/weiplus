package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wu implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f171463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f171464b;

    public wu(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f171464b = snsUserUI;
        this.f171463a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI$15");
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f171464b;
            ca4.r0 r0Var = snsUserUI.H;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            if (((java.util.HashMap) r0Var.f40011c).get(obj) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                ca4.r0 r0Var2 = snsUserUI.H;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                if (((java.util.Map) ((java.util.HashMap) r0Var2.f40011c).get(obj)).get(obj2) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    ca4.r0 r0Var3 = snsUserUI.H;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    java.lang.Long l17 = (java.lang.Long) ((java.util.Map) ((java.util.HashMap) r0Var3.f40011c).get(obj)).get(obj2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    snsUserUI.E = l17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    java.lang.Long l18 = snsUserUI.E;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "SnsDatePicker select:[%s, %s, %s]", obj, obj2, l18);
                    com.tencent.mm.sdk.platformtools.n3 Tj = com.tencent.mm.plugin.sns.model.l4.Tj();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    java.lang.Runnable runnable = snsUserUI.M;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    Tj.removeCallbacks(runnable);
                    com.tencent.mm.plugin.sns.model.d6 c76 = com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI);
                    ((com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUserUI.V6(snsUserUI)).a();
                    java.lang.String U6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI);
                    boolean Y6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    java.lang.Long l19 = snsUserUI.E;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    c76.g(2, U6, 0, Y6, l19.longValue(), com.tencent.mm.plugin.sns.ui.SnsUserUI.b7(snsUserUI));
                    com.tencent.mm.plugin.sns.ui.SnsUserUI.d7(snsUserUI, 0);
                    com.tencent.mm.plugin.sns.ui.so T6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
                    T6.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    T6.f170478J = true;
                    T6.K = false;
                    com.tencent.mm.plugin.sns.ui.xo xoVar = T6.H;
                    xoVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                    xoVar.f171578h = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    com.tencent.mm.plugin.sns.ui.SnsUserUI.e7(snsUserUI).p(true);
                    com.tencent.mm.plugin.sns.ui.SnsUserUI.W6(snsUserUI);
                }
            }
        }
        this.f171463a.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI$15");
    }
}
