package qa3;

/* loaded from: classes15.dex */
public final class h extends qa3.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f361047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String cmd, org.json.JSONObject jsonObject) {
        super(cmd, jsonObject);
        kotlin.jvm.internal.o.g(cmd, "cmd");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        this.f361047e = "url";
    }

    @Override // qa3.a
    public void a(java.util.concurrent.CountDownLatch latch) {
        kotlin.jvm.internal.o.g(latch, "latch");
        com.tencent.mars.xlog.Log.i(this.f361036b, "begin " + this.f361035a);
        java.lang.String string = this.f361035a.getString(this.f361037c);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        if (this.f361035a.has(this.f361047e)) {
            java.lang.String string2 = this.f361035a.getString(this.f361047e);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            h0Var.f310123d = string2;
        }
        qa3.g gVar = new qa3.g(string, new qa3.f(this, latch));
        if (this.f361038d <= 0) {
            gVar.invoke(h0Var.f310123d);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).k(new qa3.e(gVar, h0Var), this.f361038d);
        latch.countDown();
    }
}
