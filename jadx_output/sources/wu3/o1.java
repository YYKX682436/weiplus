package wu3;

/* loaded from: classes15.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton f449788d;

    public o1(com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton mMEditorRecordButton) {
        this.f449788d = mMEditorRecordButton;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton mMEditorRecordButton = this.f449788d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecordButton", "on Long Press, isDispatchSimpleTap: %s, isDispatchLongPress: %s", java.lang.Boolean.valueOf(mMEditorRecordButton.f156040h), java.lang.Boolean.valueOf(mMEditorRecordButton.f156041i));
        if (mMEditorRecordButton.f156040h) {
            return;
        }
        mMEditorRecordButton.f156041i = true;
        mMEditorRecordButton.getClass();
    }
}
