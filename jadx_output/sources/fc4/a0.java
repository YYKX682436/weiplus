package fc4;

/* loaded from: classes4.dex */
public final class a0 implements z35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fc4.f0 f261093a;

    public a0(fc4.f0 f0Var) {
        this.f261093a = f0Var;
    }

    @Override // z35.g0
    public void a(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVisibleChange", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$5");
        if (!pc4.d.f353410a.w()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSeekBarBgImg", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            fc4.f0 f0Var = this.f261093a;
            f0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSeekBarBgImg", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            android.view.View view = (android.view.View) ((jz5.n) f0Var.f261141h).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSeekBarBgImg", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSeekBarBgImg", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC");
            if (view != null) {
                int i17 = z17 ? 0 : 4;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSeekbarUIC$initSeekBar$5", "onVisibleChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSeekbarUIC$initSeekBar$5", "onVisibleChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVisibleChange", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSeekbarUIC$initSeekBar$5");
    }
}
