package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class SelfVuserPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.graphics.drawable.Drawable L;
    public java.lang.String M;

    public SelfVuserPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        if (imageView != null) {
            imageView.setImageDrawable(this.L);
            java.util.Objects.toString(this.L);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                imageView.setContentDescription(null);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o57);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(this.M);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c0x, viewGroup2);
        return u17;
    }

    public SelfVuserPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelfVuserPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
