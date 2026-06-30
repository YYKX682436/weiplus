package nv3;

/* loaded from: classes10.dex */
public final class o extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.w1 f340692f;

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View targetView) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        if (layoutManager.getF123307r()) {
            androidx.recyclerview.widget.w1 w1Var = this.f340692f;
            if (w1Var == null) {
                w1Var = new androidx.recyclerview.widget.v1(layoutManager);
                this.f340692f = w1Var;
            }
            iArr[1] = w1Var.e(targetView) - w1Var.k();
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
            return super.f(layoutManager);
        }
        int t17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).t();
        if (t17 == -1) {
            return null;
        }
        return layoutManager.findViewByPosition(t17);
    }
}
