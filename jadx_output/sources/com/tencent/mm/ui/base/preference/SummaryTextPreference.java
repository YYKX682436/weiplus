package com.tencent.mm.ui.base.preference;

/* loaded from: classes3.dex */
public class SummaryTextPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public java.lang.String M;
    public android.view.View N;

    public SummaryTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = null;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.L = (android.widget.TextView) view.findViewById(android.R.id.summary);
        if (!android.text.TextUtils.isEmpty(this.M)) {
            try {
                this.L.setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), this.M));
                com.tencent.mars.xlog.Log.i("MicroMsg.SummaryTextPreference", "setTypeface assets: %s", this.M);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SummaryTextPreference", "setTypeface assets path exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        this.N = view;
    }

    public SummaryTextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = null;
    }

    public SummaryTextPreference(android.content.Context context) {
        super(context);
        this.M = null;
    }
}
