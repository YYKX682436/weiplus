package wu3;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f449808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        super(2);
        this.f449808d = editorAudioView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo info = (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) obj2;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f449808d;
        if (intValue != editorAudioView.K.getItemCount() && intValue != editorAudioView.L) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = editorAudioView.f155974p.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int t17 = linearLayoutManager.t();
            int x17 = linearLayoutManager.x();
            if (info.f155718o == 2) {
                androidx.recyclerview.widget.RecyclerView recyclerView = editorAudioView.f155974p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(recyclerView, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.h(editorAudioView, intValue, false, 2, null);
            } else {
                if (t17 <= intValue && intValue <= x17) {
                    com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.h(editorAudioView, intValue, false, 2, null);
                } else {
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = editorAudioView.f155974p;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(recyclerView2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView2.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
        }
        if (intValue == editorAudioView.L) {
            editorAudioView.k();
        }
        return jz5.f0.f302826a;
    }
}
