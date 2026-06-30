package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public abstract class VoiceInputLayout extends com.tencent.mm.view.x2c.X2CLinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.widget.u1 f138231d;

    /* renamed from: e, reason: collision with root package name */
    public z21.e f138232e;

    /* renamed from: f, reason: collision with root package name */
    public int f138233f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f138234g;

    /* renamed from: h, reason: collision with root package name */
    public final int f138235h;

    /* renamed from: i, reason: collision with root package name */
    public final int f138236i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.widget.t1 f138237m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138238n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f138239o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f138240p;

    public VoiceInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f138231d = null;
        this.f138233f = 1;
        this.f138234g = null;
        this.f138235h = 3000;
        this.f138236i = 10000;
        this.f138238n = new com.tencent.mm.plugin.fts.ui.widget.p1(this);
        this.f138239o = new com.tencent.mm.plugin.fts.ui.widget.r1(this);
        this.f138240p = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.fts.ui.widget.s1(this), true);
    }

    public void c() {
        if (this.f138233f == 1) {
            return;
        }
        this.f138233f = 1;
        com.tencent.mm.plugin.fts.ui.widget.u1 u1Var = this.f138231d;
        if (u1Var != null) {
            u1Var.getClass();
        }
        z21.e eVar = this.f138232e;
        if (eVar != null) {
            eVar.cancel(true);
        }
        j();
    }

    public abstract void e(boolean z17);

    public int getCurrentState() {
        return this.f138233f;
    }

    public abstract void i(int i17);

    public abstract void j();

    public void k(boolean z17) {
        com.tencent.mm.plugin.fts.ui.widget.u1 u1Var;
        if (this.f138233f == 1) {
            return;
        }
        this.f138233f = 1;
        j();
        if (!z17 || (u1Var = this.f138231d) == null) {
            return;
        }
        u1Var.getClass();
    }

    public void setActivity(android.app.Activity activity) {
        this.f138234g = activity;
    }

    public void setFromFullScreen(boolean z17) {
    }

    public void setLongClickLisnter(com.tencent.mm.plugin.fts.ui.widget.t1 t1Var) {
        this.f138237m = t1Var;
    }

    public void setVoiceDetectListener(com.tencent.mm.plugin.fts.ui.widget.u1 u1Var) {
        this.f138231d = u1Var;
    }

    public VoiceInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138231d = null;
        this.f138233f = 1;
        this.f138234g = null;
        this.f138235h = 3000;
        this.f138236i = 10000;
        this.f138238n = new com.tencent.mm.plugin.fts.ui.widget.p1(this);
        this.f138239o = new com.tencent.mm.plugin.fts.ui.widget.r1(this);
        this.f138240p = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.fts.ui.widget.s1(this), true);
    }
}
