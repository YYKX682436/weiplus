package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class l4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.n4 f116457d;

    public l4(com.tencent.mm.plugin.finder.live.view.n4 n4Var) {
        this.f116457d = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.view.n4 n4Var = this.f116457d;
        com.tencent.mm.plugin.finder.live.widget.ve veVar = n4Var.f116509v;
        if (veVar == null) {
            veVar = new com.tencent.mm.plugin.finder.live.widget.ve(n4Var.f118381d);
            veVar.f120064h = new com.tencent.mm.plugin.finder.live.view.m4(n4Var);
        }
        n4Var.f116509v = veVar;
        int i17 = n4Var.f116511x;
        veVar.w();
        com.tencent.mm.plugin.finder.view.FinderLiveDarkModePicker finderLiveDarkModePicker = veVar.f120065i;
        if (finderLiveDarkModePicker == null) {
            kotlin.jvm.internal.o.o("picker");
            throw null;
        }
        finderLiveDarkModePicker.c(i17 - 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel$initContentView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
