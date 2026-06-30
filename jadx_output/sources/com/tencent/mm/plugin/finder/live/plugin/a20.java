package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.e20 f111785d;

    public a20(com.tencent.mm.plugin.finder.live.plugin.e20 e20Var) {
        this.f111785d = e20Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOldSongBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f233372a;
        boolean z17 = dk2.ef.f233384g;
        com.tencent.mm.plugin.finder.live.plugin.e20 e20Var = this.f111785d;
        if (z17) {
            sf2.x xVar = (sf2.x) e20Var.U0(sf2.x.class);
            if (xVar != null) {
                xVar.r7();
            }
        } else {
            qo0.c.a(e20Var.f112363q, qo0.b.f365415t2, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOldSongBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
