package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class oi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI f129606d;

    public oi(com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI finderShareFeedDetailUI) {
        this.f129606d = finderShareFeedDetailUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI$onResume$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.v1.f125393a.d();
        ((c61.l7) i95.n0.c(c61.l7.class)).getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "reset timeline auto refresh time");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zj(uuid, "Enter");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_context_id", uuid);
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.ub.L7((c61.ub) c17, this.f129606d, intent, 1, false, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderShareFeedDetailUI$onResume$1$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
