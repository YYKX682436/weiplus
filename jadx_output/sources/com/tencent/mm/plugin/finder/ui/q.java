package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f129708e;

    public q(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI, com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        this.f129707d = finderActivityDescUI;
        this.f129708e = finderContact;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$refreshView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String username = this.f129708e.getUsername();
        if (username == null) {
            username = "";
        }
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.d7(this.f129707d, username);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$refreshView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
