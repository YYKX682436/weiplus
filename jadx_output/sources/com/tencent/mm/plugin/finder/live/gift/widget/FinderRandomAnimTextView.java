package com.tencent.mm.plugin.finder.live.gift.widget;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderRandomAnimTextView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "dataList", "Ljz5/f0;", "setDataList", "", "textSize", "setTextSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "vg2/o", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderRandomAnimTextView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public final java.util.LinkedList f111653b2;

    /* renamed from: c2, reason: collision with root package name */
    public final vg2.o f111654c2;

    /* renamed from: d2, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f111655d2;

    /* renamed from: e2, reason: collision with root package name */
    public kotlinx.coroutines.r2 f111656e2;

    /* renamed from: f2, reason: collision with root package name */
    public float f111657f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRandomAnimTextView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f111653b2 = linkedList;
        vg2.o oVar = new vg2.o(this, linkedList);
        this.f111654c2 = oVar;
        this.f111655d2 = kotlinx.coroutines.z0.b();
        this.f111657f2 = 17.0f;
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        setVerticalFadingEdgeEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setAdapter(oVar);
    }

    private final void setDataList(java.util.List<java.lang.String> list) {
        java.util.LinkedList linkedList = this.f111653b2;
        linkedList.clear();
        linkedList.addAll(list);
        this.f111654c2.notifyItemRangeChanged(0, list.size());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final void g1(int i17, int i18, java.util.LinkedList linkedList) {
        java.lang.String valueOf = java.lang.String.valueOf(i17);
        java.lang.String str = "";
        for (int i19 = 0; i19 < i18 - valueOf.length(); i19++) {
            str = str + '0';
        }
        linkedList.add(str + valueOf);
    }

    public final void h1(int i17) {
        int length = java.lang.String.valueOf(i17).length();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        g1(0, length, linkedList);
        for (int i18 = 0; i18 < 8; i18++) {
            g1(new java.util.Random().nextInt(i17), length, linkedList);
        }
        g1(i17, length, linkedList);
        setDataList(linkedList);
        this.f111656e2 = kotlinx.coroutines.l.d(this.f111655d2, null, null, new vg2.p(this, null), 3, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kotlinx.coroutines.r2 r2Var = this.f111656e2;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        if (getChildCount() == 0) {
            super.onMeasure(i17, i18);
            return;
        }
        int childCount = getChildCount();
        int i19 = 0;
        int i27 = 0;
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            measureChild(childAt, i17, i18);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            if (measuredHeight > i27) {
                i27 = measuredHeight;
            }
            if (measuredWidth > i19) {
                i19 = measuredWidth;
            }
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824));
    }

    public final void setTextSize(float f17) {
        this.f111657f2 = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRandomAnimTextView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f111653b2 = linkedList;
        vg2.o oVar = new vg2.o(this, linkedList);
        this.f111654c2 = oVar;
        this.f111655d2 = kotlinx.coroutines.z0.b();
        this.f111657f2 = 17.0f;
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        setVerticalFadingEdgeEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
        setAdapter(oVar);
    }
}
