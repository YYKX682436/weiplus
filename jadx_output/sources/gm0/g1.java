package gm0;

/* loaded from: classes7.dex */
public class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f273188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273191g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gm0.h1 f273192h;

    public g1(gm0.h1 h1Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f273192h = h1Var;
        this.f273188d = i17;
        this.f273189e = str;
        this.f273190f = str2;
        this.f273191g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mars.xlog.Log.e("MicroMsg.FindOutDataDisappeared", "Found private data disappeared! (%s)", java.lang.Integer.valueOf(this.f273188d));
            com.tencent.mars.xlog.Log.e("MicroMsg.FindOutDataDisappeared", "Current private storage usage: %s", this.f273189e);
            com.tencent.mars.xlog.Log.e("MicroMsg.FindOutDataDisappeared", "Previous private storage usage: %s", this.f273190f);
            gm0.h1 h1Var = this.f273192h;
            java.lang.String str = this.f273191g;
            h1Var.getClass();
            h1Var.a(new java.io.File(lp0.b.X()));
            h1Var.a(new java.io.File(lp0.b.e()));
            h1Var.a(new java.io.File(lp0.b.e(), str));
            gm0.d1.a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FindOutDataDisappeared", th6, "", new java.lang.Object[0]);
        }
    }
}
