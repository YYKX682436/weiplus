package com.tencent.mm.plugin.story.ui.view.gallery;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryPostTip;", "Landroid/widget/RelativeLayout;", "Landroid/widget/LinearLayout;", "d", "Landroid/widget/LinearLayout;", "getPostTipLayout", "()Landroid/widget/LinearLayout;", "setPostTipLayout", "(Landroid/widget/LinearLayout;)V", "postTipLayout", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "getPostTipIv", "()Landroid/widget/ImageView;", "setPostTipIv", "(Landroid/widget/ImageView;)V", "postTipIv", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getPostTipTv", "()Landroid/widget/TextView;", "setPostTipTv", "(Landroid/widget/TextView;)V", "postTipTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StoryGalleryPostTip extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.widget.LinearLayout postTipLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.widget.ImageView postTipIv;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView postTipTv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryGalleryPostTip(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.cwp, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.no7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.postTipIv = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.no8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.postTipTv = (android.widget.TextView) findViewById2;
        android.widget.ImageView imageView = this.postTipIv;
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_error);
        com.tencent.mm.ui.uk.f(drawable, -65536);
        imageView.setImageDrawable(drawable);
        setVisibility(8);
    }

    public final android.widget.ImageView getPostTipIv() {
        return this.postTipIv;
    }

    public final android.widget.LinearLayout getPostTipLayout() {
        return this.postTipLayout;
    }

    public final android.widget.TextView getPostTipTv() {
        return this.postTipTv;
    }

    public final void setPostTipIv(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.postTipIv = imageView;
    }

    public final void setPostTipLayout(android.widget.LinearLayout linearLayout) {
        this.postTipLayout = linearLayout;
    }

    public final void setPostTipTv(android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(textView, "<set-?>");
        this.postTipTv = textView;
    }
}
