package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/StatusPostEntryButton;", "Lcom/tencent/mm/ui/blur/BlurView;", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "Ljz5/f0;", "setTitle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class StatusPostEntryButton extends com.tencent.mm.ui.blur.BlurView {

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f173477n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatusPostEntryButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setTitle(java.lang.CharSequence title) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f173477n.setText(title);
    }

    public /* synthetic */ StatusPostEntryButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusPostEntryButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setClickable(true);
        setFocusable(true);
        int a17 = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.BW_100_Alpha_0_2);
        float a18 = ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 18.5f);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(a17);
        gradientDrawable.setCornerRadius(a18);
        setBackground(gradientDrawable);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setPadding(ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 12.0f), 0, ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 16.0f), 0);
        linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        addView(linearLayout);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(r0, r0);
        layoutParams.setMarginEnd(ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 4.0f));
        weImageView.setLayoutParams(layoutParams);
        weImageView.setImageResource(com.tencent.mm.R.raw.plus_regular);
        weImageView.setIconColor(-1);
        linearLayout.addView(weImageView);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(-1);
        textView.setTextSize(2, 15.0f);
        textView.setIncludeFontPadding(false);
        textView.setGravity(16);
        this.f173477n = textView;
        linearLayout.addView(textView);
    }
}
