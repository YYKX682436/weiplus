package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rl6 f157683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.n2 f157684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.gq f157685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.h3 f157686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.z0 f157687h;

    public e3(r45.rl6 rl6Var, com.tencent.mm.plugin.remittance.ui.n2 n2Var, r45.gq gqVar, com.tencent.mm.plugin.remittance.ui.h3 h3Var, com.tencent.mm.plugin.remittance.model.z0 z0Var) {
        this.f157683d = rl6Var;
        this.f157684e = n2Var;
        this.f157685f = gqVar;
        this.f157686g = h3Var;
        this.f157687h = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.rl6 rl6Var = this.f157683d;
        if (rl6Var != null) {
            com.tencent.mm.plugin.remittance.ui.n2 n2Var = this.f157684e;
            n2Var.f157835n.setVisibility(0);
            if (rl6Var.f384987d.size() > 0) {
                r45.hl6 hl6Var = new r45.hl6();
                hl6Var.f376273f = "\u2060";
                hl6Var.f376271d = ((r45.hl6) rl6Var.f384987d.get(0)).f376271d;
                hl6Var.f376274g = ((r45.hl6) rl6Var.f384987d.get(0)).f376274g;
                rl6Var.f384987d.add(hl6Var);
            }
            android.widget.TextView textView = n2Var.f157835n;
            android.graphics.drawable.Drawable drawable = n2Var.f157836o.getDrawable();
            r45.gq gqVar = this.f157685f;
            r45.yt5 yt5Var = gqVar.f375463e;
            java.lang.String str = gqVar.f375466h;
            com.tencent.mm.plugin.remittance.ui.d3 d3Var = new com.tencent.mm.plugin.remittance.ui.d3(this.f157686g, this.f157687h);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (com.tencent.mm.plugin.wallet_core.utils.z1.m(rl6Var)) {
                textView.setClickable(true);
                textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(textView.getContext()));
            }
            if (yt5Var != null) {
                textView.setOnTouchListener(new com.tencent.mm.plugin.wallet_core.utils.p1());
            }
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) com.tencent.mm.plugin.wallet_core.utils.z1.f(textView.getContext(), rl6Var, d3Var, bool);
            if (drawable != null) {
                int q17 = (int) (i65.a.q(textView.getContext()) * 16.0f);
                drawable.setBounds(0, 0, com.tencent.mm.ui.zk.a(textView.getContext(), q17), com.tencent.mm.ui.zk.a(textView.getContext(), q17));
                com.tencent.mm.plugin.remittance.ui.k kVar = new com.tencent.mm.plugin.remittance.ui.k(drawable);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = " ";
                }
                spannableStringBuilder.append((java.lang.CharSequence) str);
                spannableStringBuilder.setSpan(kVar, spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.utils.q1(d3Var, yt5Var), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            }
            textView.setText(spannableStringBuilder);
        }
    }
}
