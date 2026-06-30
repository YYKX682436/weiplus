package com.tencent.mm.ui.gridviewheaders;

/* loaded from: classes15.dex */
public class e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f208731d;

    /* renamed from: e, reason: collision with root package name */
    public int f208732e;

    public e(com.tencent.mm.ui.gridviewheaders.h hVar, android.content.Context context) {
        super(context);
    }

    public int getHeaderId() {
        return this.f208731d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View view = (android.view.View) getTag();
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(generateDefaultLayoutParams());
        }
        if (view.getVisibility() != 8 && view.getMeasuredHeight() == 0) {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f208732e, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), view.getMeasuredHeight());
    }

    public void setHeaderId(int i17) {
        this.f208731d = i17;
    }

    public void setHeaderWidth(int i17) {
        this.f208732e = i17;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new android.widget.FrameLayout.LayoutParams(-1, -1);
    }
}
