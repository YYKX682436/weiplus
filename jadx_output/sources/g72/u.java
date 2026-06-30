package g72;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.facedetect.ui.FaceDetectUI f269246d;

    public u(com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI) {
        this.f269246d = faceDetectUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "dismiss cover and start capture");
        g72.a0 a0Var = this.f269246d.f100074h;
        synchronized (a0Var) {
            a0Var.f269224a = true;
        }
        g72.a0 a0Var2 = this.f269246d.f100074h;
        synchronized (a0Var2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "toString: %s", a0Var2.toString());
            if (a0Var2.f269224a) {
                a0Var2.f269225b.f100079p.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.facedetect.ui.FaceDetectUI faceDetectUI = this.f269246d;
        if (com.tencent.mm.plugin.facedetect.model.b0.f99993c == null) {
            faceDetectUI.getClass();
            com.tencent.mm.plugin.facedetect.model.b0.f99993c = new com.tencent.mm.plugin.facedetect.model.b0();
        }
        com.tencent.mm.plugin.facedetect.model.b0 b0Var = com.tencent.mm.plugin.facedetect.model.b0.f99993c;
        faceDetectUI.f100073g = b0Var;
        b0Var.f99994a = 0;
        b0Var.f99995b = -1;
        com.tencent.mm.plugin.facedetect.model.y.INSTANCE.f100043d.f100044i.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: get all motion not init");
        b0Var.f99995b = 0;
        faceDetectUI.f100076m = true;
        com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView = faceDetectUI.f100080q;
        android.graphics.RectF rectF = new android.graphics.RectF(faceDetectUI.f100081r.getLeft(), faceDetectUI.f100081r.getTop(), faceDetectUI.f100081r.getRight(), faceDetectUI.f100081r.getBottom());
        com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView faceDetectDecorView = faceDetectView.f100120e;
        faceDetectDecorView.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = rectF.toString();
        android.graphics.RectF rectF2 = faceDetectDecorView.f100116g;
        objArr[1] = rectF2 == null ? "null" : rectF2.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectDecorView", "hy: trigger showCover cover: %s, old: %s", objArr);
        faceDetectDecorView.f100114e = true;
        android.graphics.RectF rectF3 = faceDetectDecorView.f100116g;
        if (rectF3 == null || !rectF3.equals(rectF)) {
            faceDetectDecorView.f100116g = rectF;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectDecorView", "invalidate %s", rectF.toString());
            faceDetectDecorView.invalidate();
        }
        faceDetectUI.W6();
    }
}
