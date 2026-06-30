package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ri f118570d;

    public hi(com.tencent.mm.plugin.finder.live.widget.ri riVar) {
        this.f118570d = riVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.ri riVar = this.f118570d;
        riVar.getClass();
        riVar.postDelayed(new com.tencent.mm.plugin.finder.live.widget.li(riVar), 300L);
        yz5.a aVar = riVar.f119640h;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
