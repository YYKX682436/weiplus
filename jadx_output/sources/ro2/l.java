package ro2;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f398059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f398061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f398062g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398063h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context, com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var, java.lang.String str) {
        super(0);
        this.f398059d = baseFinderFeed;
        this.f398060e = context;
        this.f398061f = qeVar;
        this.f398062g = s0Var;
        this.f398063h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.I0().r()).booleanValue();
        android.content.Context context = this.f398060e;
        if (booleanValue) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f398059d;
            if (!baseFinderFeed.getFeedObject().isCommentClose()) {
                java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.ohb);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
                int dimension2 = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479672c9);
                java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.o3a);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
                com.tencent.mm.plugin.finder.convert.qe qeVar = this.f398061f;
                java.util.Map a17 = d2Var.a(context, ro2.r.b(qeVar, context, baseFinderFeed));
                int i17 = al5.u4.f6058t;
                al5.t4 t4Var = new al5.t4(context);
                qeVar.F = t4Var.d();
                t4Var.f6042e = hc2.x0.k(string, context, '#', com.tencent.mm.R.raw.check_mark_regular, com.tencent.mm.R.color.f478553an, dimension, dimension, 0, dimension2, 2, 64, null);
                t4Var.a(string2);
                t4Var.f6039b = 1;
                t4Var.f6046i = 4000;
                t4Var.f6045h = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479660bx);
                com.tencent.mm.plugin.finder.convert.qe qeVar2 = this.f398061f;
                in5.s0 s0Var = this.f398062g;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f398059d;
                android.content.Context context2 = this.f398060e;
                t4Var.f6038a.f6014b = new ro2.j(qeVar2, s0Var, baseFinderFeed2, context2, this.f398063h, a17);
                t4Var.f6047j = new ro2.k(context2, a17, qeVar2);
                t4Var.i();
                t4Var.g();
                return jz5.f0.f302826a;
            }
        }
        db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.mrk), com.tencent.mm.R.raw.icons_filled_done);
        return jz5.f0.f302826a;
    }
}
