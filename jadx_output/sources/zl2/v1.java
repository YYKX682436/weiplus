package zl2;

/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f473996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f473997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(db5.g4 g4Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        super(1);
        this.f473996d = g4Var;
        this.f473997e = baseFinderFeed;
        this.f473998f = context;
        this.f473999g = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ((java.util.ArrayList) this.f473996d.f228344d).clear();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f473997e;
        boolean z17 = !baseFinderFeed.getFeedObject().checkIsEnableShare(103);
        if (z17) {
            this.f473996d.j(103, (java.lang.CharSequence) it.f302842e, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
        } else {
            db5.g4 g4Var = this.f473996d;
            android.content.Context context = this.f473998f;
            g4Var.j(103, context.getString(com.tencent.mm.R.string.f492075f54), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z17);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var = ml2.u1.f328065n;
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((b92.d1) zbVar).sj(u1Var, baseFinderFeed, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6());
        }
        this.f473999g.j();
        return jz5.f0.f302826a;
    }
}
