package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class w2 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageView f210865a;

    public w2(com.tencent.mm.ui.tools.CropImageView cropImageView) {
        this.f210865a = cropImageView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.ui.tools.a3 a3Var;
        int i17 = message.what;
        com.tencent.mm.ui.tools.CropImageView cropImageView = this.f210865a;
        if (i17 == 4659) {
            cropImageView.a();
            return;
        }
        if (i17 == 4658) {
            cropImageView.b();
            return;
        }
        if (i17 != 4660 && i17 == 4661) {
            android.view.MotionEvent motionEvent = (android.view.MotionEvent) message.obj;
            cropImageView.f210029y = java.lang.System.currentTimeMillis();
            cropImageView.f210022r = false;
            if (motionEvent.getRawX() - cropImageView.f210016i <= 10.0f && motionEvent.getRawY() - cropImageView.f210017m <= 10.0f && motionEvent.getRawX() - cropImageView.f210016i >= -10.0f && motionEvent.getRawY() - cropImageView.f210017m >= -10.0f) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = cropImageView.f210029y;
                if (j17 != 0) {
                    long j18 = currentTimeMillis - j17;
                    if (j18 < 300 && j18 >= 0 && (a3Var = cropImageView.A) != null) {
                        com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI = ((com.tencent.mm.ui.tools.m2) a3Var).f210564a;
                        if (cropImageNewUI.f210001g.getVisibility() == 0) {
                            cropImageNewUI.f210001g.setVisibility(4);
                        } else if (cropImageNewUI.f210001g.getVisibility() == 4) {
                            cropImageNewUI.f210001g.setVisibility(0);
                        }
                    }
                }
                cropImageView.f210029y = 0L;
            }
            android.graphics.PointF pointF = cropImageView.f210018n;
            android.graphics.Bitmap bitmap = cropImageView.f210012e;
            if (pointF == null || bitmap == null) {
                return;
            }
            pointF.set(bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        }
    }
}
