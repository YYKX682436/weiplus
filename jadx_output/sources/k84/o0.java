package k84;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f305153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305154f;

    public o0(k84.q1 q1Var, kotlin.jvm.internal.h0 h0Var, int i17) {
        this.f305152d = q1Var;
        this.f305153e = h0Var;
        this.f305154f = i17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.ViewGroup J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startAnim$1$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$startAnim$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$startAnim$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startAnim$1$3");
            return true;
        }
        int action = motionEvent.getAction();
        int i17 = this.f305154f;
        kotlin.jvm.internal.h0 h0Var = this.f305153e;
        kotlinx.coroutines.r2 r2Var = null;
        k84.q1 q1Var = this.f305152d;
        if (action == 0) {
            k84.l lVar = k84.q1.Y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$cancelBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            q1Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.tencent.mars.xlog.Log.i(q1Var.j(), "cancelBreezeAnim");
            android.animation.ValueAnimator valueAnimator = q1Var.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.view.ViewGroup I = q1Var.I();
            if (I != null) {
                I.setScaleX(1.0f);
            }
            android.view.ViewGroup I2 = q1Var.I();
            if (I2 != null) {
                I2.setScaleY(1.0f);
            }
            android.view.ViewGroup H = q1Var.H();
            if (H != null) {
                H.setScaleX(1.0f);
            }
            android.view.ViewGroup H2 = q1Var.H();
            if (H2 != null) {
                H2.setScaleY(1.0f);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$cancelBreezeAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            kotlinx.coroutines.r2 r2Var2 = (kotlinx.coroutines.r2) h0Var.f310123d;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            android.view.ViewGroup J3 = q1Var.J();
            if (J3 != null) {
                J3.setScaleX(0.95f);
            }
            android.view.ViewGroup J4 = q1Var.J();
            if (J4 != null) {
                J4.setScaleY(0.95f);
            }
            android.view.ViewGroup H3 = q1Var.H();
            if (H3 != null) {
                H3.setBackground(new android.graphics.drawable.ColorDrawable(e3.b.c(i17, -16777216, 0.15f)));
            }
            android.view.ViewGroup I3 = q1Var.I();
            if (I3 != null) {
                I3.setBackground(null);
            }
        } else if (action == 1 || action == 3) {
            android.view.ViewGroup J5 = q1Var.J();
            if (J5 != null) {
                J5.setScaleX(1.0f);
            }
            android.view.ViewGroup J6 = q1Var.J();
            if (J6 != null) {
                J6.setScaleY(1.0f);
            }
            android.view.ViewGroup H4 = q1Var.H();
            if (H4 != null) {
                H4.setBackground(new android.graphics.drawable.ColorDrawable(i17));
            }
            android.view.ViewGroup I4 = q1Var.I();
            if (I4 != null) {
                I4.setBackground(new android.graphics.drawable.ColorDrawable(e3.b.i(i17, 38)));
            }
            if (motionEvent.getAction() == 1 && (J2 = q1Var.J()) != null) {
                J2.performClick();
            }
            kotlinx.coroutines.r2 r2Var3 = (kotlinx.coroutines.r2) h0Var.f310123d;
            if (r2Var3 != null) {
                kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
            }
            kotlinx.coroutines.y0 h17 = q1Var.h();
            if (h17 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                kotlinx.coroutines.r0 r0Var = q1Var.f305199t;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                r2Var = kotlinx.coroutines.l.d(h17, r0Var, null, new k84.n0(q1Var, null), 2, null);
            }
            h0Var.f310123d = r2Var;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$startAnim$1$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startAnim$1$3");
        return true;
    }
}
