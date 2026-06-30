package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class bk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ck f131726d;

    public bk(com.tencent.mm.plugin.finder.view.ck ckVar) {
        this.f131726d = ckVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderShareProductWxaCoverWidget$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick data:");
        com.tencent.mm.plugin.finder.view.ck ckVar = this.f131726d;
        sb6.append(ckVar.f131783b);
        com.tencent.mars.xlog.Log.i("Finder.FinderShareProductWxaCoverWidget", sb6.toString());
        com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(ckVar.f131783b), com.tencent.mm.plugin.finder.view.wj.class, new com.tencent.mm.plugin.finder.view.ak(), null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderShareProductWxaCoverWidget$setClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
