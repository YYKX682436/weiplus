package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public class VoiceInputLayoutImpl extends com.tencent.mm.pluginsdk.ui.VoiceInputLayout {

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f189864r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.g3 f189865s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f189866t;

    /* renamed from: u, reason: collision with root package name */
    public long f189867u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f189868v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnTouchListener f189869w;

    public VoiceInputLayoutImpl(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f189866t = false;
        this.f189868v = new com.tencent.mm.pluginsdk.ui.v3(this);
        this.f189869w = new com.tencent.mm.pluginsdk.ui.w3(this);
        j(context);
    }

    @Override // com.tencent.mm.pluginsdk.ui.VoiceInputLayout
    public void d(boolean z17) {
        if (!z17) {
            k(17, false);
        }
        l(new com.tencent.mm.pluginsdk.ui.z3(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.VoiceInputLayout
    public void e(int i17) {
        l(new com.tencent.mm.pluginsdk.ui.b4(this, i17));
    }

    @Override // com.tencent.mm.pluginsdk.ui.VoiceInputLayout
    public void f() {
        l(new com.tencent.mm.pluginsdk.ui.a4(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.VoiceInputLayout
    public void g(boolean z17) {
        l(new com.tencent.mm.pluginsdk.ui.y3(this, z17));
    }

    public void i(boolean z17, boolean z18) {
        int i17 = this.f189856g;
        if (i17 == 1) {
            if (z17 || z18) {
                if (!z17 || z18) {
                    return;
                }
                k(4, this.f189866t);
                k(this.f189856g, this.f189866t);
                this.f189865s.b();
                return;
            }
            int n17 = c01.d9.e().n();
            if (n17 == 4 || n17 == 6) {
                b(true);
                return;
            }
            l(new com.tencent.mm.pluginsdk.ui.x3(this));
            this.f189856g = 1;
            f();
            com.tencent.mm.pluginsdk.ui.u3 u3Var = this.f189853d;
            if (u3Var != null) {
                u3Var.g(12, -1, -1);
                return;
            }
            return;
        }
        if (i17 != 2) {
            if (!z17 && !z18) {
                k(i17, this.f189866t);
                a();
                return;
            } else {
                if (!z17 || z18) {
                    return;
                }
                k(4, this.f189866t);
                k(this.f189856g, this.f189866t);
                this.f189865s.b();
                return;
            }
        }
        if (!z18) {
            if (z17) {
                k(4, this.f189866t);
            }
            k(this.f189856g, this.f189866t);
            c();
            return;
        }
        this.f189865s.b();
        a();
        com.tencent.mm.pluginsdk.ui.t3 t3Var = this.f189860n;
        if (t3Var != null) {
            t3Var.a(true);
        }
        k(5, this.f189866t);
    }

    public void j(android.content.Context context) {
        android.view.View findViewById = android.view.View.inflate(context, com.tencent.mm.R.layout.d4b, this).findViewById(com.tencent.mm.R.id.f487617p71);
        this.f189864r = findViewById;
        findViewById.setLayerType(1, null);
        com.tencent.mm.pluginsdk.ui.g3 g3Var = new com.tencent.mm.pluginsdk.ui.g3(context);
        this.f189865s = g3Var;
        this.f189864r.setBackground(g3Var);
        this.f189864r.setEnabled(true);
        this.f189864r.setOnTouchListener(this.f189869w);
        this.f189864r.setOnLongClickListener(this.f189868v);
        h(true);
        if (isInEditMode()) {
            return;
        }
        int n17 = c01.d9.e().n();
        if (n17 == 4 || n17 == 6) {
            return;
        }
        l(new com.tencent.mm.pluginsdk.ui.x3(this));
        this.f189856g = 1;
        f();
        com.tencent.mm.pluginsdk.ui.u3 u3Var = this.f189853d;
        if (u3Var != null) {
            u3Var.g(12, -1, -1);
        }
    }

    public final void k(int i17, boolean z17) {
        com.tencent.mm.plugin.report.kvdata.log_13905 log_13905Var = new com.tencent.mm.plugin.report.kvdata.log_13905();
        com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior voiceInputBehavior = new com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior();
        if (!z17) {
            voiceInputBehavior.click = i17;
        } else if (this.f189855f) {
            voiceInputBehavior.fullScreenVoiceLongClick = i17;
            if (i17 != 4 && this.f189866t) {
                long j17 = this.f189867u;
                if (j17 != 0) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    voiceInputBehavior.fullScreenVoiceLongClickTime = android.os.SystemClock.elapsedRealtime() - j17;
                }
            }
        } else {
            voiceInputBehavior.longClick = i17;
            if (i17 != 4 && this.f189866t) {
                long j18 = this.f189867u;
                if (j18 != 0) {
                    boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    voiceInputBehavior.longClickTime = android.os.SystemClock.elapsedRealtime() - j18;
                }
            }
        }
        log_13905Var.viOp_ = voiceInputBehavior;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.I(13905, log_13905Var, false, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputLayoutImp", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", java.lang.Integer.valueOf(voiceInputBehavior.cancel), java.lang.Integer.valueOf(voiceInputBehavior.send), java.lang.Integer.valueOf(voiceInputBehavior.click), java.lang.Integer.valueOf(voiceInputBehavior.longClick), java.lang.Long.valueOf(voiceInputBehavior.longClickTime), java.lang.Integer.valueOf(voiceInputBehavior.textClick), java.lang.Integer.valueOf(voiceInputBehavior.textChangeCount), java.lang.Long.valueOf(voiceInputBehavior.textChangeTime), java.lang.Integer.valueOf(voiceInputBehavior.textChangeReturn), java.lang.Long.valueOf(voiceInputBehavior.voiceInputTime), java.lang.Integer.valueOf(voiceInputBehavior.fail), java.lang.Integer.valueOf(voiceInputBehavior.clear), java.lang.Integer.valueOf(voiceInputBehavior.smileIconClick), java.lang.Integer.valueOf(voiceInputBehavior.voiceIconClick), java.lang.Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick), java.lang.Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime));
    }

    public final void l(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    public VoiceInputLayoutImpl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f189866t = false;
        this.f189868v = new com.tencent.mm.pluginsdk.ui.v3(this);
        this.f189869w = new com.tencent.mm.pluginsdk.ui.w3(this);
        j(context);
    }
}
