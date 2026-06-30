package wu3;

/* loaded from: classes5.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f449777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f449778e;

    public m0(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView, java.util.LinkedList linkedList) {
        this.f449777d = editorAudioView;
        this.f449778e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f449777d;
        editorAudioView.getClass();
        java.util.LinkedList audioList = this.f449778e;
        kotlin.jvm.internal.o.g(audioList, "audioList");
        java.util.ArrayList arrayList = new java.util.ArrayList(editorAudioView.Q);
        int i17 = 0;
        for (java.lang.Object obj : audioList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo c17 = com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.c((r45.mh4) obj, 1);
            c17.f155719p = 3;
            c17.f155726w = i17;
            c17.f155727x = editorAudioView.getMusicRequestId();
            arrayList.add(c17);
            i17 = i18;
        }
        editorAudioView.K.B(arrayList);
        if (!editorAudioView.f155975p0 || arrayList.size() <= 0) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = editorAudioView.f155974p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "addAudioList", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "addAudioList", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        editorAudioView.g(0, false);
    }
}
