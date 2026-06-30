package yc1;

/* loaded from: classes15.dex */
public class z extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 529;
    public static final java.lang.String NAME = "operateLocalServicesScan";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f460823g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public android.net.wifi.WifiManager.MulticastLock f460824h = null;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("action");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateLocalServicesScan", "action = " + optString);
        boolean z17 = true;
        if (!android.text.TextUtils.equals("start", optString)) {
            if (!android.text.TextUtils.equals("stop", optString)) {
                lVar.a(i17, o("fail:invalid param"));
                return;
            }
            synchronized (this.f460823g) {
                for (yc1.y yVar : ((java.util.concurrent.ConcurrentHashMap) this.f460823g).values()) {
                    yVar.f460821c.set(i17);
                    uh1.o1.INSTANCE.a(yVar);
                    z17 = false;
                }
                if (z17) {
                    lVar.a(i17, o("fail:task not found"));
                }
                android.net.wifi.WifiManager.MulticastLock multicastLock = this.f460824h;
                if (multicastLock != null) {
                    try {
                        if (multicastLock.isHeld()) {
                            multicastLock.release();
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateLocalServicesScan", e17.getMessage());
                    }
                }
                ((java.util.concurrent.ConcurrentHashMap) this.f460823g).clear();
            }
            return;
        }
        java.lang.String optString2 = jSONObject.optString("serviceType");
        if (android.text.TextUtils.isEmpty(optString2)) {
            lVar.a(i17, o("fail:invalid param"));
            return;
        }
        synchronized (this.f460823g) {
            java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f460823g).keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((java.lang.String) it.next()).contains(lVar.getAppId())) {
                        lVar.a(i17, o("fail:scan task already exist"));
                        break;
                    }
                } else {
                    android.net.wifi.WifiManager.MulticastLock createMulticastLock = ((android.net.wifi.WifiManager) lVar.getContext().getApplicationContext().getSystemService("wifi")).createMulticastLock("MicroMsg.JsApiOperateLocalServicesScan");
                    this.f460824h = createMulticastLock;
                    if (createMulticastLock != null) {
                        createMulticastLock.acquire();
                    }
                    yc1.y yVar2 = new yc1.y(this, lVar);
                    yVar2.f460820b.set(i17);
                    ((java.util.concurrent.ConcurrentHashMap) this.f460823g).put(C(lVar, optString2), yVar2);
                    uh1.o1 o1Var = uh1.o1.INSTANCE;
                    o1Var.getClass();
                    android.net.nsd.NsdManager nsdManager = (android.net.nsd.NsdManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("servicediscovery");
                    uh1.i1 i1Var = new uh1.i1(o1Var, yVar2);
                    ((java.util.concurrent.ConcurrentHashMap) o1Var.f427849d).put(yVar2, i1Var);
                    nsdManager.discoverServices(optString2, 1, i1Var);
                    com.tencent.mm.sdk.platformtools.u3.i(new yc1.w(this, lVar, optString2, yVar2), 30000L);
                }
            }
        }
    }

    public final java.lang.String C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str) {
        return lVar.getAppId() + "#" + str;
    }
}
