package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes3.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f152611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo3.x f152612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f152613f;

    public f0(android.app.Activity activity, wo3.x xVar, com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f152611d = activity;
        this.f152612e = xVar;
        this.f152613f = k2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.r1.V(this.f152611d, this.f152612e.f448224h, true);
        com.tencent.mm.wallet_core.ui.r1.q0(3, 1);
        this.f152613f.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/offline/ui/OfflineErrorHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
