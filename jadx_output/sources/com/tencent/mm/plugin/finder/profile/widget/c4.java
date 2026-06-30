package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124502d;

    public c4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124502d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$updateEmptySection$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f124502d.A;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/MoreLiveNoticeListWidget$RecyclerAdapter$updateEmptySection$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
