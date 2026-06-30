package i53;

/* loaded from: classes15.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f288729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f288733h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288734i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i53.u0 f288735m;

    public t0(i53.u0 u0Var, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        this.f288735m = u0Var;
        this.f288729d = z17;
        this.f288730e = str;
        this.f288731f = str2;
        this.f288732g = str3;
        this.f288733h = i17;
        this.f288734i = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        m33.o1 o1Var;
        boolean z17 = this.f288729d;
        i53.u0 u0Var = this.f288735m;
        if (z17) {
            i53.v0 v0Var = u0Var.f288742a;
            v0Var.f288754f.add(this.f288730e);
            v0Var.f288755g.add(this.f288731f);
            v0Var.f288756h.add(this.f288732g);
        } else {
            m33.o1 o1Var2 = u0Var.f288742a.f288753e;
            if (o1Var2 != null) {
                ((u93.m) o1Var2).a(false, this.f288733h, null, null, null, null);
                i53.v0.b(u0Var.f288742a);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "upload list size : %d, hasPushAllUpload: %b", java.lang.Integer.valueOf(((java.util.HashSet) u0Var.f288742a.f288750b).size()), java.lang.Boolean.valueOf(u0Var.f288742a.f288752d));
        if (((java.util.HashSet) u0Var.f288742a.f288750b).isEmpty()) {
            i53.v0 v0Var2 = u0Var.f288742a;
            if (!v0Var2.f288752d || (o1Var = v0Var2.f288753e) == null) {
                return;
            }
            ((u93.m) o1Var).a(true, this.f288733h, v0Var2.f288754f, v0Var2.f288755g, v0Var2.f288756h, this.f288734i);
            i53.v0.b(u0Var.f288742a);
        }
    }
}
