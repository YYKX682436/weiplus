package oh4;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oh4.n f345483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph4.b f345484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.rs4 f345485g;

    public m(java.lang.String str, oh4.n nVar, ph4.b bVar, r45.rs4 rs4Var) {
        this.f345482d = str;
        this.f345483e = nVar;
        this.f345484f = bVar;
        this.f345485g = rs4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f345482d;
        android.graphics.Bitmap L = com.tencent.mm.sdk.platformtools.x.L(str, 512, 512);
        oh4.n nVar = this.f345483e;
        ph4.b bVar = this.f345484f;
        if (L == null) {
            bVar.f354462e.post(new oh4.l(nVar, bVar, this.f345485g));
            return;
        }
        com.tencent.mars.xlog.Log.i(nVar.f345486b, "use cover path: " + str);
        bVar.f354462e.post(new oh4.k(bVar, L));
    }
}
