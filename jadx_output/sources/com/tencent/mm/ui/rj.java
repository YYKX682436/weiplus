package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class rj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f209750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f209751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.TipUseDuplicateGroupUI f209752g;

    public rj(java.util.List list, java.util.ArrayList arrayList, java.lang.String str, com.tencent.mm.ui.TipUseDuplicateGroupUI tipUseDuplicateGroupUI) {
        this.f209749d = list;
        this.f209750e = arrayList;
        this.f209751f = str;
        this.f209752g = tipUseDuplicateGroupUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/TipUseDuplicateGroupUI$onCreate$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = this.f209749d;
        int size = list.size();
        int size2 = this.f209750e.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectedContactCount: ");
        sb6.append(size);
        sb6.append(", alreadyExistedGroupCount: ");
        sb6.append(size2);
        sb6.append(", createGroupSessionId: ");
        java.lang.String str = this.f209751f;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TipUseDuplicateGroupUI", sb6.toString());
        pm0.v.K(null, new com.tencent.mm.ui.qj(size2, size, str));
        com.tencent.mm.ui.TipUseDuplicateGroupUI activity = this.f209752g;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((kk5.h0) pf5.z.f353948a.a(activity).a(kk5.h0.class)).T6(list);
        yj0.a.h(this, "com/tencent/mm/ui/TipUseDuplicateGroupUI$onCreate$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
