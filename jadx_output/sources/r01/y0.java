package r01;

/* loaded from: classes7.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r01.m0 f368278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368279e;

    public y0(r01.m0 m0Var, java.lang.String str) {
        this.f368278d = m0Var;
        this.f368279e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r01.m0 m0Var = this.f368278d;
        m0Var.getClass();
        java.lang.String str = this.f368279e;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        m0Var.f368153a = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterPluginAppHelper", "onBizLogin: biz=".concat(str));
    }
}
