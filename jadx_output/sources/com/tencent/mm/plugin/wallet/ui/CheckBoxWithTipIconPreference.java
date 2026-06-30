package com.tencent.mm.plugin.wallet.ui;

/* loaded from: classes.dex */
public class CheckBoxWithTipIconPreference extends com.tencent.mm.ui.base.preference.CheckBoxPreference {
    public android.widget.TextView X;
    public int Y;
    public java.lang.String Z;

    /* renamed from: p0, reason: collision with root package name */
    public int f179128p0;

    public CheckBoxWithTipIconPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference
    public void Q(java.lang.String str, int i17) {
        this.Y = i17;
        this.Z = str;
        android.widget.TextView textView = this.X;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (android.text.TextUtils.isEmpty(this.Z)) {
                return;
            }
            this.X.setText(this.Z);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference
    public void R(int i17) {
        this.f179128p0 = i17;
        android.widget.TextView textView = this.X;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.CheckBoxPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.X = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o_v);
        Q(this.Z, this.Y);
        R(this.f179128p0);
    }

    public CheckBoxWithTipIconPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Y = -1;
        this.Z = "";
        this.f179128p0 = 8;
        this.G = com.tencent.mm.R.layout.f489300c16;
    }
}
