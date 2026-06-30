package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qf f135169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f135170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent f135171f;

    public mf(com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent finderPostRefFeedCommentEvent) {
        this.f135169d = qfVar;
        this.f135170e = finderItem;
        this.f135171f = finderPostRefFeedCommentEvent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showRefFeedCommentPostTips$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar = this.f135169d;
        kotlinx.coroutines.l.d(qfVar.getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.lf(qfVar, this.f135170e, this.f135171f, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showRefFeedCommentPostTips$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
