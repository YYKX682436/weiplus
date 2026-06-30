package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class xa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView f133322d;

    public xa(com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView finderHighLightTopicEditView) {
        this.f133322d = finderHighLightTopicEditView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderHighLightTopicEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderHighLightTopicEditView finderHighLightTopicEditView = this.f133322d;
        yz5.l lVar = finderHighLightTopicEditView.f131131i;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("onAddListener");
            throw null;
        }
        lVar.invoke(finderHighLightTopicEditView.f131133n);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderHighLightTopicEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
