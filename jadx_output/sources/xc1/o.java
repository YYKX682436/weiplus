package xc1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f453054e;

    public o(java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f453053d = str;
        this.f453054e = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NativeToWxa", "onNativePostData, in appbrand process, event on native post data");
        xc1.a aVar = new xc1.a();
        aVar.f82374f = this.f453053d;
        aVar.u(this.f453054e);
        aVar.m();
    }
}
