package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208467d;

    public d0(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208467d = j1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService$handleOnScreenShot$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "shareTongue onClick, directly show");
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208467d;
        j1Var.Ai();
        ct.e3.j2(j1Var, null, 1, null);
        yj0.a.h(this, "com/tencent/mm/ui/feature/api/screenshot/ScreenShotShareService$handleOnScreenShot$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
