package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class f9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView f132079d;

    public f9(com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView) {
        this.f132079d = finderExtendReadingEditView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f132079d.f131037e;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
