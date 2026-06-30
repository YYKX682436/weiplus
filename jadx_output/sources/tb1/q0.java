package tb1;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f416926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f416927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f416928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tb1.p0 f416929g;

    public q0(tb1.p0 p0Var, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f416929g = p0Var;
        this.f416926d = jSONObject;
        this.f416927e = lVar;
        this.f416928f = i17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public void run() {
        char c17;
        tb1.x xVar;
        tb1.p0 p0Var;
        java.lang.ref.WeakReference weakReference;
        final org.json.JSONObject jSONObject = this.f416926d;
        int optInt = jSONObject.optInt("cameraId");
        java.lang.String optString = jSONObject.optString("type");
        boolean z17 = true;
        boolean optBoolean = jSONObject.optBoolean("selfieMirror", true);
        boolean optBoolean2 = jSONObject.optBoolean("muted", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateCamera", "cameraId=%d type=%s muted=%b", java.lang.Integer.valueOf(optInt), optString, java.lang.Boolean.valueOf(optBoolean2));
        tb1.c cVar = tb1.b.f416889a;
        android.util.SparseArray sparseArray = cVar.f416893d;
        final tb1.a0 a0Var = (sparseArray.indexOfKey(optInt) < 0 || (weakReference = (java.lang.ref.WeakReference) sparseArray.get(optInt)) == null) ? null : (tb1.a0) weakReference.get();
        final int i17 = this.f416928f;
        final com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f416927e;
        final tb1.p0 p0Var2 = this.f416929g;
        if (a0Var == null) {
            lVar.a(i17, p0Var2.o("fail:no such camera"));
            return;
        }
        a0Var.setOperateCallBack(new tb1.r0(this));
        optString.getClass();
        switch (optString.hashCode()) {
            case -2144140699:
                if (optString.equals("closeFrameChange")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -1909077165:
                if (optString.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.d3.NAME)) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case -1391995149:
                if (optString.equals(com.tencent.mm.plugin.appbrand.jsapi.audio.l3.NAME)) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case -374265034:
                if (optString.equals("listenFrameChange")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 1484838379:
                if (optString.equals("takePhoto")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 1985172309:
                if (optString.equals("setZoom")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        if (c17 == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = (com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var;
            if (appBrandCameraView.C != null && (xVar = appBrandCameraView.P) != null) {
                com.tencent.mm.plugin.mmsight.api.MMSightRecordView mMSightRecordView = appBrandCameraView.F;
                xVar.f416950c = false;
                if (mMSightRecordView != null) {
                    mMSightRecordView.c(null, null);
                }
                int i18 = xVar.f416951d;
                if (i18 != Integer.MIN_VALUE) {
                    ((com.tencent.mm.plugin.appbrand.jsruntime.n) xVar.f416949b).a0(i18);
                    xVar.f416951d = Integer.MIN_VALUE;
                }
                appBrandCameraView.P = null;
            }
            lVar.a(i17, p0Var2.o("ok"));
            return;
        }
        if (c17 == 1) {
            if (optBoolean2) {
                p0Var = p0Var2;
            } else {
                p0Var2.getClass();
                si1.e1.a(java.lang.String.valueOf(lVar.getAppId()), new z2.f() { // from class: tb1.p0$$a
                    @Override // z2.f
                    public final void onRequestPermissionsResult(int i19, java.lang.String[] strArr, int[] iArr) {
                        tb1.p0 p0Var3 = tb1.p0.this;
                        p0Var3.getClass();
                        if (i19 == 18) {
                            com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = lVar;
                            org.json.JSONObject jSONObject2 = jSONObject;
                            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                                java.util.HashMap hashMap = new java.util.HashMap();
                                hashMap.put("cameraId", java.lang.Integer.valueOf(jSONObject2.optInt("cameraId")));
                                tb1.d0 d0Var = new tb1.d0();
                                d0Var.f82374f = new org.json.JSONObject(hashMap).toString();
                                com.tencent.mm.plugin.appbrand.jsapi.t E = p0Var3.E(lVar2, null);
                                if (E != null) {
                                    E.i(d0Var, null);
                                }
                                tb1.b.f416889a.f416891b = false;
                                p0Var3.f416919g = null;
                            } else {
                                tb1.b.f416889a.f416891b = true;
                                p0Var3.A(lVar2, jSONObject2, i17);
                            }
                            tb1.b.f416889a.f416892c = false;
                            si1.e1.c(lVar2.getAppId());
                        }
                    }
                });
                p0Var = p0Var2;
                boolean a17 = nf.t.a((android.app.Activity) lVar.getContext(), lVar, "android.permission.RECORD_AUDIO", 18, "", "");
                cVar.f416891b = a17;
                if (a17) {
                    si1.e1.c(lVar.getAppId());
                } else {
                    cVar.f416892c = true;
                    z17 = false;
                }
                if (!z17) {
                    return;
                }
            }
            tb1.m mVar = ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var).f80172h;
            if (mVar != null) {
                mVar.c(optBoolean, optBoolean2);
            }
            if (p0Var.f416919g != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateCamera", "found stop record runnable");
                p0Var.f416919g.run();
                p0Var.f416919g = null;
                return;
            }
            return;
        }
        if (c17 == 2) {
            p0Var2.f416919g = new java.lang.Runnable() { // from class: tb1.q0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    boolean optBoolean3 = jSONObject.optBoolean("compressed");
                    tb1.a0 a0Var2 = a0Var;
                    a0Var2.setCompressRecord(optBoolean3);
                    tb1.m mVar2 = ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var2).f80172h;
                    if (mVar2 != null) {
                        mVar2.b();
                    }
                }
            };
            if (cVar.f416892c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateCamera", "stop record, bug is requesting microphone permission");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOperateCamera", "stop record immediately");
            p0Var2.f416919g.run();
            p0Var2.f416919g = null;
            return;
        }
        if (c17 != 3) {
            if (c17 == 4) {
                a0Var.setQuality(jSONObject.optString("quality", "high"));
                boolean optBoolean3 = jSONObject.optBoolean("captureMetadata", false);
                tb1.m mVar2 = ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var).f80172h;
                if (mVar2 != null) {
                    mVar2.d(optBoolean, optBoolean3);
                    return;
                }
                return;
            }
            if (c17 != 5) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOperateCamera", "operateType not supported: %s", optString);
                lVar.a(i17, p0Var2.o("fail:operateType not supported"));
                return;
            }
            float q17 = ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var).q((float) jSONObject.optDouble(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM));
            if (q17 < 1.0f) {
                lVar.a(i17, p0Var2.o("fail: zoom multiple not support"));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, java.lang.Float.valueOf(q17));
            lVar.a(i17, p0Var2.p("ok", hashMap));
            return;
        }
        jSONObject.optString("size");
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView2 = (com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "listenFrameChange");
        if (appBrandCameraView2.C == null) {
            return;
        }
        if (appBrandCameraView2.F == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandCameraView", "listenFrameChange recordView null");
            ((tb1.r0) appBrandCameraView2.C).a("camera illegal state", -1, -1, -1);
            return;
        }
        if (appBrandCameraView2.P == null) {
            appBrandCameraView2.P = new tb1.x(lVar);
        }
        tb1.j jVar = new tb1.j(appBrandCameraView2);
        if (appBrandCameraView2.Q) {
            jVar.run();
            return;
        }
        if (appBrandCameraView2.W == null) {
            appBrandCameraView2.W = new java.util.ArrayList();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "listen frame change before camera init done");
        ((java.util.ArrayList) appBrandCameraView2.W).add(jVar);
    }
}
