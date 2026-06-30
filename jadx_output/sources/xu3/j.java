package xu3;

/* loaded from: classes5.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView f457261d;

    public j(com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        this.f457261d = editorAudioSelectFinderVideoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xu3.q callback = this.f457261d.getCallback();
        if (callback != null) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.e) callback).a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
