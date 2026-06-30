package r25;

/* loaded from: classes7.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f368853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bc0.h f368854b;

    public a(q80.d0 d0Var, bc0.h hVar) {
        this.f368853a = d0Var;
        this.f368854b = hVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkLiteAppHandler", "handleLiteApp, startLiteApp failed, appId: " + this.f368853a.f360649a);
        bc0.h hVar = this.f368854b;
        if (hVar != null) {
            ((o25.z$$a) hVar).a(false, null);
        }
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkLiteAppHandler", "handleLiteApp, startLiteApp success, appId: " + this.f368853a.f360649a);
        bc0.h hVar = this.f368854b;
        if (hVar != null) {
            ((o25.z$$a) hVar).a(true, null);
        }
    }
}
