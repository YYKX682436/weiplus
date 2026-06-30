package ui1;

/* loaded from: classes7.dex */
public class f extends ui1.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ui1.a0 f428047b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ui1.t tVar, ui1.r rVar, ui1.a0 a0Var) {
        super(rVar);
        this.f428047b = a0Var;
    }

    @Override // ui1.q, ui1.r
    public void a() {
        super.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "onConfirm " + d());
    }

    @Override // ui1.q, ui1.r
    public void c(int i17, java.lang.String str) {
        super.c(i17, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "onDeny errno[%d] errMsg[%s] %s", java.lang.Integer.valueOf(i17), str, d());
    }

    public final java.lang.String d() {
        ui1.a0 a0Var = this.f428047b;
        com.tencent.mm.plugin.appbrand.y yVar = a0Var.f428025a;
        return java.lang.String.format(java.util.Locale.ENGLISH, "component[%s %d], api[%s] callbackId[%d]", yVar.getAppId(), java.lang.Integer.valueOf(yVar.getComponentId()), a0Var.f428026b, java.lang.Integer.valueOf(a0Var.f428028d));
    }

    @Override // ui1.q, ui1.r
    public void onCancel() {
        super.onCancel();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "onCancel " + d());
    }
}
