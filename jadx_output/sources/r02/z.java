package r02;

/* loaded from: classes5.dex */
public class z extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f368345d;

    /* renamed from: e, reason: collision with root package name */
    public final int f368346e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f368347f;

    public z(android.content.res.Resources resources) {
        this.f368345d = new android.graphics.drawable.ColorDrawable(resources.getColor(com.tencent.mm.R.color.f478897k6));
        this.f368346e = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480542a36);
        this.f368347f = new android.graphics.drawable.ColorDrawable(resources.getColor(com.tencent.mm.R.color.aaw));
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        rect.set(0, 0, 0, this.f368346e);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDraw(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = recyclerView.getChildAt(i17);
            android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(0);
            int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) ((androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            int i18 = this.f368346e + bottom;
            int visibility = childAt.getVisibility();
            android.graphics.drawable.Drawable drawable = this.f368347f;
            if (visibility != 8 && childAt2.getVisibility() != 8) {
                boolean z17 = childAt2 instanceof com.tencent.mm.plugin.downloader_app.ui.TaskManagerHeaderView;
                android.graphics.drawable.Drawable drawable2 = this.f368345d;
                if (z17 || (childAt2 instanceof com.tencent.mm.plugin.downloader_app.ui.TaskHeaderView) || (childAt2 instanceof com.tencent.mm.plugin.downloader_app.ui.ExpandView)) {
                    drawable2.setBounds(paddingLeft, bottom, width, i18);
                    drawable2.draw(canvas);
                } else if (childAt2 instanceof com.tencent.mm.plugin.downloader_app.ui.TaskItemView) {
                    android.view.View childAt3 = recyclerView.getChildAt(i17 + 1);
                    if (childAt3 != null) {
                        android.view.View childAt4 = ((android.view.ViewGroup) childAt3).getChildAt(0);
                        if (childAt4 instanceof com.tencent.mm.plugin.downloader_app.ui.TaskHeaderView) {
                            super.onDraw(canvas, recyclerView, h3Var);
                        } else if ((childAt4 instanceof com.tencent.mm.plugin.downloader_app.ui.ExpandView) && childAt4.getVisibility() == 8) {
                            drawable2.setBounds(paddingLeft, bottom, width, i18);
                            drawable2.draw(canvas);
                        }
                    }
                    com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = (com.tencent.mm.plugin.downloader_app.ui.TaskItemView) childAt2;
                    drawable2.setBounds(taskItemView.getNamePaddingLeft() + paddingLeft, bottom, width, i18);
                    drawable2.draw(canvas);
                    drawable.setBounds(paddingLeft, bottom, taskItemView.getNamePaddingLeft() + paddingLeft, i18);
                    drawable.draw(canvas);
                } else {
                    super.onDraw(canvas, recyclerView, h3Var);
                }
            } else if (childAt2 instanceof com.tencent.mm.plugin.downloader_app.ui.TaskItemView) {
                drawable.setBounds(paddingLeft, bottom, width, i18);
                drawable.draw(canvas);
            }
        }
    }
}
