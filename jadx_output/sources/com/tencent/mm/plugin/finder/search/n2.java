package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.q2 f125788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f125789e;

    public n2(com.tencent.mm.plugin.finder.search.q2 q2Var, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.f125788d = q2Var;
        this.f125789e = finderContact;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String username = this.f125789e.getUsername();
        if (username == null) {
            username = "";
        }
        com.tencent.mm.plugin.finder.search.q2 q2Var = this.f125788d;
        q2Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", username);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, q2Var.f125823a, intent, 0L, null, 0, 1, false, 0, null, com.tencent.wcdb.FileUtils.S_IRWXU, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).mk(q2Var.f125823a, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
