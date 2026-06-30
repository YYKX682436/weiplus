package ow;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ow.o f349260d = new ow.o();

    public o() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
        if (m524exceptionOrNullimpl == null) {
            com.tencent.mars.xlog.Log.i("BrandEcsNotifyCacheMgr", "[BRS]flutterBSInitNotifyData success");
            ow.t.f349266b = true;
        } else {
            com.tencent.mars.xlog.Log.e("BrandEcsNotifyCacheMgr", "[BRS]flutterBSInitNotifyData failure", m524exceptionOrNullimpl);
            ow.t.f349266b = false;
        }
        ow.t.f349268d = false;
        return jz5.f0.f302826a;
    }
}
