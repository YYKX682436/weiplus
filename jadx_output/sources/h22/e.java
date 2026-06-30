package h22;

/* loaded from: classes10.dex */
public final class e extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f278292f;

    /* renamed from: g, reason: collision with root package name */
    public int f278293g = -1;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f278294h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f278295i;

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View targetView) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        if (layoutManager.getF98486n()) {
            if (this.f278294h == null) {
                this.f278294h = new androidx.recyclerview.widget.u1(layoutManager);
            }
            androidx.recyclerview.widget.w1 w1Var = this.f278294h;
            iArr[0] = w1Var == null ? 0 : w1Var.e(targetView) - this.f278293g;
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF123307r()) {
            if (this.f278295i == null) {
                this.f278295i = new androidx.recyclerview.widget.v1(layoutManager);
            }
            androidx.recyclerview.widget.w1 w1Var2 = this.f278295i;
            iArr[1] = w1Var2 != null ? w1Var2.e(targetView) - this.f278293g : 0;
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        int position;
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (layoutManager.getItemCount() == 0) {
            return -1;
        }
        if (this.f278294h == null) {
            this.f278294h = new androidx.recyclerview.widget.u1(layoutManager);
        }
        androidx.recyclerview.widget.w1 w1Var = this.f278294h;
        if (w1Var == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        int i19 = 0;
        android.view.View view = null;
        if (childCount != 0) {
            int i27 = Integer.MAX_VALUE;
            for (int i28 = 0; i28 < childCount; i28++) {
                android.view.View childAt = layoutManager.getChildAt(i28);
                int e17 = w1Var.e(childAt);
                if (e17 < i27) {
                    view = childAt;
                    i27 = e17;
                }
            }
        }
        if (view == null || (position = layoutManager.getPosition(view)) == -1) {
            return -1;
        }
        if (!(!layoutManager.getF98486n() ? i18 <= 0 : i17 <= 0)) {
            i19 = position;
        } else if (position != layoutManager.getItemCount() - 1) {
            i19 = position + 1;
        } else if (!this.f278292f) {
            i19 = layoutManager.getItemCount() - 1;
        }
        android.view.View f17 = f(layoutManager);
        if (f17 != null) {
            layoutManager.getPosition(f17);
        }
        return i19;
    }
}
