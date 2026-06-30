package ls4;

/* loaded from: classes8.dex */
public final class f implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321049a;

    public f(ls4.u uVar) {
        this.f321049a = uVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("WeCoinConsumeLogic", "onFailed,errorType:%s,errorCode:%s, msg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ls4.u uVar = this.f321049a;
        if (i18 != -3) {
            uVar.d(new pr4.a(pr4.j.f358014f));
            return;
        }
        ns4.c0 c0Var = uVar.f321102c;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("consumePanel");
            throw null;
        }
        if (c0Var.f339464c.f()) {
            return;
        }
        com.tencent.mars.xlog.Log.e("WeCoinConsumeLogic", "call cancel");
        ls4.u.a(uVar);
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        ls4.u.b(this.f321049a);
    }
}
