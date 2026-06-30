package fg;

/* loaded from: classes7.dex */
public final class f0 implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.i0 f261762d;

    public f0(fg.i0 i0Var) {
        this.f261762d = i0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public final void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebviewExtendSecureKeyboard", "onDestroy");
        c01.n2.d().e(this.f261762d.f261777h);
    }
}
