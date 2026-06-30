package wu3;

/* loaded from: classes15.dex */
public class q1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f449798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton f449799e;

    public q1(com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton mMEditorRecordButton, long j17) {
        this.f449799e = mMEditorRecordButton;
        this.f449798d = j17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton mMEditorRecordButton = this.f449799e;
        if (mMEditorRecordButton.f156036d <= 0 || this.f449798d > 500 || mMEditorRecordButton.f156041i) {
            if (mMEditorRecordButton.f156041i) {
                mMEditorRecordButton.getClass();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "error action up");
                mMEditorRecordButton.getClass();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "on Simple Tap, isDispatchSimpleTap: %s, isDispatchLongPress: %s", java.lang.Boolean.valueOf(mMEditorRecordButton.f156040h), java.lang.Boolean.valueOf(mMEditorRecordButton.f156041i));
        mMEditorRecordButton.f156040h = true;
        if (mMEditorRecordButton.f156041i) {
            return;
        }
        mMEditorRecordButton.getClass();
    }
}
