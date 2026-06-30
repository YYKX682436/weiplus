package com.tencent.mm.ui.base;

/* loaded from: classes11.dex */
public class MMProgressBar extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f197518d;

    /* renamed from: e, reason: collision with root package name */
    public int f197519e;

    /* renamed from: f, reason: collision with root package name */
    public int f197520f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f197521g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f197522h;

    /* renamed from: i, reason: collision with root package name */
    public db5.f5 f197523i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f197524m;

    public MMProgressBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197518d = 100;
        this.f197519e = 0;
        this.f197520f = 0;
        this.f197524m = new com.tencent.mm.sdk.platformtools.b4(new db5.e5(this), false);
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.c19, this);
        this.f197521g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jm8);
        this.f197522h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jm9);
    }

    public static void a(com.tencent.mm.ui.base.MMProgressBar mMProgressBar, int i17) {
        mMProgressBar.f197521g.setWidth(mMProgressBar.getProgressLength());
        db5.f5 f5Var = mMProgressBar.f197523i;
        if (f5Var != null) {
            com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI = ((com.tencent.mm.plugin.traceroute.ui.s) f5Var).f175336a;
            if (i17 < 5) {
                networkDiagnoseUI.f175315h.setText(networkDiagnoseUI.getString(com.tencent.mm.R.string.bb_));
            } else if (i17 < 5 || i17 >= 95) {
                networkDiagnoseUI.f175315h.setText(networkDiagnoseUI.getString(com.tencent.mm.R.string.k49));
            } else {
                networkDiagnoseUI.f175315h.setText(networkDiagnoseUI.getString(com.tencent.mm.R.string.f492244fs0));
            }
        }
    }

    private int getProgressLength() {
        int width = (getWidth() * this.f197519e) / this.f197518d;
        return width < com.tencent.mm.sdk.platformtools.j.d(getContext(), 20.0f) ? com.tencent.mm.sdk.platformtools.j.d(getContext(), 20.0f) : width;
    }

    public int getMax() {
        return this.f197518d;
    }

    public int getProgress() {
        return this.f197520f;
    }

    public void setAutoProgress(boolean z17) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f197524m;
        if (z17) {
            b4Var.c(40L, 40L);
        } else {
            b4Var.d();
        }
    }

    public void setMax(int i17) {
        this.f197518d = i17;
    }

    public void setOnProgressChangedListener(db5.f5 f5Var) {
        this.f197523i = f5Var;
    }

    public void setProgress(int i17) {
        int i18 = this.f197518d;
        if (i17 > i18) {
            i17 = i18;
        }
        this.f197520f = i17;
        if (this.f197524m.e()) {
            setAutoProgress(true);
        }
    }

    public void setTips(java.lang.CharSequence charSequence) {
        this.f197522h.setText(charSequence);
    }
}
