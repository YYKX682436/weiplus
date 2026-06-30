package qg1;

/* loaded from: classes7.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.v54 f362765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qg1.d f362766b;

    public g(qg1.d dVar, r45.v54 v54Var) {
        this.f362766b = dVar;
        this.f362765a = v54Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        qg1.d dVar = this.f362766b;
        int i17 = dVar.E().f387059h.f374246d;
        r45.ze5 ze5Var = this.f362765a.f387905g;
        java.lang.Runnable runnable = dVar.f362757w;
        if (ze5Var == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(ze5Var.f391956g);
        objArr[2] = java.lang.Boolean.valueOf(ze5Var.f391957h > 0);
        objArr[3] = java.lang.Boolean.valueOf(ze5Var.f391959m);
        objArr[4] = java.lang.Boolean.valueOf(ze5Var.f391953d);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCommLibVersionChecker", "updateByLaunchWxaApp, reqVersion:%d, respVersion:%d, force_update:%b, rely_update:%b, need_update:%b", objArr);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.bio.face.o.CTRL_INDEX, 21);
        r45.fc7 fc7Var = new r45.fc7();
        fc7Var.f374210d = ze5Var.f391954e;
        fc7Var.f374211e = ze5Var.f391955f;
        fc7Var.f374212f = ze5Var.f391956g;
        fc7Var.f374214h = ze5Var.f391957h;
        fc7Var.f374215i = (ze5Var.f391953d || ze5Var.f391959m) ? 1 : 0;
        fc7Var.f374216m = ze5Var.f391958i;
        com.tencent.mm.plugin.appbrand.appcache.e5.Bi().wi(i17, fc7Var, com.tencent.mm.plugin.appbrand.appcache.h8.Launch, runnable);
        return null;
    }
}
