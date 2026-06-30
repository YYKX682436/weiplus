package we3;

/* loaded from: classes11.dex */
public final class k extends ve3.q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f445280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f445281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f445282d;

    /* renamed from: e, reason: collision with root package name */
    public final mn0.b0 f445283e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f445284f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f445285g;

    public k(java.lang.String finder_export_id, java.lang.String finder_object_id, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(finder_export_id, "finder_export_id");
        kotlin.jvm.internal.o.g(finder_object_id, "finder_object_id");
        this.f445279a = finder_export_id;
        this.f445280b = i17;
        this.f445281c = i18;
        this.f445282d = i19;
        c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        mn0.b0 wi6 = ((v40.q) q0Var).wi(context);
        this.f445283e = wi6;
        mn0.y yVar = (mn0.y) wi6;
        yVar.G(true);
        yVar.K(mn0.d0.B, 23);
        ls5.d dVar = yVar.f329807f;
        if (dVar != null) {
            dVar.f321128h = new we3.g();
        }
        yVar.Q(0);
        yVar.J(new we3.h(this));
    }

    @Override // ve3.q
    public int a() {
        return this.f445280b;
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBFinderLivePlayerItem", "destroy, playId: " + this.f445280b);
        this.f445284f = false;
        mn0.b0 b0Var = this.f445283e;
        ls5.d dVar = ((mn0.y) b0Var).f329807f;
        if (dVar != null) {
            dVar.f321128h = new we3.i();
        }
        mn0.b0.C(b0Var, false, false, false, 6, null);
        ((mn0.y) b0Var).w();
    }

    public void e(ve3.o callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f445285g) {
            ((xd3.c) callback).b(-1, "cgi still requesting");
            return;
        }
        if (((mn0.y) this.f445283e).b(false)) {
            ((xd3.c) callback).b(-1, "already playing");
            return;
        }
        this.f445285g = true;
        this.f445284f = true;
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.U9((s40.w0) c17, 0L, "", 65, 2, "", true, null, 0L, null, false, false, this.f445279a, null, 0, 10176, null).l().K(new we3.j(this, callback));
    }
}
