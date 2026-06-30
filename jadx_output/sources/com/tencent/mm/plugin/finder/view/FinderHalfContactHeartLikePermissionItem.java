package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHalfContactHeartLikePermissionItem;", "Landroid/widget/FrameLayout;", "", "d", "Ljz5/g;", "getEdge2A", "()I", "edge2A", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FinderHalfContactHeartLikePermissionItem extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g edge2A;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f131121e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f131122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHalfContactHeartLikePermissionItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.edge2A = jz5.h.b(new com.tencent.mm.plugin.finder.view.ua(this));
        a();
    }

    private final int getEdge2A() {
        return ((java.lang.Number) this.edge2A.getValue()).intValue();
    }

    public final void a() {
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489170eh1, (android.view.ViewGroup) this, true);
        this.f131121e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.upm);
        this.f131122f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.upk);
        android.widget.TextView textView = this.f131121e;
        if (textView == null) {
            return;
        }
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.ogk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        textView.setText(hc2.x0.k(string, context, '#', com.tencent.mm.R.drawable.d5e, com.tencent.mm.R.color.FG_1, getEdge2A(), getEdge2A(), 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null));
    }

    public final java.lang.CharSequence b(java.lang.CharSequence charSequence) {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return hc2.x0.k(charSequence, context, '#', com.tencent.mm.R.drawable.d5e, com.tencent.mm.R.color.FG_0, getEdge2A(), getEdge2A(), 0, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
    }

    public final java.lang.CharSequence c(java.lang.CharSequence charSequence, int i17) {
        java.lang.CharSequence j17;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        j17 = hc2.x0.j(charSequence, context, i17, com.tencent.mm.R.drawable.d5e, com.tencent.mm.R.color.FG_0, getEdge2A(), getEdge2A(), (r23 & 64) != 0 ? 0 : 0, (r23 & 128) != 0 ? 0 : 0, (r23 & 256) != 0 ? 1 : 0);
        return j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHalfContactHeartLikePermissionItem(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.edge2A = jz5.h.b(new com.tencent.mm.plugin.finder.view.ua(this));
        a();
    }
}
