package pk2;

/* loaded from: classes3.dex */
public final class q6 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356194i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356194i = "assistant.more.morefunction.gift";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356194i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        zl2.r4 r4Var = zl2.r4.f473950a;
        pk2.o9 o9Var = this.f364427a;
        return !r4Var.P1(o9Var.f356074b) && ((mm2.c1) o9Var.c(mm2.c1.class)).f328862p3;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f131959f;
        boolean m76 = ((mm2.c1) o9Var.c(mm2.c1.class)).m7();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hxv);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AssistantRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.view.LoadingSwitchBtn g17 = o9Var.g(view, com.tencent.mm.R.id.ntm, m76);
        kotlinx.coroutines.y0 j17 = j();
        if (j17 != null) {
            g17.g(j17, new pk2.k6(o9Var), new pk2.p6(this, o9Var, view, null));
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.I8((zy2.zb) c17, m76 ? ml2.u1.f328031J : ml2.u1.I, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.m2p);
    }
}
