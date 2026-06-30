package lf4;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.g f318374d;

    public c(lf4.g gVar) {
        this.f318374d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadFpData username=");
        lf4.g gVar = this.f318374d;
        sb6.append(gVar.f318395e);
        sb6.append(" maxId=");
        sb6.append(gVar.f318397g);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPresenter", sb6.toString());
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        java.lang.String str = gVar.f318395e;
        r1Var.g(new ff4.d(str, gVar.f318397g, com.tencent.mm.sdk.platformtools.t8.D0(str, ef4.w.f252468t.e())));
    }
}
