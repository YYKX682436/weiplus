package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class h9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView f132227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132228e;

    public h9(com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView, java.lang.String str) {
        this.f132227d = finderExtendReadingEditView;
        this.f132228e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f132227d.f131036d;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("onAddListener");
            throw null;
        }
        lVar.invoke(this.f132228e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
