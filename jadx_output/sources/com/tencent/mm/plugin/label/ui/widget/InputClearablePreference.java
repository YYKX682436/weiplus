package com.tencent.mm.plugin.label.ui.widget;

/* loaded from: classes8.dex */
public class InputClearablePreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;
    public boolean R;
    public com.tencent.mm.ui.widget.MMEditText S;
    public android.widget.ImageView T;
    public android.widget.TextView U;
    public int V;
    public k93.h W;

    public InputClearablePreference(android.content.Context context) {
        this(context, null);
    }

    public final void M(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        int f17 = com.tencent.mm.ui.tools.v4.f(str);
        int i17 = this.Q;
        boolean z17 = f17 > i17;
        int b17 = com.tencent.mm.ui.tools.v4.b(i17, "");
        int d17 = com.tencent.mm.ui.tools.v4.d(this.Q, str);
        android.widget.TextView textView = this.U;
        if (textView != null) {
            if (z17) {
                textView.setText(java.lang.String.format(this.N, java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(d17)));
                this.U.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        k93.h hVar = this.W;
        if (hVar != null) {
            boolean z18 = f17 <= this.Q;
            com.tencent.mm.plugin.label.ui.ContactLabelEditUI contactLabelEditUI = ((f93.l1) hVar).f260379a;
            if (contactLabelEditUI.f143235v || !contactLabelEditUI.f143236w) {
                contactLabelEditUI.enableOptionMenu(z18);
            } else {
                contactLabelEditUI.enableOptionMenu(false);
                contactLabelEditUI.f143236w = false;
            }
        }
    }

    public void N(java.lang.String str) {
        this.L = str;
        if (this.S == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        this.S.setText(((ke0.e) xVar).bj(this.f197770d, this.L, this.V));
        M(this.L);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.V = i65.a.h(this.f197770d, com.tencent.mm.R.dimen.f479853h2);
        this.S = (com.tencent.mm.ui.widget.MMEditText) view.findViewById(com.tencent.mm.R.id.d98);
        this.T = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f484039ct2);
        this.U = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dhb);
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.S;
        if (mMEditText != null) {
            mMEditText.setFilters(new android.text.InputFilter[]{new k93.i(this)});
        }
        this.S.addTextChangedListener(new k93.d(this));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.L);
        sb6.append("");
        N(this.L);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            this.S.setSelection(this.L.length());
        }
        if (this.R) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new k93.g(this), 0L);
        }
        this.S.setHint(this.M);
        this.T.setOnClickListener(new k93.e(this));
        android.widget.TextView textView = this.U;
        if (textView != null) {
            textView.setOnTouchListener(new k93.f(this));
        }
    }

    public InputClearablePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InputClearablePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
