package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yv {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f120474a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f120475b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f120476c;

    public yv(android.content.Context context, android.view.ViewGroup rootView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f120474a = textView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        this.f120475b = weImageView;
        this.f120476c = "";
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        textView.setTextSize(0, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479597a7));
        textView.setBackgroundResource(com.tencent.mm.R.drawable.a8x);
        textView.setPadding(ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 10.0f), textView.getPaddingTop(), ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 10.0f), textView.getPaddingBottom());
        android.content.res.Resources resources = context.getResources();
        weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_close, resources != null ? resources.getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5) : -1));
        if (rootView instanceof android.widget.RelativeLayout) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.topMargin = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 150.0f);
            rootView.addView(textView, layoutParams);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs), (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs));
            layoutParams2.topMargin = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 150.0f);
            rootView.addView(weImageView, layoutParams2);
        } else {
            rootView.addView(textView);
            rootView.addView(weImageView);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
        int dimensionPixelOffset = (int) (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x - com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480468ys));
        if (dimensionPixelOffset > 0) {
            layoutParams3.width = dimensionPixelOffset;
        }
        if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).setMarginStart(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn));
        }
        textView.setOnLongClickListener(new com.tencent.mm.plugin.finder.live.widget.xv(this, context));
    }
}
