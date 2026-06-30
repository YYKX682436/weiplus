package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public final class PluginTextPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.ImageView L;
    public android.widget.TextView M;
    public int N;
    public java.lang.String P;
    public final int Q;
    public int R;

    public PluginTextPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        this.L = imageView;
        imageView.setImageResource(this.N);
        this.L.setVisibility(this.R);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o57);
        this.M = textView;
        textView.setText(this.P);
        this.M.setTextColor(this.Q);
    }

    public PluginTextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PluginTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.M = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.A);
        this.G = obtainStyledAttributes.getResourceId(1, com.tencent.mm.R.layout.bzt);
        this.N = obtainStyledAttributes.getResourceId(0, 0);
        this.P = obtainStyledAttributes.getString(2);
        this.Q = obtainStyledAttributes.getColor(3, -7039852);
        obtainStyledAttributes.recycle();
    }
}
