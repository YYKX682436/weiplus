package ow;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f349277e;

    public z(java.lang.String str, com.tencent.mm.modelbase.p0 p0Var) {
        this.f349276d = str;
        this.f349277e = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yw.a3 a3Var = yw.a3.f466266a;
        java.lang.String g17 = x51.j1.g(this.f349277e.f70726a.f377561h);
        kotlin.jvm.internal.o.f(g17, "skstringToString(...)");
        java.lang.String type = this.f349276d;
        kotlin.jvm.internal.o.g(type, "type");
        if (!yw.a3.f466270e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBrandServiceBridge", "onReceiveXmlPush hasInit=" + yw.a3.f466270e);
        } else if (zv.q.f476079a.g()) {
            com.tencent.wechat.aff.brand_service.v.f216049c.p(type, g17, yw.x2.f466508a);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBrandServiceBridge", "onReceiveXmlPush but not use aff. discard this msg");
        }
    }
}
