package n3;

/* loaded from: classes13.dex */
public abstract class w0 {
    public static android.graphics.Rect a(android.view.View view) {
        return view.getClipBounds();
    }

    public static boolean b(android.view.View view) {
        return view.isInLayout();
    }

    public static void c(android.view.View view, android.graphics.Rect rect) {
        view.setClipBounds(rect);
    }
}
