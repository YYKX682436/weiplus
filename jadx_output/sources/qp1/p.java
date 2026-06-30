package qp1;

/* loaded from: classes7.dex */
public class p implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qp1.k0 f365736a;

    public p(qp1.k0 k0Var) {
        this.f365736a = k0Var;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallPermissionUtil", "float window permission granted");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        qp1.q.c(this.f365736a, qp1.j0.Allow);
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallPermissionUtil", "onResultCancel ok:%b", java.lang.Boolean.valueOf(Ui));
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        qp1.q.c(this.f365736a, Ui ? qp1.j0.Allow : qp1.j0.Cancel);
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallPermissionUtil", "float window permission refused");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        qp1.q.c(this.f365736a, qp1.j0.Refuse);
    }
}
