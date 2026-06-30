package zl2;

/* loaded from: classes2.dex */
public final class y1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f474031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474034g;

    public y1(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, android.content.Context context) {
        this.f474031d = baseFinderFeed;
        this.f474032e = h0Var;
        this.f474033f = h0Var2;
        this.f474034g = context;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        zl2.r4 r4Var = zl2.r4.f473950a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f474031d;
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
        if (!r4Var.n(liveInfo != null ? liveInfo.getInteger(54) : 0) || (k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f474032e.f310123d) == null) {
            return;
        }
        android.content.Context context = this.f474034g;
        o25.y1 y1Var = (o25.y1) this.f474033f.f310123d;
        kotlin.jvm.internal.o.d(g4Var);
        ((com.tencent.mm.pluginsdk.forward.m) y1Var).Ai(context, g4Var, k0Var, 2, zl2.x1.f474021d);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ml2.u1 u1Var = ml2.u1.f328076q;
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((b92.d1) zbVar).sj(u1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6());
    }
}
