package r01;

/* loaded from: classes3.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f368038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f368039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f368040f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(l81.b1 b1Var, l81.e1 e1Var, android.content.Context context) {
        super(1);
        this.f368038d = b1Var;
        this.f368039e = e1Var;
        this.f368040f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        l81.b1 b1Var = this.f368038d;
        b1Var.f317018d = 447;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "EDITOR_WE_APP_VERSION: 447");
        b1Var.f317016c = intValue;
        b1Var.L = this.f368039e;
        java.lang.String enterPath = b1Var.f317022f;
        kotlin.jvm.internal.o.f(enterPath, "enterPath");
        if (!r26.i0.y(enterPath, "pages/creator-center/creator-center.html", false)) {
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f368040f, b1Var);
        return jz5.f0.f302826a;
    }
}
