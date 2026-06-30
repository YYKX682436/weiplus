package qa3;

/* loaded from: classes15.dex */
public final class s extends qa3.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f361065e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f361066f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f361067g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f361068h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String cmd, org.json.JSONObject jsonObject) {
        super(cmd, jsonObject);
        kotlin.jvm.internal.o.g(cmd, "cmd");
        kotlin.jvm.internal.o.g(jsonObject, "jsonObject");
        this.f361065e = "checkUpdate";
        this.f361066f = "syncCheckUpdate";
        this.f361067g = com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE;
        this.f361068h = "query";
    }

    @Override // qa3.a
    public void a(java.util.concurrent.CountDownLatch latch) {
        kotlin.jvm.internal.o.g(latch, "latch");
        com.tencent.mars.xlog.Log.i(this.f361036b, "begin " + this.f361035a);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.os.Bundle bundle = new android.os.Bundle();
        h0Var.f310123d = bundle;
        bundle.putString("appId", this.f361035a.getString(this.f361037c));
        if (this.f361035a.has(this.f361067g)) {
            ((android.os.Bundle) h0Var.f310123d).putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f361035a.getString(this.f361067g));
        }
        if (this.f361035a.has(this.f361068h)) {
            ((android.os.Bundle) h0Var.f310123d).putString("query", this.f361035a.getString(this.f361068h));
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = this.f361035a.getBoolean(this.f361065e);
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        c0Var2.f310112d = this.f361035a.getBoolean(this.f361066f);
        if (this.f361038d <= 0) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, (android.os.Bundle) h0Var.f310123d, c0Var.f310112d, c0Var2.f310112d, new qa3.r(this, latch));
        } else {
            ((ku5.t0) ku5.t0.f312615d).k(new qa3.q(h0Var, c0Var, c0Var2, this), this.f361038d);
            latch.countDown();
        }
    }
}
