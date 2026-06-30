package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes15.dex */
public abstract class VoiceInputLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.u3 f189853d;

    /* renamed from: e, reason: collision with root package name */
    public z21.w f189854e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f189855f;

    /* renamed from: g, reason: collision with root package name */
    public int f189856g;

    /* renamed from: h, reason: collision with root package name */
    public int f189857h;

    /* renamed from: i, reason: collision with root package name */
    public final int f189858i;

    /* renamed from: m, reason: collision with root package name */
    public final int f189859m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.t3 f189860n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f189861o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f189862p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f189863q;

    public VoiceInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f189853d = null;
        this.f189855f = false;
        this.f189856g = 1;
        this.f189857h = 1;
        this.f189858i = 3000;
        this.f189859m = 10000;
        this.f189861o = new com.tencent.mm.pluginsdk.ui.p3(this);
        this.f189862p = new com.tencent.mm.pluginsdk.ui.r3(this);
        this.f189863q = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.s3(this), true);
    }

    public void a() {
        if (this.f189856g == 1) {
            return;
        }
        this.f189856g = 1;
        com.tencent.mm.pluginsdk.ui.u3 u3Var = this.f189853d;
        if (u3Var != null) {
            u3Var.f();
        }
        z21.w wVar = this.f189854e;
        if (wVar != null) {
            wVar.cancel(true);
        }
        f();
    }

    public void b(boolean z17) {
        if (iq.b.C(getContext()) || iq.b.v(getContext()) || iq.b.e(getContext())) {
            f();
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
            if (getContext() instanceof android.app.Activity) {
                tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
                android.app.Activity activity = (android.app.Activity) getContext();
                ((sb0.f) jVar2).getClass();
                j35.u.i(activity, "android.permission.RECORD_AUDIO", 80);
                return;
            }
            return;
        }
        if (this.f189856g != 1) {
            return;
        }
        this.f189856g = 2;
        com.tencent.mm.pluginsdk.ui.u3 u3Var = this.f189853d;
        if (u3Var != null) {
            u3Var.c();
        }
        this.f189863q.c(50L, 50L);
        g(z17);
        z21.w wVar = new z21.w(this.f189857h, 0, new com.tencent.mm.pluginsdk.ui.q3(this));
        this.f189854e = wVar;
        wVar.start();
    }

    public void c() {
        int i17 = this.f189856g;
        if (i17 == 1 || i17 != 2) {
            return;
        }
        this.f189856g = 3;
        com.tencent.mm.pluginsdk.ui.u3 u3Var = this.f189853d;
        if (u3Var != null) {
            u3Var.b();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f189863q;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f189861o;
        n3Var.removeMessages(0);
        n3Var.sendEmptyMessageDelayed(0, this.f189858i);
        n3Var.sendEmptyMessageDelayed(1, this.f189859m);
        d(true);
        z21.w wVar = this.f189854e;
        if (wVar != null) {
            wVar.stop(true);
        }
    }

    public abstract void d(boolean z17);

    public abstract void e(int i17);

    public abstract void f();

    public abstract void g(boolean z17);

    public int getCurrentState() {
        return this.f189856g;
    }

    public void h(boolean z17) {
        com.tencent.mm.pluginsdk.ui.u3 u3Var;
        if (this.f189856g == 1) {
            return;
        }
        this.f189856g = 1;
        f();
        if (!z17 || (u3Var = this.f189853d) == null) {
            return;
        }
        u3Var.d();
    }

    public void setFromFullScreen(boolean z17) {
        this.f189855f = z17;
    }

    public void setLangType(int i17) {
        this.f189857h = i17;
    }

    public void setLongClickLisnter(com.tencent.mm.pluginsdk.ui.t3 t3Var) {
        this.f189860n = t3Var;
    }

    public void setVoiceDetectListener(com.tencent.mm.pluginsdk.ui.u3 u3Var) {
        this.f189853d = u3Var;
    }

    public VoiceInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f189853d = null;
        this.f189855f = false;
        this.f189856g = 1;
        this.f189857h = 1;
        this.f189858i = 3000;
        this.f189859m = 10000;
        this.f189861o = new com.tencent.mm.pluginsdk.ui.p3(this);
        this.f189862p = new com.tencent.mm.pluginsdk.ui.r3(this);
        this.f189863q = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.s3(this), true);
    }
}
