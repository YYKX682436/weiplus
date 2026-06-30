package rc3;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f393945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f393947f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(rc3.w0 w0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f393945d = w0Var;
        this.f393946e = str;
        this.f393947f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity B0;
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = this.f393945d.f394091i;
        if (mBBuildConfig != null && (B0 = mBBuildConfig.b().B0()) != null) {
            rc3.w0 w0Var = this.f393945d;
            java.lang.String msg = this.f393946e;
            bf3.g0 g0Var = bf3.g0.f19627a;
            java.lang.String instanceName = w0Var.f394087e;
            g0Var.getClass();
            kotlin.jvm.internal.o.g(instanceName, "instanceName");
            kotlin.jvm.internal.o.g(msg, "msg");
            if (!z65.c.a()) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            } else if (((java.lang.Boolean) bf3.g0.f19629c.b(g0Var, bf3.g0.f19628b[0])).booleanValue()) {
                com.tencent.mars.xlog.Log.e("MBServerUtil", "检测到 js 异常: ".concat(msg));
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new bf3.f0(B0, instanceName, msg));
            }
        }
        java.util.HashSet hashSet = this.f393945d.f394092m;
        java.lang.String str2 = this.f393947f;
        java.lang.String str3 = this.f393946e;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((jc3.u) it.next()).Q9(str2, str3);
        }
        rc3.w0 w0Var2 = this.f393945d;
        if (w0Var2.f394099t < 4) {
            com.tencent.mars.xlog.Log.e(w0Var2.f394105z, "onStartupJsException");
            je3.i.t8(je3.k.f299298e, this.f393945d.f394102w, "js-exception-startup", this.f393946e, null, 1.0f, 8, null);
            rc3.w0 w0Var3 = this.f393945d;
            w0Var3.f394101v = false;
            w0Var3.destroy();
        }
        return jz5.f0.f302826a;
    }
}
