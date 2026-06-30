package wu3;

/* loaded from: classes15.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton f449795d;

    public p1(com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton mMEditorRecordButton) {
        this.f449795d = mMEditorRecordButton;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton mMEditorRecordButton = this.f449795d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "startTransition, isDown: %s", java.lang.Boolean.valueOf(mMEditorRecordButton.f156046q));
        if (mMEditorRecordButton.f156046q) {
            mMEditorRecordButton.f156042m = true;
            android.view.ViewPropertyAnimator viewPropertyAnimator = mMEditorRecordButton.f156043n;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                mMEditorRecordButton.f156043n = null;
            }
            android.view.ViewPropertyAnimator animate = mMEditorRecordButton.f156038f.animate();
            float f17 = com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton.C;
            android.view.ViewPropertyAnimator scaleY = animate.scaleX(f17).scaleY(f17);
            mMEditorRecordButton.f156043n = scaleY;
            scaleY.setDuration(150L).start();
            if (mMEditorRecordButton.f156048s != mMEditorRecordButton.f156047r) {
                android.animation.ValueAnimator valueAnimator = mMEditorRecordButton.f156044o;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                android.animation.ObjectAnimator ofArgb = android.animation.ObjectAnimator.ofArgb(mMEditorRecordButton.f156050u, "color", mMEditorRecordButton.f156047r, mMEditorRecordButton.f156048s);
                mMEditorRecordButton.f156044o = ofArgb;
                ofArgb.setDuration(150L);
                mMEditorRecordButton.f156044o.start();
            }
        }
    }
}
