package sc2;

/* loaded from: classes2.dex */
public final class i1 {
    public i1(kotlin.jvm.internal.i iVar) {
    }

    public final int a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.res.Resources resources = context.getResources();
        int i17 = resources.getDisplayMetrics().widthPixels;
        int i18 = resources.getDisplayMetrics().heightPixels;
        if (i17 > i18) {
            i17 = i18;
        }
        float dimensionPixelOffset = (i17 * 0.75f) - resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        float dimension = resources.getDimension(com.tencent.mm.R.dimen.f479702cy);
        com.tencent.mars.xlog.Log.i("Finder.FeedCardJumperObserver", "getMaxWidth: itemWidth=" + dimensionPixelOffset + ", maxWidth=" + dimension);
        if (dimensionPixelOffset > dimension) {
            dimensionPixelOffset = dimension;
        }
        return (int) dimensionPixelOffset;
    }
}
