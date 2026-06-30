package ls4;

/* loaded from: classes8.dex */
public final class c0 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.e0 f321042a;

    public c0(ls4.e0 e0Var) {
        this.f321042a = e0Var;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        com.tencent.mars.xlog.Log.e("WeCoinSubscribeLogic", "auth fail");
        this.f321042a.f321047a.f358038c.invoke(new pr4.n(pr4.p.f358041d));
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("WeCoinSubscribeLogic", "auth success");
        this.f321042a.b();
    }
}
