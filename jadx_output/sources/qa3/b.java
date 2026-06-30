package qa3;

/* loaded from: classes15.dex */
public final class b extends qa3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String cmd, org.json.JSONObject jsonObject) {
        super(cmd, jsonObject);
        kotlin.jvm.internal.o.g(cmd, "cmd");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
    }

    @Override // qa3.a
    public void a(java.util.concurrent.CountDownLatch latch) {
        kotlin.jvm.internal.o.g(latch, "latch");
        com.tencent.mars.xlog.Log.i(this.f361036b, "begin " + this.f361035a);
        latch.countDown();
    }
}
