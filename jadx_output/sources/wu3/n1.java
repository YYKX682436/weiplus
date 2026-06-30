package wu3;

/* loaded from: classes15.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f449783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton f449784e;

    public n1(com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorRecordButton mMEditorRecordButton, int i17) {
        this.f449784e = mMEditorRecordButton;
        this.f449783d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*android.view.View*/.setVisibility(this.f449783d);
    }
}
