package fo5;

/* loaded from: classes14.dex */
public final class m implements j35.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f265022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ er4.r f265023b;

    public m(fo5.r0 r0Var, er4.r rVar) {
        this.f265022a = r0Var;
        this.f265023b = rVar;
    }

    @Override // j35.a
    public void a(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        er4.r rVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchSmallWindow onResultAllow: ");
        fo5.r0 r0Var = this.f265022a;
        sb6.append(r0Var.o());
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", sb6.toString());
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        if (r0Var.o() == null || (rVar = this.f265023b) == null) {
            return;
        }
        android.app.Activity o17 = r0Var.o();
        if (o17 != null) {
            o17.finish();
        }
        ((jp5.o) i95.n0.c(jp5.o.class)).we(rVar);
    }

    @Override // j35.a
    public void b(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "launchSmallWindow onResultCancel: ");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        if (this.f265022a.f265087f != er4.l.MAIN_UI_CALL_END) {
            i95.m c17 = i95.n0.c(jp5.o.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
        }
    }

    @Override // j35.a
    public void c(com.tencent.mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "launchSmallWindow onResultRefuse: ");
        if (absRequestFloatWindowPermissionDialog != null) {
            absRequestFloatWindowPermissionDialog.finish();
        }
        if (this.f265022a.f265087f != er4.l.MAIN_UI_CALL_END) {
            i95.m c17 = i95.n0.c(jp5.o.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
        }
    }
}
