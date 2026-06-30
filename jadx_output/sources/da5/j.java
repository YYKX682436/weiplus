package da5;

/* loaded from: classes11.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da5.k f227807d;

    public j(da5.k kVar) {
        this.f227807d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f227807d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.UDRAffCheckerListener", "call doCleanUDR");
        com.tencent.wechat.aff.udr.a.f217529b.n();
    }
}
