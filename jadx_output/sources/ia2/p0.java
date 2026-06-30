package ia2;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289971d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(java.lang.String str) {
        super(1);
        this.f289971d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "Failed to call flutter " + this.f289971d + ". error:" + m524exceptionOrNullimpl);
        }
        if (kotlin.Result.m528isSuccessimpl(value)) {
        }
        return jz5.f0.f302826a;
    }
}
