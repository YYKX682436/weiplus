package com.tencent.mm.ui.scroll_view_widgets;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/ui/scroll_view_widgets/ScrollViewWidgetWrapper;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rj5/c", "rj5/e", "rj5/f", "rj5/g", "rj5/k", "rj5/l", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class ScrollViewWidgetWrapper extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f209788d;

    /* renamed from: e, reason: collision with root package name */
    public rj5.l f209789e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollViewWidgetWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollViewWidgetWrapper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f209788d = new java.util.concurrent.CopyOnWriteArrayList();
    }
}
