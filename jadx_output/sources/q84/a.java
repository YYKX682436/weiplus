package q84;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final q84.d f360783a;

    public a(q84.d dVar) {
        this.f360783a = dVar;
    }

    public void a(q84.e eVar) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
        q84.d dVar = this.f360783a;
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
            return;
        }
        q84.e countDownVM = dVar.getCountDownVM();
        if (countDownVM != null && countDownVM != eVar) {
            b(countDownVM);
        }
        if (eVar != null) {
            q84.c cVar = (q84.c) eVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            cVar.f360786c = new java.lang.ref.WeakReference(dVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            l44.r4 r4Var = cVar.f360784a;
            r4Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            q84.b bVar = (q84.b) r4Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
            boolean c17 = a84.f0.c(bVar.f316326a, bVar.f316327b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isValid", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
            if (c17) {
                l44.q4 q4Var = r4Var.f316329d;
                if (q4Var != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinished", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
                    boolean z17 = q4Var.f316317b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinished", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
                    if (!z17) {
                        r4Var.f316329d.cancel();
                        r4Var.f316329d = null;
                    }
                }
                r4Var.f316330e = cVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentTimeMillis", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
                long b17 = a84.f0.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentTimeMillis", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
                if (b17 >= r4Var.f316326a) {
                    j17 = r4Var.f316327b - b17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                    j17 = -1;
                }
                if (j17 > 0) {
                    l44.q4 q4Var2 = new l44.q4(r4Var, j17);
                    r4Var.f316329d = q4Var2;
                    q4Var2.start();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
    }

    public void b(q84.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
        if (eVar != null) {
            q84.c cVar = (q84.c) eVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            l44.r4 r4Var = cVar.f360784a;
            r4Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            l44.q4 q4Var = r4Var.f316329d;
            if (q4Var != null) {
                q4Var.cancel();
                r4Var.f316329d = null;
            }
            r4Var.f316330e = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            cVar.f360786c = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
    }
}
