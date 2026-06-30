package el;

/* loaded from: classes9.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el.k f253718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el.g f253719e;

    public j(el.k kVar, el.g gVar) {
        this.f253718d = kVar;
        this.f253719e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        el.g gVar = this.f253719e;
        java.lang.String str = gVar.f253700d;
        java.lang.String str2 = gVar.f253709m;
        el.k kVar = this.f253718d;
        kVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "[handleDeleteFavorite]");
        ((a82.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(str, str2, new el.h(str, kVar));
    }
}
