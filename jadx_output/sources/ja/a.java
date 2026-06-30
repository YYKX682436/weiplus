package ja;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f298558a = {android.R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f298559b = {android.R.attr.state_selected, android.R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f298560c = {android.R.attr.state_selected};

    public static android.content.res.ColorStateList a(android.content.res.ColorStateList colorStateList) {
        return new android.content.res.ColorStateList(new int[][]{f298560c, android.util.StateSet.NOTHING}, new int[]{b(colorStateList, f298559b), b(colorStateList, f298558a)});
    }

    public static int b(android.content.res.ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return e3.b.i(colorForState, java.lang.Math.min(android.graphics.Color.alpha(colorForState) * 2, 255));
    }
}
