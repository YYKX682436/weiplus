package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122294d;

    public e0(com.tencent.mm.plugin.finder.playlist.l0 l0Var) {
        this.f122294d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122294d;
        if (com.tencent.mm.plugin.finder.playlist.l0.h(l0Var)) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        v92.g gVar = l0Var.E;
        if (gVar != null) {
            gVar.r();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
