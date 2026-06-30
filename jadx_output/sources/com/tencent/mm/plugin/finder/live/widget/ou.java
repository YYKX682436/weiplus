package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class ou implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pu f119321d;

    public ou(com.tencent.mm.plugin.finder.live.widget.pu puVar) {
        this.f119321d = puVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget$showAndLoad$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.pu puVar = this.f119321d;
        puVar.getClass();
        boolean l17 = gm0.j1.u().l();
        android.content.Context context = puVar.f118381d;
        if (l17) {
            boolean z17 = context instanceof q80.z;
            if (z17) {
                q80.z zVar = z17 ? (q80.z) context : null;
                if (zVar != null) {
                    zVar.R1(new com.tencent.mm.plugin.finder.live.widget.ku(puVar));
                }
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.lu(puVar);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.mu(puVar);
            k0Var.v();
        } else {
            db5.t7.l(context);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget$showAndLoad$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
