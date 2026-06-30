package of1;

/* loaded from: classes8.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f344923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f344924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f344925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f344926h;

    public g2(of1.m2 m2Var, java.lang.String str, long j17, int i17, float f17) {
        this.f344926h = m2Var;
        this.f344922d = str;
        this.f344923e = j17;
        this.f344924f = i17;
        this.f344925g = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        of1.m2 m2Var = this.f344926h;
        if (m2Var.f344975e == null || (wVar = m2Var.f344976f) == null || !wVar.c().f(42)) {
            return;
        }
        m2Var.f344975e.C(this.f344922d, this.f344923e, this.f344924f, this.f344925g);
    }
}
