package is;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ is.p f294343d;

    public j(is.p pVar) {
        this.f294343d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountService", "onAccountPostReset is to make ContactBlackListHelper Cache");
        ((yb0.e) ((zb0.z) i95.n0.c(zb0.z.class))).getClass();
        k35.c.a();
        k35.c.b();
        is.p pVar = this.f294343d;
        pVar.getClass();
        am5.c cVar = am5.c.f8820b;
        cVar.a(am5.b.HEAVY_USER_CONTACT, new is.l(pVar));
        cVar.a(am5.b.HEAVY_USER_SESSION, new is.m(pVar));
        cVar.a(am5.b.HEAVY_USER_STORAGE, new is.n(pVar));
        cVar.a(am5.b.HEAVY_USER_GAME, new is.o(pVar));
    }
}
