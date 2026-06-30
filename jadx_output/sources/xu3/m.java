package xu3;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView f457264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView) {
        super(3);
        this.f457264d = editorAudioSelectFinderVideoView;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.widget.Button finishBtn;
        com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderLikeFragment finderLikeFragment;
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.protocal.protobuf.FinderObject finderObj = (com.tencent.mm.protocal.protobuf.FinderObject) obj3;
        kotlin.jvm.internal.o.g((com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioFinderTabFragment) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView editorAudioSelectFinderVideoView = this.f457264d;
        finishBtn = editorAudioSelectFinderVideoView.getFinishBtn();
        finishBtn.setEnabled(true);
        finderLikeFragment = editorAudioSelectFinderVideoView.getFinderLikeFragment();
        finderLikeFragment.b();
        com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView.d(editorAudioSelectFinderVideoView, finderObj, 6);
        return jz5.f0.f302826a;
    }
}
