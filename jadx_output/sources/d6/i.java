package d6;

/* loaded from: classes14.dex */
public abstract class i {
    public static int a(d6.l lVar, int i17, int i18, int i19, boolean z17) {
        int i27 = i17 - i19;
        if (i27 > 0) {
            return i27;
        }
        int i28 = i18 - i19;
        if (i28 > 0) {
            return i28;
        }
        if (i17 != -2) {
            return -1;
        }
        android.util.DisplayMetrics displayMetrics = ((d6.f) lVar).f226639c.getContext().getResources().getDisplayMetrics();
        return z17 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
    }

    public static coil.size.PixelSize b(d6.l lVar) {
        d6.f fVar = (d6.f) lVar;
        android.view.ViewGroup.LayoutParams layoutParams = fVar.f226639c.getLayoutParams();
        int i17 = layoutParams == null ? -1 : layoutParams.width;
        android.view.View view = fVar.f226639c;
        int a17 = a(lVar, i17, view.getWidth(), fVar.f226640d ? view.getPaddingLeft() + view.getPaddingRight() : 0, true);
        if (a17 <= 0) {
            return null;
        }
        d6.f fVar2 = (d6.f) lVar;
        android.view.View view2 = fVar2.f226639c;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int a18 = a(lVar, layoutParams2 != null ? layoutParams2.height : -1, view2.getHeight(), fVar2.f226640d ? view2.getPaddingTop() + view2.getPaddingBottom() : 0, false);
        if (a18 <= 0) {
            return null;
        }
        return new coil.size.PixelSize(a17, a18);
    }
}
