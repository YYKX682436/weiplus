package s23;

/* loaded from: classes4.dex */
public final class b implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.b f402298d = new s23.b();

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        androidx.lifecycle.j0 j0Var;
        java.lang.Integer num = (java.lang.Integer) obj;
        androidx.lifecycle.i0 i0Var = s23.n.f402319q;
        if (kotlin.jvm.internal.o.b(num, i0Var.getValue())) {
            return;
        }
        i0Var.setValue(num);
        java.util.Iterator it = s23.n.f402311f.iterator();
        while (it.hasNext()) {
            s23.x xVar = (s23.x) s23.n.f402310e.get((s23.o) it.next());
            if (!kotlin.jvm.internal.o.b((xVar == null || (j0Var = xVar.f402351o) == null) ? null : (java.lang.Integer) j0Var.getValue(), num)) {
                if (xVar != null) {
                    kotlin.jvm.internal.o.d(num);
                    int intValue = num.intValue();
                    s23.a[] aVarArr = s23.a.f402297d;
                    if (intValue == 2) {
                        android.widget.ImageButton imageButton = xVar.f402346g;
                        if (imageButton != null) {
                            imageButton.setSelected(true);
                        }
                        android.widget.ImageButton imageButton2 = xVar.f402346g;
                        if (imageButton2 != null) {
                            imageButton2.setEnabled(false);
                        }
                        android.widget.TextView textView = xVar.f402347h;
                        if (textView != null) {
                            textView.setClickable(false);
                        }
                        xVar.f402350n = 2;
                    } else if (intValue == 1) {
                        android.widget.ImageButton imageButton3 = xVar.f402346g;
                        if (imageButton3 != null) {
                            imageButton3.setSelected(true);
                        }
                        android.widget.ImageButton imageButton4 = xVar.f402346g;
                        if (imageButton4 != null) {
                            imageButton4.setEnabled(true);
                        }
                        android.widget.TextView textView2 = xVar.f402347h;
                        if (textView2 != null) {
                            textView2.setClickable(true);
                        }
                        xVar.f402350n = 1;
                    } else {
                        android.widget.ImageButton imageButton5 = xVar.f402346g;
                        if (imageButton5 != null) {
                            imageButton5.setSelected(false);
                        }
                        android.widget.ImageButton imageButton6 = xVar.f402346g;
                        if (imageButton6 != null) {
                            imageButton6.setEnabled(true);
                        }
                        android.widget.TextView textView3 = xVar.f402347h;
                        if (textView3 != null) {
                            textView3.setClickable(true);
                        }
                    }
                }
                androidx.lifecycle.j0 j0Var2 = xVar != null ? xVar.f402351o : null;
                if (j0Var2 != null) {
                    j0Var2.setValue(num);
                }
            }
        }
        ((s23.m) s23.n.f402327y).invoke();
    }
}
