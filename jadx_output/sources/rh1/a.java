package rh1;

/* loaded from: classes7.dex */
public class a extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public final r45.qs0 f395622x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI f395623y;

    public a(ak3.c cVar) {
        super(cVar);
        this.f395622x = new r45.qs0();
        this.f395623y = null;
    }

    @Override // jk3.v, jk3.b
    public void C(boolean z17, int i17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFilesMultiTaskHelper", "onMenuFloatBallSelected, enter float ball");
            l(null, true);
            this.f395623y.T6(null);
        }
    }

    public void c0(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFilesMultiTaskHelper", "update processName: %s", str);
        r45.qs0 qs0Var = this.f395622x;
        if (qs0Var != null) {
            qs0Var.set(4, str);
            try {
                this.f300077a.field_data = qs0Var.toByteArray();
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandFilesMultiTaskHelper", "updateAppid", e17);
            }
        }
        J();
    }
}
