package v10;

/* loaded from: classes9.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.q7 f432316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f432317b;

    public a(bw5.q7 q7Var, android.content.Context context) {
        this.f432316a = q7Var;
        this.f432317b = context;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("ECS_O.Router.LiteApp", "start liteApp fail");
        bw5.q7 q7Var = this.f432316a;
        java.lang.String str = q7Var.f31987o[4] ? q7Var.f31982g : "";
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.e("ECS_O.Router.LiteApp", "start liteApp fail go default_url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", q7Var.f31987o[4] ? q7Var.f31982g : "");
        j45.l.j(this.f432317b, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("ECS_O.Router.LiteApp", "start liteApp success");
    }
}
