package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class FTSVoiceInputLayoutImpl extends com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f138222x = 0;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f138223q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f138224r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.widget.x0 f138225s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f138226t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f138227u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f138228v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnTouchListener f138229w;

    public FTSVoiceInputLayoutImpl(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f138226t = false;
        this.f138227u = false;
        this.f138228v = new com.tencent.mm.plugin.fts.ui.widget.d1(this);
        this.f138229w = new com.tencent.mm.plugin.fts.ui.widget.e1(this);
        m(context);
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout
    public void e(boolean z17) {
        o(new com.tencent.mm.plugin.fts.ui.widget.g1(this));
    }

    public com.tencent.mm.plugin.fts.ui.widget.x0 getVoiceInputDrawable() {
        return this.f138225s;
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout
    public void i(int i17) {
        o(new com.tencent.mm.plugin.fts.ui.widget.i1(this, i17));
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout
    public void j() {
        o(new com.tencent.mm.plugin.fts.ui.widget.h1(this));
    }

    public void l(boolean z17, boolean z18) {
        int i17 = this.f138233f;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f138240p;
        if (i17 == 1) {
            if (z17 || z18) {
                if (!z17 || z18) {
                    return;
                }
                com.tencent.mm.plugin.fts.ui.widget.x0 x0Var = this.f138225s;
                x0Var.f138358n = 2;
                x0Var.f138359o = 0;
                x0Var.invalidateSelf();
                return;
            }
            if (iq.b.C(getContext()) || iq.b.v(getContext()) || iq.b.e(getContext())) {
                j();
                return;
            }
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = getContext();
            ((sb0.f) jVar).getClass();
            if (!j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
                android.app.Activity activity = !(getContext() instanceof android.app.Activity) ? this.f138234g : (android.app.Activity) getContext();
                if (activity != null) {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 80, null, null);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputLayout", "context = " + activity);
                return;
            }
            if (this.f138233f != 1) {
                return;
            }
            this.f138233f = 2;
            com.tencent.mm.plugin.fts.ui.widget.u1 u1Var = this.f138231d;
            if (u1Var != null) {
                com.tencent.mm.plugin.fts.ui.widget.y0 y0Var = (com.tencent.mm.plugin.fts.ui.widget.y0) u1Var;
                y0Var.f138364a = "";
                y0Var.f138365b = "";
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15490, 3, java.lang.Long.valueOf(o13.p.f342250c), 1);
                com.tencent.mm.plugin.fts.ui.widget.b1 b1Var = y0Var.f138366c;
                b1Var.f138248c = true;
                b1Var.f138247b.d();
            }
            b4Var.c(50L, 50L);
            n(true);
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
                this.f138232e = new z21.w();
            } else {
                ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
                this.f138232e = com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy.getInstance();
            }
            this.f138232e.init(1, 8, new com.tencent.mm.plugin.fts.ui.widget.q1(this));
            this.f138232e.start();
            return;
        }
        if (i17 != 2) {
            if (!z17 && !z18) {
                c();
                return;
            }
            if (!z17 || z18) {
                return;
            }
            com.tencent.mm.plugin.fts.ui.widget.x0 x0Var2 = this.f138225s;
            x0Var2.f138358n = 2;
            x0Var2.f138359o = 0;
            x0Var2.invalidateSelf();
            return;
        }
        if (!z18) {
            if (i17 == 1 || i17 != 2) {
                return;
            }
            this.f138233f = 3;
            if (b4Var != null) {
                b4Var.d();
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f138238n;
            n3Var.removeMessages(0);
            n3Var.sendEmptyMessageDelayed(0, this.f138235h);
            n3Var.sendEmptyMessageDelayed(1, this.f138236i);
            e(true);
            z21.e eVar = this.f138232e;
            if (eVar != null) {
                eVar.stop(true);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.fts.ui.widget.x0 x0Var3 = this.f138225s;
        x0Var3.f138358n = 2;
        x0Var3.f138359o = 0;
        x0Var3.invalidateSelf();
        c();
        com.tencent.mm.plugin.fts.ui.widget.t1 t1Var = this.f138237m;
        if (t1Var != null) {
            com.tencent.mm.plugin.fts.ui.widget.b1 b1Var2 = ((com.tencent.mm.plugin.fts.ui.widget.z0) t1Var).f138369a;
            android.widget.Toast toast = b1Var2.f138255j;
            if (toast != null) {
                toast.cancel();
            }
            com.tencent.mm.ui.MMActivity mMActivity = b1Var2.f138246a;
            android.widget.Toast makeText = dp.a.makeText(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.fha), 0);
            b1Var2.f138255j = makeText;
            makeText.setGravity(17, 0, 0);
            b1Var2.f138255j.show();
            b1Var2.f138247b.c(true, false, "");
        }
    }

    public void m(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bd8, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f487617p71);
        this.f138223q = findViewById;
        findViewById.setLayerType(1, null);
        com.tencent.mm.plugin.fts.ui.widget.x0 x0Var = new com.tencent.mm.plugin.fts.ui.widget.x0(context);
        this.f138225s = x0Var;
        this.f138223q.setBackground(x0Var);
        this.f138223q.setEnabled(true);
        this.f138223q.setOnTouchListener(this.f138229w);
        this.f138223q.setOnLongClickListener(this.f138228v);
        this.f138224r = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ggj);
        k(true);
        if (isInEditMode() || com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return;
        }
        o(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.fts.ui.widget.x0 x0Var2 = com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl.this.f138225s;
                x0Var2.f138358n = 5;
                x0Var2.invalidateSelf();
            }
        });
        this.f138233f = 1;
        j();
        com.tencent.mm.plugin.fts.ui.widget.u1 u1Var = this.f138231d;
        if (u1Var != null) {
            ((com.tencent.mm.plugin.fts.ui.widget.y0) u1Var).a(12, -1, -1);
        }
    }

    public void n(boolean z17) {
        o(new com.tencent.mm.plugin.fts.ui.widget.f1(this, z17));
    }

    public final void o(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    public void setFTSVoiceDetectListener(com.tencent.mm.plugin.fts.ui.widget.j1 j1Var) {
        super.setVoiceDetectListener(j1Var);
    }

    public FTSVoiceInputLayoutImpl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138226t = false;
        this.f138227u = false;
        this.f138228v = new com.tencent.mm.plugin.fts.ui.widget.d1(this);
        this.f138229w = new com.tencent.mm.plugin.fts.ui.widget.e1(this);
        m(context);
    }
}
