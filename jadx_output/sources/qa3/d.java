package qa3;

/* loaded from: classes15.dex */
public final class d extends qa3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String cmd, org.json.JSONObject jsonObject) {
        super(cmd, jsonObject);
        kotlin.jvm.internal.o.g(cmd, "cmd");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
    }

    @Override // qa3.a
    public void a(java.util.concurrent.CountDownLatch latch) {
        kotlin.jvm.internal.o.g(latch, "latch");
        com.tencent.mars.xlog.Log.i(this.f361036b, "begin " + this.f361035a);
        java.lang.String string = this.f361035a.getString(this.f361037c);
        if (this.f361038d > 0) {
            ((ku5.t0) ku5.t0.f312615d).k(new qa3.c(string, this), this.f361038d);
        } else {
            com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(string, null);
            java.lang.String str = this.f361036b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("null ");
            sb6.append(y17 != null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (y17 != null) {
                com.tencent.mm.plugin.lite.logic.g1.s().L(y17);
            }
            qa3.o.f361051a.c(this.f361035a, true, "");
        }
        latch.countDown();
    }
}
