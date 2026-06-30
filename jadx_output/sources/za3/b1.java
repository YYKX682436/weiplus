package za3;

/* loaded from: classes15.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f470892a;

    /* renamed from: b, reason: collision with root package name */
    public final za3.a1 f470893b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.res.Resources f470894c;

    public b1(android.content.Context context, za3.a1 a1Var) {
        this.f470892a = context;
        this.f470893b = a1Var;
        this.f470894c = context.getResources();
    }

    public void a() {
        java.lang.Object l17 = gm0.j1.u().c().l(67590, null);
        if (!(l17 == null ? false : ((java.lang.Boolean) l17).booleanValue())) {
            db5.e1.H(this.f470892a, this.f470894c.getString(com.tencent.mm.R.string.f492397gh0), "", false, new za3.v0(this), new za3.w0(this));
            gm0.j1.u().c().w(67590, java.lang.Boolean.TRUE);
            return;
        }
        za3.a1 a1Var = this.f470893b;
        if (a1Var != null) {
            com.tencent.mm.plugin.location.ui.impl.p0 p0Var = (com.tencent.mm.plugin.location.ui.impl.p0) a1Var;
            p0Var.Y.f434368z = p0Var.f144733i.f144804f.getZoom();
            p0Var.f144728d.finish();
        }
    }
}
