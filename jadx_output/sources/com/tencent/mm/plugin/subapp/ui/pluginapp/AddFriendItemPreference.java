package com.tencent.mm.plugin.subapp.ui.pluginapp;

/* loaded from: classes11.dex */
public class AddFriendItemPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final java.lang.String L;
    public final int M;
    public int N;
    public final int P;
    public final android.content.Context Q;

    public AddFriendItemPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        com.tencent.mm.ui.MMImageView mMImageView = (com.tencent.mm.ui.MMImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        if (mMImageView != null) {
            mMImageView.setVisibility(8);
            android.graphics.drawable.Drawable drawable = this.f197779p;
            if (drawable != null) {
                mMImageView.setImageDrawable(drawable);
                mMImageView.setVisibility(0);
            } else {
                int i17 = this.f197777n;
                if (i17 != 0) {
                    mMImageView.setImageResource(i17);
                    mMImageView.setVisibility(0);
                }
            }
            int i18 = this.f197778o;
            if (i18 != 0) {
                mMImageView.getDrawable().setColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else if (mMImageView.getDrawable() != null) {
                mMImageView.getDrawable().clearColorFilter();
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.jlx);
        int i19 = this.P;
        if (i19 != -1) {
            linearLayout.setMinimumHeight(i19);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o58);
        if (textView != null) {
            textView.setVisibility(this.N);
            textView.setText(this.L);
            int i27 = this.M;
            if (i27 != -1) {
                textView.setBackgroundDrawable(i65.a.i(this.Q, i27));
            }
        }
    }

    public AddFriendItemPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddFriendItemPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = -1;
        this.N = 8;
        this.P = -1;
        this.Q = context;
        this.G = com.tencent.mm.R.layout.bz8;
    }
}
