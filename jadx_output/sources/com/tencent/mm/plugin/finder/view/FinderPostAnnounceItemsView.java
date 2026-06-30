package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderPostAnnounceItemsView;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "e", "Landroid/view/View;", "getContentContainer", "()Landroid/view/View;", "setContentContainer", "(Landroid/view/View;)V", "contentContainer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderPostAnnounceItemsView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f131361d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public android.view.View contentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPostAnnounceItemsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131361d = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        setOrientation(1);
    }

    public final android.view.View getContentContainer() {
        return this.contentContainer;
    }

    public final void setContentContainer(android.view.View view) {
        this.contentContainer = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderPostAnnounceItemsView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131361d = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        setOrientation(1);
    }
}
