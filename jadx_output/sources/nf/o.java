package nf;

/* loaded from: classes7.dex */
public abstract class o {
    public static boolean a(android.content.Context context) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.app.Activity a17;
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        if (context == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method")) == null || (a17 = q75.a.a(context)) == null || (currentFocus = a17.getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return false;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        boolean z17 = true;
        if (i17 <= 34 && (i17 != 34 || (!"VanillaIceCream".equals(android.os.Build.VERSION.RELEASE_OR_CODENAME) && !"15".equals(android.os.Build.VERSION.RELEASE_OR_CODENAME)))) {
            z17 = false;
        }
        if (z17) {
            try {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (!n3.b1.a(currentFocus).f(8)) {
                    return false;
                }
            } catch (java.lang.NullPointerException unused) {
            }
        }
        try {
            return inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException unused2) {
            return false;
        }
    }
}
