package n3;

/* loaded from: classes14.dex */
public abstract class y0 {
    public static android.view.WindowInsets a(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static android.view.WindowInsets b(android.view.View view, android.view.WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(android.view.View view) {
        view.requestApplyInsets();
    }
}
