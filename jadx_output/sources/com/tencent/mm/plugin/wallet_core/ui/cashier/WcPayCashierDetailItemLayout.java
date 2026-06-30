package com.tencent.mm.plugin.wallet_core.ui.cashier;

/* loaded from: classes9.dex */
public class WcPayCashierDetailItemLayout extends android.widget.LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f180188h = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 288);

    /* renamed from: i, reason: collision with root package name */
    public static final int f180189i = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20);

    /* renamed from: m, reason: collision with root package name */
    public static final int f180190m = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 11);

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f180191d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f180192e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180193f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f180194g;

    public WcPayCashierDetailItemLayout(android.content.Context context) {
        super(context);
        b();
    }

    public void a() {
        if (this.f180193f.getVisibility() != 8) {
            post(new et4.j(this));
        }
    }

    public final void b() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f489637d90, this);
        this.f180191d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ppg);
        this.f180192e = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.pph);
        this.f180193f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ppj);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById(com.tencent.mm.R.id.ppi);
        this.f180194g = cdnImageView;
        android.graphics.drawable.Drawable drawable = cdnImageView.getDrawable();
        if (drawable != null) {
            drawable.setColorFilter(getResources().getColor(com.tencent.mm.R.color.BW_50), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
    }

    public WcPayCashierDetailItemLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public WcPayCashierDetailItemLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }
}
