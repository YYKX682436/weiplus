package gn4;

/* loaded from: classes10.dex */
public class c extends in4.e0 {

    /* renamed from: c, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f273593c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f273594d;

    @Override // in4.e0
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        if (layoutManager.getF98486n()) {
            iArr[0] = h(layoutManager, view, k(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF123307r()) {
            iArr[1] = h(layoutManager, view, l(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // in4.e0
    public androidx.recyclerview.widget.o1 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof androidx.recyclerview.widget.f3) {
            return new gn4.b(this, this.f292961a.getContext());
        }
        return null;
    }

    @Override // in4.e0
    public android.view.View e(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.getF123307r()) {
            return i(layoutManager, l(layoutManager));
        }
        if (layoutManager.getF98486n()) {
            return i(layoutManager, k(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in4.e0
    public int f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        int itemCount;
        int position;
        android.graphics.PointF a17;
        if (java.lang.Math.abs(i18) <= 500 || java.lang.Math.abs(i17) >= java.lang.Math.abs(i18) || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        android.view.View j17 = layoutManager.getF123307r() ? j(layoutManager, l(layoutManager)) : layoutManager.getF98486n() ? j(layoutManager, k(layoutManager)) : null;
        if (j17 == null || (position = layoutManager.getPosition(j17)) == -1) {
            return -1;
        }
        boolean z17 = false;
        boolean z18 = !layoutManager.getF98486n() ? i18 <= 0 : i17 <= 0;
        if ((layoutManager instanceof androidx.recyclerview.widget.f3) && (a17 = ((androidx.recyclerview.widget.f3) layoutManager).a(itemCount - 1)) != null && (a17.x < 0.0f || a17.y < 0.0f)) {
            z17 = true;
        }
        return z17 ? z18 ? position - 1 : position : z18 ? position + 1 : position;
    }

    public final int h(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view, androidx.recyclerview.widget.w1 w1Var) {
        return (w1Var.e(view) + (w1Var.c(view) / 2)) - (layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2);
    }

    public final android.view.View i(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 w1Var) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        int k17 = layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2;
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = layoutManager.getChildAt(i18);
            int abs = java.lang.Math.abs((w1Var.e(childAt) + (w1Var.c(childAt) / 2)) - k17);
            if (abs < i17) {
                view = childAt;
                i17 = abs;
            }
        }
        return view;
    }

    public final android.view.View j(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 w1Var) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        int i17 = Integer.MAX_VALUE;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = layoutManager.getChildAt(i18);
            int e17 = w1Var.e(childAt);
            if (e17 < i17) {
                view = childAt;
                i17 = e17;
            }
        }
        return view;
    }

    public final androidx.recyclerview.widget.w1 k(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.w1 w1Var = this.f273594d;
        if (w1Var == null || w1Var.f12259a != layoutManager) {
            this.f273594d = new androidx.recyclerview.widget.u1(layoutManager);
        }
        return this.f273594d;
    }

    public final androidx.recyclerview.widget.w1 l(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.w1 w1Var = this.f273593c;
        if (w1Var == null || w1Var.f12259a != layoutManager) {
            this.f273593c = new androidx.recyclerview.widget.v1(layoutManager);
        }
        return this.f273593c;
    }
}
