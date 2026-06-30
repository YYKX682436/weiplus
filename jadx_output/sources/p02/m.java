package p02;

/* loaded from: classes2.dex */
public class m extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.res.Resources f350421d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f350422e;

    /* renamed from: f, reason: collision with root package name */
    public final int f350423f;

    public m(android.content.res.Resources resources) {
        this.f350421d = resources;
        this.f350422e = new android.graphics.drawable.ColorDrawable(resources.getColor(com.tencent.mm.R.color.f478897k6));
        this.f350423f = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480542a36);
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        rect.set(0, 0, 0, this.f350423f);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount - 1; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.f486766me4);
            android.view.View findViewById2 = childAt.findViewById(com.tencent.mm.R.id.me8);
            android.view.View findViewById3 = childAt.findViewById(com.tencent.mm.R.id.mfe);
            if (childAt.getVisibility() == 8) {
                super.onDraw(canvas, recyclerView, h3Var);
            } else {
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                int i18 = this.f350423f + bottom;
                int visibility = findViewById.getVisibility();
                android.graphics.drawable.Drawable drawable = this.f350422e;
                if (visibility == 0) {
                    drawable.setBounds(paddingLeft, bottom, width, i18);
                    drawable.draw(canvas);
                } else {
                    int visibility2 = findViewById2.getVisibility();
                    android.content.res.Resources resources = this.f350421d;
                    if (visibility2 == 0) {
                        drawable.setBounds(resources.getDimensionPixelSize(com.tencent.mm.R.dimen.a9k) + paddingLeft, bottom, width, i18);
                        drawable.draw(canvas);
                    } else if (findViewById3.getVisibility() == 0) {
                        drawable.setBounds(resources.getDimensionPixelSize(com.tencent.mm.R.dimen.a9j) + paddingLeft, bottom, width, i18);
                        drawable.draw(canvas);
                    }
                }
            }
        }
    }
}
