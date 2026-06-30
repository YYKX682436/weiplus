package xk2;

/* loaded from: classes10.dex */
public final class b implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk2.c f455014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455016f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f455017g;

    public b(xk2.c cVar, java.lang.String str, java.lang.String str2, v65.n nVar) {
        this.f455014d = cVar;
        this.f455015e = str;
        this.f455016f = str2;
        this.f455017g = nVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public final void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        this.f455014d.getClass();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveBgmPlayer", "prepareAsync done  " + this.f455015e + ", " + this.f455016f);
        this.f455017g.a(java.lang.Boolean.TRUE);
    }
}
