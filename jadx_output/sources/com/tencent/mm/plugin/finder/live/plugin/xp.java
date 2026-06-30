package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f115121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f115122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f115123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f115124g;

    public xp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, android.content.Context context, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f115121d = dqVar;
        this.f115122e = context;
        this.f115123f = f0Var;
        this.f115124g = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        js4.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftSendPlugin$showWecoinNotEnoughDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f115121d;
        if (dqVar.f112321p.getLiveRole() == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Wj(ml2.h5.f327529m, "", 0);
        }
        android.content.Context context = this.f115122e;
        if (context instanceof androidx.fragment.app.FragmentActivity) {
            dk2.xf W0 = dqVar.W0();
            if (W0 != null) {
                kotlin.jvm.internal.o.f(context, "$context");
                androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
                int i17 = this.f115123f.f310116d;
                kVar = ((dk2.r4) W0).s0(fragmentActivity, 2, i17 > 0 ? i17 : 0, new com.tencent.mm.plugin.finder.live.plugin.wp(dqVar));
            } else {
                kVar = null;
            }
            dqVar.Q = kVar;
        }
        this.f115124g.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftSendPlugin$showWecoinNotEnoughDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
