package r33;

/* loaded from: classes8.dex */
public class c implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m53.t3 f368967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m33.h1 f368968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r33.f f368969d;

    public c(r33.f fVar, java.lang.String str, m53.t3 t3Var, m33.h1 h1Var) {
        this.f368969d = fVar;
        this.f368966a = str;
        this.f368967b = t3Var;
        this.f368968c = h1Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.CgiGetLaunchGameInfo", "openLiteApp fail " + this.f368966a);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("error", "openLiteApp fail");
        this.f368968c.b(hashMap);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetLaunchGameInfo", "openLiteApp success " + this.f368966a);
        this.f368969d.a(3, this.f368967b, this.f368968c);
    }
}
