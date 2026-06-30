package ow;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ow.l f349257d = new ow.l();

    public l() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
        if (m524exceptionOrNullimpl == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNoticeMsgRepository", "[BRS] flutterBSUpdateContact Success.");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandEcsNoticeMsgRepository", "[BRS] flutterBSUpdateContact Failed: " + m524exceptionOrNullimpl.getMessage());
        }
        return jz5.f0.f302826a;
    }
}
