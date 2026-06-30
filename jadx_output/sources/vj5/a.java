package vj5;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(android.view.View view, int i17, boolean z17) {
        vj5.h hVar;
        if (view != null && vj5.n.f437718k) {
            android.view.View view2 = view;
            while (!(view2 instanceof vj5.h)) {
                java.lang.Object parent = view2.getParent();
                if (parent == null || !(parent instanceof android.view.ViewGroup)) {
                    hVar = null;
                    break;
                }
                view2 = (android.view.View) parent;
            }
            hVar = (vj5.h) view2;
            if (hVar != null) {
                hVar.x(i17, z17);
                return;
            }
            android.app.Activity a17 = q75.a.a(view.getContext());
            if (a17 == null || a17.getWindow() == null) {
                return;
            }
            a17.getWindow().setStatusBarColor(i17);
            com.tencent.mm.ui.v9.c(a17.getWindow(), z17);
        }
    }
}
