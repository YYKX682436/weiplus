package q81;

/* loaded from: classes7.dex */
public class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q81.x f360725a;

    public w(q81.x xVar) {
        this.f360725a = xVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "retry queue drained, interrupt");
        km5.u.b().a(null);
        synchronized (this.f360725a) {
            this.f360725a.f360728d = false;
            ((java.util.concurrent.ConcurrentSkipListSet) this.f360725a.f360730f).clear();
        }
        return null;
    }
}
