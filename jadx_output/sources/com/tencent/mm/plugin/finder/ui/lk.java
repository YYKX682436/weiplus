package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class lk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f129486e;

    public lk(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, android.view.View view) {
        this.f129485d = finderShareFeedRelUI;
        this.f129486e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$showRetryTips$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129485d;
        finderShareFeedRelUI.R7(true);
        android.view.View view2 = this.f129486e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$showRetryTips$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$showRetryTips$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
        if (qmVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        qmVar.P();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$showRetryTips$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
