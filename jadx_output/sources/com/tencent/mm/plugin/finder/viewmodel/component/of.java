package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class of implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qf f135471d;

    public of(com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar) {
        this.f135471d = qfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer;
        com.tencent.mm.plugin.finder.feed.a7 a7Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showTipsBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar = this.f135471d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = qfVar.f135696f;
        if (finderItem != null) {
            java.lang.String desc = qfVar.f135697g;
            com.tencent.mm.plugin.finder.viewmodel.component.ze zeVar = (com.tencent.mm.plugin.finder.viewmodel.component.ze) qfVar.f135699i.get(java.lang.Long.valueOf(finderItem.getExpectId()));
            if (zeVar != null) {
                com.tencent.mm.plugin.finder.convert.w8 w8Var = (com.tencent.mm.plugin.finder.convert.w8) zeVar;
                com.tencent.mm.plugin.finder.convert.qe.E0(w8Var.f104852a, w8Var.f104853b, w8Var.f104854c, false, 0L, null, 0, 0, false, 0L, 0, 0, 2044, null);
                kotlin.jvm.internal.o.g(desc, "desc");
                com.tencent.mm.plugin.finder.view.f5 j27 = w8Var.f104852a.f104358f.j2();
                if (j27 != null && (finderCommentDrawer = j27.f132067a) != null && (a7Var = finderCommentDrawer.presenter) != null) {
                    a7Var.p0(finderCommentDrawer.sceneForReply, new java.util.ArrayList(), desc);
                }
            }
            qfVar.O6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showTipsBar$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
