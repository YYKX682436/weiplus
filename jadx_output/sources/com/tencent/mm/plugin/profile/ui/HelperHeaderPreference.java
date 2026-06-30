package com.tencent.mm.plugin.profile.ui;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public class HelperHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public com.tencent.mm.storage.z3 Q;
    public hr3.i9 R;
    public boolean S;

    public HelperHeaderPreference(android.content.Context context) {
        super(context);
        this.S = false;
    }

    public final void M() {
        com.tencent.mm.storage.z3 z3Var;
        if (!this.S || (z3Var = this.Q) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.HelperHeaderPreference", "initView : bindView = " + this.S + "contact = " + this.Q);
            return;
        }
        java.lang.String d17 = z3Var.d1();
        if (this.M != null && this.Q.d1().equals(d17)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.M, d17, null);
        }
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setText(this.Q.f2());
        }
        hr3.i9 i9Var = this.R;
        if (i9Var != null) {
            i9Var.a(this);
            java.lang.CharSequence hint = this.R.getHint();
            if (hint == null) {
                this.P.setVisibility(8);
            } else {
                this.P.setText(hint);
                this.P.setVisibility(0);
            }
        }
    }

    public void N(com.tencent.mm.storage.z3 z3Var, hr3.i9 i9Var) {
        hr3.i9 i9Var2 = this.R;
        if (i9Var2 != null) {
            i9Var2.onDetach();
        }
        iz5.a.g(null, z3Var != null);
        this.Q = z3Var;
        this.R = i9Var;
        M();
    }

    public void O(boolean z17) {
        if (this.R == null) {
            return;
        }
        android.content.Context context = this.f197770d;
        if (!z17) {
            this.N.setTextColor(com.tencent.mm.ui.tools.gd.a(context));
            this.N.setText(com.tencent.mm.R.string.iwu);
            this.N.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.drawable.bnh, 0, 0, 0);
        } else {
            android.widget.TextView textView = this.N;
            iz5.a.g(null, context != null);
            textView.setTextColor(new com.tencent.mm.ui.tools.gd(context).f210448a[0]);
            this.N.setText(com.tencent.mm.R.string.iwo);
            this.N.setCompoundDrawablesWithIntrinsicBounds(com.tencent.mm.R.drawable.bni, 0, 0, 0);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        this.M = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cav);
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cdv);
        this.L = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cdf);
        this.P = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483889cd0);
        this.S = true;
        M();
        super.t(view);
    }

    public HelperHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = false;
    }

    public HelperHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.S = false;
    }
}
