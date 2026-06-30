package io.flutter.plugin.platform;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class SingleViewFakeWindowViewGroup extends android.view.ViewGroup {
    private final android.graphics.Rect childRect;
    private final android.graphics.Rect viewBounds;

    public SingleViewFakeWindowViewGroup(android.content.Context context) {
        super(context);
        this.viewBounds = new android.graphics.Rect();
        this.childRect = new android.graphics.Rect();
    }

    private static int atMost(int i17) {
        return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i17), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        for (int i28 = 0; i28 < getChildCount(); i28++) {
            android.view.View childAt = getChildAt(i28);
            android.view.WindowManager.LayoutParams layoutParams = (android.view.WindowManager.LayoutParams) childAt.getLayoutParams();
            this.viewBounds.set(i17, i18, i19, i27);
            android.view.Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.viewBounds, layoutParams.x, layoutParams.y, this.childRect);
            android.graphics.Rect rect = this.childRect;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            getChildAt(i19).measure(atMost(i17), atMost(i18));
        }
        super.onMeasure(i17, i18);
    }
}
