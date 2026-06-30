package dl4;

/* loaded from: classes3.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o11.g f235468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ff0.s f235469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235471g;

    public s0(o11.g gVar, ff0.s sVar, java.lang.String str, java.lang.String str2) {
        this.f235468d = gVar;
        this.f235469e = sVar;
        this.f235470f = str;
        this.f235471g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f235468d.f342107e;
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        java.lang.String str2 = this.f235470f;
        if (j17) {
            byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
            ff0.s sVar = this.f235469e;
            if (sVar != null) {
                ((dl4.n) sVar).a(str2, N, N != null);
                return;
            }
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingImageLoader", "downloadImage session: " + currentTimeMillis + ", imageKey: " + this.f235471g + ", url: %s", str2);
        dl4.d1 d1Var = dl4.d1.f235383a;
        java.lang.String str3 = this.f235470f;
        dl4.d1.b(d1Var, currentTimeMillis, str3, this.f235471g, this.f235468d, new dl4.r0(currentTimeMillis, str, this.f235469e, str3));
    }
}
