package t00;

/* loaded from: classes7.dex */
public final class k1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414341v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        boolean z17;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (i17 != 3) {
            callback.a();
            return;
        }
        data.toString();
        org.json.JSONObject optJSONObject = data.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (optJSONObject == null) {
            callback.a();
            return;
        }
        java.lang.String optString = optJSONObject.optString("op");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            callback.a();
            return;
        }
        if (context == 0 || !((z17 = context instanceof u00.a))) {
            callback.a();
            return;
        }
        u00.a aVar = z17 ? (u00.a) context : null;
        if (kotlin.jvm.internal.o.b(optString, "changeImage")) {
            int optInt = optJSONObject.optInt("currentIndex", 0);
            if (aVar != null) {
                com.tencent.mm.plugin.subapp.ui.gallery.ecs.EcsGestureGalleryUI ecsGestureGalleryUI = (com.tencent.mm.plugin.subapp.ui.gallery.ecs.EcsGestureGalleryUI) aVar;
                com.tencent.mars.xlog.Log.i("MicroMsg. EcsGestureGalleryUI", "onMbChangeImageToIndex: " + optInt);
                if (optInt < 0 || optInt >= ecsGestureGalleryUI.f172199i2.size()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GestureGalleryUI", "setSelection fail, invalid position");
                } else {
                    com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = ecsGestureGalleryUI.f172190e;
                    if (mMGestureGallery != null) {
                        mMGestureGallery.setSelection(optInt);
                    }
                }
            }
            callback.b(null);
            return;
        }
        if (kotlin.jvm.internal.o.b(optString, "updatePassBuffer")) {
            com.tencent.mm.sdk.platformtools.o4.L().putString("KEcsMBPassBufferToNative", optJSONObject.optString("passBuffer"));
            callback.b(null);
            return;
        }
        if (kotlin.jvm.internal.o.b(optString, "updateCircleToSearchData")) {
            java.lang.String optString2 = optJSONObject.optString("extInfo");
            java.lang.String optString3 = optJSONObject.optString("reportInfoFor33399");
            com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
            L.putString("KPassExtInfoToSearch", optString2);
            L.putString("KPassReportInfoToSearch", optString3);
            callback.b(null);
            return;
        }
        if (!kotlin.jvm.internal.o.b(optString, "closeImage")) {
            callback.a();
            return;
        }
        if (aVar != null) {
            com.tencent.mm.plugin.subapp.ui.gallery.ecs.EcsGestureGalleryUI ecsGestureGalleryUI2 = (com.tencent.mm.plugin.subapp.ui.gallery.ecs.EcsGestureGalleryUI) aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg. EcsGestureGalleryUI", "onMbCloseImage");
            ecsGestureGalleryUI2.C7();
            ecsGestureGalleryUI2.L7(true);
        }
        callback.b(null);
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
