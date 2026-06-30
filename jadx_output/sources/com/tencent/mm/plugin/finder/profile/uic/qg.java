package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class qg implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC f124160d;

    public qg(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC) {
        this.f124160d = finderProfileTemplateUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC$addPublishTemplateHeader$textView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC.O6(this.f124160d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC$addPublishTemplateHeader$textView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
