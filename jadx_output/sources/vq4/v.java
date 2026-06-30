package vq4;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f439384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f439385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z17, rh.c1 c1Var) {
        super(1);
        this.f439384d = z17;
        this.f439385e = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        rh.c1 c1Var = this.f439385e;
        boolean z17 = this.f439384d;
        vq4.x.a(subJson, com.tencent.midas.api.APMidasPayAPI.ENV_DEV, new vq4.s(c1Var, z17));
        vq4.x.a(subJson, "app", new vq4.t(c1Var));
        if (z17) {
            vq4.x.a(subJson, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, new vq4.u(c1Var));
        }
        return jz5.f0.f302826a;
    }
}
