package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes4.dex */
public class IconWidgetPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.ImageView L;
    public final int M;
    public android.graphics.Bitmap N;

    public IconWidgetPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.l2u);
        this.L = imageView;
        if (imageView != null) {
            imageView.setVisibility(8);
            int i17 = this.M;
            if (i17 != -1) {
                this.L.setImageResource(i17);
                this.L.setVisibility(0);
                return;
            }
            android.graphics.Bitmap bitmap = this.N;
            if (bitmap != null) {
                this.L.setImageBitmap(bitmap);
                this.L.setVisibility(0);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c18, viewGroup2);
        return u17;
    }

    public IconWidgetPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconWidgetPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = -1;
        this.N = null;
        this.G = com.tencent.mm.R.layout.byv;
        this.H = 0;
    }
}
