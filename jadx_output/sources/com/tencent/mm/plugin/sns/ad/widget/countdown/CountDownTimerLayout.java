package com.tencent.mm.plugin.sns.ad.widget.countdown;

/* loaded from: classes4.dex */
public class CountDownTimerLayout extends android.widget.LinearLayout implements androidx.lifecycle.x, q84.d {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f163528d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f163529e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f163530f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f163531g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f163532h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f163533i;

    /* renamed from: m, reason: collision with root package name */
    public long f163534m;

    /* renamed from: n, reason: collision with root package name */
    public q84.a f163535n;

    public CountDownTimerLayout(android.content.Context context) {
        super(context);
        this.f163533i = true;
        this.f163534m = -1L;
        b(context);
    }

    private void setDateTime(a84.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        if (e0Var == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.CountDownTimerLayout", "the date time is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            return;
        }
        if (e0Var.f2272a > 0) {
            a84.y0.p(this.f163529e, true);
            a84.y0.p(this.f163528d, true);
            c(this.f163529e, java.lang.String.valueOf(e0Var.f2272a));
        } else {
            a84.y0.p(this.f163529e, false);
            a84.y0.p(this.f163528d, false);
        }
        c(this.f163530f, a84.f0.a(e0Var.f2273b));
        c(this.f163531g, a84.f0.a(e0Var.f2274c));
        c(this.f163532h, a84.f0.a(e0Var.f2275d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @Override // q84.d
    public void a(long j17, a84.e0 e0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            this.f163534m = j17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            boolean isAttachedToWindow = isAttachedToWindow();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            if (isAttachedToWindow && this.f163533i) {
                setDateTime(e0Var);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCountDownTimeChanged", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public void b(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cqg, this);
            this.f163535n = new q84.a(this);
            this.f163528d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486980n26);
            this.f163529e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486979n25);
            this.f163530f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n27);
            this.f163531g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n28);
            this.f163532h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.n29);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public final void c(android.widget.TextView textView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        if (textView != null) {
            textView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public final void doPause(androidx.lifecycle.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            this.f163533i = false;
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void doResume(androidx.lifecycle.y yVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        try {
            this.f163533i = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        } catch (java.lang.Throwable unused) {
        }
        if (this.f163533i) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            boolean isAttachedToWindow = isAttachedToWindow();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAlive", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            if (isAttachedToWindow) {
                long j17 = this.f163534m;
                if (j17 >= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
                    a84.e0 d17 = a84.f0.d(j17, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toDateTime", "com.tencent.mm.plugin.sns.ad.utils.DateTimeUtil");
                    setDateTime(d17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeDateTime", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doResume", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @Override // q84.d
    public q84.e getCountDownVM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCountDownVM", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        super.onAttachedToWindow();
        try {
            android.content.Context context = getContext();
            if (context instanceof androidx.fragment.app.FragmentActivity) {
                ((androidx.fragment.app.FragmentActivity) context).mo133getLifecycle().a(this);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
        super.onDetachedFromWindow();
        try {
            android.content.Context context = getContext();
            if (context instanceof androidx.fragment.app.FragmentActivity) {
                ((androidx.fragment.app.FragmentActivity) context).mo133getLifecycle().c(this);
            }
            q84.e countDownVM = getCountDownVM();
            q84.a aVar = this.f163535n;
            if (aVar != null) {
                aVar.b(countDownVM);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.CountDownTimerLayout", "onDetachedFromWindow, exp=" + th6);
            ca4.q.c("CountDownTimerLayout, stopCountDown", new java.lang.RuntimeException("stopCountDown"));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownTimerLayout");
    }

    public CountDownTimerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f163533i = true;
        this.f163534m = -1L;
        b(context);
    }

    public CountDownTimerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163533i = true;
        this.f163534m = -1L;
        b(context);
    }

    public CountDownTimerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f163533i = true;
        this.f163534m = -1L;
        b(context);
    }
}
