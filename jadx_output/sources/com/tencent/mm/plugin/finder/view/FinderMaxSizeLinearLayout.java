package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderMaxSizeLinearLayout;", "Landroid/widget/LinearLayout;", "", "maxHeight", "Ljz5/f0;", "setMaxHeight", "getMaxHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMaxSizeLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f131269d;

    /* renamed from: e, reason: collision with root package name */
    public int f131270e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMaxSizeLinearLayout(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f131269d = "Finder.FinderMaxSizeLinearLayout";
    }

    /* renamed from: getMaxHeight, reason: from getter */
    public final int getF131270e() {
        return this.f131270e;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f131270e;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    public final void setMaxHeight(int i17) {
        this.f131270e = i17;
        com.tencent.mars.xlog.Log.i(this.f131269d, "[setMaxHeight],maxHeight:" + this.f131270e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMaxSizeLinearLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f131269d = "Finder.FinderMaxSizeLinearLayout";
    }
}
