package com.tencent.mm.pluginsdk.ui.websearch;

/* loaded from: classes15.dex */
public class WebSearchVoiceInputLayoutImpl extends com.tencent.mm.pluginsdk.ui.VoiceInputLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f192045w = 0;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f192046r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.g3 f192047s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f192048t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f192049u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnTouchListener f192050v;

    public WebSearchVoiceInputLayoutImpl(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f192048t = false;
        this.f192049u = new com.tencent.mm.pluginsdk.ui.websearch.a(this);
        this.f192050v = new com.tencent.mm.pluginsdk.ui.websearch.b(this);
        j(context);
    }

    @Override // com.tencent.mm.pluginsdk.ui.VoiceInputLayout
    public void d(boolean z17) {
        k(new com.tencent.mm.pluginsdk.ui.websearch.e(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.VoiceInputLayout
    public void e(int i17) {
        k(new com.tencent.mm.pluginsdk.ui.websearch.g(this, i17));
    }

    @Override // com.tencent.mm.pluginsdk.ui.VoiceInputLayout
    public void f() {
        k(new com.tencent.mm.pluginsdk.ui.websearch.f(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.VoiceInputLayout
    public void g(boolean z17) {
        k(new com.tencent.mm.pluginsdk.ui.websearch.d(this, z17));
    }

    public void i(boolean z17, boolean z18) {
        int i17 = this.f189856g;
        if (i17 == 1) {
            if (z17 || z18) {
                if (!z17 || z18) {
                    return;
                }
                this.f192047s.b();
                return;
            }
            int n17 = c01.d9.e().n();
            if (n17 == 4 || n17 == 6) {
                b(true);
                return;
            }
            k(new com.tencent.mm.pluginsdk.ui.websearch.c(this));
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
                a();
                return;
            } else {
                if (!z17 || z18) {
                    return;
                }
                this.f192047s.b();
                return;
            }
        }
        if (!z18) {
            c();
            return;
        }
        this.f192047s.b();
        a();
        com.tencent.mm.pluginsdk.ui.t3 t3Var = this.f189860n;
        if (t3Var != null) {
            t3Var.a(true);
        }
    }

    public void j(android.content.Context context) {
        android.view.View findViewById = android.view.View.inflate(context, com.tencent.mm.R.layout.d4b, this).findViewById(com.tencent.mm.R.id.f487617p71);
        this.f192046r = findViewById;
        findViewById.setLayerType(1, null);
        com.tencent.mm.pluginsdk.ui.g3 g3Var = new com.tencent.mm.pluginsdk.ui.g3(context);
        this.f192047s = g3Var;
        this.f192046r.setBackground(g3Var);
        this.f192046r.setEnabled(true);
        this.f192046r.setOnTouchListener(this.f192050v);
        this.f192046r.setOnLongClickListener(this.f192049u);
        h(true);
        if (isInEditMode()) {
            return;
        }
        int n17 = c01.d9.e().n();
        if (n17 == 4 || n17 == 6) {
            return;
        }
        k(new com.tencent.mm.pluginsdk.ui.websearch.c(this));
        this.f189856g = 1;
        f();
        com.tencent.mm.pluginsdk.ui.u3 u3Var = this.f189853d;
        if (u3Var != null) {
            u3Var.g(12, -1, -1);
        }
    }

    public final void k(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    public WebSearchVoiceInputLayoutImpl(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f192048t = false;
        this.f192049u = new com.tencent.mm.pluginsdk.ui.websearch.a(this);
        this.f192050v = new com.tencent.mm.pluginsdk.ui.websearch.b(this);
        j(context);
    }
}
