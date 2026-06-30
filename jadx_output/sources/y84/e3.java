package y84;

/* loaded from: classes4.dex */
public final class e3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f460040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f460041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f460042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f460043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f460044h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f460045i;

    public e3(y84.h3 h3Var, kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.c0 c0Var, int i17) {
        this.f460040d = h3Var;
        this.f460041e = e0Var;
        this.f460042f = e0Var2;
        this.f460043g = g0Var;
        this.f460044h = c0Var;
        this.f460045i = i17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$1$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        y84.h3 h3Var = this.f460040d;
        java.lang.String j17 = h3Var.j();
        try {
            int action = motionEvent.getAction();
            kotlin.jvm.internal.e0 e0Var = this.f460041e;
            kotlin.jvm.internal.e0 e0Var2 = this.f460042f;
            kotlin.jvm.internal.g0 g0Var = this.f460043g;
            kotlin.jvm.internal.c0 c0Var = this.f460044h;
            if (action == 0) {
                e0Var.f310115d = motionEvent.getX();
                e0Var2.f310115d = motionEvent.getY();
                g0Var.f310121d = java.lang.System.currentTimeMillis();
                c0Var.f310112d = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                h3Var.X0();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            } else {
                int action2 = motionEvent.getAction();
                int i17 = this.f460045i;
                if (action2 == 2) {
                    float abs = java.lang.Math.abs(motionEvent.getX() - e0Var.f310115d);
                    float abs2 = java.lang.Math.abs(motionEvent.getY() - e0Var2.f310115d);
                    float f17 = i17;
                    if (abs > f17 || abs2 > f17) {
                        c0Var.f310112d = false;
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (c0Var.f310112d && motionEvent.getAction() == 1) {
                        float abs3 = java.lang.Math.abs(motionEvent.getX() - e0Var.f310115d);
                        float abs4 = java.lang.Math.abs(motionEvent.getY() - e0Var2.f310115d);
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - g0Var.f310121d;
                        float f18 = i17;
                        if (abs3 < f18 && abs4 < f18 && currentTimeMillis < 200) {
                            view.performClick();
                        }
                    }
                    if (!c0Var.f310112d) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMScrollCount$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        int i18 = h3Var.Q0;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMScrollCount$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMScrollCount$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        h3Var.Q0 = i18 + 1;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMScrollCount$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    }
                    c0Var.f310112d = false;
                    y84.h3.O(h3Var);
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$1$1");
        return false;
    }
}
