package xu3;

/* loaded from: classes5.dex */
public final class c implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment f457254d;

    public c(com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment editorAudioFinderTabFragment) {
        this.f457254d = editorAudioFinderTabFragment;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment editorAudioFinderTabFragment = this.f457254d;
        xu3.b bVar = (xu3.b) kz5.n0.a0(editorAudioFinderTabFragment.f156101d, i17);
        if (bVar != null) {
            boolean z17 = bVar.f457253f;
            boolean z18 = false;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = bVar.f457251d;
            if (z17) {
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                if (objectDesc != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null && finderMedia.getMediaType() == 2) {
                    z18 = true;
                }
                if (z18) {
                    db5.t7.m(editorAudioFinderTabFragment.getContext(), i65.a.r(editorAudioFinderTabFragment.getContext(), com.tencent.mm.R.string.f493291jm2));
                    return;
                } else {
                    db5.t7.m(editorAudioFinderTabFragment.getContext(), i65.a.r(editorAudioFinderTabFragment.getContext(), com.tencent.mm.R.string.f493292jm3));
                    return;
                }
            }
            if (bVar.f457252e) {
                return;
            }
            xu3.b bVar2 = (xu3.b) kz5.n0.a0(editorAudioFinderTabFragment.f156101d, editorAudioFinderTabFragment.f156102e);
            if (bVar2 != null) {
                bVar2.f457252e = false;
            }
            bVar.f457252e = true;
            adapter.notifyItemChanged(editorAudioFinderTabFragment.f156102e, 1);
            adapter.notifyItemChanged(i17, 1);
            editorAudioFinderTabFragment.f156102e = i17;
            yz5.q onFinderVideoSelectListener = editorAudioFinderTabFragment.getOnFinderVideoSelectListener();
            if (onFinderVideoSelectListener != null) {
                onFinderVideoSelectListener.invoke(editorAudioFinderTabFragment, java.lang.Integer.valueOf(i17), finderObject);
            }
        }
    }
}
