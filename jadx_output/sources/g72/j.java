package g72;

/* loaded from: classes.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI f269235d;

    public j(com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI) {
        this.f269235d = faceDetectConfirmUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.facedetect.ui.FaceDetectConfirmUI faceDetectConfirmUI = this.f269235d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "check_alive_type is %s", java.lang.Integer.valueOf(faceDetectConfirmUI.f100065w));
        if (!com.tencent.mm.plugin.facedetect.model.s0.a(faceDetectConfirmUI)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectConfirmUI", "no camera permission. request permission");
            yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i18 = faceDetectConfirmUI.f100065w;
        if (i18 == 0 || i18 == 2) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            java.lang.String string = faceDetectConfirmUI.getString(com.tencent.mm.R.string.c6h);
            sb0.f fVar = (sb0.f) jVar;
            fVar.getClass();
            boolean d17 = j35.u.d(faceDetectConfirmUI, "android.permission.RECORD_AUDIO", true);
            if (d17) {
                i17 = 1;
            } else {
                i17 = 1;
                j35.u.k(faceDetectConfirmUI, 80, new sb0.e(fVar, faceDetectConfirmUI), new java.lang.String[]{"android.permission.RECORD_AUDIO"}, "", "", string, null);
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(d17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceUtils", "summerper checkPermission checkAudio[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), faceDetectConfirmUI);
            if (!d17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectConfirmUI", "no audio permission. request permission");
                yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            i17 = 1;
        }
        android.os.Bundle extras = faceDetectConfirmUI.getIntent().getExtras();
        if (extras != null) {
            extras.putInt("check_alive_type", faceDetectConfirmUI.f100065w);
            extras.putString("appId", faceDetectConfirmUI.f100060r);
            extras.putString("feedbackUrl", faceDetectConfirmUI.f100057o);
            extras.putString("business_tips", faceDetectConfirmUI.f100066x);
            extras.putString("business_tips_color", faceDetectConfirmUI.f100067y);
            extras.putFloat("mLight_threshold", faceDetectConfirmUI.f100059q);
            extras.putLong("confirm_page_timestamp", faceDetectConfirmUI.I);
            float f17 = faceDetectConfirmUI.H;
            double d18 = f17;
            if (d18 >= 0.2d && d18 <= 0.9d) {
                com.tencent.mm.plugin.flash.view.FaceFlashReflectMask.f137256q = f17 / 2.0f;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectConfirmUI", "carson check_alive_type_response is " + faceDetectConfirmUI.f100065w);
            com.tencent.mm.plugin.flash.FaceFlashUI.X6(faceDetectConfirmUI, extras, i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectConfirmUI", "extras is null when start FaceDetectPrepareUI");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
