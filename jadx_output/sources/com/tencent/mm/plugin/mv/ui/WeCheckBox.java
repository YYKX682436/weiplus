package com.tencent.mm.plugin.mv.ui;

/* loaded from: classes11.dex */
public class WeCheckBox extends com.tencent.mm.ui.widget.imageview.WeImageView {

    /* renamed from: r, reason: collision with root package name */
    public boolean f150892r;

    public WeCheckBox(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150892r = false;
    }

    public void setChecked(boolean z17) {
        this.f150892r = z17;
        if (z17) {
            setImageResource(com.tencent.mm.R.raw.icons_outlined_pause_white);
        } else {
            setImageResource(com.tencent.mm.R.raw.icons_outlined_playbtn_white);
        }
    }

    public void setOnCheckedChangeListener(jm3.j1 j1Var) {
        super.setOnClickListener(new jm3.i1(this, j1Var));
    }

    public WeCheckBox(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150892r = false;
    }
}
