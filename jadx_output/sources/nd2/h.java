package nd2;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final nd2.h f336440d = new nd2.h();

    public h() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(((kotlin.Result) obj).getValue());
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "sendEvent error: " + m524exceptionOrNullimpl.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
