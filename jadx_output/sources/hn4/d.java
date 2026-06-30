package hn4;

/* loaded from: classes10.dex */
public class d extends in4.e0 {

    /* renamed from: c, reason: collision with root package name */
    public final fn4.b f282546c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f282547d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f282548e;

    public d(fn4.b bVar) {
        this.f282546c = bVar;
    }

    @Override // in4.e0
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view) {
        int[] iArr = new int[2];
        boolean f98486n = layoutManager.getF98486n();
        fn4.b bVar = this.f282546c;
        if (f98486n) {
            androidx.recyclerview.widget.w1 w1Var = this.f282548e;
            if (w1Var == null || w1Var.f12259a != layoutManager) {
                this.f282548e = new androidx.recyclerview.widget.u1(layoutManager);
            }
            iArr[0] = this.f282548e.e(view) - bVar.l4();
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF123307r()) {
            androidx.recyclerview.widget.w1 w1Var2 = this.f282547d;
            if (w1Var2 == null || w1Var2.f12259a != layoutManager) {
                this.f282547d = new androidx.recyclerview.widget.v1(layoutManager);
            }
            iArr[1] = this.f282547d.e(view) - bVar.l4();
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // in4.e0
    public androidx.recyclerview.widget.o1 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof androidx.recyclerview.widget.f3) {
            return new hn4.c(this, this.f292961a.getContext());
        }
        return null;
    }

    @Override // in4.e0
    public android.view.View e(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.getF123307r()) {
            androidx.recyclerview.widget.w1 w1Var = this.f282547d;
            if (w1Var == null || w1Var.f12259a != layoutManager) {
                this.f282547d = new androidx.recyclerview.widget.v1(layoutManager);
            }
            return h(layoutManager, this.f282547d);
        }
        if (!layoutManager.getF98486n()) {
            return null;
        }
        androidx.recyclerview.widget.w1 w1Var2 = this.f282548e;
        if (w1Var2 == null || w1Var2.f12259a != layoutManager) {
            this.f282548e = new androidx.recyclerview.widget.u1(layoutManager);
        }
        return h(layoutManager, this.f282548e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in4.e0
    public int f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        int itemCount;
        android.graphics.PointF a17;
        if (java.lang.Math.abs(i18) <= 500 || java.lang.Math.abs(i17) >= java.lang.Math.abs(i18) || (itemCount = layoutManager.getItemCount()) == 0) {
            return -1;
        }
        fn4.b bVar = this.f282546c;
        int Y2 = bVar.Y2() + 1;
        if (Y2 == -1) {
            return -1;
        }
        boolean z17 = false;
        boolean z18 = !layoutManager.getF98486n() ? i18 <= 0 : i17 <= 0;
        if ((layoutManager instanceof androidx.recyclerview.widget.f3) && (a17 = ((androidx.recyclerview.widget.f3) layoutManager).a(itemCount - 1)) != null && (a17.x < 0.0f || a17.y < 0.0f)) {
            z17 = true;
        }
        int i19 = (!z17 ? z18 : !z18) ? Y2 - 1 : Y2 + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoPagerSnapHelper", "findTargetSnapPosition velocityY: %d centerPosition: %d forwardDirection: %b result: %d currentPlayPos: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(Y2), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(bVar.Y2() + 1));
        return i19;
    }

    public final android.view.View h(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, androidx.recyclerview.widget.w1 w1Var) {
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount == 0) {
            return null;
        }
        int k17 = layoutManager.getClipToPadding() ? w1Var.k() + ((w1Var.l() - wm4.a.f447283a) / 2) : w1Var.f() / 2;
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
}
