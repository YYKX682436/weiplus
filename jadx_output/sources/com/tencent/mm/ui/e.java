package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.b f208350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f208351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.Menu f208352g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208353h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f208354i;

    public e(android.view.View view, androidx.appcompat.app.b bVar, com.tencent.mm.ui.ga gaVar, android.view.Menu menu, android.view.View view2, boolean z17) {
        this.f208349d = view;
        this.f208350e = bVar;
        this.f208351f = gaVar;
        this.f208352g = menu;
        this.f208353h = view2;
        this.f208354i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        android.view.View view = this.f208349d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView measuredWidth inside is %s, customView : %s .", java.lang.Integer.valueOf(view.getMeasuredWidth()), view);
        androidx.appcompat.app.b bVar = this.f208350e;
        if (view != bVar.j()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView is not equals current actionbar's custom, customView width old = %s customView = %s， context : %s.", java.lang.Integer.valueOf(view.getMeasuredWidth()), view, view.getContext());
            if (bVar.j() != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView is not equals current actionbar's custom, customView width new = %s, customView = %s， context : %s.", java.lang.Integer.valueOf(bVar.j().getMeasuredWidth()), bVar.j(), bVar.j().getContext());
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, actionBar.getCustomView() is null.");
            }
        }
        android.content.Context context = view.getContext();
        int B = i65.a.B(context);
        if (!com.tencent.mm.ui.bk.y()) {
            B = i65.a.B(context);
        } else if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                B = activity.getWindow().getDecorView().getMeasuredWidth();
            }
        }
        int measuredWidth = view.getMeasuredWidth();
        if (measuredWidth == 0 && "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(this.f208351f.v())) {
            android.view.Menu menu = this.f208352g;
            if (menu == null || menu.size() <= 0) {
                i17 = 0;
            } else {
                i17 = 0;
                for (int i18 = 0; i18 < menu.size(); i18++) {
                    android.view.MenuItem item = menu.getItem(i18);
                    if (item != null && item.isEnabled() && item.isVisible()) {
                        i17++;
                    }
                }
            }
            int dimension = (i17 > 1 ? i17 : 1) * ((int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db));
            com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, menu width is %s, defaultMenuWidth: %s.", java.lang.Integer.valueOf(i17 * ((int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db))), java.lang.Integer.valueOf(dimension));
            measuredWidth = B - dimension;
        }
        android.view.View view2 = this.f208353h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/ActionBarCenterHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/ActionBarCenterHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f208353h;
        if (view3 == null || measuredWidth == 0) {
            return;
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
        int dimension2 = (int) view.getResources().getDimension(com.tencent.mm.R.dimen.f479723df);
        if (findViewById != null) {
            dimension2 = findViewById.getMeasuredWidth();
        }
        if (!this.f208354i) {
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f482535h1);
            if (findViewById2 != null) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
                marginLayoutParams.leftMargin = 0;
                findViewById2.setLayoutParams(marginLayoutParams);
            }
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            marginLayoutParams2.leftMargin = dimension2;
            view3.setLayoutParams(marginLayoutParams2);
            return;
        }
        int left = view.getLeft();
        int i19 = (B - measuredWidth) - left;
        int max = java.lang.Math.max(i19 - left, dimension2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) view3.getLayoutParams();
        marginLayoutParams3.width = B - ((max + left) * 2);
        marginLayoutParams3.leftMargin = max;
        view3.setLayoutParams(marginLayoutParams3);
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, backViewWidth: %s, menuAreaWidth: %s, leftMargin: %s, titleWidth: %s, activityWidth: %s, customMeasuredWidth: %s, customPadding: %s, customRealWidth: %s.", java.lang.Integer.valueOf(dimension2), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(marginLayoutParams3.width), java.lang.Integer.valueOf(B), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(left), java.lang.Integer.valueOf(view.getWidth()));
        if (findViewById != null) {
            if (max != 0) {
                dimension2 = 0;
            }
            view3.setPadding(dimension2, 0, dimension2, 0);
        }
    }
}
