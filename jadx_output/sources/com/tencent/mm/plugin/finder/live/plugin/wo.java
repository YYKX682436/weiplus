package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f114982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cj1 f114983e;

    public wo(com.tencent.mm.plugin.finder.live.plugin.ap apVar, r45.cj1 cj1Var) {
        this.f114982d = apVar;
        this.f114983e = cj1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$updateBulletShowingInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!zl2.r4.f473950a.w1()) {
            r45.zb4 zb4Var = new r45.zb4();
            java.lang.String string = this.f114983e.getString(0);
            if (string == null) {
                string = "";
            }
            zb4Var.set(0, string);
            zb4Var.set(1, java.lang.Boolean.TRUE);
            ((mm2.s2) this.f114982d.P0(mm2.s2.class)).f329411p.postValue(zb4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$updateBulletShowingInfo$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
