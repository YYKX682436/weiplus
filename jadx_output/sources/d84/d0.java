package d84;

/* loaded from: classes4.dex */
public final class d0 implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227054a;

    public d0(d84.j0 j0Var) {
        this.f227054a = j0Var;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mWindowFocusChangeListener$1");
        d84.j0 j0Var = this.f227054a;
        if (z17) {
            com.tencent.mars.xlog.Log.i(j0Var.j(), "onWindowFocusChanged callback, pageValue is " + ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) d84.j0.A(j0Var)).getValue()).booleanValue() + ", focusValue is true");
            ((kotlinx.coroutines.flow.h3) d84.j0.F(j0Var)).k(java.lang.Boolean.TRUE);
        } else {
            com.tencent.mars.xlog.Log.i(j0Var.j(), "onWindowFocusChanged callback, pageValue is false, focusValue is false");
            kotlinx.coroutines.flow.j2 A = d84.j0.A(j0Var);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            ((kotlinx.coroutines.flow.h3) A).k(bool);
            ((kotlinx.coroutines.flow.h3) d84.j0.F(j0Var)).k(bool);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$mWindowFocusChangeListener$1");
    }
}
