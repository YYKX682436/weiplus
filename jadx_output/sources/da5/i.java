package da5;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da5.k f227806d;

    public i(da5.k kVar) {
        this.f227806d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f227806d.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.UDRAffCheckerListener", "call doUpdateUDR");
            com.tencent.wechat.aff.udr.a.f217529b.m();
        } catch (java.io.EOFException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UDRAffCheckerListener", e17, "", new java.lang.Object[0]);
        }
    }
}
