package jm4;

/* loaded from: classes.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(java.lang.String str) {
        super(0);
        this.f300396d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String errMsg = this.f300396d;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (errMsg.length() == 0) {
            errMsg = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493382jz0);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NativeShowErrorToast", "processPlayError, errorMsg:" + errMsg);
        il4.l lVar = il4.l.f292142a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (errMsg == null || errMsg.length() == 0) {
            errMsg = context.getString(com.tencent.mm.R.string.h4e);
            kotlin.jvm.internal.o.f(errMsg, "getString(...)");
        }
        db5.t7.m(context, errMsg);
        return jz5.f0.f302826a;
    }
}
