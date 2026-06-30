package com.tencent.mm.plugin.finder.view;

/* loaded from: classes4.dex */
public final class ra implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderGridGalleryView f132938d;

    public ra(com.tencent.mm.plugin.finder.view.FinderGridGalleryView finderGridGalleryView) {
        this.f132938d = finderGridGalleryView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderGridGalleryView$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rl5.r rVar = this.f132938d.f131112o;
        if (rVar == null) {
            kotlin.jvm.internal.o.o("mediaTypePopupMenu");
            throw null;
        }
        rVar.m();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderGridGalleryView$init$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
