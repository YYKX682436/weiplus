package x82;

/* loaded from: classes9.dex */
public class w implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f452538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f452539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.op0 f452540c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452541d;

    public w(q80.d0 d0Var, o72.r2 r2Var, r45.op0 op0Var, android.content.Context context) {
        this.f452538a = d0Var;
        this.f452539b = r2Var;
        this.f452540c = op0Var;
        this.f452541d = context;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemLogic", "[handleLiteAppItem] fail appId = " + this.f452538a.f360649a);
        ((ku5.t0) ku5.t0.f312615d).B(new x82.m(this));
        if (this.f452540c.f382407d.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemLogic", "fallback to url:%s", this.f452540c.f382407d);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f452540c.f382407d);
        j45.l.j(this.f452541d, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemLogic", "[handleLiteAppItem] success appId = " + this.f452538a.f360649a);
        ((ku5.t0) ku5.t0.f312615d).B(new x82.l(this));
    }
}
