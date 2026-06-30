package sc2;

/* loaded from: classes2.dex */
public final class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f405785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f405786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f405788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405789i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f405790m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405791n;

    public b6(xc2.p0 p0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.wf6 wf6Var, android.view.View view, sc2.d6 d6Var, in5.s0 s0Var, r45.wf6 wf6Var2, java.lang.String str) {
        this.f405784d = p0Var;
        this.f405785e = baseFinderFeed;
        this.f405786f = wf6Var;
        this.f405787g = view;
        this.f405788h = d6Var;
        this.f405789i = s0Var;
        this.f405790m = wf6Var2;
        this.f405791n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.dm2 object_extend;
        r45.cl2 cl2Var;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.in2 in2Var = new r45.in2();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f405785e;
        in2Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getFeedObject().getId()));
        in2Var.set(1, baseFinderFeed.getFeedObject().getObjectNonceId());
        in2Var.set(2, java.lang.Integer.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getAdFlag()));
        in2Var.set(3, baseFinderFeed.getFeedObject().getFeedObject().getCookie());
        linkedList.add(in2Var);
        xc2.p0 p0Var = this.f405784d;
        xc2.o0 o0Var = p0Var.f453246h;
        xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
        java.lang.String str = pVar != null ? pVar.f453229h : null;
        if ((str == null || str.length() == 0) && ((object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend()) == null || (cl2Var = (r45.cl2) object_extend.getCustom(4)) == null || (str = cl2Var.getString(2)) == null)) {
            str = "";
        }
        java.lang.String str2 = str;
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        int integer = this.f405786f.getInteger(36);
        android.view.View view = this.f405787g;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i17 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context2);
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        android.content.Context context3 = view.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        az2.j Xh = c61.zb.Xh(zbVar, linkedList, integer, 0, i17, e17, str2, null, null, 0, null, null, null, null, ((c61.w8) paVar).wi(context3), null, null, null, 122820, null);
        p0Var.f453236b = android.os.SystemClock.elapsedRealtime();
        pq5.g h17 = Xh.l().h(new sc2.a6(this.f405784d, this.f405788h, this.f405789i, this.f405787g, this.f405790m, this.f405785e, this.f405791n));
        java.lang.Object obj = this.f405789i.f293121e;
        im5.b bVar = obj instanceof im5.b ? (im5.b) obj : null;
        if (bVar != null) {
            h17.f(bVar);
        }
    }
}
