package gf;

/* loaded from: classes7.dex */
public final class d implements com.tencent.skyline.IWindowReadyCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl f271031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f271032c;

    public d(int i17, com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl, com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        this.f271030a = i17;
        this.f271031b = appServiceSkylineExtensionImpl;
        this.f271032c = yVar;
    }

    @Override // com.tencent.skyline.IWindowReadyCallback
    public void onWindowReady(int i17) {
        java.lang.Object remove;
        com.tencent.mars.xlog.Log.i("AppServiceSkylineExtensionImpl", this.f271030a + " onWindowReady id:" + i17);
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f271031b;
        synchronized (appServiceSkylineExtensionImpl.f47719o) {
            appServiceSkylineExtensionImpl.f47718n.add(java.lang.Integer.valueOf(i17));
        }
        df.a1 a1Var = df.a1.f229421a;
        synchronized (a1Var) {
            java.lang.Long l17 = (java.lang.Long) df.a1.f229424d.get(java.lang.Integer.valueOf(i17));
            if (l17 == null) {
                l17 = 0L;
            }
            kotlin.jvm.internal.o.d(l17);
            df.x0 x0Var = (df.x0) df.a1.f229423c.get(java.lang.Long.valueOf(l17.longValue()));
            if (x0Var == null) {
                com.tencent.mars.xlog.Log.e("SkylineManager", "notifyFlutterReady id:" + i17 + " fail");
            } else {
                if (x0Var.f229607e == i17) {
                    df.y0 y0Var = x0Var.f229604b;
                    y0Var.getClass();
                    y0Var.f229614b = java.lang.System.currentTimeMillis();
                } else {
                    df.y0 y0Var2 = (df.y0) x0Var.f229605c.get(java.lang.Integer.valueOf(i17));
                    if (y0Var2 != null) {
                        y0Var2.f229614b = java.lang.System.currentTimeMillis();
                    }
                }
                x0Var.f229609g.add(java.lang.Integer.valueOf(i17));
                com.tencent.mars.xlog.Log.i("SkylineManager", "Thread.currentThread().priority:" + java.lang.Thread.currentThread().getPriority() + " Process.priority:" + android.os.Process.getThreadPriority(android.os.Process.myTid()));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyFlutterReady id:");
                sb6.append(i17);
                sb6.append(" size:");
                java.util.HashMap hashMap = df.a1.f229425e;
                sb6.append(hashMap.size());
                com.tencent.mars.xlog.Log.i("SkylineManager", sb6.toString());
                synchronized (a1Var) {
                    remove = hashMap.remove(java.lang.Integer.valueOf(i17));
                }
                yz5.l lVar = (yz5.l) remove;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                }
            }
        }
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl2 = this.f271031b;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f271032c;
        appServiceSkylineExtensionImpl2.d(yVar, false);
        appServiceSkylineExtensionImpl2.e(new gf.q(yVar, i17));
    }
}
