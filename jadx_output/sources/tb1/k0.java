package tb1;

/* loaded from: classes7.dex */
public class k0 extends gb1.d {
    private static final int CTRL_INDEX = 329;
    public static final java.lang.String NAME = "insertCamera";

    /* renamed from: h, reason: collision with root package name */
    public static tb1.j0 f416906h;

    /* renamed from: g, reason: collision with root package name */
    public boolean f416907g;

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.optInt("cameraId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        char c17;
        this.f416907g = false;
        android.content.Context context = tVar.getContext();
        ((tb1.f) f416906h).getClass();
        com.tencent.mm.plugin.appbrand.app.w7.a();
        com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView appBrandCameraView = new com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView(context);
        int optInt = jSONObject.optInt("cameraId");
        java.lang.String optString = jSONObject.optString("mode", "normal");
        java.lang.String optString2 = jSONObject.optString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, "back");
        java.lang.String optString3 = jSONObject.optString("flash", "auto");
        java.lang.String optString4 = jSONObject.optString("size");
        optString4.getClass();
        int hashCode = optString4.hashCode();
        if (hashCode == -1078030475) {
            if (optString4.equals(ya.b.MEDIUM)) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != 102742843) {
            if (hashCode == 109548807 && optString4.equals("small")) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (optString4.equals("large")) {
                c17 = 1;
            }
            c17 = 65535;
        }
        int i17 = c17 != 0 ? c17 != 1 ? 288 : com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH : 480;
        boolean optBoolean = jSONObject.optBoolean("needOutput", false);
        java.lang.String optString5 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_RESOLUTION, ya.b.MEDIUM);
        appBrandCameraView.setAppId(tVar.getAppId());
        appBrandCameraView.setPage(tVar);
        appBrandCameraView.setCameraId(optInt);
        appBrandCameraView.setMode(optString);
        appBrandCameraView.k(optString2, true);
        appBrandCameraView.setFlash(optString3);
        appBrandCameraView.setFrameLimitSize(i17);
        appBrandCameraView.setNeedOutput(optBoolean);
        appBrandCameraView.setResolution(optString5);
        appBrandCameraView.setPageOrientation(tVar.S());
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("position");
        int j17 = ik1.w.j(optJSONObject, "width", 0);
        int j18 = ik1.w.j(optJSONObject, "height", 0);
        if (j17 != 0 && j18 != 0) {
            appBrandCameraView.p(j17, j18, true);
        }
        tb1.y yVar = (tb1.y) tVar.q(tb1.y.class);
        if (yVar != null) {
            int[] a17 = ((uf1.h) yVar).a(tVar);
            if (a17.length == 2 && a17[0] > 0 && a17[1] > 0) {
                appBrandCameraView.setDisplayScreenSize(new android.util.Size(a17[0], a17[1]));
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertCamera", "onInsertView screen width: %d, screen height: %d", java.lang.Integer.valueOf(a17[0]), java.lang.Integer.valueOf(a17[1]));
            }
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("scanArea");
        if (optJSONArray == null || optJSONArray.length() != 4) {
            appBrandCameraView.n(0, 0, j17, j18);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertCamera", "scanAreaArray:%s, scanAreaArray.length:%d", optJSONArray, java.lang.Integer.valueOf(optJSONArray.length()));
            appBrandCameraView.n(ik1.w.c(optJSONArray.optInt(0)), ik1.w.c(optJSONArray.optInt(1)), ik1.w.c(optJSONArray.optInt(2)), ik1.w.c(optJSONArray.optInt(3)));
        }
        appBrandCameraView.setScanFreq(jSONObject.optInt("scanFreq"));
        appBrandCameraView.setPreviewCenterCrop(jSONObject.optBoolean("centerCrop"));
        appBrandCameraView.getView().setContentDescription(context.getString("normal".equals(optString) ? com.tencent.mm.R.string.f490015ij : com.tencent.mm.R.string.f490016ik));
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(context, appBrandCameraView);
    }

    @Override // gb1.d
    public boolean M() {
        return true;
    }

    @Override // gb1.d
    public void O(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject, gb1.n nVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertCamera", "onInsertView cameraId=%d", java.lang.Integer.valueOf(i17));
        tb1.a0 a0Var = (tb1.a0) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(android.view.View.class);
        if (a0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiInsertCamera", "onInsertView(viewId : %d) failed, cameraView is null", java.lang.Integer.valueOf(i17));
            nVar.a(o("fail:internal error"));
            return;
        }
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(a0Var);
        java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(tVar);
        P(tVar, a0Var, nVar);
        tb1.c cVar = tb1.b.f416889a;
        cVar.f416893d.put(a0Var.getCameraId(), new java.lang.ref.WeakReference(a0Var));
        tVar.U(a0Var);
        tVar.R(a0Var);
        tVar.w(a0Var);
        com.tencent.mm.plugin.appbrand.x0.a(tVar.getAppId(), new tb1.g0(this, weakReference, weakReference2));
        a0Var.setOutPutCallBack(new tb1.h0(this));
    }

    public final boolean P(com.tencent.mm.plugin.appbrand.jsapi.l lVar, tb1.a0 a0Var, gb1.n nVar) {
        si1.e1.a(java.lang.String.valueOf(lVar.getAppId()), new tb1.i0(this, new java.lang.ref.WeakReference(a0Var), new java.lang.ref.WeakReference(lVar), nVar));
        android.app.Activity activity = (android.app.Activity) lVar.getContext();
        if (activity == null) {
            return false;
        }
        boolean b17 = nf.t.b(activity, lVar, "android.permission.WRITE_EXTERNAL_STORAGE");
        tb1.c cVar = tb1.b.f416889a;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraMrg", "has external storage permission: %b", java.lang.Boolean.valueOf(b17));
        boolean a17 = nf.t.a(activity, lVar, "android.permission.CAMERA", 16, "", "");
        cVar.f416890a = a17;
        if (!a17) {
            return false;
        }
        si1.e1.c(lVar.getAppId());
        if (!this.f416907g) {
            nVar.a(o("ok"));
            ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var).h();
            this.f416907g = true;
        }
        return true;
    }
}
