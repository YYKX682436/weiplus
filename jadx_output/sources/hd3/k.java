package hd3;

/* loaded from: classes.dex */
public final class k implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd3.l f280562b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280563c;

    public k(java.lang.String str, hd3.l lVar, java.lang.String str2) {
        this.f280561a = str;
        this.f280562b = lVar;
        this.f280563c = str2;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiTakeHeapSnapshot", "heap snapshot evaluate done, result=" + ((java.lang.String) obj));
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f280561a);
        if (!r6Var.m() || r6Var.C() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiTakeHeapSnapshot", "heap snapshot file not generated: " + this.f280561a);
            this.f280562b.s().invoke(this.f280562b.i(lc3.x.f317936c));
            return;
        }
        long C = r6Var.C();
        ((ku5.t0) ku5.t0.f312615d).B(new hd3.j(this.f280561a, C));
        this.f280562b.s().invoke(this.f280562b.l(kz5.c1.i(new jz5.l(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f280563c), new jz5.l("physicalPath", this.f280561a), new jz5.l("size", java.lang.Long.valueOf(C)))));
    }
}
