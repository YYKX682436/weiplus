package fn4;

/* loaded from: classes15.dex */
public abstract class d {
    public static final fn4.m a(fn4.b bVar) {
        androidx.recyclerview.widget.k3 w07;
        int childCount = bVar.u6().getChildCount();
        if (childCount == 0) {
            w07 = null;
        } else {
            int k17 = bVar.u6().getClipToPadding() ? bVar.d2().k() + (bVar.d2().l() / 2) : bVar.d2().f() / 2;
            int i17 = Integer.MAX_VALUE;
            android.view.View view = null;
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = bVar.u6().getChildAt(i18);
                int abs = java.lang.Math.abs((bVar.d2().e(childAt) + (bVar.d2().c(childAt) / 2)) - k17);
                if (abs < i17) {
                    view = childAt;
                    i17 = abs;
                }
            }
            w07 = bVar.getRecyclerView().w0(view);
        }
        if (w07 instanceof fn4.m) {
            return (fn4.m) w07;
        }
        return null;
    }

    public abstract void b(fn4.b bVar);

    public abstract void c(fn4.b bVar);

    public void d(fn4.b bVar, int i17) {
    }
}
