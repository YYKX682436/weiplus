package com.tencent.mm.plugin.flash.action;

/* loaded from: classes.dex */
public class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f137128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f137129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f137130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout f137131g;

    public e0(com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout faceFlashActionProcessLayout, boolean z17, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f137131g = faceFlashActionProcessLayout;
        this.f137128d = z17;
        this.f137129e = jSONObject;
        this.f137130f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout.f137088t;
        boolean z17 = this.f137128d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashActionProcessLayout", "click retry btn, canRetry：%s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.flash.action.FaceFlashActionProcessLayout faceFlashActionProcessLayout = this.f137131g;
        if (z17) {
            faceFlashActionProcessLayout.f137089d.Y6();
        } else {
            com.tencent.mm.plugin.flash.action.FaceFlashActionUI faceFlashActionUI = faceFlashActionProcessLayout.f137089d;
            org.json.JSONObject jSONObject = this.f137129e;
            faceFlashActionUI.U6(jSONObject);
            if (wz2.a.d(jSONObject)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f137130f)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23269, 1, 3, 0);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23269, 1, 3, 1);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/action/FaceFlashActionProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
