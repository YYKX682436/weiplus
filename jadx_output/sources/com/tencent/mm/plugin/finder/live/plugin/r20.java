package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class r20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t20 f114074d;

    public r20(com.tencent.mm.plugin.finder.live.plugin.t20 t20Var) {
        this.f114074d = t20Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$setClickJumpGameTogetherHalf$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f114074d.v1();
        if (!((mm2.c1) this.f114074d.P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) this.f114074d.P0(mm2.n0.class)).f329273r)) {
                qo0.c.a(this.f114074d.R0(), qo0.b.f365444z2, null, 2, null);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$setClickJumpGameTogetherHalf$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        qo0.c.a(this.f114074d.R0(), qo0.b.C2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOneClickGameTipsPlugin$setClickJumpGameTogetherHalf$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
