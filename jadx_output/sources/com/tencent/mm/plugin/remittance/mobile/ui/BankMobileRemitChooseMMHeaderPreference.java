package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes8.dex */
public class BankMobileRemitChooseMMHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final java.util.Map L;

    public BankMobileRemitChooseMMHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = new java.util.HashMap();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.acq);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.acr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(null);
            if (Bi != null) {
                imageView.setImageBitmap(Bi);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                com.tencent.mm.plugin.remittance.mobile.ui.a aVar = new com.tencent.mm.plugin.remittance.mobile.ui.a(this, imageView);
                ((java.util.HashMap) this.L).put(null, aVar);
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(null, aVar);
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            return;
        }
        textView.setText((java.lang.CharSequence) null);
    }

    public BankMobileRemitChooseMMHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new java.util.HashMap();
    }

    public BankMobileRemitChooseMMHeaderPreference(android.content.Context context) {
        super(context);
        this.L = new java.util.HashMap();
    }
}
