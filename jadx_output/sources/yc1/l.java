package yc1;

/* loaded from: classes7.dex */
public final class l implements uh1.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f460793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f460794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc1.m f460795c;

    public l(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, yc1.m mVar) {
        this.f460793a = lVar;
        this.f460794b = i17;
        this.f460795c = mVar;
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiBindSocketToNetwork", "invoke, success: " + z17);
        this.f460793a.a(this.f460794b, this.f460795c.r(null, z17 ? jc1.f.f298912a : jc1.f.f298915d, null));
    }
}
