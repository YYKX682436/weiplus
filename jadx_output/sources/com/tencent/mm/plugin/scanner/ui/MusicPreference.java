package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class MusicPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public android.widget.ImageButton M;
    public boolean N;
    public android.view.View.OnClickListener P;
    public java.lang.String Q;
    public java.lang.String R;
    public java.lang.String S;
    public com.tencent.mm.plugin.scanner.ui.s T;

    public MusicPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void M(boolean z17) {
        this.N = z17;
        android.widget.ImageButton imageButton = this.M;
        if (imageButton != null) {
            if (z17) {
                imageButton.setImageResource(com.tencent.mm.R.drawable.auy);
            } else {
                imageButton.setImageResource(com.tencent.mm.R.drawable.auw);
            }
        }
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
        super.t(view);
        if (this.P == null) {
            this.P = new com.tencent.mm.plugin.scanner.ui.r(this);
        }
        android.widget.ImageButton imageButton = (android.widget.ImageButton) view.findViewById(com.tencent.mm.R.id.l2t);
        this.M = imageButton;
        imageButton.setOnClickListener(this.P);
        if (this.N) {
            this.M.setImageResource(com.tencent.mm.R.drawable.auy);
        } else {
            this.M.setImageResource(com.tencent.mm.R.drawable.auw);
        }
    }

    public MusicPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = null;
        this.Q = "";
        this.R = "";
        this.S = "";
        this.G = com.tencent.mm.R.layout.c0p;
    }
}
