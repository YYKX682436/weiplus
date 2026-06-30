package com.tencent.mm.plugin.flash.action;

/* loaded from: classes.dex */
public class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f137120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout f137121e;

    public c0(com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout faceFlashActionProcessLayout, org.json.JSONObject jSONObject) {
        this.f137121e = faceFlashActionProcessLayout;
        this.f137120d = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        org.json.JSONObject jSONObject = this.f137120d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout.f137088t;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionProcessLayout", "click customBtn");
        try {
            jSONObject.put("click_other_verify_btn", "yes");
            this.f137121e.f137089d.U6(jSONObject);
            if (wz2.a.d(jSONObject)) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23269, 1, 1, 1);
            }
        } catch (java.lang.Exception e17) {
            int i18 = com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout.f137088t;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e17, "face start feedback webview exception", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
