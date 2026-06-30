package ym5;

/* loaded from: classes3.dex */
public abstract class u6 {
    public static void a(android.view.View view, android.view.View view2, com.tencent.mm.view.ViewAnimHelper$ViewInfo viewAnimHelper$ViewInfo, android.animation.Animator.AnimatorListener animatorListener, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        android.graphics.Rect rect = b(view, null).f213513d;
        android.graphics.Rect rect2 = viewAnimHelper$ViewInfo.f213513d;
        float max = java.lang.Math.max((viewAnimHelper$ViewInfo.f213513d.height() * 1.0f) / rect.height(), (rect2.width() * 1.0f) / rect.width());
        float centerX = rect.centerX();
        float centerY = rect.centerY();
        float centerX2 = rect2.centerX();
        float centerY2 = rect2.centerY();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(new android.view.animation.AccelerateInterpolator(1.2f));
        ofFloat.addUpdateListener(new ym5.p6(view, centerX2, centerX, centerY2, centerY, max, view2, animatorUpdateListener));
        ofFloat.addListener(new ym5.q6(animatorListener));
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(240L);
        ofFloat.start();
    }

    public static com.tencent.mm.view.ViewAnimHelper$ViewInfo b(android.view.View view, android.view.View view2) {
        java.lang.String str;
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Rect rect2 = new android.graphics.Rect();
        if (view2 != null) {
            view2.getGlobalVisibleRect(rect2);
        }
        view.getGlobalVisibleRect(rect);
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            str = "getGlobalVisibleRect";
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            rect.left = i17;
            rect.top = iArr[1];
            rect.right = i17 + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            str = "getLocationOnScreen";
        }
        com.tencent.mars.xlog.Log.i("ViewAnimHelper", str + " left=" + rect.left + " right=" + rect.right + " top=" + rect.top + " bottom=" + rect.bottom);
        if (!rect2.isEmpty() && rect.bottom - view.getHeight() < rect2.top) {
            rect.top = rect.bottom - view.getHeight();
        }
        return new com.tencent.mm.view.ViewAnimHelper$ViewInfo(rect);
    }
}
