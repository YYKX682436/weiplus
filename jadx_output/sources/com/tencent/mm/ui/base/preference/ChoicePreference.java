package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public final class ChoicePreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.RadioGroup L;
    public final java.util.HashMap M;
    public java.lang.String N;
    public int P;
    public java.lang.CharSequence[] Q;
    public java.lang.CharSequence[] R;
    public com.tencent.mm.ui.base.preference.q0 S;

    public ChoicePreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void D(com.tencent.mm.ui.base.preference.q0 q0Var) {
        this.S = q0Var;
    }

    public void M(java.lang.String str) {
        this.N = str;
        com.tencent.mm.ui.base.preference.e eVar = (com.tencent.mm.ui.base.preference.e) this.M.get(str);
        if (eVar == null) {
            this.P = -1;
        } else {
            this.P = eVar.f197797b;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.RadioGroup radioGroup = this.L;
        if (radioGroup != null) {
            radioGroup.check(this.P);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzc, viewGroup2);
        this.L = (android.widget.RadioGroup) u17.findViewById(com.tencent.mm.R.id.gtt);
        int i17 = 0;
        while (true) {
            java.lang.CharSequence[] charSequenceArr = this.R;
            if (i17 >= charSequenceArr.length) {
                this.L.setOnCheckedChangeListener(new com.tencent.mm.ui.base.preference.f(this));
                return u17;
            }
            com.tencent.mm.ui.base.preference.e eVar = (com.tencent.mm.ui.base.preference.e) this.M.get(charSequenceArr[i17]);
            if (eVar != null) {
                int i18 = eVar.f197797b;
                java.lang.CharSequence charSequence = eVar.f197796a;
                if (i17 == 0) {
                    android.widget.RadioButton radioButton = (android.widget.RadioButton) layoutInflater.inflate(com.tencent.mm.R.layout.by7, (android.view.ViewGroup) null);
                    radioButton.setText(charSequence);
                    radioButton.setId(i18);
                    this.L.addView(radioButton);
                } else if (i17 == this.R.length - 1) {
                    android.widget.RadioButton radioButton2 = (android.widget.RadioButton) layoutInflater.inflate(com.tencent.mm.R.layout.by9, (android.view.ViewGroup) null);
                    radioButton2.setText(charSequence);
                    radioButton2.setId(i18);
                    this.L.addView(radioButton2);
                } else {
                    android.widget.RadioButton radioButton3 = (android.widget.RadioButton) layoutInflater.inflate(com.tencent.mm.R.layout.by8, (android.view.ViewGroup) null);
                    radioButton3.setText(charSequence);
                    radioButton3.setId(i18);
                    this.L.addView(radioButton3);
                }
            }
            i17++;
        }
    }

    public ChoicePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChoicePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.M = hashMap;
        this.P = -1;
        int i18 = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447188f, i17, 0);
        this.Q = obtainStyledAttributes.getTextArray(0);
        this.R = obtainStyledAttributes.getTextArray(1);
        obtainStyledAttributes.recycle();
        if (this.Q == null) {
            this.Q = new java.lang.CharSequence[0];
        }
        if (this.R == null) {
            this.R = new java.lang.CharSequence[0];
        }
        iz5.a.g("entries count different", this.Q.length == this.R.length);
        hashMap.clear();
        while (true) {
            java.lang.CharSequence[] charSequenceArr = this.R;
            if (i18 >= charSequenceArr.length) {
                return;
            }
            java.lang.CharSequence charSequence = charSequenceArr[i18];
            hashMap.put(charSequence, new com.tencent.mm.ui.base.preference.e(charSequence, this.Q[i18], 1048576 + i18));
            i18++;
        }
    }
}
