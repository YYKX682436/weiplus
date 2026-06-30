package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f208584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f208585f;

    public z(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, java.util.HashMap hashMap, android.view.View.OnClickListener onClickListener) {
        this.f208583d = j1Var;
        this.f208584e = hashMap;
        this.f208585f = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        qj5.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService$createShareTongue$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208583d;
        j1Var.f208499e = currentTimeMillis;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_screenshot_btn", "view_clk", this.f208584e, 36458);
        java.lang.ref.WeakReference weakReference = j1Var.f208508q;
        if (weakReference != null && (sVar = (qj5.s) weakReference.get()) != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ry) sVar).b();
        }
        j1Var.Bi(com.tencent.mm.ui.feature.api.screenshot.w.f208563e);
        this.f208585f.onClick(view);
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService$createShareTongue$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
