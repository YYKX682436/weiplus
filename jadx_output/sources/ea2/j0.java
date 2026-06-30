package ea2;

/* loaded from: classes2.dex */
public final class j0 extends com.tencent.mm.plugin.finder.activity.uic.w1 {

    /* renamed from: v, reason: collision with root package name */
    public int f250562v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int O6(int i17) {
        return this.f250562v;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int P6() {
        return 138;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int Q6() {
        return getActivity().getIntent().getIntExtra("key_latest_index", 0);
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC R6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(ea2.k0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public int T6() {
        return 15;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC
    public boolean V6() {
        return 1 == this.f101741d;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.w1
    public void d7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = (com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC.class);
        da2.g Z6 = finderMusicTopicHeaderUIC.Z6();
        r45.hj2 hj2Var = Z6.f227749a;
        r45.zi2 zi2Var = hj2Var != null ? (r45.zi2) hj2Var.getCustom(3) : null;
        com.tencent.mm.plugin.finder.storage.FinderItem c17 = Z6.c();
        qd2.g gVar = Z6.f227753e;
        if (gVar.f361728b == null && c17 != null) {
            gVar.f361728b = c17;
            gVar.d(zi2Var);
        }
        finderMusicTopicHeaderUIC.U6();
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.w1
    public void e7() {
        r45.hj2 hj2Var;
        r45.zi2 zi2Var;
        r45.hj2 hj2Var2;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) pf5.z.f353948a.a(activity).c(zy2.ra.class))).V6();
        android.content.Intent intent = getActivity().getIntent();
        long longExtra = intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L;
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        r45.r03 r03Var = (r45.r03) ((ea2.k0) pf5.z.f353948a.a(activity2).a(ea2.k0.class)).f452711w;
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("source_feedid", pm0.v.u(longExtra));
        java.lang.String str = null;
        lVarArr[1] = new jz5.l("audioid", (r03Var == null || (hj2Var2 = (r45.hj2) r03Var.getCustom(19)) == null) ? null : hj2Var2.getString(15));
        if (r03Var != null && (hj2Var = (r45.hj2) r03Var.getCustom(19)) != null && (zi2Var = (r45.zi2) hj2Var.getCustom(3)) != null) {
            str = zi2Var.getString(12);
        }
        lVarArr[2] = new jz5.l("songid", str);
        lVarArr[3] = new jz5.l("music_profile_tab_type", java.lang.Integer.valueOf(this.f101741d));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("", "page_pull_up_refresh", com.tencent.mm.plugin.finder.report.d2.f124994a.b(V6, kz5.c1.k(lVarArr)), 1, false);
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.w1, com.tencent.mm.plugin.finder.activity.base.uic.FinderBaseContentUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f250562v = getIntent().getIntExtra("key_topic_type", 15);
        super.onCreate(bundle);
        c7().u().f405818f = (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.V0().r()).intValue() - 1) * 2;
        U6().f434523b.setEnableRefresh(false);
        android.view.ViewGroup.LayoutParams layoutParams = U6().f434523b.getLayoutParams();
        androidx.coordinatorlayout.widget.c cVar = layoutParams instanceof androidx.coordinatorlayout.widget.c ? (androidx.coordinatorlayout.widget.c) layoutParams : null;
        if (cVar != null) {
            ((android.view.ViewGroup.MarginLayoutParams) cVar).bottomMargin = (int) getDimension(com.tencent.mm.R.dimen.f479659bw);
            U6().f434523b.setLayoutParams(cVar);
        }
    }
}
