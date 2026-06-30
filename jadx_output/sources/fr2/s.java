package fr2;

/* loaded from: classes2.dex */
public final class s implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f265753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.e0 f265754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr2.x f265755c;

    public s(kotlin.jvm.internal.e0 e0Var, kotlin.jvm.internal.e0 e0Var2, fr2.x xVar) {
        this.f265753a = e0Var;
        this.f265754b = e0Var2;
        this.f265755c = xVar;
    }

    @Override // com.google.android.material.appbar.e
    public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        if (appBarLayout != null) {
            int height = appBarLayout.getHeight();
            float f17 = height * 1;
            kotlin.jvm.internal.e0 e0Var = this.f265753a;
            e0Var.f310115d = f17 / 3.0f;
            kotlin.jvm.internal.e0 e0Var2 = this.f265754b;
            e0Var2.f310115d = f17 / 6.0f;
            int height2 = appBarLayout.getHeight() + i17;
            float f18 = e0Var.f310115d;
            fr2.x xVar = this.f265755c;
            float O6 = fr2.x.O6(xVar, height2, f18);
            float O62 = fr2.x.O6(xVar, height2, e0Var2.f310115d);
            android.view.View findViewById = xVar.getContext().findViewById(com.tencent.mm.R.id.nv_);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(O62));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "updateTabListBackground", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeActionBarUIC", "updateTabListBackground", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            android.widget.ImageView imageView = xVar.f265767h;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("headerBgView");
                throw null;
            }
            imageView.setAlpha(O6);
            android.widget.TextView textView = xVar.f265768i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("headerTitleTextView");
                throw null;
            }
            textView.setAlpha(O6);
            android.widget.ImageView imageView2 = xVar.f265765f;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("themeHeaderBgView");
                throw null;
            }
            imageView2.setAlpha((1.0f - O6) * 0.5f);
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onOffsetChanged: " + height2 + " mainAlpha: " + O6 + " tabListAlpha: " + O62 + " initHeaderHeight: " + height + " mainOffestHeight: " + e0Var.f310115d + " tabListOffestHeight: " + e0Var2.f310115d);
        }
    }
}
