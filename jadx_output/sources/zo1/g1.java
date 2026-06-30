package zo1;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f474617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f474618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(kotlin.jvm.internal.f0 f0Var, java.util.concurrent.CountDownLatch countDownLatch, java.lang.String str) {
        super(2);
        this.f474617d = f0Var;
        this.f474618e = countDownLatch;
        this.f474619f = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        java.util.ArrayList<com.tencent.wechat.aff.affroam.g> pkgs = (java.util.ArrayList) obj2;
        kotlin.jvm.internal.o.g(pkgs, "pkgs");
        int i17 = 0;
        for (com.tencent.wechat.aff.affroam.g gVar : pkgs) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "preNum=" + i17 + ", curPkgName=" + gVar.f215831f + " deviceId=" + gVar.f215832g.f215989e);
            if (kotlin.jvm.internal.o.b(gVar.f215832g.f215989e, this.f474619f)) {
                java.lang.String str = gVar.f215831f;
                kotlin.jvm.internal.o.f(str, "getPackageName(...)");
                if (r26.i0.y(str, "WXGBACKUPPACKAGEPREFIX_", false)) {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\d+");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    java.lang.String str2 = gVar.f215831f;
                    kotlin.jvm.internal.o.f(str2, "getPackageName(...)");
                    java.util.regex.Matcher matcher = compile.matcher(str2);
                    kotlin.jvm.internal.o.f(matcher, "matcher(...)");
                    r26.m a17 = r26.u.a(matcher, 23, str2);
                    i17 = a17 != null ? java.lang.Math.max(i17, java.lang.Integer.parseInt(((r26.q) a17).c())) : java.lang.Math.max(i17, 1);
                }
            }
        }
        this.f474617d.f310116d = i17;
        this.f474618e.countDown();
        return jz5.f0.f302826a;
    }
}
