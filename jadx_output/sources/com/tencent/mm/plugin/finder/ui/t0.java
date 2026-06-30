package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f129853d;

    public t0(com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f129853d = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f129853d.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
