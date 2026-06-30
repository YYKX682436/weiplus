package wu3;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView f449776d;

    public m(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView) {
        this.f449776d = editorAudioSearchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView editorAudioSearchView = this.f449776d;
        su3.m mVar = editorAudioSearchView.f155964u;
        if (mVar != null) {
            int i17 = editorAudioSearchView.f155967x;
            if (i17 == -1 || i17 >= mVar.getItemCount()) {
                editorAudioSearchView.getCallback();
                editorAudioSearchView.f();
                wt3.u uVar = wt3.v.f449504h;
                wt3.v.f449506j.f61552e = 1L;
                uVar.a();
            } else {
                wu3.i callback = editorAudioSearchView.getCallback();
                if (callback != null) {
                    com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo x17 = mVar.x(editorAudioSearchView.f155967x);
                    com.tencent.mm.plugin.recordvideo.ui.editor.d dVar = (com.tencent.mm.plugin.recordvideo.ui.editor.d) callback;
                    if (x17 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        x17.f155718o = 1;
                        x17.f155719p = 4;
                        arrayList2.add(x17);
                        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = dVar.f156123a;
                        su3.m mVar2 = editorAudioView.K;
                        mVar2.getClass();
                        mVar2.f412793d.addAll(0, arrayList2);
                        mVar2.notifyDataSetChanged();
                        if (editorAudioView.W) {
                            androidx.recyclerview.widget.RecyclerView recyclerView = editorAudioView.f155974p;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(recyclerView, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            recyclerView.c1(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(recyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            editorAudioView.g(0, false);
                        } else {
                            editorAudioView.K.z(0);
                            androidx.recyclerview.widget.RecyclerView recyclerView2 = editorAudioView.f155974p;
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList4.add(0);
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(recyclerView2, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            recyclerView2.c1(((java.lang.Integer) arrayList4.get(0)).intValue());
                            yj0.a.f(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$initAudioSearchPanel$1", "onSearchAudioFinish", "(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        }
                        editorAudioView.j(false);
                        editorAudioView.setShowAudioPanel(true);
                        editorAudioView.l(true);
                        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback2 = editorAudioView.getCallback();
                        if (callback2 != null) {
                            callback2.b(x17);
                        }
                    }
                }
                editorAudioSearchView.f();
                wt3.u uVar2 = wt3.v.f449504h;
                wt3.v.f449506j.f61552e = 0L;
                uVar2.a();
            }
            editorAudioSearchView.g();
        }
        android.widget.EditText editText = editorAudioSearchView.f155957n;
        if (editText != null) {
            editText.clearFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioSearchView$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
