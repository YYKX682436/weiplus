package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class zz {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.dz f120617a = new com.tencent.mm.plugin.finder.live.widget.dz();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m10 f120618b;

    public zz(com.tencent.mm.plugin.finder.live.widget.m10 m10Var) {
        this.f120618b = m10Var;
    }

    public final java.lang.CharSequence a(int i17, int i18) {
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120618b;
        java.lang.String string = m10Var.f118999a.getContext().getString(i17, java.lang.Integer.valueOf(i18));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        int L = r26.n0.L(string, java.lang.String.valueOf(i18), 0, false, 6, null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = m10Var.f118999a.getContext();
        java.lang.String substring = string.substring(0, L);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = string.substring(L, string.length());
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        android.content.Context context2 = m10Var.f118999a.getContext();
        android.widget.TextView textView = m10Var.f119002d;
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(context2, com.tencent.mm.R.raw.coin_icon, textView != null ? textView.getCurrentTextColor() : -1);
        e17.setBounds(0, 0, i65.a.f(m10Var.f118999a.getContext(), com.tencent.mm.R.dimen.f479688cn), i65.a.f(m10Var.f118999a.getContext(), com.tencent.mm.R.dimen.f479688cn));
        ((ke0.e) xVar).getClass();
        return com.tencent.mm.pluginsdk.ui.span.c0.b(context, substring, substring2, e17, true, false);
    }

    public final void b(r45.q63 q63Var, java.lang.Runnable runnable, boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120618b;
        android.widget.TextView textView = m10Var.f119005g;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = m10Var.f119006h;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = m10Var.f119005g;
        if (textView3 != null) {
            textView3.setText(m10Var.f118999a.getContext().getString(com.tencent.mm.R.string.czv));
        }
        android.widget.TextView textView4 = m10Var.f119002d;
        if (textView4 != null) {
            textView4.setText(a(z17 ? com.tencent.mm.R.string.czw : com.tencent.mm.R.string.czx, q63Var.getInteger(11)));
        }
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var2 = this.f120618b;
        com.tencent.mm.plugin.finder.live.widget.xz xzVar = new com.tencent.mm.plugin.finder.live.widget.xz(m10Var2, this, q63Var, z17, runnable);
        android.widget.TextView textView5 = m10Var2.f119005g;
        if (textView5 != null) {
            textView5.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.vz(m10Var2, q63Var, xzVar));
        }
    }

    public final void c(boolean z17, r45.q63 q63Var) {
        android.content.Context context;
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120618b;
        android.widget.TextView textView = m10Var.f119005g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = m10Var.f119006h;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (z17) {
            android.widget.TextView textView3 = m10Var.f119002d;
            if (textView3 == null) {
                return;
            }
            textView3.setText(a(com.tencent.mm.R.string.czx, q63Var.getInteger(11)));
            return;
        }
        android.widget.TextView textView4 = m10Var.f119002d;
        if (textView4 != null) {
            textView4.setText(a(com.tencent.mm.R.string.czw, q63Var.getInteger(11)));
        }
        android.widget.TextView textView5 = m10Var.f119006h;
        if (textView5 == null) {
            return;
        }
        textView5.setText((textView5 == null || (context = textView5.getContext()) == null) ? null : context.getString(com.tencent.mm.R.string.cz_));
    }

    public final void d(r45.q63 q63Var, java.lang.Runnable runnable) {
        com.tencent.mm.plugin.finder.live.widget.m10 m10Var = this.f120618b;
        android.widget.TextView textView = m10Var.f119005g;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = m10Var.f119006h;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = m10Var.f119005g;
        if (textView3 != null) {
            textView3.setText(m10Var.f118999a.getContext().getString(com.tencent.mm.R.string.czr));
        }
        android.widget.TextView textView4 = m10Var.f119002d;
        if (textView4 != null) {
            textView4.setText(a(com.tencent.mm.R.string.czx, q63Var.getInteger(11)));
        }
        android.widget.TextView textView5 = m10Var.f119005g;
        if (textView5 != null) {
            textView5.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.yz(m10Var, runnable));
        }
    }
}
