package wu3;

/* loaded from: classes.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f449775d;

    public l0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        this.f449775d = editorAudioView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f449775d.f155973o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$setShowAudioPanel$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$setShowAudioPanel$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
