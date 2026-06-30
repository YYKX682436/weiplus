package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class n4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.p4 f117278d;

    public n4(com.tencent.mm.plugin.finder.live.viewmodel.p4 p4Var) {
        this.f117278d = p4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGuideCardViewHolder$bind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f117278d.itemView.getContext();
        com.tencent.mars.xlog.Log.i("FinderLiveGuideCard", "closeGuideCard: close guide card");
        if (context instanceof android.app.Activity) {
            ((android.app.Activity) context).finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveGuideCardViewHolder$bind$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
