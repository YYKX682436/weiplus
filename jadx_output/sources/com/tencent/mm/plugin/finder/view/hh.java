package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class hh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f132243d;

    public hh(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f132243d = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderPostOriginView$showTipDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_ORIGIN_TIPS_DIALOG_DONT_REMIND_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        this.f132243d.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderPostOriginView$showTipDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
