package zl3;

/* loaded from: classes11.dex */
public final class j implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zl3.n f474066d;

    public j(zl3.n nVar) {
        this.f474066d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (kotlin.Result.m527isFailureimpl(value)) {
            this.f474066d.getClass();
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterMusicPlayerPlugin", kotlin.Result.m524exceptionOrNullimpl(value), "error happened", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
