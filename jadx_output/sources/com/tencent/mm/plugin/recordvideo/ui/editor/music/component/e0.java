package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class e0 extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b {
    public yz5.a A;
    public yz5.l B;
    public yz5.l C;
    public int D;
    public final java.util.HashMap E;
    public final java.util.HashMap F;
    public boolean G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f156195J;

    /* renamed from: h, reason: collision with root package name */
    public final int f156196h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f156197i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f156198m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f156199n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f156200o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f156201p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f156202q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f156203r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f156204s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f156205t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f156206u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f156207v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f156208w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f156209x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f156210y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View.OnClickListener f156211z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, int i17) {
        super(parent, status);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f156196h = i17;
        this.f156197i = "MicroMsg.MusicOptionComponent";
        this.f156198m = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.x(this));
        this.f156199n = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.p(this));
        this.f156200o = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.o(this));
        this.f156201p = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.n(this));
        this.f156202q = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c0(this));
        this.f156203r = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.v(this));
        this.f156204s = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.t(this));
        this.f156205t = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.w(this));
        this.f156206u = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d0(this));
        this.f156207v = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.u(this));
        this.f156208w = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a0(this));
        this.f156209x = jz5.h.b(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.z(this));
        this.A = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b0.f156169d;
        this.D = 100;
        this.E = new java.util.HashMap();
        this.F = new java.util.HashMap();
        this.H = com.tencent.mm.R.raw.popvideo_post_selected_origin;
        this.I = com.tencent.mm.R.raw.ui_rescoures_checkbox_unselected;
        this.f156195J = com.tencent.mm.R.color.FG_2;
    }

    public static void B(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.e0 e0Var, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        e0Var.getClass();
        com.tencent.mars.xlog.Log.i(e0Var.f156197i, "updateLyricsStatus: " + z17);
        e0Var.z((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) e0Var.f156201p).getValue(), z17);
        e0Var.J(3, z17);
        e0Var.I(e0Var.q(), ((android.widget.TextView) ((jz5.n) e0Var.f156207v).getValue()).getText().toString(), z17);
        if (z18) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("key_boolean", z17);
            bundle.putBoolean("KEY_FROM_CLICK", z19);
            e0Var.f266982d.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156252o, bundle);
        }
    }

    public final void E(boolean z17) {
        z((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f156200o).getValue(), z17);
        J(1, z17);
        I((android.view.View) ((jz5.n) this.f156203r).getValue(), ((android.widget.TextView) ((jz5.n) this.f156205t).getValue()).getText().toString(), z17);
    }

    public final void G(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        if (this.f156210y) {
            return;
        }
        v().setText(text);
    }

    public final void H(int i17, boolean z17) {
        this.F.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    public final void I(android.view.View view, java.lang.String str, boolean z17) {
        view.setContentDescription(this.f156168g.getString(z17 ? com.tencent.mm.R.string.br_ : com.tencent.mm.R.string.bra, str));
    }

    public final void J(int i17, boolean z17) {
        this.E.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        int i18 = com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k0.f156284a;
        if (i17 == 1 || i17 == 2) {
            w();
        }
    }

    public final void a(boolean z17) {
        if (z17) {
            this.f156210y = true;
            android.view.View q17 = q();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(q17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "applyImproveLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            q17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(q17, "com/tencent/mm/plugin/recordvideo/ui/editor/music/component/MusicOptionComponent", "applyImproveLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.G = false;
            android.view.View r17 = r();
            android.widget.LinearLayout linearLayout = r17 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) r17 : null;
            if (linearLayout == null) {
                return;
            }
            android.view.ViewGroup.LayoutParams layoutParams = u().getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            android.content.Context context = this.f156168g;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(0);
                layoutParams2.setMarginEnd(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz));
                u().setLayoutParams(layoutParams2);
            }
            if (linearLayout.indexOfChild(u()) != 0) {
                linearLayout.removeView(u());
                linearLayout.addView(u(), 0);
            }
            v().setText(i65.a.r(context, com.tencent.mm.R.string.pij));
            jz5.g gVar = this.f156208w;
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(0);
            com.tencent.mm.ui.bk.t0(((android.widget.TextView) ((jz5.n) gVar).getValue()).getPaint());
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.m(this));
            w();
        }
    }

    @Override // fv3.b
    public void m() {
        r().setPadding(r().getPaddingLeft(), r().getPaddingTop(), r().getPaddingRight(), r().getPaddingBottom() + this.f156196h);
        com.tencent.mm.ui.bk.t0(((android.widget.TextView) ((jz5.n) this.f156205t).getValue()).getPaint());
        E(false);
        H(1, true);
        ((android.view.View) ((jz5.n) this.f156203r).getValue()).setOnClickListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.r(this));
        com.tencent.mm.ui.bk.t0(((android.widget.TextView) ((jz5.n) this.f156207v).getValue()).getPaint());
        B(this, false, false, false, 4, null);
        H(3, true);
        q().setOnClickListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.q(this));
        com.tencent.mm.ui.bk.t0(v().getPaint());
        z((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f156199n).getValue(), false);
        J(2, false);
        I(u(), v().getText().toString(), false);
        H(2, true);
        u().setOnClickListener(new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.s(this));
    }

    public final void o() {
        if (s(1)) {
            E(false);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("key_boolean", false);
            this.f266982d.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156250m, bundle);
            wt3.v vVar = wt3.v.f449505i;
            if (vVar != null) {
                vVar.b();
            }
            B(this, false, false, false, 6, null);
            x(q(), com.tencent.mm.R.id.f482770ni, com.tencent.mm.R.string.f489949ge);
            ((android.view.View) ((jz5.n) this.f156203r).getValue()).setTag(com.tencent.mm.R.id.e7_, java.lang.Boolean.FALSE);
        }
    }

    public final android.view.View q() {
        return (android.view.View) ((jz5.n) this.f156204s).getValue();
    }

    public final android.view.View r() {
        return (android.view.View) ((jz5.n) this.f156198m).getValue();
    }

    public final boolean s(int i17) {
        java.lang.Boolean bool = (java.lang.Boolean) this.E.get(java.lang.Integer.valueOf(i17));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j1 t() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j1) ((jz5.n) this.f156209x).getValue();
    }

    public final android.view.View u() {
        return (android.view.View) ((jz5.n) this.f156202q).getValue();
    }

    public final android.widget.TextView v() {
        return (android.widget.TextView) ((jz5.n) this.f156206u).getValue();
    }

    public final void w() {
        if (this.f156210y) {
            boolean z17 = s(1) || ((u().getVisibility() == 0) && !(s(2) ^ true));
            ((android.widget.TextView) ((jz5.n) this.f156208w).getValue()).setTextColor(this.f156168g.getResources().getColor(z17 ? com.tencent.mm.R.color.Link_100 : com.tencent.mm.R.color.FG_3));
            if (z17) {
                return;
            }
            com.tencent.mm.ui.widget.dialog.y1 y1Var = t().f156274b;
            if (y1Var != null && y1Var.f()) {
                com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j1 t17 = t();
                com.tencent.mm.ui.widget.dialog.y1 y1Var2 = t17.f156274b;
                if (y1Var2 != null) {
                    y1Var2.q();
                }
                t17.f156274b = null;
            }
        }
    }

    public final void x(android.view.View view, int i17, int i18) {
        kotlin.jvm.internal.o.g(view, "view");
        view.setTag(i17, i65.a.r(this.f156167f.getContext(), i18));
    }

    public final void y() {
        if (s(1)) {
            o();
            return;
        }
        if (s(1)) {
            return;
        }
        E(true);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_boolean", true);
        this.f266982d.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156250m, bundle);
        ((android.view.View) ((jz5.n) this.f156203r).getValue()).setTag(com.tencent.mm.R.id.e7_, java.lang.Boolean.TRUE);
    }

    public final void z(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, boolean z17) {
        if (z17) {
            weImageView.s(this.H, com.tencent.mm.R.color.a9e);
        } else {
            weImageView.s(this.I, this.f156195J);
        }
    }
}
