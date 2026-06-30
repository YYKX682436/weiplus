package zo3;

@j95.b
/* loaded from: classes8.dex */
public class p extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.e f474864d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.l f474865e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.y f474866f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.z f474867g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.g0 f474868h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.c1 f474869i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.app.f f474870m;

    public static java.lang.String Ai() {
        return gm0.j1.u().d() + "openapi/";
    }

    public static com.tencent.mm.pluginsdk.model.app.f Bi() {
        gm0.j1.b().c();
        if (Zi().f474870m == null) {
            Zi().f474870m = new com.tencent.mm.pluginsdk.model.app.f();
        }
        return Zi().f474870m;
    }

    public static com.tencent.mm.pluginsdk.model.app.l Di() {
        gm0.j1.b().c();
        if (Zi().f474865e == null) {
            Zi().f474865e = new com.tencent.mm.pluginsdk.model.app.l();
        }
        return Zi().f474865e;
    }

    public static com.tencent.mm.pluginsdk.model.app.y Ni() {
        gm0.j1.b().c();
        if (Zi().f474866f == null) {
            Zi().f474866f = new com.tencent.mm.pluginsdk.model.app.y();
        }
        return Zi().f474866f;
    }

    public static com.tencent.mm.pluginsdk.model.app.z Ri() {
        gm0.j1.b().c();
        if (Zi().f474867g == null) {
            Zi().f474867g = new com.tencent.mm.pluginsdk.model.app.z(gm0.j1.u().f273153f);
        }
        return Zi().f474867g;
    }

    public static com.tencent.mm.pluginsdk.model.app.c1 Ui() {
        gm0.j1.b().c();
        if (Zi().f474869i == null) {
            Zi().f474869i = new com.tencent.mm.pluginsdk.model.app.c1();
        }
        return Zi().f474869i;
    }

    public static java.lang.String Vi() {
        return gm0.j1.u().d() + "share_img_tmp/";
    }

    public static zo3.p Zi() {
        return (zo3.p) i95.n0.c(zo3.p.class);
    }

    public static void wi() {
        if (com.tencent.mm.vfs.w6.j(Ai()) || com.tencent.mm.vfs.w6.u(Ai())) {
            return;
        }
        com.tencent.mars.xlog.Log.e("XPinOpenApi", "checkAccOpenApiPath mkdirs failed");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        com.tencent.mm.pluginsdk.model.app.y yVar = Zi().f474866f;
        if (yVar != null) {
            Bi().a(7, yVar);
        }
        com.tencent.mm.pluginsdk.model.app.l lVar = Zi().f474865e;
        if (lVar != null) {
            ((java.util.ArrayList) lVar.f188974b).clear();
            ((java.util.ArrayList) lVar.f188975c).clear();
            lVar.f188976d.clear();
        }
        com.tencent.mm.pluginsdk.model.app.c1 c1Var = Zi().f474869i;
        if (c1Var != null) {
            c1Var.f188821d.clear();
            Bi().a(1, c1Var);
        }
        com.tencent.mm.pluginsdk.model.app.f fVar = this.f474870m;
        if (fVar != null) {
            fVar.getClass();
            gm0.j1.n().f273288b.q(452, fVar);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.app.i(fVar));
        }
        if (Zi().f474867g != null) {
            ((lt0.f) Zi().f474867g.f189170d).clear();
        }
        this.f474864d = null;
        this.f474867g = null;
        com.tencent.mars.xlog.Log.i("XPinOpenApi", "onAccountRelease");
    }
}
