package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes5.dex */
public class r extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f151928d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f151929e;

    /* renamed from: f, reason: collision with root package name */
    public final int f151930f;

    /* renamed from: g, reason: collision with root package name */
    public final int f151931g;

    public r(int i17, int i18, int i19, boolean z17, com.tencent.mm.plugin.mv.ui.view.q qVar) {
        this.f151930f = i17;
        this.f151929e = z17;
        this.f151931g = i18;
        this.f151928d = new android.graphics.drawable.ColorDrawable(i19);
    }

    public final int d(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) {
            return ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).f11861w;
        }
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            return ((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).f11920d;
        }
        return -1;
    }

    public final boolean e(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, int i19) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager) {
            int i27 = i19 % i18;
            if (i27 == 0) {
                if (i17 < i19 - i18) {
                    return false;
                }
            } else if (i17 < i19 - i27) {
                return false;
            }
            return true;
        }
        if (layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager) {
            if (((androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager).f11924h == 1) {
                int i28 = i19 % i18;
                if (i28 == 0) {
                    if (i17 < i19 - i18) {
                        return false;
                    }
                } else if (i17 < i19 - i28) {
                    return false;
                }
                return true;
            }
            if ((i17 + 1) % i18 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int d17 = d(recyclerView);
        int itemCount = recyclerView.getAdapter().getItemCount();
        int b17 = ((androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).b();
        if (b17 < 0) {
            return;
        }
        int i17 = b17 % d17;
        int i18 = this.f151931g;
        int i19 = (i17 * i18) / d17;
        int i27 = i18 - (((i17 + 1) * i18) / d17);
        boolean e17 = e(recyclerView, b17, d17, itemCount);
        int i28 = this.f151930f;
        if (e17 && !this.f151929e) {
            i28 = 0;
        }
        rect.set(i19, 0, i27, i28);
    }

    @Override // androidx.recyclerview.widget.p2
    public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        android.graphics.drawable.Drawable drawable;
        int i17;
        int childCount = recyclerView.getChildCount();
        int i18 = 0;
        while (true) {
            drawable = this.f151928d;
            i17 = this.f151930f;
            if (i18 >= childCount) {
                break;
            }
            android.view.View childAt = recyclerView.getChildAt(i18);
            if (!e(recyclerView, i18, d(recyclerView), childCount) || this.f151929e) {
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt.getLayoutParams();
                int left = childAt.getLeft() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                int right = childAt.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int bottom = childAt.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                drawable.setBounds(left, bottom, right, i17 + bottom);
                drawable.draw(canvas);
            }
            i18++;
        }
        int childCount2 = recyclerView.getChildCount();
        for (int i19 = 0; i19 < childCount2; i19++) {
            android.view.View childAt2 = recyclerView.getChildAt(i19);
            if ((recyclerView.w0(childAt2).getAdapterPosition() + 1) % d(recyclerView) != 0) {
                androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) childAt2.getLayoutParams();
                int top = childAt2.getTop() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                int bottom2 = childAt2.getBottom() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i17;
                int right2 = childAt2.getRight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int i27 = this.f151931g;
                int i28 = right2 + i27;
                if (i19 == childCount2 - 1) {
                    i28 -= i27;
                }
                drawable.setBounds(right2, top, i28, bottom2);
                drawable.draw(canvas);
            }
        }
    }
}
