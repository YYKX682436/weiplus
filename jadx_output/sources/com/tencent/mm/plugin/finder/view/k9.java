package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class k9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendReadingView f132486d;

    public k9(com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView) {
        this.f132486d = finderExtendReadingView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setOriginState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderExtendReadingView finderExtendReadingView = this.f132486d;
        yz5.a aVar = finderExtendReadingView.f131046d;
        if (aVar != null) {
            aVar.invoke();
        }
        finderExtendReadingView.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingView$setOriginState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
