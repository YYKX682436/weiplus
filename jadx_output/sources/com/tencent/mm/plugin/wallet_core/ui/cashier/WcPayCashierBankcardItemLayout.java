package com.tencent.mm.plugin.wallet_core.ui.cashier;

/* loaded from: classes9.dex */
public class WcPayCashierBankcardItemLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f180183d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180184e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180185f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RadioButton f180186g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout f180187h;

    public WcPayCashierBankcardItemLayout(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.d8z, this);
        this.f180183d = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.pol);
        this.f180184e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pon);
        this.f180185f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.poo);
        this.f180186g = (android.widget.RadioButton) findViewById(com.tencent.mm.R.id.pos);
        this.f180187h = (com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout) findViewById(com.tencent.mm.R.id.poq);
    }

    public WcPayCashierBankcardItemLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public WcPayCashierBankcardItemLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
