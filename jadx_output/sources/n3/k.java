package n3;

/* loaded from: classes7.dex */
public abstract class k {
    public static android.view.DisplayCutout a(android.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, android.graphics.Insets insets2) {
        return new android.view.DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
    }

    public static android.graphics.Insets b(android.view.DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }
}
