package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114472d;

    public tr(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f114472d = etVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$initRoleAvatarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((ml2.r0) c17).ak(2, 9, null);
        i95.m c18 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((ml2.r0) c18).Cj(ml2.g5.E, null);
        df2.af afVar = (df2.af) this.f114472d.U0(df2.af.class);
        if (afVar != null) {
            afVar.Z6(true, new jz5.l(ml2.g5.F, null), 6);
        }
        i95.m c19 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c19;
        ml2.b4 b4Var = ml2.b4.f327277x2;
        cl0.g gVar = new cl0.g();
        gVar.h("type", "2");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "2");
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveInputPlugin$initRoleAvatarView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
