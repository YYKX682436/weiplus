package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public abstract class BasePanelKeybordLayout extends com.tencent.mm.ui.KeyboardLinearLayout {

    /* renamed from: m, reason: collision with root package name */
    public int f196606m;

    public BasePanelKeybordLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196606m = -1;
    }

    public abstract java.util.List<android.view.View> getPanelView();

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        java.util.List<android.view.View> panelView;
        android.view.View next;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View.MeasureSpec.getSize(i17);
        int size = android.view.View.MeasureSpec.getSize(i18);
        if (size >= 0) {
            int i19 = this.f196606m;
            if (i19 < 0) {
                this.f196606m = size;
            } else {
                int i27 = i19 - size;
                this.f196606m = size;
                if (i27 != 0 && (panelView = getPanelView()) != null) {
                    java.util.Iterator<android.view.View> it = panelView.iterator();
                    while (it.hasNext() && (layoutParams = (next = it.next()).getLayoutParams()) != null) {
                        int i28 = layoutParams.height;
                        int i29 = i28 < 0 ? 0 : i28 - i27;
                        if (i29 < 0) {
                            i29 = 0;
                        }
                        int b17 = com.tencent.mm.sdk.platformtools.d2.b(com.tencent.mm.sdk.platformtools.x2.f193071a, true);
                        int g17 = com.tencent.mm.sdk.platformtools.d2.g(getContext());
                        int i37 = com.tencent.mm.sdk.platformtools.d2.f192518b;
                        if (i37 > 0 && size >= i37) {
                            i29 = g17;
                        }
                        int i38 = (i29 <= 0 || i29 >= b17 || next.getVisibility() == 0) ? i29 : 0;
                        if (i38 > g17) {
                            i38 = g17;
                        }
                        if (i38 <= 0 || i38 >= g17) {
                            g17 = i38;
                        }
                        layoutParams.height = g17;
                        next.setLayoutParams(layoutParams);
                    }
                }
            }
        }
        super.onMeasure(i17, i18);
    }

    public void setOnMeasureListener(com.tencent.mm.ui.u1 u1Var) {
    }

    public BasePanelKeybordLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196606m = -1;
    }
}
