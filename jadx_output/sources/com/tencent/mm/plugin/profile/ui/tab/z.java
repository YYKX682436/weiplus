package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f154706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.b0 f154707e;

    public z(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.profile.ui.tab.b0 b0Var) {
        this.f154706d = c0Var;
        this.f154707e = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initSubscribeBtnLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.tab.b0 b0Var = this.f154707e;
        boolean z17 = b0Var.f154242k.getVisibility() == 0;
        kotlin.jvm.internal.c0 c0Var = this.f154706d;
        c0Var.f310112d = z17;
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "btn clicked, cur status = " + c0Var.f310112d);
        if (c0Var.f310112d) {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "btn clicked, try to cancel!");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(b0Var.f154244m, 1, true);
            k0Var.f211872n = new com.tencent.mm.plugin.profile.ui.tab.x(b0Var);
            k0Var.f211881s = new com.tencent.mm.plugin.profile.ui.tab.y(b0Var);
            k0Var.v();
        } else {
            java.lang.String UserName = b0Var.f154233b.f389233d.f383065d;
            kotlin.jvm.internal.o.f(UserName, "UserName");
            gr3.e.d(UserName, 1702, b0Var.f154235d, b0Var.f154232a.getIntent(), b0Var.f154248q, 0, 0, null, null, null, 0, 0, 4064, null);
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "btn clicked, try to reserve!");
            com.tencent.mm.plugin.profile.ui.tab.b0.d(b0Var, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic$initSubscribeBtnLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
