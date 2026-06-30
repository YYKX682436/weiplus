package gc5;

/* loaded from: classes8.dex */
public class a extends dp1.a {
    @Override // dp1.u, dp1.x
    public android.graphics.Bitmap getBitmap() {
        return super.getBitmap();
    }

    @Override // dp1.u, dp1.x
    public android.view.View getContentView() {
        android.view.View contentView = super.getContentView();
        if (contentView != null) {
            return contentView;
        }
        android.view.ViewGroup a17 = a();
        int i17 = 1;
        android.view.View view = null;
        int i18 = 1;
        for (int i19 = 0; i19 < a17.getChildCount(); i19++) {
            android.view.View childAt = a17.getChildAt(i19);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i17 * i18) {
                i17 = childAt.getWidth();
                i18 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }

    @Override // dp1.u, dp1.x
    public android.view.View getMaskView() {
        android.view.ViewGroup a17 = a();
        int i17 = 1;
        android.view.View view = null;
        int i18 = 1;
        for (int i19 = 0; i19 < a17.getChildCount(); i19++) {
            android.view.View childAt = a17.getChildAt(i19);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i17 * i18) {
                i17 = childAt.getWidth();
                i18 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }

    @Override // dp1.u, dp1.x
    public boolean p() {
        return true;
    }
}
