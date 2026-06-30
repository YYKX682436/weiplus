package e32;

/* loaded from: classes10.dex */
public final class e extends androidx.recyclerview.widget.p1 {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f247103f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f247104g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f247105h;

    /* renamed from: i, reason: collision with root package name */
    public e32.c f247106i;

    @Override // androidx.recyclerview.widget.r3
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.b(recyclerView);
        this.f247103f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.r3
    public androidx.recyclerview.widget.g3 d(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof androidx.recyclerview.widget.f3)) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f247103f;
        return new e32.d(this, recyclerView != null ? recyclerView.getContext() : null);
    }

    @Override // androidx.recyclerview.widget.p1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        androidx.recyclerview.widget.w1 w1Var;
        android.view.View view;
        int top;
        int measuredHeight;
        if (layoutManager == null) {
            return null;
        }
        if (layoutManager.getF98486n()) {
            androidx.recyclerview.widget.w1 w1Var2 = this.f247105h;
            if (w1Var2 == null || w1Var2.f12259a != layoutManager) {
                this.f247105h = new androidx.recyclerview.widget.u1(layoutManager);
            }
            w1Var = this.f247105h;
            kotlin.jvm.internal.o.d(w1Var);
        } else {
            androidx.recyclerview.widget.w1 w1Var3 = this.f247104g;
            if (w1Var3 == null || w1Var3.f12259a != layoutManager) {
                this.f247104g = new androidx.recyclerview.widget.v1(layoutManager);
            }
            w1Var = this.f247104g;
            kotlin.jvm.internal.o.d(w1Var);
        }
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            view = null;
        } else {
            int k17 = layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2;
            int i17 = Integer.MAX_VALUE;
            view = null;
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = layoutManager.getChildAt(i18);
                if (childAt != null) {
                    if (layoutManager.getF98486n()) {
                        top = childAt.getLeft();
                        measuredHeight = childAt.getMeasuredWidth() / 2;
                    } else {
                        top = childAt.getTop();
                        measuredHeight = childAt.getMeasuredHeight() / 2;
                    }
                    int abs = java.lang.Math.abs((top + measuredHeight) - k17);
                    if (abs < i17) {
                        view = childAt;
                        i17 = abs;
                    }
                }
            }
        }
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams ? (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams : null;
        int a17 = layoutParams2 != null ? layoutParams2.a() : -1;
        e32.c cVar = this.f247106i;
        if (cVar != null) {
            com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = ((a32.w) cVar).f1047a;
            com.tencent.mars.xlog.Log.i(editorStickerView.f98666d, "onPageSelected: " + a17);
            com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView.b(editorStickerView, a17);
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.p1, androidx.recyclerview.widget.r3
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17, int i18) {
        int g17 = super.g(layoutManager, i17, i18);
        e32.c cVar = this.f247106i;
        if (cVar != null) {
            com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView editorStickerView = ((a32.w) cVar).f1047a;
            com.tencent.mars.xlog.Log.i(editorStickerView.f98666d, "onPageSelected: " + g17);
            com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView.b(editorStickerView, g17);
        }
        return g17;
    }
}
