package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R:\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/CommentHeaderCollapsibleExpandButton;", "Landroid/widget/LinearLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "value", "e", "Lyz5/a;", "getOnExpandListener", "()Lyz5/a;", "setOnExpandListener", "(Lyz5/a;)V", "onExpandListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentHeaderCollapsibleExpandButton extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f130828d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.a onExpandListener;

    public CommentHeaderCollapsibleExpandButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final yz5.a getOnExpandListener() {
        return this.onExpandListener;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.vi9);
        this.f130828d = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.view.g0(this));
        }
    }

    public final void setOnExpandListener(yz5.a aVar) {
        this.onExpandListener = aVar;
        android.view.View view = this.f130828d;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.view.f0(this));
        }
    }

    public CommentHeaderCollapsibleExpandButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
