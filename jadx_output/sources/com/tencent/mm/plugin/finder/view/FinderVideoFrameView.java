package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderVideoFrameView;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView;", "d", "Landroid/view/TextureView;", "getTextureView", "()Landroid/view/TextureView;", "setTextureView", "(Landroid/view/TextureView;)V", "textureView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderVideoFrameView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public android.view.TextureView textureView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoFrameView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        a();
    }

    public final void a() {
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.b_z, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f487555oz3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setTextureView((android.view.TextureView) findViewById);
    }

    public final android.view.TextureView getTextureView() {
        android.view.TextureView textureView = this.textureView;
        if (textureView != null) {
            return textureView;
        }
        kotlin.jvm.internal.o.o("textureView");
        throw null;
    }

    public final void setTextureView(android.view.TextureView textureView) {
        kotlin.jvm.internal.o.g(textureView, "<set-?>");
        this.textureView = textureView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoFrameView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoFrameView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        a();
    }
}
