package dp2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final dp2.a f242183a = new dp2.a();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f242184b;

    static {
        ae2.in inVar = ae2.in.f3688a;
        f242184b = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3841p2).getValue()).r()).intValue() == 0;
    }

    public final boolean a(java.lang.String invokeSource, r45.dd2 dd2Var, int i17) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        if (((ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
            return true;
        }
        if (i17 != -1) {
            if (i17 == 9500001 || i17 == 9500002 || i17 == 9500004 || i17 == 9500003) {
                return true;
            }
        }
        if (!(dd2Var != null && dd2Var.getInteger(0) == 88889)) {
            return true;
        }
        com.tencent.mars.xlog.Log.w(invokeSource, "canLoadNearbyCityFeeds FINDER_LIVE_SQUARE_TAB_NEARBY_CITY");
        return false;
    }

    public final boolean b(int i17, android.view.View view, float f17) {
        kotlin.jvm.internal.o.g(view, "view");
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return (((float) rect.height()) * 1.0f) / ((float) view.getHeight()) < f17 || (((float) rect.width()) * 1.0f) / ((float) view.getWidth()) < f17;
    }
}
