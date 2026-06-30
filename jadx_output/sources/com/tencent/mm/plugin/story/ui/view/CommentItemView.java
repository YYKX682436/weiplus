package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000289B!\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b5\u00107R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006:"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/CommentItemView;", "Landroid/widget/LinearLayout;", "", "Landroid/animation/ValueAnimator;", "d", "Landroid/animation/ValueAnimator;", "getNormalAnimator", "()Landroid/animation/ValueAnimator;", "setNormalAnimator", "(Landroid/animation/ValueAnimator;)V", "normalAnimator", "e", "getNormalBgAnimator", "setNormalBgAnimator", "normalBgAnimator", "Landroid/view/View;", "f", "Landroid/view/View;", "getMaskView", "()Landroid/view/View;", "setMaskView", "(Landroid/view/View;)V", "maskView", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "getAvatarView", "()Landroid/widget/ImageView;", "setAvatarView", "(Landroid/widget/ImageView;)V", "avatarView", "Landroid/view/ViewGroup;", "h", "Landroid/view/ViewGroup;", "getContentLayout", "()Landroid/view/ViewGroup;", "setContentLayout", "(Landroid/view/ViewGroup;)V", "contentLayout", "Lgf4/a;", "i", "Lgf4/a;", "getComment", "()Lgf4/a;", "setComment", "(Lgf4/a;)V", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rf4/b", "rf4/c", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CommentItemView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.animation.ValueAnimator normalAnimator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.animation.ValueAnimator normalBgAnimator;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View maskView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.ImageView avatarView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public android.view.ViewGroup contentLayout;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public gf4.a comment;

    /* renamed from: m, reason: collision with root package name */
    public boolean f171888m;

    /* renamed from: n, reason: collision with root package name */
    public final int f171889n;

    /* renamed from: o, reason: collision with root package name */
    public int f171890o;

    /* renamed from: p, reason: collision with root package name */
    public int f171891p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.comment = new gf4.a();
        this.f171889n = i65.a.b(context, 48);
    }

    public final android.widget.ImageView getAvatarView() {
        android.widget.ImageView imageView = this.avatarView;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("avatarView");
        throw null;
    }

    public final gf4.a getComment() {
        return this.comment;
    }

    public final android.view.ViewGroup getContentLayout() {
        android.view.ViewGroup viewGroup = this.contentLayout;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.o.o("contentLayout");
        throw null;
    }

    public final android.view.View getMaskView() {
        android.view.View view = this.maskView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.o.o("maskView");
        throw null;
    }

    public final android.animation.ValueAnimator getNormalAnimator() {
        return this.normalAnimator;
    }

    public final android.animation.ValueAnimator getNormalBgAnimator() {
        return this.normalBgAnimator;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nkf);
        if (findViewById == null) {
            findViewById = findViewById(com.tencent.mm.R.id.nkm);
        }
        if (findViewById == null) {
            setMaskView(this);
        } else {
            setMaskView(findViewById);
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nkz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        setAvatarView((android.widget.ImageView) findViewById2);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487125nl3);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        setContentLayout((android.view.ViewGroup) findViewById3);
    }

    public final void setAvatarView(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.avatarView = imageView;
    }

    public final void setComment(gf4.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.comment = aVar;
    }

    public final void setContentLayout(android.view.ViewGroup viewGroup) {
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        this.contentLayout = viewGroup;
    }

    public final void setMaskView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<set-?>");
        this.maskView = view;
    }

    public final void setNormalAnimator(android.animation.ValueAnimator valueAnimator) {
        this.normalAnimator = valueAnimator;
    }

    public final void setNormalBgAnimator(android.animation.ValueAnimator valueAnimator) {
        this.normalBgAnimator = valueAnimator;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
