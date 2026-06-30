package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class f5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151128d;

    public f5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var) {
        this.f151128d = z5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCancel, firstRenderTime:");
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151128d;
        sb6.append(z5Var.f151585x);
        sb6.append(", firstRenderFrame:");
        sb6.append(z5Var.f151586y);
        sb6.append(", backFirstRenderTime:");
        sb6.append(z5Var.f151587z);
        sb6.append(", backFirstFrame:");
        sb6.append(z5Var.A);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", sb6.toString());
        z5Var.f151586y = z5Var.A;
        z5Var.f151585x = z5Var.f151587z;
        com.tencent.mm.plugin.mv.ui.uic.w4 w4Var = z5Var.H;
        if (w4Var != null) {
            ((jm3.j0) w4Var).a(z5Var.B);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
