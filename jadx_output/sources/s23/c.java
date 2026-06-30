package s23;

/* loaded from: classes4.dex */
public final class c implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.c f402299d = new s23.c();

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        androidx.lifecycle.j0 j0Var;
        java.lang.String str = (java.lang.String) obj;
        androidx.lifecycle.i0 i0Var = s23.n.f402320r;
        if (str.equals(i0Var.getValue())) {
            return;
        }
        i0Var.setValue(str);
        java.util.Iterator it = s23.n.f402311f.iterator();
        while (it.hasNext()) {
            s23.x xVar = (s23.x) s23.n.f402310e.get((s23.o) it.next());
            if (!r26.i0.q((xVar == null || (j0Var = xVar.f402352p) == null) ? null : (java.lang.String) j0Var.getValue(), str, false, 2, null)) {
                if (xVar != null) {
                    int i17 = str.length() == 0 ? 8 : 0;
                    android.widget.TextView textView = xVar.f402349m;
                    if (textView != null) {
                        textView.setText(str);
                    }
                    if (xVar.f402343d.a()) {
                        android.widget.LinearLayout linearLayout = xVar.f402348i;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(i17);
                        }
                    } else {
                        android.widget.LinearLayout linearLayout2 = xVar.f402348i;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(8);
                        }
                    }
                }
                androidx.lifecycle.j0 j0Var2 = xVar != null ? xVar.f402352p : null;
                if (j0Var2 != null) {
                    j0Var2.setValue(str);
                }
            }
        }
    }
}
