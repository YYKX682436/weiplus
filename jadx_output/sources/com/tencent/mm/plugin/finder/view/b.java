package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.c f131685d;

    public b(com.tencent.mm.plugin.finder.view.c cVar) {
        this.f131685d = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/AnchorHideNoticeGuideView$initContentView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.c cVar = this.f131685d;
        yz5.a aVar = cVar.f131741h;
        if (aVar != null) {
            aVar.invoke();
        }
        cVar.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/AnchorHideNoticeGuideView$initContentView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
