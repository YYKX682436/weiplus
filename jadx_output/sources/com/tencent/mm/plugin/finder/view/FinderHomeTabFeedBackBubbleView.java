package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHomeTabFeedBackBubbleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderHomeTabFeedBackBubbleView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f131134d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f131135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHomeTabFeedBackBubbleView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131135e = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dqh, (android.view.ViewGroup) this, true);
    }

    public final void a(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("FinderHomeTabFeedBackBubbleView", source.concat(" hide!"));
        removeCallbacks(this.f131134d);
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a("onDetachedFromWindow");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHomeTabFeedBackBubbleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131135e = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dqh, (android.view.ViewGroup) this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHomeTabFeedBackBubbleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131135e = "";
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dqh, (android.view.ViewGroup) this, true);
    }
}
