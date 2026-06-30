package r25;

/* loaded from: classes7.dex */
public final class g implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f368861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bc0.h f368862b;

    public g(l81.b1 b1Var, bc0.h hVar) {
        this.f368861a = b1Var;
        this.f368862b = hVar;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkWxaHandler", "handleWxa, startWxa failed, appId: " + this.f368861a.f317014b);
        bc0.h hVar = this.f368862b;
        if (hVar != null) {
            ((o25.z$$a) hVar).a(false, null);
        }
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkWxaHandler", "handleWxa, startWxa success, appId: " + this.f368861a.f317014b);
        bc0.h hVar = this.f368862b;
        if (hVar != null) {
            ((o25.z$$a) hVar).a(true, null);
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
