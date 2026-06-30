package wu3;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f449831d;

    public y(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        this.f449831d = editorAudioView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f449831d.setShow(false);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
