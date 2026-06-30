package sf4;

/* loaded from: classes10.dex */
public final class w extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f407603f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f407604g;

    private final int i(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View view, androidx.recyclerview.widget.w1 w1Var) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (layoutManager.getF98486n()) {
            topDecorationHeight = layoutManager.getLeftDecorationWidth(view);
            bottomDecorationHeight = layoutManager.getRightDecorationWidth(view);
        } else {
            topDecorationHeight = layoutManager.getTopDecorationHeight(view);
            bottomDecorationHeight = layoutManager.getBottomDecorationHeight(view);
        }
        return (w1Var.e(view) + ((w1Var.c(view) - (topDecorationHeight + bottomDecorationHeight)) / 2)) - (layoutManager.getClipToPadding() ? w1Var.k() + (w1Var.l() / 2) : w1Var.f() / 2);
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View targetView) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        com.tencent.mars.xlog.Log.i("MicroMsg.PageScrollHelper", "LogStory: calculateDistanceToFinalSnap " + layoutManager.getPosition(targetView));
        int[] iArr = new int[2];
        if (layoutManager.getF98486n()) {
            androidx.recyclerview.widget.w1 w1Var = this.f407604g;
            if (w1Var == null || w1Var.f12259a != layoutManager) {
                this.f407604g = new androidx.recyclerview.widget.u1(layoutManager);
            }
            androidx.recyclerview.widget.w1 w1Var2 = this.f407604g;
            kotlin.jvm.internal.o.d(w1Var2);
            iArr[0] = i(layoutManager, targetView, w1Var2);
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.getF123307r()) {
            androidx.recyclerview.widget.w1 w1Var3 = this.f407603f;
            if (w1Var3 == null || w1Var3.f12259a != layoutManager) {
                this.f407603f = new androidx.recyclerview.widget.v1(layoutManager);
            }
            androidx.recyclerview.widget.w1 w1Var4 = this.f407603f;
            kotlin.jvm.internal.o.d(w1Var4);
            iArr[1] = i(layoutManager, targetView, w1Var4);
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
