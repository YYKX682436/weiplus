package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class y8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f117550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.z8 f117551e;

    public y8(r45.qt2 qt2Var, com.tencent.mm.plugin.finder.live.viewmodel.z8 z8Var) {
        this.f117550d = qt2Var;
        this.f117551e = z8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRolePrivacyEntranceUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.W2;
        java.util.HashMap i17 = kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "3"), new jz5.l("type", "2"));
        r45.qt2 qt2Var = this.f117550d;
        zy2.zb.T8(zbVar, t1Var, i17, qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        androidx.appcompat.app.AppCompatActivity context = this.f117551e.getActivity();
        ((b92.d1) zbVar2).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLiveNormalOccupyUI3.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/FinderCommonLiveService", "goLivePrivacyUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/FinderCommonLiveService", "goLivePrivacyUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRolePrivacyEntranceUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
