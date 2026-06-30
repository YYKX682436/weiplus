package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class CdnImageIconPreference extends com.tencent.mm.ui.base.preference.IconPreference {
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView Y1;

    public CdnImageIconPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.Y1 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            return;
        }
        this.Y1.setUseSdcardCache(true);
        this.Y1.setUrl(null);
        this.Y1.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.f488378rp, viewGroup2);
        return u17;
    }

    public CdnImageIconPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
