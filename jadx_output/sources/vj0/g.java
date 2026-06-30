package vj0;

/* loaded from: classes11.dex */
public final class g implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f437647a;

    public g(android.os.Bundle bundle) {
        this.f437647a = bundle;
    }

    @Override // q80.f0
    public void fail() {
        vj0.i iVar = vj0.i.f437649a;
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, null, v45.c.class, vj0.b.f437638d);
        android.os.Bundle bundle = this.f437647a;
        com.tencent.mars.xlog.Log.e("MicroMsg.CommonLiteAppGuidanceManager", "startLiteApp fail: appid=%s  page=%s", bundle.getString("appId", ""), bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, ""));
    }

    @Override // q80.f0
    public void success() {
        java.lang.String str;
        vj0.i iVar = vj0.i.f437649a;
        android.os.Bundle bundle = this.f437647a;
        kotlin.jvm.internal.o.g(bundle, "bundle");
        w15.a aVar = vj0.i.f437650b;
        if (aVar == null || (str = aVar.toXml()) == null) {
            str = "";
        }
        bundle.putString("BUNDLE_KEY_LAST_INFO", str);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, bundle, v45.c.class, vj0.h.f437648d);
        vj0.i.f437651c.alive();
        vj0.i.f437652d.alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.CommonLiteAppGuidanceManager", "startLiteApp success: appid=%s  page=%s", bundle.getString("appId", ""), bundle.getString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, ""));
    }
}
