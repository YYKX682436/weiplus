package xi1;

/* loaded from: classes7.dex */
public interface g extends com.tencent.mm.plugin.appbrand.jsapi.h0, xi1.s, java.lang.Comparable {
    xi1.m createFullscreenHandler(xi1.k kVar);

    android.content.Context getContext();

    xi1.e getNavigationBar();

    xi1.p getOrientationHandler();

    android.graphics.Rect getSafeAreaInsets();

    android.util.DisplayMetrics getVDisplayMetrics();

    boolean isInMultiWindowMode();

    boolean q5();

    void setSoftOrientation(java.lang.String str);

    void setWindowDescription(xi1.d dVar);

    boolean shouldInLargeScreenCompatMode();
}
