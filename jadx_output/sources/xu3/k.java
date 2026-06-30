package xu3;

/* loaded from: classes5.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView f457262d;

    public k(com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        this.f457262d = editorAudioSelectFinderVideoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView = this.f457262d;
        xu3.q callback = editorAudioSelectFinderVideoView.getCallback();
        if (callback != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = editorAudioSelectFinderVideoView.f156119o;
            com.tencent.mm.plugin.recordvideo.ui.editor.e eVar = (com.tencent.mm.plugin.recordvideo.ui.editor.e) callback;
            if (audioCacheInfo != null) {
                int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.f155970x1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                audioCacheInfo.f155718o = 1;
                arrayList2.add(audioCacheInfo);
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = eVar.f156124a;
                su3.m mVar = editorAudioView.K;
                mVar.getClass();
                mVar.f412793d.addAll(0, arrayList2);
                mVar.notifyDataSetChanged();
                if (editorAudioView.W) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = editorAudioView.f155974p;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.c1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    editorAudioView.g(0, false);
                } else {
                    editorAudioView.K.z(0);
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = editorAudioView.f155974p;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(recyclerView2, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView2.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initSelectFinderVideoPanel$1", "onFinishSelectFinderVideo", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                editorAudioView.setShowAudioPanel(true);
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.f(editorAudioView, false);
                editorAudioView.l(true);
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback2 = editorAudioView.getCallback();
                if (callback2 != null) {
                    callback2.b(audioCacheInfo);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
