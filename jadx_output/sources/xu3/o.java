package xu3;

/* loaded from: classes5.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView f457266d;

    public o(com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        this.f457266d = editorAudioSelectFinderVideoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.d(view);
        int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView.f156110q;
        this.f457266d.g(view);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
