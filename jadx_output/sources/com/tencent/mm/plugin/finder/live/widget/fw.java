package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class fw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nw f118375d;

    public fw(com.tencent.mm.plugin.finder.live.widget.nw nwVar) {
        this.f118375d = nwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveSwitchRoleDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f118375d.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveSwitchRoleDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
