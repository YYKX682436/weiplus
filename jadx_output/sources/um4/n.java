package um4;

/* loaded from: classes.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback f429124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f429125e;

    public n(com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback iLiteAppUICallback, int i17) {
        this.f429124d = iLiteAppUICallback;
        this.f429125e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final android.view.View findViewById;
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        final android.view.View view = (android.view.View) this.f429124d;
        final lf0.h0 h0Var = (lf0.h0) g0Var;
        h0Var.getClass();
        if (view.getRootView() == null || (findViewById = view.getRootView().findViewById(com.tencent.mm.R.id.og_)) == null) {
            return;
        }
        findViewById.setBackgroundColor(this.f429125e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/feature/topstory/TopStoryUIService", "showNavBarShadow", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/feature/topstory/TopStoryUIService", "showNavBarShadow", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: lf0.h0$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                android.view.View view3 = findViewById;
                lf0.h0 h0Var2 = lf0.h0.this;
                h0Var2.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view3);
                android.view.View view4 = view;
                arrayList2.add(view4);
                arrayList2.add(view2);
                java.lang.Object[] array = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/feature/topstory/TopStoryUIService", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", h0Var2, array);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/feature/topstory/TopStoryUIService", "lambda$showNavBarShadow$0", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/feature/topstory/TopStoryUIService", "lambda$showNavBarShadow$0", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (view4 instanceof com.tencent.liteapp.ui.WxaLiteAppBaseView) {
                    h0Var2.Ri(((com.tencent.liteapp.ui.WxaLiteAppBaseView) view4).getAppUuid(), "onNavBarShadowManuallyHidden", null);
                }
                yj0.a.h(h0Var2, "com/tencent/mm/feature/topstory/TopStoryUIService", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }
}
