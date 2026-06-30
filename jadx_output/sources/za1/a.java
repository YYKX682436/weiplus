package za1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final za1.a f470877d = new za1.a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_APPBRAND_JSAPI_BIG_DATA_TRANSFER_MMKV_CHECK_CLEAN_TIMESTAMP_LONG;
            if (c17.t(u3Var, 0L) + za1.b.f470879b <= java.lang.System.currentTimeMillis()) {
                try {
                    com.tencent.mm.sdk.platformtools.o4 o4Var = za1.b.f470880c;
                    boolean z17 = o4Var.Y() >= 20971520;
                    com.tencent.mars.xlog.Log.i("JsApiIpcBigDataTransfer", "do check  mmkv file too large, needClear[%b]", java.lang.Boolean.valueOf(z17));
                    if (z17) {
                        o4Var.d();
                    }
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } catch (java.lang.Throwable th6) {
                    try {
                        com.tencent.mars.xlog.Log.e("JsApiIpcBigDataTransfer", "do check  mmkv file too large, exception = %s", th6);
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APPBRAND_JSAPI_BIG_DATA_TRANSFER_MMKV_CHECK_CLEAN_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    } catch (java.lang.Throwable th7) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_APPBRAND_JSAPI_BIG_DATA_TRANSFER_MMKV_CHECK_CLEAN_TIMESTAMP_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        throw th7;
                    }
                }
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
