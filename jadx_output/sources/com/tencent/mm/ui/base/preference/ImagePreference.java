package com.tencent.mm.ui.base.preference;

/* loaded from: classes4.dex */
public final class ImagePreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.ImageView L;
    public final com.tencent.mm.ui.base.preference.l M;

    public ImagePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        this.L = imageView;
        com.tencent.mm.ui.base.preference.l lVar = this.M;
        if (imageView == null) {
            lVar.getClass();
        } else if (lVar.f197839a != -1) {
            imageView.setImageDrawable(i65.a.i(imageView.getContext(), lVar.f197839a));
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.chj);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.c0b, viewGroup2);
        return u17;
    }

    public ImagePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        com.tencent.mm.ui.base.preference.l lVar = new com.tencent.mm.ui.base.preference.l();
        this.M = lVar;
        this.G = com.tencent.mm.R.layout.c0b;
        this.H = com.tencent.mm.R.layout.f489294c10;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447192j);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            lVar.f197839a = resourceId;
            android.widget.ImageView imageView = this.L;
            if (imageView != null && resourceId != -1) {
                imageView.setImageDrawable(i65.a.i(imageView.getContext(), lVar.f197839a));
            }
        }
        obtainStyledAttributes.recycle();
    }
}
