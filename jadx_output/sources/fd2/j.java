package fd2;

/* loaded from: classes2.dex */
public final class j extends com.tencent.mm.ui.component.UIComponent implements zy2.u5 {

    /* renamed from: i, reason: collision with root package name */
    public static final fd2.a f261271i = new fd2.a(null);

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Long f261272m;

    /* renamed from: d, reason: collision with root package name */
    public long f261273d;

    /* renamed from: e, reason: collision with root package name */
    public so2.u0 f261274e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f261275f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f261276g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f261277h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f261277h = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
    }

    public static final void O6(fd2.j jVar, java.lang.String str, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        if (baseFinderFeed == null) {
            jVar.getClass();
            return;
        }
        android.app.Activity context = jVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        in5.s0 s0Var = jVar.P6().f251270f;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("nointerest_guide_bubble", str, kz5.c1.i(new jz5.l("feed_id", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Ui(baseFinderFeed.getFeedObject().getId())), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("session_buffer", ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), V6.getInteger(5))), new jz5.l("playpercent", java.lang.Integer.valueOf((s0Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) == null) ? 0 : finderVideoLayout.getPlayPercent()))), 1, false);
    }

    public final ed2.i P6() {
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(ed2.i.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (ed2.i) a17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f261277h = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
    }
}
