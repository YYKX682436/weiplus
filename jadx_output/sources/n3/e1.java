package n3;

/* loaded from: classes14.dex */
public abstract class e1 {
    public static void a(android.view.View view, final n3.j1 j1Var) {
        x.n nVar = (x.n) view.getTag(com.tencent.mm.R.id.nxe);
        if (nVar == null) {
            nVar = new x.n();
            view.setTag(com.tencent.mm.R.id.nxe, nVar);
        }
        java.util.Objects.requireNonNull(j1Var);
        android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new android.view.View.OnUnhandledKeyEventListener(j1Var) { // from class: n3.e1$$a
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(android.view.View view2, android.view.KeyEvent keyEvent) {
                throw null;
            }
        };
        nVar.put(j1Var, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static java.lang.CharSequence b(android.view.View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(android.view.View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(android.view.View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(android.view.View view, n3.j1 j1Var) {
        android.view.View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        x.n nVar = (x.n) view.getTag(com.tencent.mm.R.id.nxe);
        if (nVar == null || (onUnhandledKeyEventListener = (android.view.View.OnUnhandledKeyEventListener) nVar.getOrDefault(j1Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(android.view.View view, int i17) {
        return (T) view.requireViewById(i17);
    }

    public static void g(android.view.View view, boolean z17) {
        view.setAccessibilityHeading(z17);
    }

    public static void h(android.view.View view, java.lang.CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(android.view.View view, android.view.autofill.AutofillId autofillId) {
        view.setAutofillId(autofillId);
    }

    public static void j(android.view.View view, boolean z17) {
        view.setScreenReaderFocusable(z17);
    }
}
