package com.tencent.mm.wallet_core.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R*\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/wallet_core/ui/WcPayBannerView;", "Landroid/widget/LinearLayout;", "Lr45/tw4;", "bannerItem", "Ljz5/f0;", "setBannerData", "", "value", "bgColor", "I", "getBgColor", "()I", "setBgColor", "(I)V", "textColor", "getTextColor", "setTextColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WcPayBannerView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f214100d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f214101e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f214102f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f214103g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f214104h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WcPayBannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d8x, this);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate;
        this.f214103g = linearLayout;
        android.view.View findViewById = linearLayout.findViewById(com.tencent.mm.R.id.pgc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f214104h = (android.widget.LinearLayout) findViewById;
        android.widget.LinearLayout linearLayout2 = this.f214103g;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = linearLayout2.findViewById(com.tencent.mm.R.id.pg_);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f214100d = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById2;
        android.widget.LinearLayout linearLayout3 = this.f214103g;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = linearLayout3.findViewById(com.tencent.mm.R.id.pgb);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f214101e = (android.widget.TextView) findViewById3;
        android.widget.LinearLayout linearLayout4 = this.f214103g;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View findViewById4 = linearLayout4.findViewById(com.tencent.mm.R.id.pg9);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f214102f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.f214100d;
        if (cdnImageView == null) {
            kotlin.jvm.internal.o.o("iconIv");
            throw null;
        }
        cdnImageView.setUseSdcardCache(true);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = this.f214100d;
        if (cdnImageView2 != null) {
            cdnImageView2.setImgSavedDir(com.tencent.mm.wallet_core.f.a());
        } else {
            kotlin.jvm.internal.o.o("iconIv");
            throw null;
        }
    }

    public final void a() {
        setBgColor(getResources().getColor(com.tencent.mm.R.color.f478526a7));
        setTextColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
    }

    public final int getBgColor() {
        return 0;
    }

    public final int getTextColor() {
        return 0;
    }

    public final void setBannerData(r45.tw4 tw4Var) {
        boolean z17;
        if (tw4Var == null) {
            setVisibility(8);
            return;
        }
        if (tw4Var.f386831d == 0) {
            setVisibility(8);
            return;
        }
        boolean z18 = false;
        setVisibility(0);
        android.widget.TextView textView = this.f214101e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView.setLineSpacing(2.0f, 1.0f);
        android.widget.TextView textView2 = this.f214101e;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView2.setText(tw4Var.f386832e);
        java.lang.String str = tw4Var.f386833f;
        if (str == null || str.length() == 0) {
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.f214100d;
            if (cdnImageView == null) {
                kotlin.jvm.internal.o.o("iconIv");
                throw null;
            }
            cdnImageView.setVisibility(8);
            z17 = false;
        } else {
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = this.f214100d;
            if (cdnImageView2 == null) {
                kotlin.jvm.internal.o.o("iconIv");
                throw null;
            }
            cdnImageView2.setUrl(tw4Var.f386833f);
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView3 = this.f214100d;
            if (cdnImageView3 == null) {
                kotlin.jvm.internal.o.o("iconIv");
                throw null;
            }
            cdnImageView3.setVisibility(0);
            z17 = true;
        }
        java.lang.String str2 = tw4Var.f386834g;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f214102f;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("arrowIv");
                throw null;
            }
            weImageView.setVisibility(8);
        } else {
            setOnClickListener(new com.tencent.mm.wallet_core.ui.g2(this, tw4Var));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f214102f;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("arrowIv");
                throw null;
            }
            weImageView2.setVisibility(0);
            setForeground(getResources().getDrawable(com.tencent.mm.R.drawable.bae));
            z18 = true;
        }
        if (!z17 && !z18) {
            android.widget.TextView textView3 = this.f214101e;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView3.setGravity(1);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24273, tw4Var.f386835h, 1);
    }

    public final void setBgColor(int i17) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i65.a.b(getContext(), 8));
        gradientDrawable.setColor(i17);
        android.widget.LinearLayout linearLayout = this.f214104h;
        if (linearLayout != null) {
            linearLayout.setBackground(gradientDrawable);
        } else {
            kotlin.jvm.internal.o.o("bannerLayout");
            throw null;
        }
    }

    public final void setTextColor(int i17) {
        android.widget.TextView textView = this.f214101e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView.setTextColor(i17);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f214102f;
        if (weImageView != null) {
            weImageView.setIconColor(i17);
        } else {
            kotlin.jvm.internal.o.o("arrowIv");
            throw null;
        }
    }
}
