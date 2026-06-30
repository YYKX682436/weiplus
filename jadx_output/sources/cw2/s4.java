package cw2;

/* loaded from: classes5.dex */
public final class s4 implements rm5.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f223990a;

    /* renamed from: b, reason: collision with root package name */
    public gp.d f223991b;

    public s4(r45.mb4 media) {
        kotlin.jvm.internal.o.g(media, "media");
        this.f223990a = "MicroMsg.FinderVideoThumbFetcherFactory";
        gp.d dVar = new gp.d();
        this.f223991b = dVar;
        try {
            dVar.setDataSource(media.getString(0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f223990a, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // rm5.k
    public void a(java.util.List times, yz5.p callback) {
        kotlin.jvm.internal.o.g(times, "times");
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.L("FinderNormalVideoThumbFetcher_requestFrames", true, new cw2.r4(times, this, callback));
    }

    @Override // rm5.k
    public void b(long j17) {
    }

    @Override // rm5.k
    public void destroy() {
        try {
            gp.d dVar = this.f223991b;
            if (dVar != null) {
                dVar.release();
            }
            this.f223991b = null;
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // rm5.k
    public void setSize(int i17, int i18) {
    }
}
