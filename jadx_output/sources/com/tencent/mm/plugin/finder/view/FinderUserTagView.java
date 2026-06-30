package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderUserTagView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderUserTagView extends androidx.appcompat.widget.AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderUserTagView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        setLayoutParams(marginLayoutParams);
        marginLayoutParams.rightMargin = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479925j4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderUserTagView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        setLayoutParams(marginLayoutParams);
        marginLayoutParams.rightMargin = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        setTextSize(0, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479925j4));
    }
}
