package vj5;

/* loaded from: classes7.dex */
public abstract class o extends com.tencent.mm.ui.v9 {
    public static void e(android.view.Window window) {
        if (window == null) {
            return;
        }
        int i17 = window.getAttributes().flags;
        int i18 = ((-67108865) & i17) | Integer.MIN_VALUE;
        if (i18 != i17) {
            window.setFlags(i18, i18);
        }
        if (window.getStatusBarColor() != 0) {
            window.setStatusBarColor(0);
        }
    }

    public static android.view.ContextThemeWrapper g(android.content.Context context) {
        android.content.Context baseContext;
        if (context == null) {
            return null;
        }
        if (context instanceof android.view.ContextThemeWrapper) {
            return (android.view.ContextThemeWrapper) context;
        }
        if (!(context instanceof android.content.ContextWrapper) || (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return g(baseContext);
    }

    public static boolean h(android.view.Window window) {
        return (window == null || window.getDecorView() == null || (window.getDecorView().getSystemUiVisibility() & 8192) == 0) ? false : true;
    }
}
