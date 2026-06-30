package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class k0 extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public java.lang.String M;
    public int N;
    public boolean P;
    public final int Q;
    public final int R;
    public android.view.View.OnClickListener S;
    public android.view.View T;

    public k0(android.content.Context context) {
        super(context, null);
        this.L = null;
        this.N = Integer.MAX_VALUE;
        this.Q = -1;
        this.R = -1;
        this.G = com.tencent.mm.R.layout.bmr;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        int i17;
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hq_);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.owm);
        textView.setText(this.f197774h);
        this.T = view;
        int i18 = this.N;
        if (i18 != Integer.MAX_VALUE) {
            textView2.setTextColor(i18);
        }
        boolean z17 = this.P;
        android.content.Context context = this.f197770d;
        if (!z17) {
            textView2.setOnClickListener(null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = this.M;
            float textSize = textView2.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
            return;
        }
        int i19 = this.Q;
        if (i19 >= 0 && (i17 = this.R) > 0) {
            com.tencent.mm.plugin.wallet_core.ui.b4 b4Var = new com.tencent.mm.plugin.wallet_core.ui.b4(context);
            android.text.SpannableString spannableString = new android.text.SpannableString(this.M);
            b4Var.f180146d = new com.tencent.mm.plugin.wallet_core.ui.j0(this);
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            spannableString.setSpan(b4Var, i19, i17, 33);
            textView2.setText(spannableString);
            return;
        }
        int i27 = this.N;
        if (i27 != Integer.MAX_VALUE) {
            textView2.setTextColor(i27);
        } else {
            textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479376xs));
        }
        textView2.setOnClickListener(this.S);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str2 = this.M;
        float textSize2 = textView2.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize2));
    }
}
