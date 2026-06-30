package rn3;

@j95.b
/* loaded from: classes13.dex */
public class i extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.newtips.model.p f397951d = null;

    /* renamed from: e, reason: collision with root package name */
    public vn3.a f397952e = null;

    /* renamed from: f, reason: collision with root package name */
    public vn3.b f397953f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.newtips.model.e f397954g = null;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.newtips.model.t f397955h = new com.tencent.mm.plugin.newtips.model.t();

    public static com.tencent.mm.plugin.newtips.model.e Ai() {
        gm0.j1.b().c();
        if (Ni().f397954g == null) {
            Ni().f397954g = new com.tencent.mm.plugin.newtips.model.e();
        }
        return Ni().f397954g;
    }

    public static vn3.b Bi() {
        gm0.j1.b().c();
        if (Ni().f397953f == null) {
            rn3.i Ni = Ni();
            gm0.j1.i();
            Ni.f397953f = new vn3.b(gm0.j1.u().f273153f);
        }
        return Ni().f397953f;
    }

    public static com.tencent.mm.plugin.newtips.model.p Di() {
        gm0.j1.b().c();
        if (Ni().f397951d == null) {
            Ni().f397951d = new com.tencent.mm.plugin.newtips.model.p();
        }
        return Ni().f397951d;
    }

    public static rn3.i Ni() {
        return (rn3.i) i95.n0.c(rn3.i.class);
    }

    public static vn3.a wi() {
        gm0.j1.b().c();
        if (Ni().f397952e == null) {
            rn3.i Ni = Ni();
            gm0.j1.i();
            Ni.f397952e = new vn3.a(gm0.j1.u().f273153f);
        }
        return Ni().f397952e;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        Di().h(1, 1, 1, "", "me_setting_general_plugin");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTips.NewTipsManager", "dancy register dynamic newtips, tipsId:%s, path:%s", 1, "me_setting_general_plugin");
    }
}
