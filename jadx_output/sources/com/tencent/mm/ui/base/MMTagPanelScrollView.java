package com.tencent.mm.ui.base;

/* loaded from: classes11.dex */
public class MMTagPanelScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public final db5.d7 f197595d;

    /* renamed from: e, reason: collision with root package name */
    public int f197596e;

    /* renamed from: f, reason: collision with root package name */
    public int f197597f;

    public MMTagPanelScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197595d = new db5.d7(null);
        this.f197596e = 0;
        this.f197597f = 2;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        scrollBy(0, i27);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        super.onMeasure(i17, i18);
        if (getChildCount() <= 0) {
            return;
        }
        int i27 = 0;
        if (getChildAt(0) instanceof com.tencent.mm.ui.base.MMTagPanel) {
            com.tencent.mm.ui.base.MMTagPanel mMTagPanel = (com.tencent.mm.ui.base.MMTagPanel) getChildAt(0);
            com.tencent.mm.ui.widget.MMEditText mMEditText = mMTagPanel.F;
            boolean isFocused = mMEditText == null ? false : mMEditText.isFocused();
            if (mMTagPanel.getLineCount() == this.f197597f) {
                this.f197596e = mMTagPanel.getMeasuredHeight() + getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479928j8);
            }
            if (mMTagPanel.getLineCount() >= this.f197597f) {
                int size = android.view.View.MeasureSpec.getSize(i17);
                int i28 = this.f197597f;
                java.util.LinkedList linkedList = mMTagPanel.f197256f;
                int max = java.lang.Math.max(0, java.lang.Math.min(linkedList.size(), i28));
                int paddingTop = mMTagPanel.getPaddingTop();
                while (true) {
                    i19 = max - 1;
                    if (i27 >= i19) {
                        break;
                    }
                    paddingTop += ((java.lang.Integer) linkedList.get(i27)).intValue() + mMTagPanel.f197255e;
                    i27++;
                }
                setMeasuredDimension(size, java.lang.Math.max(paddingTop + ((java.lang.Integer) linkedList.get(i19)).intValue() + mMTagPanel.getPaddingBottom(), this.f197596e));
                if (isFocused) {
                    db5.d7 d7Var = this.f197595d;
                    d7Var.f228319d = mMTagPanel;
                    removeCallbacks(d7Var);
                    post(d7Var);
                }
            }
        }
    }

    public void setMaxLine(int i17) {
        if (i17 < 1) {
            i17 = 1;
        }
        this.f197597f = i17;
    }

    public MMTagPanelScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197595d = new db5.d7(null);
        this.f197596e = 0;
        this.f197597f = 2;
    }
}
