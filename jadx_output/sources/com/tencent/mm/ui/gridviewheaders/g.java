package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public class g extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f208735d;

    /* renamed from: e, reason: collision with root package name */
    public int f208736e;

    /* renamed from: f, reason: collision with root package name */
    public int f208737f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View[] f208738g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.gridviewheaders.h f208739h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.gridviewheaders.h hVar, android.content.Context context) {
        super(context);
        this.f208739h = hVar;
    }

    @Override // android.view.View
    public java.lang.Object getTag() {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        return childAt.getTag();
    }

    public android.view.View getView() {
        return getChildAt(0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int i19 = this.f208736e;
        if (i19 == 1 || this.f208739h.f208747m == null) {
            return;
        }
        int i27 = this.f208737f % i19;
        if (i27 == 0 && !this.f208735d) {
            this.f208735d = true;
            for (android.view.View view : this.f208738g) {
                view.measure(i17, i18);
            }
            this.f208735d = false;
        }
        int measuredHeight = getMeasuredHeight();
        int i28 = measuredHeight;
        for (android.view.View view2 : this.f208738g) {
            if (view2 != null) {
                i28 = java.lang.Math.max(i28, view2.getMeasuredHeight());
            }
        }
        if (i28 == measuredHeight) {
            return;
        }
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i28, 1073741824));
    }

    public void setNumColumns(int i17) {
        this.f208736e = i17;
    }

    public void setPosition(int i17) {
        this.f208737f = i17;
    }

    public void setRowSiblings(android.view.View[] viewArr) {
        this.f208738g = viewArr;
    }

    @Override // android.view.View
    public void setTag(int i17, java.lang.Object obj) {
        getChildAt(0).setTag(i17, obj);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.View
    public void setTag(java.lang.Object obj) {
        getChildAt(0).setTag(obj);
    }

    @Override // android.view.View
    public java.lang.Object getTag(int i17) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return null;
        }
        return childAt.getTag(i17);
    }
}
