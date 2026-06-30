package g73;

/* loaded from: classes15.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.handoff.model.HandOff f269286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.handoff.model.HandOff handOff) {
        super(0);
        this.f269286d = handOff;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.handoff.model.HandOff handOff = this.f269286d;
        kotlin.jvm.internal.o.g(handOff, "handOff");
        com.tencent.wechat.aff.ext_device.j.f216698b.b(com.tencent.wechat.aff.ext_device.a.ExtDeviceHandoff_Open, java.lang.String.valueOf(handOff.getDataType()), handOff.getId(), c01.id.c(), g73.i.f269275a);
        g73.m2 m2Var = g73.o0.f269320p;
        java.util.List c17 = kz5.b0.c(this.f269286d);
        m2Var.getClass();
        m2Var.h(10, c17);
        if (this.f269286d instanceof com.tencent.mm.plugin.handoff.model.HandOffFile) {
            int i17 = !com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a) ? -1 : !g73.o0.f269317m.f77353f ? -2 : 0;
            if (g73.o0.f269319o) {
                g73.o0.f269311d.getClass();
                android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
                intent.setPackage("com.tencent.mtt");
                try {
                    if (i17 == -2) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i17);
                        jSONObject.put("des", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492668hf1));
                        intent.putExtra("key_reader_sdk_toast", jSONObject.toString());
                    } else if (i17 == -1) {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i17);
                        jSONObject2.put("des", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492667hf0));
                        intent.putExtra("key_reader_sdk_toast", jSONObject2.toString());
                    } else if (i17 == 0) {
                        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.icon_toast_ok));
                        arrayList.add(resources);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/handoff/service/HandOffService", "notifyQbOpenResult", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/handoff/service/HandOffService", "notifyQbOpenResult", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 0);
                        jSONObject3.put("des", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cff));
                        intent.putExtra("key_reader_sdk_toast", jSONObject3.toString());
                        intent.putExtra("key_reader_sdk_toast_icon", decodeResource);
                    }
                    com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("HandOffService", "notifyQbOpenResult() Exception%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                }
            } else {
                g73.o0.f269311d.getClass();
                if (i17 == -2) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.i(context, context.getString(com.tencent.mm.R.string.f492668hf1), 0);
                } else if (i17 == -1) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.i(context2, context2.getString(com.tencent.mm.R.string.f492667hf0), 0);
                } else if (i17 == 0) {
                    android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.h(context3, context3.getString(com.tencent.mm.R.string.f492669hf2));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
