package com.tencent.mm.ui.base.preference;

/* loaded from: classes9.dex */
public class CheckBoxPreference extends com.tencent.mm.ui.base.preference.Preference {
    public boolean L;
    public com.tencent.mm.ui.widget.MMSwitchBtn M;
    public android.widget.TextView N;
    public int P;
    public java.lang.String Q;
    public int R;
    public android.view.View S;
    public android.view.View.OnClickListener T;
    public android.widget.TextView U;
    public com.tencent.mm.ui.base.preference.d V;
    public final boolean W;

    public CheckBoxPreference(android.content.Context context) {
        this(context, null);
    }

    public int M() {
        return com.tencent.mm.R.layout.f489297c13;
    }

    public boolean N() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.M;
        return mMSwitchBtn != null ? mMSwitchBtn.f211363x : this.L;
    }

    public void O(boolean z17) {
        this.L = z17;
    }

    public void Q(java.lang.String str, int i17) {
        this.P = i17;
        this.Q = str;
        android.widget.TextView textView = this.N;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (android.text.TextUtils.isEmpty(this.Q)) {
                return;
            }
            this.N.setText(this.Q);
        }
    }

    public void R(int i17) {
        this.R = i17;
        android.widget.TextView textView = this.N;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void S(boolean z17) {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.M;
        if (mMSwitchBtn != null) {
            this.L = z17;
            mMSwitchBtn.setCheck(z17);
        }
    }

    public final void T() {
        if (this.M == null || this.S == null) {
            return;
        }
        if (r()) {
            this.M.setEnabled(true);
            ((android.widget.TextView) this.S.findViewById(android.R.id.title)).setTextColor(this.S.getResources().getColor(com.tencent.mm.R.color.a0c));
        } else {
            this.M.setEnabled(false);
            ((android.widget.TextView) this.S.findViewById(android.R.id.title)).setTextColor(this.S.getResources().getColor(com.tencent.mm.R.color.f478895k4));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public java.lang.String l() {
        return N() ? "1" : "0";
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public int m() {
        return 1;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        this.S = view;
        this.U = (android.widget.TextView) view.findViewById(android.R.id.summary);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) view.findViewById(com.tencent.mm.R.id.btf);
        this.M = mMSwitchBtn;
        mMSwitchBtn.setRemoveAnimateEndPost(this.W);
        this.M.setSwitchListener(new com.tencent.mm.ui.base.preference.c(this));
        this.M.setCheck(this.L);
        this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o_v);
        Q(this.Q, this.P);
        R(this.R);
        T();
        com.tencent.mm.ui.base.preference.d dVar = this.V;
        if (dVar != null) {
            dVar.a(view);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, M(), viewGroup2);
        this.S = u17;
        android.view.View.OnClickListener onClickListener = this.T;
        if (onClickListener != null) {
            u17.setOnClickListener(onClickListener);
        }
        return this.S;
    }

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.P = -1;
        this.Q = "";
        this.R = 8;
        this.W = false;
        this.G = com.tencent.mm.R.layout.byv;
        this.W = context.obtainStyledAttributes(attributeSet, yl5.a.f463095b).getBoolean(0, false);
    }
}
