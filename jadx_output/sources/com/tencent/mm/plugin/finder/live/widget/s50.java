package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class s50 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.s50 f119723a = new com.tencent.mm.plugin.finder.live.widget.s50();

    public final void a(android.view.View optionView, android.content.Context context, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(optionView, "optionView");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "updateOptionAppearance: option=" + optionView.getTag() + ", isSelected=" + z17 + ", isDisabled=" + z18);
        int color = z18 ? context.getColor(com.tencent.mm.R.color.f478492d) : z17 ? context.getColor(com.tencent.mm.R.color.Brand_Alpha_0_1) : context.getColor(com.tencent.mm.R.color.f478492d);
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setOptionBackgroundColor: color=" + ((!z18 && z17) ? "Brand_Alpha_0_1" : "BG_3") + ", isSelected=" + z17 + ", isDisabled=" + z18);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(context.getResources().getDisplayMetrics().density * 8.0f);
        optionView.setBackground(gradientDrawable);
        android.widget.TextView textView = (android.widget.TextView) optionView.findViewById(com.tencent.mm.R.id.kk9);
        java.lang.String str = "Brand_100";
        if (textView != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setOptionTextColor: color=" + (z18 ? "Glyph_2" : z17 ? "Brand_100" : "Glyph_1") + ", isSelected=" + z17 + ", isDisabled=" + z18);
            int color2 = z18 ? context.getColor(com.tencent.mm.R.color.f478520a84) : z17 ? context.getColor(com.tencent.mm.R.color.Brand_100) : context.getColor(com.tencent.mm.R.color.adg);
            int currentTextColor = textView.getCurrentTextColor();
            if (currentTextColor != color2) {
                android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(currentTextColor, color2);
                ofArgb.setDuration(200L);
                ofArgb.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
                ofArgb.addUpdateListener(new com.tencent.mm.plugin.finder.live.widget.r50(textView));
                ofArgb.start();
            } else {
                textView.setTextColor(color2);
            }
            if (z17) {
                com.tencent.mm.ui.bk.s0(textView.getPaint());
            } else {
                com.tencent.mm.ui.bk.t0(textView.getPaint());
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) optionView.findViewById(com.tencent.mm.R.id.f486199kk2);
        if (imageView != null) {
            if (z18) {
                str = "Glyph_2";
            } else if (!z17) {
                str = "Glyph_1";
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLiveModeTabWidget", "setOptionIconColor: color=" + str + ", isSelected=" + z17 + ", isDisabled=" + z18);
            imageView.setColorFilter(z18 ? context.getColor(com.tencent.mm.R.color.f478520a84) : z17 ? context.getColor(com.tencent.mm.R.color.Brand_100) : context.getColor(com.tencent.mm.R.color.adg), android.graphics.PorterDuff.Mode.SRC_IN);
        }
    }
}
