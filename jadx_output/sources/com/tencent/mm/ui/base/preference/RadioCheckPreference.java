package com.tencent.mm.ui.base.preference;

/* loaded from: classes.dex */
public class RadioCheckPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.CheckBox L;
    public android.widget.TextView M;
    public int N;
    public java.lang.String P;
    public int Q;
    public final int R;

    public RadioCheckPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.lhx);
        this.L = checkBox;
        checkBox.setChecked(false);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o_v);
        this.M = textView;
        java.lang.String str = this.P;
        int i17 = this.N;
        this.N = i17;
        this.P = str;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (!android.text.TextUtils.isEmpty(this.P)) {
                this.M.setText(this.P);
            }
        }
        int i18 = this.Q;
        this.Q = i18;
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setVisibility(i18);
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.L.getLayoutParams();
        int i19 = this.R;
        if (-1 != i19) {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, i19, layoutParams.bottomMargin);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.c17, viewGroup2);
        return u17;
    }

    public RadioCheckPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = -1;
        this.P = "";
        this.Q = 8;
        this.R = -1;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
