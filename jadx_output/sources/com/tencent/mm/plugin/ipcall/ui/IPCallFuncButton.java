package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class IPCallFuncButton extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f142621d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142622e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f142623f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f142624g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f142625h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f142626i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f142627m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f142628n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f142629o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.i2 f142630p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnTouchListener f142631q;

    public IPCallFuncButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f142628n = false;
        this.f142629o = true;
        com.tencent.mm.plugin.ipcall.ui.h2 h2Var = new com.tencent.mm.plugin.ipcall.ui.h2(this);
        this.f142631q = h2Var;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bls, this);
        this.f142621d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.b2z);
        this.f142622e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o3b);
        android.content.res.TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, rj.t.f396154d, 0, 0);
        this.f142623f = obtainStyledAttributes.getDrawable(2);
        this.f142624g = obtainStyledAttributes.getDrawable(3);
        this.f142627m = obtainStyledAttributes.getBoolean(0, false);
        this.f142625h = obtainStyledAttributes.getDrawable(1);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f142626i = getContext().getString(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142626i)) {
            this.f142622e.setVisibility(8);
        } else {
            this.f142622e.setText(this.f142626i);
        }
        android.graphics.drawable.Drawable drawable = this.f142623f;
        if (drawable != null) {
            this.f142621d.setImageDrawable(drawable);
        }
        this.f142621d.setClickable(true);
        this.f142621d.setOnTouchListener(h2Var);
    }

    public boolean a() {
        if (this.f142627m) {
            return this.f142628n;
        }
        return false;
    }

    public java.lang.String getFuncText() {
        return this.f142626i;
    }

    public void setCheckBoxMode(boolean z17) {
        if (this.f142627m != z17) {
            this.f142627m = z17;
            this.f142628n = false;
            android.graphics.drawable.Drawable drawable = this.f142623f;
            if (drawable != null) {
                this.f142621d.setImageDrawable(drawable);
            }
        }
    }

    public void setChecked(boolean z17) {
        if (z17 == this.f142628n || !this.f142627m) {
            return;
        }
        this.f142628n = z17;
        if (z17) {
            this.f142621d.setImageDrawable(this.f142624g);
        } else {
            this.f142621d.setImageDrawable(this.f142623f);
        }
    }

    public void setClickCallback(com.tencent.mm.plugin.ipcall.ui.i2 i2Var) {
        this.f142630p = i2Var;
    }

    public void setEnable(boolean z17) {
        android.graphics.drawable.Drawable drawable;
        if (z17 != this.f142629o) {
            this.f142629o = z17;
            if (z17 || (drawable = this.f142625h) == null) {
                this.f142621d.setImageDrawable(this.f142623f);
            } else {
                this.f142621d.setImageDrawable(drawable);
            }
            this.f142628n = false;
        }
    }

    public void setFuncText(java.lang.String str) {
        this.f142626i = str;
        this.f142622e.setText(str);
    }
}
