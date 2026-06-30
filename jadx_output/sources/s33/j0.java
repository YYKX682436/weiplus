package s33;

@j95.b
/* loaded from: classes8.dex */
public class j0 extends i95.w implements t33.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402512d;

    /* renamed from: e, reason: collision with root package name */
    public d95.b0 f402513e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f402514f;

    /* renamed from: g, reason: collision with root package name */
    public y33.f f402515g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f402516h = false;

    public d95.b0 Ai() {
        if (!this.f402516h) {
            synchronized (this) {
                if (!this.f402516h) {
                    this.f402514f = gm0.j1.u().h() + "GameChatRoom.db";
                    d95.b0 b0Var = new d95.b0();
                    this.f402513e = b0Var;
                    java.lang.String str = this.f402514f;
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(-1129824805, new s33.e0(this));
                    hashMap.put(-1899647075, new s33.f0(this));
                    if (b0Var.S(str, hashMap, true, true)) {
                        this.f402516h = true;
                    } else {
                        com.tencent.mars.xlog.Log.i("GameChatRoom.PluginGameChatRoom", "GameChatRoom db init failed");
                    }
                }
            }
        }
        return this.f402513e;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("GameChatRoom.PluginGameChatRoom", "onAccountRelease");
        d95.b0 b0Var = this.f402513e;
        if (b0Var != null) {
            b0Var.L();
            this.f402513e = null;
        }
        this.f402515g = null;
    }

    public y33.f wi() {
        gm0.j1.b().c();
        if (this.f402515g == null) {
            this.f402515g = new y33.f(Ai());
        }
        return this.f402515g;
    }
}
