package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveFansView;", "Landroid/widget/FrameLayout;", "", "", "fansLevel", "Ljz5/f0;", "setFansLevel", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveFansView extends android.widget.FrameLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f131196d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f131197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFansView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.aqq, (android.view.ViewGroup) this, true);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ecy);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131196d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ecz);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131197e = (android.widget.TextView) findViewById2;
    }

    public final void setFansLevel(int i17) {
        android.widget.ImageView imageView = this.f131196d;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("fansLevelIcons");
            throw null;
        }
        imageView.setImageResource(0);
        android.widget.TextView textView = this.f131197e;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(i17));
        } else {
            kotlin.jvm.internal.o.o("fansLevelTv");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveFansView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.aqq, (android.view.ViewGroup) this, true);
    }
}
