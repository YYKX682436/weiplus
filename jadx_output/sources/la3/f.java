package la3;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f317526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f317529g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f317530h;

    public f(la3.h hVar, zg0.v2 v2Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f317526d = v2Var;
        this.f317527e = str;
        this.f317528f = str2;
        this.f317529g = bundle;
        this.f317530h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            zg0.v2 v2Var = this.f317526d;
            if (v2Var != null) {
                ((nw4.n) v2Var).O(this.f317527e, this.f317528f, nw4.a.a(this.f317529g), this.f317530h);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("LiteAppWebViewStubCallback", "In jsapi onHandleEnd method, it happens something unwanted!");
        }
    }
}
