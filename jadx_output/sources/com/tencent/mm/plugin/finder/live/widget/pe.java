package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class pe implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.se f119380d;

    public pe(com.tencent.mm.plugin.finder.live.widget.se seVar) {
        this.f119380d = seVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$showContent$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f119380d.f119753a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        new com.tencent.mm.plugin.finder.live.widget.nw(context, false, com.tencent.mm.plugin.finder.live.widget.cw.f118029d).w();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveExceptionWidget$showContent$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
